// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateHotParamRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

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

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ParamIdx")
    public Integer paramIdx;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StatDurationSec")
    public Long statDurationSec;

    @NameInMap("Threshold")
    public Float threshold;

    public static CreateHotParamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotParamRuleRequest self = new CreateHotParamRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotParamRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateHotParamRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateHotParamRuleRequest setBurstCount(Integer burstCount) {
        this.burstCount = burstCount;
        return this;
    }
    public Integer getBurstCount() {
        return this.burstCount;
    }

    public CreateHotParamRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public CreateHotParamRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateHotParamRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public CreateHotParamRuleRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public CreateHotParamRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateHotParamRuleRequest setParamIdx(Integer paramIdx) {
        this.paramIdx = paramIdx;
        return this;
    }
    public Integer getParamIdx() {
        return this.paramIdx;
    }

    public CreateHotParamRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateHotParamRuleRequest setStatDurationSec(Long statDurationSec) {
        this.statDurationSec = statDurationSec;
        return this;
    }
    public Long getStatDurationSec() {
        return this.statDurationSec;
    }

    public CreateHotParamRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
