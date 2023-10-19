// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateCircuitBreakerRuleResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("Data")
    public CreateCircuitBreakerRuleResponseBodyData data;

    /**
     * <p>The message returned.</p>
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
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCircuitBreakerRuleResponseBody self = new CreateCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCircuitBreakerRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCircuitBreakerRuleResponseBody setData(CreateCircuitBreakerRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCircuitBreakerRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateCircuitBreakerRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCircuitBreakerRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCircuitBreakerRuleResponseBodyData extends TeaModel {
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
         * <p>Indicates whether the rule is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

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
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The maximum response time (RT). Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.</p>
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

        /**
         * <p>The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period.</p>
         */
        @NameInMap("RetryTimeoutMs")
        public Integer retryTimeoutMs;

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
         * <p>    Slow call ratio</p>
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
         * <p>    Abnormal proportion</p>
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

        public static CreateCircuitBreakerRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCircuitBreakerRuleResponseBodyData self = new CreateCircuitBreakerRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCircuitBreakerRuleResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateCircuitBreakerRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateCircuitBreakerRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateCircuitBreakerRuleResponseBodyData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public CreateCircuitBreakerRuleResponseBodyData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public CreateCircuitBreakerRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCircuitBreakerRuleResponseBodyData setMaxAllowedRtMs(Integer maxAllowedRtMs) {
            this.maxAllowedRtMs = maxAllowedRtMs;
            return this;
        }
        public Integer getMaxAllowedRtMs() {
            return this.maxAllowedRtMs;
        }

        public CreateCircuitBreakerRuleResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public CreateCircuitBreakerRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateCircuitBreakerRuleResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateCircuitBreakerRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateCircuitBreakerRuleResponseBodyData setRetryTimeoutMs(Integer retryTimeoutMs) {
            this.retryTimeoutMs = retryTimeoutMs;
            return this;
        }
        public Integer getRetryTimeoutMs() {
            return this.retryTimeoutMs;
        }

        public CreateCircuitBreakerRuleResponseBodyData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public CreateCircuitBreakerRuleResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public CreateCircuitBreakerRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
