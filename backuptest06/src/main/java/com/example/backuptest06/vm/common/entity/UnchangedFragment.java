package com.example.backuptest06.vm.common.entity;

/**
 * @author
 * @Description
 * @time 2022111417:52
 */
public class UnchangedFragment {
    public long startIndex;
    public long length;
    public UnchangedFragment() {

    }
    public UnchangedFragment(long startIndex, long length) {
        this.startIndex = startIndex;
        this.length = length;
    }

    public long getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(long startIndex) {
        this.startIndex = startIndex;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
