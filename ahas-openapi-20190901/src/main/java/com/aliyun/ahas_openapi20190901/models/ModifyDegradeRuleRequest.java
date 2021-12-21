// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyDegradeRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    @NameInMap("RecoveryTimeoutMs")
    public Integer recoveryTimeoutMs;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("SlowRtMs")
    public Integer slowRtMs;

    @NameInMap("StatDurationMs")
    public Integer statDurationMs;

    @NameInMap("Strategy")
    public Integer strategy;

    @NameInMap("Threshold")
    public Float threshold;

    public static ModifyDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDegradeRuleRequest self = new ModifyDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDegradeRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ModifyDegradeRuleRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public ModifyDegradeRuleRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public ModifyDegradeRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public ModifyDegradeRuleRequest setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
        this.recoveryTimeoutMs = recoveryTimeoutMs;
        return this;
    }
    public Integer getRecoveryTimeoutMs() {
        return this.recoveryTimeoutMs;
    }

    public ModifyDegradeRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyDegradeRuleRequest setSlowRtMs(Integer slowRtMs) {
        this.slowRtMs = slowRtMs;
        return this;
    }
    public Integer getSlowRtMs() {
        return this.slowRtMs;
    }

    public ModifyDegradeRuleRequest setStatDurationMs(Integer statDurationMs) {
        this.statDurationMs = statDurationMs;
        return this;
    }
    public Integer getStatDurationMs() {
        return this.statDurationMs;
    }

    public ModifyDegradeRuleRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public ModifyDegradeRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
