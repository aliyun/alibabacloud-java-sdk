// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOverviewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Count")
    public Float count;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("FallbackId")
    public Long fallbackId;

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

    @NameInMap("Resource")
    public String resource;

    @NameInMap("SlowRatioThreshold")
    public Float slowRatioThreshold;

    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static SentinelDegradeRuleOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOverviewRequest self = new SentinelDegradeRuleOverviewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOverviewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDegradeRuleOverviewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelDegradeRuleOverviewRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelDegradeRuleOverviewRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SentinelDegradeRuleOverviewRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public SentinelDegradeRuleOverviewRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelDegradeRuleOverviewRequest setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
        this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
        return this;
    }
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    public SentinelDegradeRuleOverviewRequest setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
        this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
        return this;
    }
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    public SentinelDegradeRuleOverviewRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public SentinelDegradeRuleOverviewRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public SentinelDegradeRuleOverviewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelDegradeRuleOverviewRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelDegradeRuleOverviewRequest setSlowRatioThreshold(Float slowRatioThreshold) {
        this.slowRatioThreshold = slowRatioThreshold;
        return this;
    }
    public Float getSlowRatioThreshold() {
        return this.slowRatioThreshold;
    }

    public SentinelDegradeRuleOverviewRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public SentinelDegradeRuleOverviewRequest setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
