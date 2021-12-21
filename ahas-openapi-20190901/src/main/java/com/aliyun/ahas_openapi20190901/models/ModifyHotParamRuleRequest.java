// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyHotParamRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("BurstCount")
    public Integer burstCount;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("MetricType")
    public Integer metricType;

    @NameInMap("ParamIdx")
    public Integer paramIdx;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("StatDurationSec")
    public Long statDurationSec;

    @NameInMap("Threshold")
    public Float threshold;

    public static ModifyHotParamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHotParamRuleRequest self = new ModifyHotParamRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHotParamRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ModifyHotParamRuleRequest setBurstCount(Integer burstCount) {
        this.burstCount = burstCount;
        return this;
    }
    public Integer getBurstCount() {
        return this.burstCount;
    }

    public ModifyHotParamRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public ModifyHotParamRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyHotParamRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public ModifyHotParamRuleRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public ModifyHotParamRuleRequest setParamIdx(Integer paramIdx) {
        this.paramIdx = paramIdx;
        return this;
    }
    public Integer getParamIdx() {
        return this.paramIdx;
    }

    public ModifyHotParamRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyHotParamRuleRequest setStatDurationSec(Long statDurationSec) {
        this.statDurationSec = statDurationSec;
        return this;
    }
    public Long getStatDurationSec() {
        return this.statDurationSec;
    }

    public ModifyHotParamRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
