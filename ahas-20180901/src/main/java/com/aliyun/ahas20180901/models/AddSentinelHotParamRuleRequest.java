// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddSentinelHotParamRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BurstCount")
    public Integer burstCount;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("Count")
    public Float count;

    @NameInMap("DurationInSec")
    public Long durationInSec;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ParamIdx")
    public Integer paramIdx;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("Tags")
    public String tags;

    public static AddSentinelHotParamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSentinelHotParamRuleRequest self = new AddSentinelHotParamRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddSentinelHotParamRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public AddSentinelHotParamRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddSentinelHotParamRuleRequest setBurstCount(Integer burstCount) {
        this.burstCount = burstCount;
        return this;
    }
    public Integer getBurstCount() {
        return this.burstCount;
    }

    public AddSentinelHotParamRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public AddSentinelHotParamRuleRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public AddSentinelHotParamRuleRequest setDurationInSec(Long durationInSec) {
        this.durationInSec = durationInSec;
        return this;
    }
    public Long getDurationInSec() {
        return this.durationInSec;
    }

    public AddSentinelHotParamRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AddSentinelHotParamRuleRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public AddSentinelHotParamRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddSentinelHotParamRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public AddSentinelHotParamRuleRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public AddSentinelHotParamRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddSentinelHotParamRuleRequest setParamIdx(Integer paramIdx) {
        this.paramIdx = paramIdx;
        return this;
    }
    public Integer getParamIdx() {
        return this.paramIdx;
    }

    public AddSentinelHotParamRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public AddSentinelHotParamRuleRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
