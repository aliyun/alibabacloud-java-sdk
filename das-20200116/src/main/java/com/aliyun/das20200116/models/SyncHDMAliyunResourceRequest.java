// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SyncHDMAliyunResourceRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("__context")
    public String context;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Async")
    public String async;

    @NameInMap("WaitForModifySecurityIps")
    public String waitForModifySecurityIps;

    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static SyncHDMAliyunResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncHDMAliyunResourceRequest self = new SyncHDMAliyunResourceRequest();
        return TeaModel.build(map, self);
    }

    public SyncHDMAliyunResourceRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public SyncHDMAliyunResourceRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public SyncHDMAliyunResourceRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public SyncHDMAliyunResourceRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public SyncHDMAliyunResourceRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public SyncHDMAliyunResourceRequest setSkipAuth(String skipAuth) {
        this.skipAuth = skipAuth;
        return this;
    }
    public String getSkipAuth() {
        return this.skipAuth;
    }

    public SyncHDMAliyunResourceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SyncHDMAliyunResourceRequest setAsync(String async) {
        this.async = async;
        return this;
    }
    public String getAsync() {
        return this.async;
    }

    public SyncHDMAliyunResourceRequest setWaitForModifySecurityIps(String waitForModifySecurityIps) {
        this.waitForModifySecurityIps = waitForModifySecurityIps;
        return this;
    }
    public String getWaitForModifySecurityIps() {
        return this.waitForModifySecurityIps;
    }

    public SyncHDMAliyunResourceRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
