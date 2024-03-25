// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetDirectoryOrFilePropertiesResponseBody extends TeaModel {
    /**
     * <p>The details about the file or directory.</p>
     */
    @NameInMap("Entry")
    public GetDirectoryOrFilePropertiesResponseBodyEntry entry;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDirectoryOrFilePropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryOrFilePropertiesResponseBody self = new GetDirectoryOrFilePropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectoryOrFilePropertiesResponseBody setEntry(GetDirectoryOrFilePropertiesResponseBodyEntry entry) {
        this.entry = entry;
        return this;
    }
    public GetDirectoryOrFilePropertiesResponseBodyEntry getEntry() {
        return this.entry;
    }

    public GetDirectoryOrFilePropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDirectoryOrFilePropertiesResponseBodyEntry extends TeaModel {
        /**
         * <p>The time when the file was queried.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is File.</p>
         */
        @NameInMap("ATime")
        public String ATime;

        /**
         * <p>The time when the raw data was modified.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is File.</p>
         */
        @NameInMap("CTime")
        public String CTime;

        @NameInMap("HasArchiveFile")
        public Boolean hasArchiveFile;

        /**
         * <p>Indicates whether the directory contains files stored in the IA storage medium.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is Directory.</p>
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
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is File.</p>
         */
        @NameInMap("MTime")
        public String MTime;

        /**
         * <p>The name of the file or directory.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the last data retrieval task was run.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is File.</p>
         */
        @NameInMap("RetrieveTime")
        public String retrieveTime;

        /**
         * <p>The size of the file.</p>
         * <br>
         * <p>Unit: bytes.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is File.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The storage type of the file.</p>
         * <br>
         * <p>This parameter is returned only if the value of the Type parameter is File.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   standard: General-purpose NAS file system</p>
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

        public static GetDirectoryOrFilePropertiesResponseBodyEntry build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryOrFilePropertiesResponseBodyEntry self = new GetDirectoryOrFilePropertiesResponseBodyEntry();
            return TeaModel.build(map, self);
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setATime(String ATime) {
            this.ATime = ATime;
            return this;
        }
        public String getATime() {
            return this.ATime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setCTime(String CTime) {
            this.CTime = CTime;
            return this;
        }
        public String getCTime() {
            return this.CTime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setHasArchiveFile(Boolean hasArchiveFile) {
            this.hasArchiveFile = hasArchiveFile;
            return this;
        }
        public Boolean getHasArchiveFile() {
            return this.hasArchiveFile;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setHasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
            this.hasInfrequentAccessFile = hasInfrequentAccessFile;
            return this;
        }
        public Boolean getHasInfrequentAccessFile() {
            return this.hasInfrequentAccessFile;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setInode(String inode) {
            this.inode = inode;
            return this;
        }
        public String getInode() {
            return this.inode;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setMTime(String MTime) {
            this.MTime = MTime;
            return this;
        }
        public String getMTime() {
            return this.MTime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setRetrieveTime(String retrieveTime) {
            this.retrieveTime = retrieveTime;
            return this;
        }
        public String getRetrieveTime() {
            return this.retrieveTime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
