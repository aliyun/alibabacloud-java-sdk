// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleNewRequest extends TeaModel {
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

    public static SentinelGatewayFlowRuleNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleNewRequest self = new SentinelGatewayFlowRuleNewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleNewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGatewayFlowRuleNewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelGatewayFlowRuleNewRequest setBurst(Integer burst) {
        this.burst = burst;
        return this;
    }
    public Integer getBurst() {
        return this.burst;
    }

    public SentinelGatewayFlowRuleNewRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public SentinelGatewayFlowRuleNewRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelGatewayFlowRuleNewRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SentinelGatewayFlowRuleNewRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public SentinelGatewayFlowRuleNewRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelGatewayFlowRuleNewRequest setHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
        return this;
    }
    public Boolean getHasParam() {
        return this.hasParam;
    }

    public SentinelGatewayFlowRuleNewRequest setIntervalSec(Long intervalSec) {
        this.intervalSec = intervalSec;
        return this;
    }
    public Long getIntervalSec() {
        return this.intervalSec;
    }

    public SentinelGatewayFlowRuleNewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGatewayFlowRuleNewRequest setMatchStrategy(Integer matchStrategy) {
        this.matchStrategy = matchStrategy;
        return this;
    }
    public Integer getMatchStrategy() {
        return this.matchStrategy;
    }

    public SentinelGatewayFlowRuleNewRequest setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
        this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
        return this;
    }
    public Integer getMaxQueueingTimeoutMs() {
        return this.maxQueueingTimeoutMs;
    }

    public SentinelGatewayFlowRuleNewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelGatewayFlowRuleNewRequest setParseStrategy(Integer parseStrategy) {
        this.parseStrategy = parseStrategy;
        return this;
    }
    public Integer getParseStrategy() {
        return this.parseStrategy;
    }

    public SentinelGatewayFlowRuleNewRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public SentinelGatewayFlowRuleNewRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelGatewayFlowRuleNewRequest setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }
    public Integer getResourceMode() {
        return this.resourceMode;
    }

}
