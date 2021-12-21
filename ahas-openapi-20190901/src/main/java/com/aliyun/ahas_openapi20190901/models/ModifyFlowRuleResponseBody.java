// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyFlowRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModifyFlowRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowRuleResponseBody self = new ModifyFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyFlowRuleResponseBody setData(ModifyFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public ModifyFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyFlowRuleResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterEstimatedMaxQps")
        public Float clusterEstimatedMaxQps;

        @NameInMap("ClusterFallbackStrategy")
        public Integer clusterFallbackStrategy;

        @NameInMap("ClusterFallbackThreshold")
        public Integer clusterFallbackThreshold;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("ClusterThresholdType")
        public Integer clusterThresholdType;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("WarmUpPeriodSec")
        public Integer warmUpPeriodSec;

        public static ModifyFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowRuleResponseBodyData self = new ModifyFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyFlowRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ModifyFlowRuleResponseBodyData setClusterEstimatedMaxQps(Float clusterEstimatedMaxQps) {
            this.clusterEstimatedMaxQps = clusterEstimatedMaxQps;
            return this;
        }
        public Float getClusterEstimatedMaxQps() {
            return this.clusterEstimatedMaxQps;
        }

        public ModifyFlowRuleResponseBodyData setClusterFallbackStrategy(Integer clusterFallbackStrategy) {
            this.clusterFallbackStrategy = clusterFallbackStrategy;
            return this;
        }
        public Integer getClusterFallbackStrategy() {
            return this.clusterFallbackStrategy;
        }

        public ModifyFlowRuleResponseBodyData setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public ModifyFlowRuleResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public ModifyFlowRuleResponseBodyData setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public ModifyFlowRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ModifyFlowRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyFlowRuleResponseBodyData setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public ModifyFlowRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ModifyFlowRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyFlowRuleResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public ModifyFlowRuleResponseBodyData setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public ModifyFlowRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ModifyFlowRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ModifyFlowRuleResponseBodyData setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public ModifyFlowRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ModifyFlowRuleResponseBodyData setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

    }

}
