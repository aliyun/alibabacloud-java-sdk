// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleEditResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelFlowRuleEditResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFlowRuleEditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleEditResponseBody self = new SentinelFlowRuleEditResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleEditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFlowRuleEditResponseBody setData(SentinelFlowRuleEditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelFlowRuleEditResponseBodyData getData() {
        return this.data;
    }

    public SentinelFlowRuleEditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFlowRuleEditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFlowRuleEditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFlowRuleEditResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("autoAdjustFallbackThresholdEnabled")
        public Boolean autoAdjustFallbackThresholdEnabled;

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

        @NameInMap("fallbackThresholdAdjustMargin")
        public Integer fallbackThresholdAdjustMargin;

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

        @NameInMap("thresholdMode")
        public Integer thresholdMode;

        @NameInMap("userId")
        public String userId;

        @NameInMap("warmUpPeriodSec")
        public Integer warmUpPeriodSec;

        @NameInMap("windowIntervalMs")
        public Integer windowIntervalMs;

        public static SentinelFlowRuleEditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFlowRuleEditResponseBodyData self = new SentinelFlowRuleEditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFlowRuleEditResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFlowRuleEditResponseBodyData setAutoAdjustFallbackThresholdEnabled(Boolean autoAdjustFallbackThresholdEnabled) {
            this.autoAdjustFallbackThresholdEnabled = autoAdjustFallbackThresholdEnabled;
            return this;
        }
        public Boolean getAutoAdjustFallbackThresholdEnabled() {
            return this.autoAdjustFallbackThresholdEnabled;
        }

        public SentinelFlowRuleEditResponseBodyData setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public SentinelFlowRuleEditResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public SentinelFlowRuleEditResponseBodyData setClusterRequestMode(Integer clusterRequestMode) {
            this.clusterRequestMode = clusterRequestMode;
            return this;
        }
        public Integer getClusterRequestMode() {
            return this.clusterRequestMode;
        }

        public SentinelFlowRuleEditResponseBodyData setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public SentinelFlowRuleEditResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelFlowRuleEditResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelFlowRuleEditResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFlowRuleEditResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelFlowRuleEditResponseBodyData setEstimatedMaxClusterQps(Float estimatedMaxClusterQps) {
            this.estimatedMaxClusterQps = estimatedMaxClusterQps;
            return this;
        }
        public Float getEstimatedMaxClusterQps() {
            return this.estimatedMaxClusterQps;
        }

        public SentinelFlowRuleEditResponseBodyData setFallbackThresholdAdjustMargin(Integer fallbackThresholdAdjustMargin) {
            this.fallbackThresholdAdjustMargin = fallbackThresholdAdjustMargin;
            return this;
        }
        public Integer getFallbackThresholdAdjustMargin() {
            return this.fallbackThresholdAdjustMargin;
        }

        public SentinelFlowRuleEditResponseBodyData setFallbackToLocalWhenFail(Boolean fallbackToLocalWhenFail) {
            this.fallbackToLocalWhenFail = fallbackToLocalWhenFail;
            return this;
        }
        public Boolean getFallbackToLocalWhenFail() {
            return this.fallbackToLocalWhenFail;
        }

        public SentinelFlowRuleEditResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelFlowRuleEditResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFlowRuleEditResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelFlowRuleEditResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public SentinelFlowRuleEditResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFlowRuleEditResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFlowRuleEditResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public SentinelFlowRuleEditResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFlowRuleEditResponseBodyData setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public SentinelFlowRuleEditResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public SentinelFlowRuleEditResponseBodyData setThresholdMode(Integer thresholdMode) {
            this.thresholdMode = thresholdMode;
            return this;
        }
        public Integer getThresholdMode() {
            return this.thresholdMode;
        }

        public SentinelFlowRuleEditResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFlowRuleEditResponseBodyData setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

        public SentinelFlowRuleEditResponseBodyData setWindowIntervalMs(Integer windowIntervalMs) {
            this.windowIntervalMs = windowIntervalMs;
            return this;
        }
        public Integer getWindowIntervalMs() {
            return this.windowIntervalMs;
        }

    }

}
