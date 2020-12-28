// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateFlowRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateFlowRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRuleResponseBody self = new CreateFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowRuleResponseBody setData(CreateFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFlowRuleResponseBodyData extends TeaModel {
        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("ClusterFallbackThreshold")
        public Integer clusterFallbackThreshold;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        @NameInMap("ClusterThresholdType")
        public Integer clusterThresholdType;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ClusterEstimatedMaxQps")
        public Float clusterEstimatedMaxQps;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("ClusterFallbackStrategy")
        public Integer clusterFallbackStrategy;

        @NameInMap("WarmUpPeriodSec")
        public Integer warmUpPeriodSec;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        public static CreateFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowRuleResponseBodyData self = new CreateFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFlowRuleResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public CreateFlowRuleResponseBodyData setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public CreateFlowRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateFlowRuleResponseBodyData setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public CreateFlowRuleResponseBodyData setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public CreateFlowRuleResponseBodyData setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public CreateFlowRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public CreateFlowRuleResponseBodyData setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public CreateFlowRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateFlowRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateFlowRuleResponseBodyData setClusterEstimatedMaxQps(Float clusterEstimatedMaxQps) {
            this.clusterEstimatedMaxQps = clusterEstimatedMaxQps;
            return this;
        }
        public Float getClusterEstimatedMaxQps() {
            return this.clusterEstimatedMaxQps;
        }

        public CreateFlowRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public CreateFlowRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public CreateFlowRuleResponseBodyData setClusterFallbackStrategy(Integer clusterFallbackStrategy) {
            this.clusterFallbackStrategy = clusterFallbackStrategy;
            return this;
        }
        public Integer getClusterFallbackStrategy() {
            return this.clusterFallbackStrategy;
        }

        public CreateFlowRuleResponseBodyData setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

        public CreateFlowRuleResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public CreateFlowRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public CreateFlowRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
