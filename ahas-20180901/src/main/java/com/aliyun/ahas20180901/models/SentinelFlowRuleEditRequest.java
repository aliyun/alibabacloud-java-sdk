// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleEditRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

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

    @NameInMap("EstimatedMaxClusterQps")
    public Float estimatedMaxClusterQps;

    @NameInMap("FallbackThresholdAdjustMargin")
    public Integer fallbackThresholdAdjustMargin;

    @NameInMap("FallbackToLocalWhenFail")
    public Boolean fallbackToLocalWhenFail;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("Id")
    public Long id;

    @NameInMap("LimitApp")
    public String limitApp;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RefResource")
    public String refResource;

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

    public static SentinelFlowRuleEditRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleEditRequest self = new SentinelFlowRuleEditRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleEditRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFlowRuleEditRequest setAutoAdjustFallbackThresholdEnabled(Boolean autoAdjustFallbackThresholdEnabled) {
        this.autoAdjustFallbackThresholdEnabled = autoAdjustFallbackThresholdEnabled;
        return this;
    }
    public Boolean getAutoAdjustFallbackThresholdEnabled() {
        return this.autoAdjustFallbackThresholdEnabled;
    }

    public SentinelFlowRuleEditRequest setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
        this.clusterFallbackThreshold = clusterFallbackThreshold;
        return this;
    }
    public Integer getClusterFallbackThreshold() {
        return this.clusterFallbackThreshold;
    }

    public SentinelFlowRuleEditRequest setClusterMode(Boolean clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public Boolean getClusterMode() {
        return this.clusterMode;
    }

    public SentinelFlowRuleEditRequest setClusterRequestMode(Integer clusterRequestMode) {
        this.clusterRequestMode = clusterRequestMode;
        return this;
    }
    public Integer getClusterRequestMode() {
        return this.clusterRequestMode;
    }

    public SentinelFlowRuleEditRequest setClusterThresholdType(Integer clusterThresholdType) {
        this.clusterThresholdType = clusterThresholdType;
        return this;
    }
    public Integer getClusterThresholdType() {
        return this.clusterThresholdType;
    }

    public SentinelFlowRuleEditRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public SentinelFlowRuleEditRequest setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public SentinelFlowRuleEditRequest setEstimatedMaxClusterQps(Float estimatedMaxClusterQps) {
        this.estimatedMaxClusterQps = estimatedMaxClusterQps;
        return this;
    }
    public Float getEstimatedMaxClusterQps() {
        return this.estimatedMaxClusterQps;
    }

    public SentinelFlowRuleEditRequest setFallbackThresholdAdjustMargin(Integer fallbackThresholdAdjustMargin) {
        this.fallbackThresholdAdjustMargin = fallbackThresholdAdjustMargin;
        return this;
    }
    public Integer getFallbackThresholdAdjustMargin() {
        return this.fallbackThresholdAdjustMargin;
    }

    public SentinelFlowRuleEditRequest setFallbackToLocalWhenFail(Boolean fallbackToLocalWhenFail) {
        this.fallbackToLocalWhenFail = fallbackToLocalWhenFail;
        return this;
    }
    public Boolean getFallbackToLocalWhenFail() {
        return this.fallbackToLocalWhenFail;
    }

    public SentinelFlowRuleEditRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelFlowRuleEditRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelFlowRuleEditRequest setLimitApp(String limitApp) {
        this.limitApp = limitApp;
        return this;
    }
    public String getLimitApp() {
        return this.limitApp;
    }

    public SentinelFlowRuleEditRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public SentinelFlowRuleEditRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelFlowRuleEditRequest setRefResource(String refResource) {
        this.refResource = refResource;
        return this;
    }
    public String getRefResource() {
        return this.refResource;
    }

    public SentinelFlowRuleEditRequest setSampleCount(Integer sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }
    public Integer getSampleCount() {
        return this.sampleCount;
    }

    public SentinelFlowRuleEditRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public SentinelFlowRuleEditRequest setThresholdMode(Integer thresholdMode) {
        this.thresholdMode = thresholdMode;
        return this;
    }
    public Integer getThresholdMode() {
        return this.thresholdMode;
    }

    public SentinelFlowRuleEditRequest setWarmUpPeriodSec(Integer warmUpPeriodSec) {
        this.warmUpPeriodSec = warmUpPeriodSec;
        return this;
    }
    public Integer getWarmUpPeriodSec() {
        return this.warmUpPeriodSec;
    }

    public SentinelFlowRuleEditRequest setWindowIntervalMs(Integer windowIntervalMs) {
        this.windowIntervalMs = windowIntervalMs;
        return this;
    }
    public Integer getWindowIntervalMs() {
        return this.windowIntervalMs;
    }

}
