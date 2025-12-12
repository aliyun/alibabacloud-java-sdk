// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListAutoScalingConfigsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAutoScalingConfigsResponseBodyData data;

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

    public static ListAutoScalingConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingConfigsResponseBody self = new ListAutoScalingConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingConfigsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAutoScalingConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoScalingConfigsResponseBody setData(ListAutoScalingConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAutoScalingConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListAutoScalingConfigsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAutoScalingConfigsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAutoScalingConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAutoScalingConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoScalingConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList extends TeaModel {
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

        public static ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList self = new ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setObservationWindow(Integer observationWindow) {
            this.observationWindow = observationWindow;
            return this;
        }
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setScaleInStep(Integer scaleInStep) {
            this.scaleInStep = scaleInStep;
            return this;
        }
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setScaleOutStep(Integer scaleOutStep) {
            this.scaleOutStep = scaleOutStep;
            return this;
        }
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setTargetMetric(String targetMetric) {
            this.targetMetric = targetMetric;
            return this;
        }
        public String getTargetMetric() {
            return this.targetMetric;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setTargetNodes(Integer targetNodes) {
            this.targetNodes = targetNodes;
            return this;
        }
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setThresholdLower(Integer thresholdLower) {
            this.thresholdLower = thresholdLower;
            return this;
        }
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setThresholdUpper(Integer thresholdUpper) {
            this.thresholdUpper = thresholdUpper;
            return this;
        }
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList setTriggerCronExpr(String triggerCronExpr) {
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

    }

    public static class ListAutoScalingConfigsResponseBodyDataScaleConfigs extends TeaModel {
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
        public java.util.List<ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList> scaleRuleList;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("SpecId")
        public String specId;

        @NameInMap("StorageCapacityMax")
        public Long storageCapacityMax;

        public static ListAutoScalingConfigsResponseBodyDataScaleConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingConfigsResponseBodyDataScaleConfigs self = new ListAutoScalingConfigsResponseBodyDataScaleConfigs();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setEffectiveTimeEnd(String effectiveTimeEnd) {
            this.effectiveTimeEnd = effectiveTimeEnd;
            return this;
        }
        public String getEffectiveTimeEnd() {
            return this.effectiveTimeEnd;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setEffectiveTimeStart(String effectiveTimeStart) {
            this.effectiveTimeStart = effectiveTimeStart;
            return this;
        }
        public String getEffectiveTimeStart() {
            return this.effectiveTimeStart;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setNodesMax(Integer nodesMax) {
            this.nodesMax = nodesMax;
            return this;
        }
        public Integer getNodesMax() {
            return this.nodesMax;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setNodesMin(Integer nodesMin) {
            this.nodesMin = nodesMin;
            return this;
        }
        public Integer getNodesMin() {
            return this.nodesMin;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setScaleRuleList(java.util.List<ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList> scaleRuleList) {
            this.scaleRuleList = scaleRuleList;
            return this;
        }
        public java.util.List<ListAutoScalingConfigsResponseBodyDataScaleConfigsScaleRuleList> getScaleRuleList() {
            return this.scaleRuleList;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setSpecId(String specId) {
            this.specId = specId;
            return this;
        }
        public String getSpecId() {
            return this.specId;
        }

        public ListAutoScalingConfigsResponseBodyDataScaleConfigs setStorageCapacityMax(Long storageCapacityMax) {
            this.storageCapacityMax = storageCapacityMax;
            return this;
        }
        public Long getStorageCapacityMax() {
            return this.storageCapacityMax;
        }

    }

    public static class ListAutoScalingConfigsResponseBodyData extends TeaModel {
        @NameInMap("ScaleConfigs")
        public java.util.List<ListAutoScalingConfigsResponseBodyDataScaleConfigs> scaleConfigs;

        public static ListAutoScalingConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingConfigsResponseBodyData self = new ListAutoScalingConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingConfigsResponseBodyData setScaleConfigs(java.util.List<ListAutoScalingConfigsResponseBodyDataScaleConfigs> scaleConfigs) {
            this.scaleConfigs = scaleConfigs;
            return this;
        }
        public java.util.List<ListAutoScalingConfigsResponseBodyDataScaleConfigs> getScaleConfigs() {
            return this.scaleConfigs;
        }

    }

}
