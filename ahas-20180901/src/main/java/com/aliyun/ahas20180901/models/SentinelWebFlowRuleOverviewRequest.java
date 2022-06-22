// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleOverviewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Burst")
    public Integer burst;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("Count")
    public Float count;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("FallbackId")
    public Long fallbackId;

    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("HasParam")
    public Boolean hasParam;

    @NameInMap("IntervalSec")
    public Long intervalSec;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MatchStrategy")
    public Integer matchStrategy;

    @NameInMap("MaxQueueingTimeoutMs")
    public Integer maxQueueingTimeoutMs;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ParseStrategy")
    public Integer parseStrategy;

    @NameInMap("Pattern")
    public String pattern;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceMode")
    public Integer resourceMode;

    public static SentinelWebFlowRuleOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleOverviewRequest self = new SentinelWebFlowRuleOverviewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleOverviewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelWebFlowRuleOverviewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelWebFlowRuleOverviewRequest setBurst(Integer burst) {
        this.burst = burst;
        return this;
    }
    public Integer getBurst() {
        return this.burst;
    }

    public SentinelWebFlowRuleOverviewRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public SentinelWebFlowRuleOverviewRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelWebFlowRuleOverviewRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SentinelWebFlowRuleOverviewRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public SentinelWebFlowRuleOverviewRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public SentinelWebFlowRuleOverviewRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelWebFlowRuleOverviewRequest setHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
        return this;
    }
    public Boolean getHasParam() {
        return this.hasParam;
    }

    public SentinelWebFlowRuleOverviewRequest setIntervalSec(Long intervalSec) {
        this.intervalSec = intervalSec;
        return this;
    }
    public Long getIntervalSec() {
        return this.intervalSec;
    }

    public SentinelWebFlowRuleOverviewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelWebFlowRuleOverviewRequest setMatchStrategy(Integer matchStrategy) {
        this.matchStrategy = matchStrategy;
        return this;
    }
    public Integer getMatchStrategy() {
        return this.matchStrategy;
    }

    public SentinelWebFlowRuleOverviewRequest setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
        this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
        return this;
    }
    public Integer getMaxQueueingTimeoutMs() {
        return this.maxQueueingTimeoutMs;
    }

    public SentinelWebFlowRuleOverviewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelWebFlowRuleOverviewRequest setParseStrategy(Integer parseStrategy) {
        this.parseStrategy = parseStrategy;
        return this;
    }
    public Integer getParseStrategy() {
        return this.parseStrategy;
    }

    public SentinelWebFlowRuleOverviewRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public SentinelWebFlowRuleOverviewRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelWebFlowRuleOverviewRequest setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }
    public Integer getResourceMode() {
        return this.resourceMode;
    }

}
