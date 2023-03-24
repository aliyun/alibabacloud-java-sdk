package com.example.backuptest06.vm.common.entity;

/**
 * @author
 * @Description
 * @time 2022111117:05
 */
public class ModifiedFragmentInfo {
    public long startIndex;
    public long length;
    public ModifiedFragmentInfo() {

    }
    public ModifiedFragmentInfo(long startIndex, long length) {
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
