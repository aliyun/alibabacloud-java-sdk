// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateCircuitBreakerRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1po62@c3df23522bXXXXX</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to enable the rule.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The minimum number of requests that can be passed in each step after circuit breaking recovers. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    /**
     * <p>The number of circuit breaking recovery steps. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    /**
     * <p>The maximum response time (RT). Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxAllowedRtMs")
    public Integer maxAllowedRtMs;

    /**
     * <p>The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     * <p>This parameter is required.</p>
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
     * <p>The name of the interface to which the rule applies. The interface name must be the same as the name on the interface details page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/a</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period. The value must be an integral multiple of 1,000. Default value: 10000. This value indicates 10 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("RetryTimeoutMs")
    public Integer retryTimeoutMs;

    /**
     * <p>The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes. The default value is 20000. This value indicates 20 seconds.</p>
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
     * <p>slow call proportion</p>
     * <!-- -->
     * </li>
     * <li><p>1</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>abnormal proportion</p>
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Strategy")
    public Integer strategy;

    /**
     * <p>A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static CreateCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCircuitBreakerRuleRequest self = new CreateCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCircuitBreakerRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCircuitBreakerRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCircuitBreakerRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateCircuitBreakerRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateCircuitBreakerRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public CreateCircuitBreakerRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public CreateCircuitBreakerRuleRequest setMaxAllowedRtMs(Integer maxAllowedRtMs) {
        this.maxAllowedRtMs = maxAllowedRtMs;
        return this;
    }
    public Integer getMaxAllowedRtMs() {
        return this.maxAllowedRtMs;
    }

    public CreateCircuitBreakerRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public CreateCircuitBreakerRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateCircuitBreakerRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCircuitBreakerRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateCircuitBreakerRuleRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public CreateCircuitBreakerRuleRequest setRetryTimeoutMs(Integer retryTimeoutMs) {
        this.retryTimeoutMs = retryTimeoutMs;
        return this;
    }
    public Integer getRetryTimeoutMs() {
        return this.retryTimeoutMs;
    }

    public CreateCircuitBreakerRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public CreateCircuitBreakerRuleRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public CreateCircuitBreakerRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
