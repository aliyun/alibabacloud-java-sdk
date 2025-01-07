// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetAutoScalingRuleResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAutoScalingRuleResponseBodyData data;

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

    public static GetAutoScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingRuleResponseBody self = new GetAutoScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingRuleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAutoScalingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoScalingRuleResponseBody setData(GetAutoScalingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoScalingRuleResponseBodyData getData() {
        return this.data;
    }

    public GetAutoScalingRuleResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAutoScalingRuleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAutoScalingRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAutoScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoScalingRuleResponseBodyData extends TeaModel {
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

        public static GetAutoScalingRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingRuleResponseBodyData self = new GetAutoScalingRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingRuleResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public GetAutoScalingRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAutoScalingRuleResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetAutoScalingRuleResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoScalingRuleResponseBodyData setObservationWindow(Integer observationWindow) {
            this.observationWindow = observationWindow;
            return this;
        }
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        public GetAutoScalingRuleResponseBodyData setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public GetAutoScalingRuleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetAutoScalingRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetAutoScalingRuleResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetAutoScalingRuleResponseBodyData setScaleInStep(Integer scaleInStep) {
            this.scaleInStep = scaleInStep;
            return this;
        }
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        public GetAutoScalingRuleResponseBodyData setScaleOutStep(Integer scaleOutStep) {
            this.scaleOutStep = scaleOutStep;
            return this;
        }
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        public GetAutoScalingRuleResponseBodyData setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public GetAutoScalingRuleResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetAutoScalingRuleResponseBodyData setTargetMetric(String targetMetric) {
            this.targetMetric = targetMetric;
            return this;
        }
        public String getTargetMetric() {
            return this.targetMetric;
        }

        public GetAutoScalingRuleResponseBodyData setTargetNodes(Integer targetNodes) {
            this.targetNodes = targetNodes;
            return this;
        }
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        public GetAutoScalingRuleResponseBodyData setThresholdLower(Integer thresholdLower) {
            this.thresholdLower = thresholdLower;
            return this;
        }
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        public GetAutoScalingRuleResponseBodyData setThresholdUpper(Integer thresholdUpper) {
            this.thresholdUpper = thresholdUpper;
            return this;
        }
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        public GetAutoScalingRuleResponseBodyData setTriggerCronExpr(String triggerCronExpr) {
            this.triggerCronExpr = triggerCronExpr;
            return this;
        }
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

    }

}
