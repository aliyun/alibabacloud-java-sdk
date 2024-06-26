// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetStorageListResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>73-8B78-5D86-A50C-49B96C</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageInfoList")
    public java.util.List<GetStorageListResponseBodyStorageInfoList> storageInfoList;

    public static GetStorageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageListResponseBody self = new GetStorageListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageListResponseBody setStorageInfoList(java.util.List<GetStorageListResponseBodyStorageInfoList> storageInfoList) {
        this.storageInfoList = storageInfoList;
        return this;
    }
    public java.util.List<GetStorageListResponseBodyStorageInfoList> getStorageInfoList() {
        return this.storageInfoList;
    }

    public static class GetStorageListResponseBodyStorageInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>2024-06-06T01:55:07Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultStorage")
        public Boolean defaultStorage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EditingTempFileStorage")
        public Boolean editingTempFileStorage;

        /**
         * <strong>example:</strong>
         * <p>2024-06-06T03:07:07Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>your-path/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>your-bucket</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <strong>example:</strong>
         * <p>vod_oss_bucket</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static GetStorageListResponseBodyStorageInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageListResponseBodyStorageInfoList self = new GetStorageListResponseBodyStorageInfoList();
            return TeaModel.build(map, self);
        }

        public GetStorageListResponseBodyStorageInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetStorageListResponseBodyStorageInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetStorageListResponseBodyStorageInfoList setDefaultStorage(Boolean defaultStorage) {
            this.defaultStorage = defaultStorage;
            return this;
        }
        public Boolean getDefaultStorage() {
            return this.defaultStorage;
        }

        public GetStorageListResponseBodyStorageInfoList setEditingTempFileStorage(Boolean editingTempFileStorage) {
            this.editingTempFileStorage = editingTempFileStorage;
            return this;
        }
        public Boolean getEditingTempFileStorage() {
            return this.editingTempFileStorage;
        }

        public GetStorageListResponseBodyStorageInfoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetStorageListResponseBodyStorageInfoList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetStorageListResponseBodyStorageInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStorageListResponseBodyStorageInfoList setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetStorageListResponseBodyStorageInfoList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
