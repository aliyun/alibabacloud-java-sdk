package com.example.backuptest06.vm.common.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author
 * @Description
 * @time 2022110321:33
 */
public class TrieNode {
    Character value;
    boolean tail = false;
    List<String> content = new ArrayList<>(); //节点内容
    public HashMap<Character, TrieNode> son = new HashMap<>();

    public TrieNode(Character c){
        value = c;
    }

    public void setValue(Character value) {
        this.value = value;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public void setContent(String content) {
        this.content.add(content);
    }

    public void setSon(HashMap<Character, TrieNode> son) {
        this.son = son;
    }

    public Character getValue() {
        return value;
    }

    public boolean isTail() {
        return tail;
    }

    public List<String> getContent() {
        return content;
    }

    public HashMap<Character, TrieNode> getSon() {
        return son;
    }

}
