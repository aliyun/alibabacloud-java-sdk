// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleEditRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Burst")
    public Integer burst;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("Count")
    public Float count;

    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("HasParam")
    public Boolean hasParam;

    @NameInMap("Id")
    public Long id;

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

    public static SentinelGatewayFlowRuleEditRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleEditRequest self = new SentinelGatewayFlowRuleEditRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleEditRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGatewayFlowRuleEditRequest setBurst(Integer burst) {
        this.burst = burst;
        return this;
    }
    public Integer getBurst() {
        return this.burst;
    }

    public SentinelGatewayFlowRuleEditRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public SentinelGatewayFlowRuleEditRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelGatewayFlowRuleEditRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public SentinelGatewayFlowRuleEditRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelGatewayFlowRuleEditRequest setHasParam(Boolean hasParam) {
        this.hasParam = hasParam;
        return this;
    }
    public Boolean getHasParam() {
        return this.hasParam;
    }

    public SentinelGatewayFlowRuleEditRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelGatewayFlowRuleEditRequest setIntervalSec(Long intervalSec) {
        this.intervalSec = intervalSec;
        return this;
    }
    public Long getIntervalSec() {
        return this.intervalSec;
    }

    public SentinelGatewayFlowRuleEditRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGatewayFlowRuleEditRequest setMatchStrategy(Integer matchStrategy) {
        this.matchStrategy = matchStrategy;
        return this;
    }
    public Integer getMatchStrategy() {
        return this.matchStrategy;
    }

    public SentinelGatewayFlowRuleEditRequest setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
        this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
        return this;
    }
    public Integer getMaxQueueingTimeoutMs() {
        return this.maxQueueingTimeoutMs;
    }

    public SentinelGatewayFlowRuleEditRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelGatewayFlowRuleEditRequest setParseStrategy(Integer parseStrategy) {
        this.parseStrategy = parseStrategy;
        return this;
    }
    public Integer getParseStrategy() {
        return this.parseStrategy;
    }

    public SentinelGatewayFlowRuleEditRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public SentinelGatewayFlowRuleEditRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelGatewayFlowRuleEditRequest setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }
    public Integer getResourceMode() {
        return this.resourceMode;
    }

}
