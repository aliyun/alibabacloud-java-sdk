// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateDegradeRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDegradeRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDegradeRuleResponseBody self = new CreateDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDegradeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDegradeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDegradeRuleResponseBody setData(CreateDegradeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDegradeRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateDegradeRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDegradeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDegradeRuleResponseBodyData extends TeaModel {
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

        public static CreateDegradeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDegradeRuleResponseBodyData self = new CreateDegradeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDegradeRuleResponseBodyData setSlowRtMs(Integer slowRtMs) {
            this.slowRtMs = slowRtMs;
            return this;
        }
        public Integer getSlowRtMs() {
            return this.slowRtMs;
        }

        public CreateDegradeRuleResponseBodyData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public CreateDegradeRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateDegradeRuleResponseBodyData setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public CreateDegradeRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public CreateDegradeRuleResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public CreateDegradeRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateDegradeRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateDegradeRuleResponseBodyData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public CreateDegradeRuleResponseBodyData setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
            this.recoveryTimeoutMs = recoveryTimeoutMs;
            return this;
        }
        public Integer getRecoveryTimeoutMs() {
            return this.recoveryTimeoutMs;
        }

        public CreateDegradeRuleResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public CreateDegradeRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public CreateDegradeRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
