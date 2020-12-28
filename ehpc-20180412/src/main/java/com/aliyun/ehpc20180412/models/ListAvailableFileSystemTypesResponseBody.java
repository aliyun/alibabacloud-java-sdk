// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableFileSystemTypesResponseBody extends TeaModel {
    @NameInMap("FileSystemTypeList")
    public java.util.List<ListAvailableFileSystemTypesResponseBodyFileSystemTypeList> fileSystemTypeList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAvailableFileSystemTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableFileSystemTypesResponseBody self = new ListAvailableFileSystemTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableFileSystemTypesResponseBody setFileSystemTypeList(java.util.List<ListAvailableFileSystemTypesResponseBodyFileSystemTypeList> fileSystemTypeList) {
        this.fileSystemTypeList = fileSystemTypeList;
        return this;
    }
    public java.util.List<ListAvailableFileSystemTypesResponseBodyFileSystemTypeList> getFileSystemTypeList() {
        return this.fileSystemTypeList;
    }

    public ListAvailableFileSystemTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvailableFileSystemTypesResponseBodyFileSystemTypeList extends TeaModel {
        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("Available")
        public Boolean available;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("StorageTypes")
        public java.util.List<String> storageTypes;

        public static ListAvailableFileSystemTypesResponseBodyFileSystemTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableFileSystemTypesResponseBodyFileSystemTypeList self = new ListAvailableFileSystemTypesResponseBodyFileSystemTypeList();
            return TeaModel.build(map, self);
        }

        public ListAvailableFileSystemTypesResponseBodyFileSystemTypeList setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public ListAvailableFileSystemTypesResponseBodyFileSystemTypeList setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListAvailableFileSystemTypesResponseBodyFileSystemTypeList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListAvailableFileSystemTypesResponseBodyFileSystemTypeList setStorageTypes(java.util.List<String> storageTypes) {
            this.storageTypes = storageTypes;
            return this;
        }
        public java.util.List<String> getStorageTypes() {
            return this.storageTypes;
        }

    }

}
