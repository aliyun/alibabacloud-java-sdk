// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetClientConfigResponseBody extends TeaModel {
    // oss bucket 名称
    @NameInMap("ClientUploadBucket")
    public String clientUploadBucket;

    // 路径
    @NameInMap("ClientUploadPath")
    public String clientUploadPath;

    // 状态
    @NameInMap("ClientUploadStorageStatus")
    public String clientUploadStorageStatus;

    // 存储类型
    @NameInMap("ClientUploadStorageType")
    public String clientUploadStorageType;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetClientConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientConfigResponseBody self = new GetClientConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientConfigResponseBody setClientUploadBucket(String clientUploadBucket) {
        this.clientUploadBucket = clientUploadBucket;
        return this;
    }
    public String getClientUploadBucket() {
        return this.clientUploadBucket;
    }

    public GetClientConfigResponseBody setClientUploadPath(String clientUploadPath) {
        this.clientUploadPath = clientUploadPath;
        return this;
    }
    public String getClientUploadPath() {
        return this.clientUploadPath;
    }

    public GetClientConfigResponseBody setClientUploadStorageStatus(String clientUploadStorageStatus) {
        this.clientUploadStorageStatus = clientUploadStorageStatus;
        return this;
    }
    public String getClientUploadStorageStatus() {
        return this.clientUploadStorageStatus;
    }

    public GetClientConfigResponseBody setClientUploadStorageType(String clientUploadStorageType) {
        this.clientUploadStorageType = clientUploadStorageType;
        return this;
    }
    public String getClientUploadStorageType() {
        return this.clientUploadStorageType;
    }

    public GetClientConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
