// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

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

    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    @NameInMap("Strategy")
    public Integer strategy;

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
