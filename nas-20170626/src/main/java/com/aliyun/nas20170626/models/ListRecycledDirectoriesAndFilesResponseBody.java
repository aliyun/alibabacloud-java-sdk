// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Id of the request
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Entries")
    public java.util.List<ListRecycledDirectoriesAndFilesResponseBodyEntries> entries;

    public static ListRecycledDirectoriesAndFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecycledDirectoriesAndFilesResponseBody self = new ListRecycledDirectoriesAndFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecycledDirectoriesAndFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecycledDirectoriesAndFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecycledDirectoriesAndFilesResponseBody setEntries(java.util.List<ListRecycledDirectoriesAndFilesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<ListRecycledDirectoriesAndFilesResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public static class ListRecycledDirectoriesAndFilesResponseBodyEntries extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("DeleteTime")
        public String deleteTime;

        @NameInMap("Inode")
        public String inode;

        @NameInMap("ATime")
        public String ATime;

        @NameInMap("MTime")
        public String MTime;

        @NameInMap("CTime")
        public String CTime;

        @NameInMap("Size")
        public Long size;

        public static ListRecycledDirectoriesAndFilesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            ListRecycledDirectoriesAndFilesResponseBodyEntries self = new ListRecycledDirectoriesAndFilesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setInode(String inode) {
            this.inode = inode;
            return this;
        }
        public String getInode() {
            return this.inode;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setATime(String ATime) {
            this.ATime = ATime;
            return this;
        }
        public String getATime() {
            return this.ATime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setMTime(String MTime) {
            this.MTime = MTime;
            return this;
        }
        public String getMTime() {
            return this.MTime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setCTime(String CTime) {
            this.CTime = CTime;
            return this;
        }
        public String getCTime() {
            return this.CTime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
