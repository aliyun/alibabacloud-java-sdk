// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateCircuitBreakerRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCircuitBreakerRuleResponseBody self = new UpdateCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCircuitBreakerRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCircuitBreakerRuleResponseBody setData(UpdateCircuitBreakerRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCircuitBreakerRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateCircuitBreakerRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCircuitBreakerRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateCircuitBreakerRuleResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxAllowedRtMs")
        public Integer maxAllowedRtMs;

        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RetryTimeoutMs")
        public Integer retryTimeoutMs;

        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("Threshold")
        public Float threshold;

        public static UpdateCircuitBreakerRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCircuitBreakerRuleResponseBodyData self = new UpdateCircuitBreakerRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCircuitBreakerRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setMaxAllowedRtMs(Integer maxAllowedRtMs) {
            this.maxAllowedRtMs = maxAllowedRtMs;
            return this;
        }
        public Integer getMaxAllowedRtMs() {
            return this.maxAllowedRtMs;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setRetryTimeoutMs(Integer retryTimeoutMs) {
            this.retryTimeoutMs = retryTimeoutMs;
            return this;
        }
        public Integer getRetryTimeoutMs() {
            return this.retryTimeoutMs;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public UpdateCircuitBreakerRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
