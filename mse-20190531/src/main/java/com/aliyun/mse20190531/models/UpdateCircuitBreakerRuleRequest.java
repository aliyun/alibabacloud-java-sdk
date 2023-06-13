// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateCircuitBreakerRuleRequest extends TeaModel {
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

    public static UpdateCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCircuitBreakerRuleRequest self = new UpdateCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCircuitBreakerRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCircuitBreakerRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCircuitBreakerRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateCircuitBreakerRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateCircuitBreakerRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public UpdateCircuitBreakerRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public UpdateCircuitBreakerRuleRequest setMaxAllowedRtMs(Integer maxAllowedRtMs) {
        this.maxAllowedRtMs = maxAllowedRtMs;
        return this;
    }
    public Integer getMaxAllowedRtMs() {
        return this.maxAllowedRtMs;
    }

    public UpdateCircuitBreakerRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public UpdateCircuitBreakerRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateCircuitBreakerRuleRequest setRetryTimeoutMs(Integer retryTimeoutMs) {
        this.retryTimeoutMs = retryTimeoutMs;
        return this;
    }
    public Integer getRetryTimeoutMs() {
        return this.retryTimeoutMs;
    }

    public UpdateCircuitBreakerRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateCircuitBreakerRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public UpdateCircuitBreakerRuleRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public UpdateCircuitBreakerRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
