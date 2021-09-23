// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Entries")
    public java.util.List<ListDirectoriesAndFilesResponseBodyEntries> entries;

    public static ListDirectoriesAndFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesAndFilesResponseBody self = new ListDirectoriesAndFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesAndFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDirectoriesAndFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDirectoriesAndFilesResponseBody setEntries(java.util.List<ListDirectoriesAndFilesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<ListDirectoriesAndFilesResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public static class ListDirectoriesAndFilesResponseBodyEntries extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("HasInfrequentAccessFile")
        public Boolean hasInfrequentAccessFile;

        @NameInMap("Ctime")
        public String ctime;

        @NameInMap("Mtime")
        public String mtime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Atime")
        public String atime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RetrieveTime")
        public String retrieveTime;

        @NameInMap("Inode")
        public String inode;

        @NameInMap("FileId")
        public String fileId;

        public static ListDirectoriesAndFilesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            ListDirectoriesAndFilesResponseBodyEntries self = new ListDirectoriesAndFilesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public ListDirectoriesAndFilesResponseBodyEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setHasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
            this.hasInfrequentAccessFile = hasInfrequentAccessFile;
            return this;
        }
        public Boolean getHasInfrequentAccessFile() {
            return this.hasInfrequentAccessFile;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setCtime(String ctime) {
            this.ctime = ctime;
            return this;
        }
        public String getCtime() {
            return this.ctime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setMtime(String mtime) {
            this.mtime = mtime;
            return this;
        }
        public String getMtime() {
            return this.mtime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setAtime(String atime) {
            this.atime = atime;
            return this;
        }
        public String getAtime() {
            return this.atime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setRetrieveTime(String retrieveTime) {
            this.retrieveTime = retrieveTime;
            return this;
        }
        public String getRetrieveTime() {
            return this.retrieveTime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setInode(String inode) {
            this.inode = inode;
            return this;
        }
        public String getInode() {
            return this.inode;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
