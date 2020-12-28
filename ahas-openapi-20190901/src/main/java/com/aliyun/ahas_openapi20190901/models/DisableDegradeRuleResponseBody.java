// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableDegradeRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DisableDegradeRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DisableDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDegradeRuleResponseBody self = new DisableDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDegradeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableDegradeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableDegradeRuleResponseBody setData(DisableDegradeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableDegradeRuleResponseBodyData getData() {
        return this.data;
    }

    public DisableDegradeRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableDegradeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableDegradeRuleResponseBodyData extends TeaModel {
        @NameInMap("SlowRtMs")
        public Integer slowRtMs;

        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("RecoveryTimeoutMs")
        public Integer recoveryTimeoutMs;

        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        public static DisableDegradeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableDegradeRuleResponseBodyData self = new DisableDegradeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableDegradeRuleResponseBodyData setSlowRtMs(Integer slowRtMs) {
            this.slowRtMs = slowRtMs;
            return this;
        }
        public Integer getSlowRtMs() {
            return this.slowRtMs;
        }

        public DisableDegradeRuleResponseBodyData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public DisableDegradeRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DisableDegradeRuleResponseBodyData setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public DisableDegradeRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DisableDegradeRuleResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public DisableDegradeRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DisableDegradeRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DisableDegradeRuleResponseBodyData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public DisableDegradeRuleResponseBodyData setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
            this.recoveryTimeoutMs = recoveryTimeoutMs;
            return this;
        }
        public Integer getRecoveryTimeoutMs() {
            return this.recoveryTimeoutMs;
        }

        public DisableDegradeRuleResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public DisableDegradeRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DisableDegradeRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
