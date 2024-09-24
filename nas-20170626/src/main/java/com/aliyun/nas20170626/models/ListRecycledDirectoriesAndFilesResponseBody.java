// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesResponseBody extends TeaModel {
    /**
     * <p>The information about files or directories in the recycle bin.</p>
     */
    @NameInMap("Entries")
    public java.util.List<ListRecycledDirectoriesAndFilesResponseBodyEntries> entries;

    /**
     * <p>A pagination token.</p>
     * <p>If all the files and directories are incompletely returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>CKuO8QMSIjE2OTc3NzI0NjI5MTcyMTYyNDVfMzEzNTUyMF81MjEzODY=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRecycledDirectoriesAndFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecycledDirectoriesAndFilesResponseBody self = new ListRecycledDirectoriesAndFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecycledDirectoriesAndFilesResponseBody setEntries(java.util.List<ListRecycledDirectoriesAndFilesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<ListRecycledDirectoriesAndFilesResponseBodyEntries> getEntries() {
        return this.entries;
    }

    public ListRecycledDirectoriesAndFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecycledDirectoriesAndFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecycledDirectoriesAndFilesResponseBodyEntries extends TeaModel {
        /**
         * <p>The time when the file or directory was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-30T10:08:08Z</p>
         */
        @NameInMap("ATime")
        public String ATime;

        /**
         * <p>The time when the metadata was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-30T10:08:08Z</p>
         */
        @NameInMap("CTime")
        public String CTime;

        /**
         * <p>The time when the file or directory was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-30T10:08:08Z</p>
         */
        @NameInMap("DeleteTime")
        public String deleteTime;

        /**
         * <p>The IDs of the files or directories.</p>
         * 
         * <strong>example:</strong>
         * <p>04***08</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The inode of the file or directory.</p>
         * 
         * <strong>example:</strong>
         * <p>04***08</p>
         */
        @NameInMap("Inode")
        public String inode;

        /**
         * <p>The time when the file or directory was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-30T10:08:08Z</p>
         */
        @NameInMap("MTime")
        public String MTime;

        /**
         * <p>The name of the file or directory before it was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * <p>The value 0 is returned for this parameter if Directory is returned for the Type parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The type of the returned object. Valid values:</p>
         * <ul>
         * <li>File</li>
         * <li>Directory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRecycledDirectoriesAndFilesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            ListRecycledDirectoriesAndFilesResponseBodyEntries self = new ListRecycledDirectoriesAndFilesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setATime(String ATime) {
            this.ATime = ATime;
            return this;
        }
        public String getATime() {
            return this.ATime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setCTime(String CTime) {
            this.CTime = CTime;
            return this;
        }
        public String getCTime() {
            return this.CTime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setInode(String inode) {
            this.inode = inode;
            return this;
        }
        public String getInode() {
            return this.inode;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setMTime(String MTime) {
            this.MTime = MTime;
            return this;
        }
        public String getMTime() {
            return this.MTime;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListRecycledDirectoriesAndFilesResponseBodyEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
