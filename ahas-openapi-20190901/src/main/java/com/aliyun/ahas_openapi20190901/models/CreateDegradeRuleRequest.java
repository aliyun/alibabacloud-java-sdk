// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateDegradeRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RecoveryTimeoutMs")
    public Integer recoveryTimeoutMs;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("SlowRtMs")
    public Integer slowRtMs;

    @NameInMap("StatDurationMs")
    public Integer statDurationMs;

    @NameInMap("Strategy")
    public Integer strategy;

    @NameInMap("Threshold")
    public Float threshold;

    public static CreateDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDegradeRuleRequest self = new CreateDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDegradeRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDegradeRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateDegradeRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public CreateDegradeRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public CreateDegradeRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public CreateDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateDegradeRuleRequest setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
        this.recoveryTimeoutMs = recoveryTimeoutMs;
        return this;
    }
    public Integer getRecoveryTimeoutMs() {
        return this.recoveryTimeoutMs;
    }

    public CreateDegradeRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateDegradeRuleRequest setSlowRtMs(Integer slowRtMs) {
        this.slowRtMs = slowRtMs;
        return this;
    }
    public Integer getSlowRtMs() {
        return this.slowRtMs;
    }

    public CreateDegradeRuleRequest setStatDurationMs(Integer statDurationMs) {
        this.statDurationMs = statDurationMs;
        return this;
    }
    public Integer getStatDurationMs() {
        return this.statDurationMs;
    }

    public CreateDegradeRuleRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public CreateDegradeRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
