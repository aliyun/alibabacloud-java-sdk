// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAutoScalingRulesResponseBodyData data;

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

    public static ListAutoScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesResponseBody self = new ListAutoScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAutoScalingRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoScalingRulesResponseBody setData(ListAutoScalingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAutoScalingRulesResponseBodyData getData() {
        return this.data;
    }

    public ListAutoScalingRulesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAutoScalingRulesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAutoScalingRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAutoScalingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAutoScalingRulesResponseBodyDataScaleRules extends TeaModel {
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

        public static ListAutoScalingRulesResponseBodyDataScaleRules build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingRulesResponseBodyDataScaleRules self = new ListAutoScalingRulesResponseBodyDataScaleRules();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setObservationWindow(Integer observationWindow) {
            this.observationWindow = observationWindow;
            return this;
        }
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setScaleInStep(Integer scaleInStep) {
            this.scaleInStep = scaleInStep;
            return this;
        }
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setScaleOutStep(Integer scaleOutStep) {
            this.scaleOutStep = scaleOutStep;
            return this;
        }
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setTargetMetric(String targetMetric) {
            this.targetMetric = targetMetric;
            return this;
        }
        public String getTargetMetric() {
            return this.targetMetric;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setTargetNodes(Integer targetNodes) {
            this.targetNodes = targetNodes;
            return this;
        }
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setThresholdLower(Integer thresholdLower) {
            this.thresholdLower = thresholdLower;
            return this;
        }
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setThresholdUpper(Integer thresholdUpper) {
            this.thresholdUpper = thresholdUpper;
            return this;
        }
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        public ListAutoScalingRulesResponseBodyDataScaleRules setTriggerCronExpr(String triggerCronExpr) {
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

    }

    public static class ListAutoScalingRulesResponseBodyData extends TeaModel {
        @NameInMap("ScaleRules")
        public java.util.List<ListAutoScalingRulesResponseBodyDataScaleRules> scaleRules;

        public static ListAutoScalingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingRulesResponseBodyData self = new ListAutoScalingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingRulesResponseBodyData setScaleRules(java.util.List<ListAutoScalingRulesResponseBodyDataScaleRules> scaleRules) {
            this.scaleRules = scaleRules;
            return this;
        }
        public java.util.List<ListAutoScalingRulesResponseBodyDataScaleRules> getScaleRules() {
            return this.scaleRules;
        }

    }

}
