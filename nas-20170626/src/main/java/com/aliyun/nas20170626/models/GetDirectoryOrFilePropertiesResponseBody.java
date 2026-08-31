// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetDirectoryOrFilePropertiesResponseBody extends TeaModel {
    /**
     * <p>The directory or file information.</p>
     */
    @NameInMap("Entry")
    public GetDirectoryOrFilePropertiesResponseBodyEntry entry;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
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
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is returned only when Type is File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-01T10:08:08Z</p>
         */
        @NameInMap("ATime")
        public String ATime;

        /**
         * <p>The time when the metadata was modified.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is returned only when Type is File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-11T10:08:10Z</p>
         */
        @NameInMap("CTime")
        public String CTime;

        /**
         * <p>Indicates whether the directory contains Archive storage class files.</p>
         * <p>This parameter is returned only when Type is Directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The directory contains Archive storage class files.</li>
         * <li>false: The directory does not contain Archive storage class files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasArchiveFile")
        public Boolean hasArchiveFile;

        /**
         * <p>Indicates whether the directory contains IA storage class files.</p>
         * <p>This parameter is returned only when Type is Directory.</p>
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
         * <p>40</p>
         */
        @NameInMap("Inode")
        public String inode;

        /**
         * <p>The time when the file was modified.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is returned only when Type is File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-11T10:08:08Z</p>
         */
        @NameInMap("MTime")
        public String MTime;

        /**
         * <p>The file name or directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>file.txt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The total duration for which the file has been stored as an Archive file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("OfflineDuration")
        public Long offlineDuration;

        /**
         * <p>The total duration for which the file has remained unchanged since it was stored as an Archive file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("OfflineUnchangedDuration")
        public Long offlineUnchangedDuration;

        /**
         * <p>The time when the most recent data retrieval task was executed.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <p>This parameter is returned only when Type is File.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-11T10:08:08Z</p>
         */
        @NameInMap("RetrieveTime")
        public String retrieveTime;

        /**
         * <p>The size of the file.</p>
         * <p>Unit: bytes.</p>
         * <p>This parameter is returned only when Type is File.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The storage type of the returned file.</p>
         * <p>This parameter is returned only when Type is File.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Standard: General-purpose NAS storage.</li>
         * <li>InfrequentAccess: IA storage class.</li>
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
         * <li>File: file</li>
         * <li>Directory: directory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>File</p>
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

        public GetDirectoryOrFilePropertiesResponseBodyEntry setOfflineDuration(Long offlineDuration) {
            this.offlineDuration = offlineDuration;
            return this;
        }
        public Long getOfflineDuration() {
            return this.offlineDuration;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setOfflineUnchangedDuration(Long offlineUnchangedDuration) {
            this.offlineUnchangedDuration = offlineUnchangedDuration;
            return this;
        }
        public Long getOfflineUnchangedDuration() {
            return this.offlineUnchangedDuration;
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
