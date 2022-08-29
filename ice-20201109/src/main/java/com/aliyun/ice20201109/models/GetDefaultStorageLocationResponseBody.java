// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDefaultStorageLocationResponseBody extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Path")
    public String path;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StorageType")
    public String storageType;

    public static GetDefaultStorageLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultStorageLocationResponseBody self = new GetDefaultStorageLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultStorageLocationResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetDefaultStorageLocationResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetDefaultStorageLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultStorageLocationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDefaultStorageLocationResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
