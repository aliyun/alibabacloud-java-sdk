// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateCircuitBreakerRuleResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@c3df23522bXXXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The minimum number of requests that can be passed in each step after circuit breaking recovers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        /**
         * <p>The number of circuit breaking recovery steps.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The maximum response time (RT). Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("MaxAllowedRtMs")
        public Integer maxAllowedRtMs;

        /**
         * <p>The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        /**
         * <p>The microservice namespace to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the interface to which the rule is applicable. The interface name must be the same as the name on the interface details page in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>/a</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RetryTimeoutMs")
        public Integer retryTimeoutMs;

        /**
         * <p>The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        /**
         * <p>The threshold type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>0</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Slow call ratio</p>
         * <!-- -->
         * </li>
         * <li><p>1</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Abnormal proportion</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
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
