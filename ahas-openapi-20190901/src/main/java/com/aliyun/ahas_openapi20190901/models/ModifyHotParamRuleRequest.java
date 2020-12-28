// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyHotParamRuleRequest extends TeaModel {
    @NameInMap("MetricType")
    public Integer metricType;

    @NameInMap("Threshold")
    public Float threshold;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("ParamIdx")
    public Integer paramIdx;

    @NameInMap("StatDurationSec")
    public Long statDurationSec;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("BurstCount")
    public Integer burstCount;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static ModifyHotParamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHotParamRuleRequest self = new ModifyHotParamRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHotParamRuleRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public ModifyHotParamRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public ModifyHotParamRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyHotParamRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyHotParamRuleRequest setParamIdx(Integer paramIdx) {
        this.paramIdx = paramIdx;
        return this;
    }
    public Integer getParamIdx() {
        return this.paramIdx;
    }

    public ModifyHotParamRuleRequest setStatDurationSec(Long statDurationSec) {
        this.statDurationSec = statDurationSec;
        return this;
    }
    public Long getStatDurationSec() {
        return this.statDurationSec;
    }

    public ModifyHotParamRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public ModifyHotParamRuleRequest setBurstCount(Integer burstCount) {
        this.burstCount = burstCount;
        return this;
    }
    public Integer getBurstCount() {
        return this.burstCount;
    }

    public ModifyHotParamRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public ModifyHotParamRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
