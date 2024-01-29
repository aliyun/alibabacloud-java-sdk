// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListCircuitBreakerRulesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("Data")
    public ListCircuitBreakerRulesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether the rule was enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The behavior that was bound to the rule.</p>
         */
        @NameInMap("FallbackObject")
        public String fallbackObject;

        /**
         * <p>The minimum number of requests that can be passed in each step after circuit breaking recovers.</p>
         */
        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        /**
         * <p>The number of circuit breaking recovery steps.</p>
         */
        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        /**
         * <p>The maximum RT. Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.</p>
         */
        @NameInMap("MaxAllowedRtMs")
        public Integer maxAllowedRtMs;

        /**
         * <p>The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met.</p>
         */
        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        /**
         * <p>The microservice namespace to which the application belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region in which the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the interface to which the rule is applicable. The interface name must be the same as the name on the interface details page in the console.</p>
         */
        @NameInMap("Resource")
        public String resource;

        @NameInMap("ResourceType")
        public Integer resourceType;

        /**
         * <p>The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period.</p>
         */
        @NameInMap("RetryTimeoutMs")
        public Integer retryTimeoutMs;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes.</p>
         */
        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        /**
         * <p>The threshold type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    slow call proportion</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   1</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    abnormal proportion</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.</p>
         */
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

        public ListCircuitBreakerRulesResponseBodyDataResult setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Integer getResourceType() {
            return this.resourceType;
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
        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned result.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListCircuitBreakerRulesResponseBodyDataResult> result;

        /**
         * <p>The total number of pages.</p>
         */
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
