// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleNewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AutoAdjustFallbackThresholdEnabled")
    public Boolean autoAdjustFallbackThresholdEnabled;

    @NameInMap("ClusterFallbackThreshold")
    public Integer clusterFallbackThreshold;

    @NameInMap("ClusterMode")
    public Boolean clusterMode;

    @NameInMap("ClusterRequestMode")
    public Integer clusterRequestMode;

    @NameInMap("ClusterThresholdType")
    public Integer clusterThresholdType;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("Count")
    public Float count;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("EstimatedMaxClusterQps")
    public Float estimatedMaxClusterQps;

    @NameInMap("FallbackThresholdAdjustMargin")
    public Integer fallbackThresholdAdjustMargin;

    @NameInMap("FallbackToLocalWhenFail")
    public Boolean fallbackToLocalWhenFail;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("LimitApp")
    public String limitApp;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RefResource")
    public String refResource;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("SampleCount")
    public Integer sampleCount;

    @NameInMap("Strategy")
    public Integer strategy;

    @NameInMap("ThresholdMode")
    public Integer thresholdMode;

    @NameInMap("WarmUpPeriodSec")
    public Integer warmUpPeriodSec;

    @NameInMap("WindowIntervalMs")
    public Integer windowIntervalMs;

    public static SentinelFlowRuleNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleNewRequest self = new SentinelFlowRuleNewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleNewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFlowRuleNewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelFlowRuleNewRequest setAutoAdjustFallbackThresholdEnabled(Boolean autoAdjustFallbackThresholdEnabled) {
        this.autoAdjustFallbackThresholdEnabled = autoAdjustFallbackThresholdEnabled;
        return this;
    }
    public Boolean getAutoAdjustFallbackThresholdEnabled() {
        return this.autoAdjustFallbackThresholdEnabled;
    }

    public SentinelFlowRuleNewRequest setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
        this.clusterFallbackThreshold = clusterFallbackThreshold;
        return this;
    }
    public Integer getClusterFallbackThreshold() {
        return this.clusterFallbackThreshold;
    }

    public SentinelFlowRuleNewRequest setClusterMode(Boolean clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public Boolean getClusterMode() {
        return this.clusterMode;
    }

    public SentinelFlowRuleNewRequest setClusterRequestMode(Integer clusterRequestMode) {
        this.clusterRequestMode = clusterRequestMode;
        return this;
    }
    public Integer getClusterRequestMode() {
        return this.clusterRequestMode;
    }

    public SentinelFlowRuleNewRequest setClusterThresholdType(Integer clusterThresholdType) {
        this.clusterThresholdType = clusterThresholdType;
        return this;
    }
    public Integer getClusterThresholdType() {
        return this.clusterThresholdType;
    }

    public SentinelFlowRuleNewRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public SentinelFlowRuleNewRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelFlowRuleNewRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SentinelFlowRuleNewRequest setEstimatedMaxClusterQps(Float estimatedMaxClusterQps) {
        this.estimatedMaxClusterQps = estimatedMaxClusterQps;
        return this;
    }
    public Float getEstimatedMaxClusterQps() {
        return this.estimatedMaxClusterQps;
    }

    public SentinelFlowRuleNewRequest setFallbackThresholdAdjustMargin(Integer fallbackThresholdAdjustMargin) {
        this.fallbackThresholdAdjustMargin = fallbackThresholdAdjustMargin;
        return this;
    }
    public Integer getFallbackThresholdAdjustMargin() {
        return this.fallbackThresholdAdjustMargin;
    }

    public SentinelFlowRuleNewRequest setFallbackToLocalWhenFail(Boolean fallbackToLocalWhenFail) {
        this.fallbackToLocalWhenFail = fallbackToLocalWhenFail;
        return this;
    }
    public Boolean getFallbackToLocalWhenFail() {
        return this.fallbackToLocalWhenFail;
    }

    public SentinelFlowRuleNewRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelFlowRuleNewRequest setLimitApp(String limitApp) {
        this.limitApp = limitApp;
        return this;
    }
    public String getLimitApp() {
        return this.limitApp;
    }

    public SentinelFlowRuleNewRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public SentinelFlowRuleNewRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public SentinelFlowRuleNewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelFlowRuleNewRequest setRefResource(String refResource) {
        this.refResource = refResource;
        return this;
    }
    public String getRefResource() {
        return this.refResource;
    }

    public SentinelFlowRuleNewRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelFlowRuleNewRequest setSampleCount(Integer sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }
    public Integer getSampleCount() {
        return this.sampleCount;
    }

    public SentinelFlowRuleNewRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public SentinelFlowRuleNewRequest setThresholdMode(Integer thresholdMode) {
        this.thresholdMode = thresholdMode;
        return this;
    }
    public Integer getThresholdMode() {
        return this.thresholdMode;
    }

    public SentinelFlowRuleNewRequest setWarmUpPeriodSec(Integer warmUpPeriodSec) {
        this.warmUpPeriodSec = warmUpPeriodSec;
        return this;
    }
    public Integer getWarmUpPeriodSec() {
        return this.warmUpPeriodSec;
    }

    public SentinelFlowRuleNewRequest setWindowIntervalMs(Integer windowIntervalMs) {
        this.windowIntervalMs = windowIntervalMs;
        return this;
    }
    public Integer getWindowIntervalMs() {
        return this.windowIntervalMs;
    }

}
