// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesResponseBody extends TeaModel {
    /**
     * <p>The collection of directory or file information.</p>
     */
    @NameInMap("Entries")
    public java.util.List<ListDirectoriesAndFilesResponseBodyEntries> entries;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, you can use NextToken to initiate a new request to retrieve the content after the current truncation position.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
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
         * <p>The query time.</p>
         * <p>The time follows the ISO 8601 standard and is returned in the format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <p>This parameter is returned and meaningful only when Type is set to File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-01T10:08:08Z</p>
         */
        @NameInMap("Atime")
        public String atime;

        /**
         * <p>The time when the metadata was modified.</p>
         * <p>The time follows the ISO 8601 standard and is returned in the format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <p>This parameter is returned and meaningful only when Type is set to File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-11T10:08:10Z</p>
         */
        @NameInMap("Ctime")
        public String ctime;

        /**
         * <p>The FileId of the directory or file.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>Indicates whether the directory contains archive storage class files.</p>
         * <p>This parameter is returned and meaningful only when Type is set to Directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The directory contains archive storage class files.</li>
         * <li>false: The directory does not contain archive storage class files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasArchiveFile")
        public String hasArchiveFile;

        /**
         * <p>Indicates whether the directory contains IA storage class files.</p>
         * <p>This parameter is returned and meaningful only when Type is set to Directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The directory contains IA storage class files.</li>
         * <li>false: The directory does not contain IA storage class files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasInfrequentAccessFile")
        public Boolean hasInfrequentAccessFile;

        /**
         * <p>The inode of the file or directory.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("Inode")
        public String inode;

        /**
         * <p>The time when the file was modified.</p>
         * <p>The time follows the ISO 8601 standard and is returned in the format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <p>This parameter is returned and meaningful only when Type is set to File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-11T10:08:08Z</p>
         */
        @NameInMap("Mtime")
        public String mtime;

        /**
         * <p>The file name or directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>file.txt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The total duration for which the file has been stored as an archive file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("OfflineDuration")
        public Long offlineDuration;

        /**
         * <p>The total duration for which the file has remained unchanged since it was stored as an archive file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("OfflineUnchangedDuration")
        public Long offlineUnchangedDuration;

        /**
         * <p>The portable account ID.
         * This parameter is meaningful only when ProtocolType is set to SMB and access control is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>37862c****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The time when the most recent data retrieval task was run.</p>
         * <p>The time follows the ISO 8601 standard and is returned in the format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <p>This parameter is returned and meaningful only when Type is set to File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-11T10:08:08Z</p>
         */
        @NameInMap("RetrieveTime")
        public String retrieveTime;

        /**
         * <p>The size of the file.</p>
         * <p>Unit: bytes.</p>
         * <p>This parameter is returned and meaningful only when Type is set to File.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The storage class type of the returned file.</p>
         * <p>This parameter is returned and meaningful only when Type is set to File.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>InfrequentAccess: IA storage class.</li>
         * <li>Archive: Archive storage class.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The type of the returned result.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>File: file.</li>
         * <li>Directory: directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>File</p>
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

        public ListDirectoriesAndFilesResponseBodyEntries setHasArchiveFile(String hasArchiveFile) {
            this.hasArchiveFile = hasArchiveFile;
            return this;
        }
        public String getHasArchiveFile() {
            return this.hasArchiveFile;
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

        public ListDirectoriesAndFilesResponseBodyEntries setOfflineDuration(Long offlineDuration) {
            this.offlineDuration = offlineDuration;
            return this;
        }
        public Long getOfflineDuration() {
            return this.offlineDuration;
        }

        public ListDirectoriesAndFilesResponseBodyEntries setOfflineUnchangedDuration(Long offlineUnchangedDuration) {
            this.offlineUnchangedDuration = offlineUnchangedDuration;
            return this;
        }
        public Long getOfflineUnchangedDuration() {
            return this.offlineUnchangedDuration;
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
