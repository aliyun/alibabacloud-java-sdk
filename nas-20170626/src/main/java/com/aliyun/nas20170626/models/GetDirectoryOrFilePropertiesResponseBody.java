// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetDirectoryOrFilePropertiesResponseBody extends TeaModel {
    @NameInMap("Entry")
    public GetDirectoryOrFilePropertiesResponseBodyEntry entry;

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
        @NameInMap("Type")
        public String type;

        @NameInMap("HasInfrequentAccessFile")
        public Boolean hasInfrequentAccessFile;

        @NameInMap("MTime")
        public String MTime;

        @NameInMap("ATime")
        public String ATime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("CTime")
        public String CTime;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RetrieveTime")
        public String retrieveTime;

        @NameInMap("Inode")
        public String inode;

        public static GetDirectoryOrFilePropertiesResponseBodyEntry build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryOrFilePropertiesResponseBodyEntry self = new GetDirectoryOrFilePropertiesResponseBodyEntry();
            return TeaModel.build(map, self);
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setHasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
            this.hasInfrequentAccessFile = hasInfrequentAccessFile;
            return this;
        }
        public Boolean getHasInfrequentAccessFile() {
            return this.hasInfrequentAccessFile;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setMTime(String MTime) {
            this.MTime = MTime;
            return this;
        }
        public String getMTime() {
            return this.MTime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setATime(String ATime) {
            this.ATime = ATime;
            return this;
        }
        public String getATime() {
            return this.ATime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setCTime(String CTime) {
            this.CTime = CTime;
            return this;
        }
        public String getCTime() {
            return this.CTime;
        }

        public GetDirectoryOrFilePropertiesResponseBodyEntry setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
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

        public GetDirectoryOrFilePropertiesResponseBodyEntry setInode(String inode) {
            this.inode = inode;
            return this;
        }
        public String getInode() {
            return this.inode;
        }

    }

}
