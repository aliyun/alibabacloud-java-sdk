// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesResponseBody extends TeaModel {
    /**
     * <p>The details about the files or directories.</p>
     */
    @NameInMap("Entries")
    public java.util.List<ListDirectoriesAndFilesResponseBodyEntries> entries;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDirectoriesAndFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesAndFilesResponseBody self = new ListDirectoriesAndFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesAndFilesResponseBody setEntries(java.util.List<ListDirectoriesAndFilesResponseBodyEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<ListDirectoriesAndFilesResponseBodyEntries> getEntries() {
        return this.entries;
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

    public static class ListDirectoriesAndFilesResponseBodyEntries extends TeaModel {
        /**
         * <p>The time when the file was queried.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
         */
        @NameInMap("Atime")
        public String atime;

        /**
         * <p>The time when the raw data was modified.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
         */
        @NameInMap("Ctime")
        public String ctime;

        /**
         * <p>The ID of the directory or file.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Indicates whether the directory contains files stored in the IA storage medium.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is Directory.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: The directory contains files stored in the IA storage medium.</p>
         * <p>*   false: The directory does not contain files stored in the IA storage medium.</p>
         */
        @NameInMap("HasInfrequentAccessFile")
        public Boolean hasInfrequentAccessFile;

        /**
         * <p>The file or directory inode.</p>
         */
        @NameInMap("Inode")
        public String inode;

        /**
         * <p>The time when the file was modified.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
         */
        @NameInMap("Mtime")
        public String mtime;

        /**
         * <p>The name of the file or directory.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the portable account. This parameter is returned and valid only if the value of the ProtocolType parameter is SMB and RAM-based access control is enabled.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The time when the last data retrieval task was run.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
         */
        @NameInMap("RetrieveTime")
        public String retrieveTime;

        /**
         * <p>The size of the file.</p>
         * <br>
         * <p>Unit: bytes.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The storage type of the file.</p>
         * <br>
         * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   InfrequentAccess: IA storage medium</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The type of the query result.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   File</p>
         * <p>*   Directory</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDirectoriesAndFilesResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            ListDirectoriesAndFilesResponseBodyEntries self = new ListDirectoriesAndFilesResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public ListDirectoriesAndFilesResponseBodyEntries setAtime(String atime) {
            this.atime = atime;
            return this;
        }
        public String getAtime() {
            return this.atime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setCtime(String ctime) {
            this.ctime = ctime;
            return this;
        }
        public String getCtime() {
            return this.ctime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setHasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
            this.hasInfrequentAccessFile = hasInfrequentAccessFile;
            return this;
        }
        public Boolean getHasInfrequentAccessFile() {
            return this.hasInfrequentAccessFile;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setInode(String inode) {
            this.inode = inode;
            return this;
        }
        public String getInode() {
            return this.inode;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setMtime(String mtime) {
            this.mtime = mtime;
            return this;
        }
        public String getMtime() {
            return this.mtime;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setRetrieveTime(String retrieveTime) {
            this.retrieveTime = retrieveTime;
            return this;
        }
        public String getRetrieveTime() {
            return this.retrieveTime;
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

        public ListDirectoriesAndFilesResponseBodyEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
