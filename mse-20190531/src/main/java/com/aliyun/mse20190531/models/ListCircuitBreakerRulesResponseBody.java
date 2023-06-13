// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListCircuitBreakerRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListCircuitBreakerRulesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCircuitBreakerRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCircuitBreakerRulesResponseBody self = new ListCircuitBreakerRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCircuitBreakerRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCircuitBreakerRulesResponseBody setData(ListCircuitBreakerRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCircuitBreakerRulesResponseBodyData getData() {
        return this.data;
    }

    public ListCircuitBreakerRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCircuitBreakerRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCircuitBreakerRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCircuitBreakerRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCircuitBreakerRulesResponseBodyDataResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("FallbackObject")
        public String fallbackObject;

        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("MaxAllowedRtMs")
        public Integer maxAllowedRtMs;

        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RetryTimeoutMs")
        public Integer retryTimeoutMs;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListCircuitBreakerRulesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListCircuitBreakerRulesResponseBodyDataResult self = new ListCircuitBreakerRulesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setMaxAllowedRtMs(Integer maxAllowedRtMs) {
            this.maxAllowedRtMs = maxAllowedRtMs;
            return this;
        }
        public Integer getMaxAllowedRtMs() {
            return this.maxAllowedRtMs;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setRetryTimeoutMs(Integer retryTimeoutMs) {
            this.retryTimeoutMs = retryTimeoutMs;
            return this;
        }
        public Integer getRetryTimeoutMs() {
            return this.retryTimeoutMs;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ListCircuitBreakerRulesResponseBodyDataResult setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListCircuitBreakerRulesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListCircuitBreakerRulesResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListCircuitBreakerRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCircuitBreakerRulesResponseBodyData self = new ListCircuitBreakerRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCircuitBreakerRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCircuitBreakerRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCircuitBreakerRulesResponseBodyData setResult(java.util.List<ListCircuitBreakerRulesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListCircuitBreakerRulesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListCircuitBreakerRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
