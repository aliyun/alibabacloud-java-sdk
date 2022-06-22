// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleListAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelFlowRuleListAllResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFlowRuleListAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleListAllResponseBody self = new SentinelFlowRuleListAllResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleListAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFlowRuleListAllResponseBody setData(java.util.List<SentinelFlowRuleListAllResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelFlowRuleListAllResponseBodyData> getData() {
        return this.data;
    }

    public SentinelFlowRuleListAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFlowRuleListAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFlowRuleListAllResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFlowRuleListAllResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("clusterFallbackThreshold")
        public Integer clusterFallbackThreshold;

        @NameInMap("clusterMode")
        public Boolean clusterMode;

        @NameInMap("clusterRequestMode")
        public Integer clusterRequestMode;

        @NameInMap("clusterThresholdType")
        public Integer clusterThresholdType;

        @NameInMap("controlBehavior")
        public Integer controlBehavior;

        @NameInMap("count")
        public Float count;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("estimatedMaxClusterQps")
        public Float estimatedMaxClusterQps;

        @NameInMap("fallbackToLocalWhenFail")
        public Boolean fallbackToLocalWhenFail;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("maxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("model")
        public Long model;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("refResource")
        public String refResource;

        @NameInMap("resource")
        public String resource;

        @NameInMap("sampleCount")
        public Integer sampleCount;

        @NameInMap("strategy")
        public Integer strategy;

        @NameInMap("userId")
        public String userId;

        @NameInMap("warmUpPeriodSec")
        public Integer warmUpPeriodSec;

        @NameInMap("windowIntervalMs")
        public Integer windowIntervalMs;

        public static SentinelFlowRuleListAllResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFlowRuleListAllResponseBodyData self = new SentinelFlowRuleListAllResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFlowRuleListAllResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFlowRuleListAllResponseBodyData setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public SentinelFlowRuleListAllResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public SentinelFlowRuleListAllResponseBodyData setClusterRequestMode(Integer clusterRequestMode) {
            this.clusterRequestMode = clusterRequestMode;
            return this;
        }
        public Integer getClusterRequestMode() {
            return this.clusterRequestMode;
        }

        public SentinelFlowRuleListAllResponseBodyData setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public SentinelFlowRuleListAllResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelFlowRuleListAllResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelFlowRuleListAllResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFlowRuleListAllResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelFlowRuleListAllResponseBodyData setEstimatedMaxClusterQps(Float estimatedMaxClusterQps) {
            this.estimatedMaxClusterQps = estimatedMaxClusterQps;
            return this;
        }
        public Float getEstimatedMaxClusterQps() {
            return this.estimatedMaxClusterQps;
        }

        public SentinelFlowRuleListAllResponseBodyData setFallbackToLocalWhenFail(Boolean fallbackToLocalWhenFail) {
            this.fallbackToLocalWhenFail = fallbackToLocalWhenFail;
            return this;
        }
        public Boolean getFallbackToLocalWhenFail() {
            return this.fallbackToLocalWhenFail;
        }

        public SentinelFlowRuleListAllResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelFlowRuleListAllResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFlowRuleListAllResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelFlowRuleListAllResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public SentinelFlowRuleListAllResponseBodyData setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public SentinelFlowRuleListAllResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFlowRuleListAllResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFlowRuleListAllResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public SentinelFlowRuleListAllResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFlowRuleListAllResponseBodyData setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public SentinelFlowRuleListAllResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public SentinelFlowRuleListAllResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFlowRuleListAllResponseBodyData setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

        public SentinelFlowRuleListAllResponseBodyData setWindowIntervalMs(Integer windowIntervalMs) {
            this.windowIntervalMs = windowIntervalMs;
            return this;
        }
        public Integer getWindowIntervalMs() {
            return this.windowIntervalMs;
        }

    }

}
