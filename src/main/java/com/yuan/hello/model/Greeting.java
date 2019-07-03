package com.yuan.hello.model;

public class Greeting {
    // final(can not modify)
    private final long id;
    private String content;

    // class constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
