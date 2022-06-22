// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleEditRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Count")
    public Float count;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("HalfOpenBaseAmountPerStep")
    public Integer halfOpenBaseAmountPerStep;

    @NameInMap("HalfOpenRecoveryStepNum")
    public Integer halfOpenRecoveryStepNum;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("SlowRatioThreshold")
    public Float slowRatioThreshold;

    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static SentinelDegradeRuleEditRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleEditRequest self = new SentinelDegradeRuleEditRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleEditRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDegradeRuleEditRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelDegradeRuleEditRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelDegradeRuleEditRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public SentinelDegradeRuleEditRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public SentinelDegradeRuleEditRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelDegradeRuleEditRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public SentinelDegradeRuleEditRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelDegradeRuleEditRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelDegradeRuleEditRequest setSlowRatioThreshold(Float slowRatioThreshold) {
        this.slowRatioThreshold = slowRatioThreshold;
        return this;
    }
    public Float getSlowRatioThreshold() {
        return this.slowRatioThreshold;
    }

    public SentinelDegradeRuleEditRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public SentinelDegradeRuleEditRequest setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
