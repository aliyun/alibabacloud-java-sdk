// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEndpointSwitchTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("__context")
    public String context;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("timestamp")
    public String timestamp;

    public static GetEndpointSwitchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointSwitchTaskRequest self = new GetEndpointSwitchTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetEndpointSwitchTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetEndpointSwitchTaskRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetEndpointSwitchTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetEndpointSwitchTaskRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public GetEndpointSwitchTaskRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetEndpointSwitchTaskRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetEndpointSwitchTaskRequest setSkipAuth(String skipAuth) {
        this.skipAuth = skipAuth;
        return this;
    }
    public String getSkipAuth() {
        return this.skipAuth;
    }

    public GetEndpointSwitchTaskRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
