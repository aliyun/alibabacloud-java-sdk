// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPartitionsHeatmapRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TimeRange")
    public String timeRange;

    @NameInMap("Type")
    public String type;

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

    public static GetPartitionsHeatmapRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsHeatmapRequest self = new GetPartitionsHeatmapRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionsHeatmapRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetPartitionsHeatmapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPartitionsHeatmapRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public GetPartitionsHeatmapRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetPartitionsHeatmapRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetPartitionsHeatmapRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetPartitionsHeatmapRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public GetPartitionsHeatmapRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetPartitionsHeatmapRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetPartitionsHeatmapRequest setSkipAuth(String skipAuth) {
        this.skipAuth = skipAuth;
        return this;
    }
    public String getSkipAuth() {
        return this.skipAuth;
    }

    public GetPartitionsHeatmapRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
