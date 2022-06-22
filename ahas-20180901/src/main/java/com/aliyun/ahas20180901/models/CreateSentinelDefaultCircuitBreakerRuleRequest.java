// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateSentinelDefaultCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Count")
    public Float count;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("SlowRatioThreshold")
    public Float slowRatioThreshold;

    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static CreateSentinelDefaultCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelDefaultCircuitBreakerRuleRequest self = new CreateSentinelDefaultCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setSlowRatioThreshold(Float slowRatioThreshold) {
        this.slowRatioThreshold = slowRatioThreshold;
        return this;
    }
    public Float getSlowRatioThreshold() {
        return this.slowRatioThreshold;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public CreateSentinelDefaultCircuitBreakerRuleRequest setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
