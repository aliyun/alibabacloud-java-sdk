// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetAutoScalingConfigResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAutoScalingConfigResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAutoScalingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingConfigResponseBody self = new GetAutoScalingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAutoScalingConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoScalingConfigResponseBody setData(GetAutoScalingConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoScalingConfigResponseBodyData getData() {
        return this.data;
    }

    public GetAutoScalingConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAutoScalingConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAutoScalingConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAutoScalingConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoScalingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoScalingConfigResponseBodyDataScaleRuleList extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ObservationWindow")
        public Integer observationWindow;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("ScaleInStep")
        public Integer scaleInStep;

        @NameInMap("ScaleOutStep")
        public Integer scaleOutStep;

        @NameInMap("SilenceTime")
        public Integer silenceTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TargetMetric")
        public String targetMetric;

        @NameInMap("TargetNodes")
        public Integer targetNodes;

        @NameInMap("ThresholdLower")
        public Integer thresholdLower;

        @NameInMap("ThresholdUpper")
        public Integer thresholdUpper;

        @NameInMap("TriggerCronExpr")
        public String triggerCronExpr;

        public static GetAutoScalingConfigResponseBodyDataScaleRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingConfigResponseBodyDataScaleRuleList self = new GetAutoScalingConfigResponseBodyDataScaleRuleList();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setObservationWindow(Integer observationWindow) {
            this.observationWindow = observationWindow;
            return this;
        }
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setScaleInStep(Integer scaleInStep) {
            this.scaleInStep = scaleInStep;
            return this;
        }
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setScaleOutStep(Integer scaleOutStep) {
            this.scaleOutStep = scaleOutStep;
            return this;
        }
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setTargetMetric(String targetMetric) {
            this.targetMetric = targetMetric;
            return this;
        }
        public String getTargetMetric() {
            return this.targetMetric;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setTargetNodes(Integer targetNodes) {
            this.targetNodes = targetNodes;
            return this;
        }
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setThresholdLower(Integer thresholdLower) {
            this.thresholdLower = thresholdLower;
            return this;
        }
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setThresholdUpper(Integer thresholdUpper) {
            this.thresholdUpper = thresholdUpper;
            return this;
        }
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        public GetAutoScalingConfigResponseBodyDataScaleRuleList setTriggerCronExpr(String triggerCronExpr) {
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

    }

    public static class GetAutoScalingConfigResponseBodyData extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("EffectiveTimeEnd")
        public String effectiveTimeEnd;

        @NameInMap("EffectiveTimeStart")
        public String effectiveTimeStart;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NodesMax")
        public Integer nodesMax;

        @NameInMap("NodesMin")
        public Integer nodesMin;

        @NameInMap("ScaleRuleList")
        public java.util.List<GetAutoScalingConfigResponseBodyDataScaleRuleList> scaleRuleList;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("SpecId")
        public String specId;

        public static GetAutoScalingConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingConfigResponseBodyData self = new GetAutoScalingConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingConfigResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public GetAutoScalingConfigResponseBodyData setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetAutoScalingConfigResponseBodyData setEffectiveTimeEnd(String effectiveTimeEnd) {
            this.effectiveTimeEnd = effectiveTimeEnd;
            return this;
        }
        public String getEffectiveTimeEnd() {
            return this.effectiveTimeEnd;
        }

        public GetAutoScalingConfigResponseBodyData setEffectiveTimeStart(String effectiveTimeStart) {
            this.effectiveTimeStart = effectiveTimeStart;
            return this;
        }
        public String getEffectiveTimeStart() {
            return this.effectiveTimeStart;
        }

        public GetAutoScalingConfigResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAutoScalingConfigResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetAutoScalingConfigResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoScalingConfigResponseBodyData setNodesMax(Integer nodesMax) {
            this.nodesMax = nodesMax;
            return this;
        }
        public Integer getNodesMax() {
            return this.nodesMax;
        }

        public GetAutoScalingConfigResponseBodyData setNodesMin(Integer nodesMin) {
            this.nodesMin = nodesMin;
            return this;
        }
        public Integer getNodesMin() {
            return this.nodesMin;
        }

        public GetAutoScalingConfigResponseBodyData setScaleRuleList(java.util.List<GetAutoScalingConfigResponseBodyDataScaleRuleList> scaleRuleList) {
            this.scaleRuleList = scaleRuleList;
            return this;
        }
        public java.util.List<GetAutoScalingConfigResponseBodyDataScaleRuleList> getScaleRuleList() {
            return this.scaleRuleList;
        }

        public GetAutoScalingConfigResponseBodyData setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public GetAutoScalingConfigResponseBodyData setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

    }

}
