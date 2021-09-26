// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("MinSize")
    public Long minSize;

    @NameInMap("MaxSize")
    public Long maxSize;

    @NameInMap("DefaultCooldown")
    public Long defaultCooldown;

    @NameInMap("ActiveRuleCategory")
    public String activeRuleCategory;

    @NameInMap("WithGrace")
    public Boolean withGrace;

    @NameInMap("TimeoutWithGrace")
    public Long timeoutWithGrace;

    @NameInMap("MultiAvailablePolicy")
    public String multiAvailablePolicy;

    @NameInMap("MultiAvailablePolicyParam")
    public String multiAvailablePolicyParam;

    @NameInMap("ScalingConfig")
    public DescribeScalingGroupInstanceResponseBodyScalingConfig scalingConfig;

    @NameInMap("ScalingRuleList")
    public DescribeScalingGroupInstanceResponseBodyScalingRuleList scalingRuleList;

    public static DescribeScalingGroupInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupInstanceResponseBody self = new DescribeScalingGroupInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupInstanceResponseBody setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public DescribeScalingGroupInstanceResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingGroupInstanceResponseBody setMinSize(Long minSize) {
        this.minSize = minSize;
        return this;
    }
    public Long getMinSize() {
        return this.minSize;
    }

    public DescribeScalingGroupInstanceResponseBody setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

    public DescribeScalingGroupInstanceResponseBody setDefaultCooldown(Long defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Long getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public DescribeScalingGroupInstanceResponseBody setActiveRuleCategory(String activeRuleCategory) {
        this.activeRuleCategory = activeRuleCategory;
        return this;
    }
    public String getActiveRuleCategory() {
        return this.activeRuleCategory;
    }

    public DescribeScalingGroupInstanceResponseBody setWithGrace(Boolean withGrace) {
        this.withGrace = withGrace;
        return this;
    }
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public DescribeScalingGroupInstanceResponseBody setTimeoutWithGrace(Long timeoutWithGrace) {
        this.timeoutWithGrace = timeoutWithGrace;
        return this;
    }
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    public DescribeScalingGroupInstanceResponseBody setMultiAvailablePolicy(String multiAvailablePolicy) {
        this.multiAvailablePolicy = multiAvailablePolicy;
        return this;
    }
    public String getMultiAvailablePolicy() {
        return this.multiAvailablePolicy;
    }

    public DescribeScalingGroupInstanceResponseBody setMultiAvailablePolicyParam(String multiAvailablePolicyParam) {
        this.multiAvailablePolicyParam = multiAvailablePolicyParam;
        return this;
    }
    public String getMultiAvailablePolicyParam() {
        return this.multiAvailablePolicyParam;
    }

    public DescribeScalingGroupInstanceResponseBody setScalingConfig(DescribeScalingGroupInstanceResponseBodyScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }
    public DescribeScalingGroupInstanceResponseBodyScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    public DescribeScalingGroupInstanceResponseBody setScalingRuleList(DescribeScalingGroupInstanceResponseBodyScalingRuleList scalingRuleList) {
        this.scalingRuleList = scalingRuleList;
        return this;
    }
    public DescribeScalingGroupInstanceResponseBodyScalingRuleList getScalingRuleList() {
        return this.scalingRuleList;
    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList extends TeaModel {
        @NameInMap("instanceTypeList")
        public java.util.List<String> instanceTypeList;

        public static DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList self = new DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList setInstanceTypeList(java.util.List<String> instanceTypeList) {
            this.instanceTypeList = instanceTypeList;
            return this;
        }
        public java.util.List<String> getInstanceTypeList() {
            return this.instanceTypeList;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits self = new DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits extends TeaModel {
        @NameInMap("spotPriceLimits")
        public java.util.List<DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits> spotPriceLimits;

        public static DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits self = new DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits setSpotPriceLimits(java.util.List<DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits> spotPriceLimits) {
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }
        public java.util.List<DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimits> getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingConfig extends TeaModel {
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskSize")
        public Long dataDiskSize;

        @NameInMap("DataDiskCount")
        public Long dataDiskCount;

        @NameInMap("SysDiskCategory")
        public String sysDiskCategory;

        @NameInMap("SysDiskSize")
        public Long sysDiskSize;

        @NameInMap("InstanceTypeList")
        public DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList instanceTypeList;

        @NameInMap("SpotPriceLimits")
        public DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits spotPriceLimits;

        public static DescribeScalingGroupInstanceResponseBodyScalingConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingConfig self = new DescribeScalingGroupInstanceResponseBodyScalingConfig();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setDataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setDataDiskCount(Long dataDiskCount) {
            this.dataDiskCount = dataDiskCount;
            return this;
        }
        public Long getDataDiskCount() {
            return this.dataDiskCount;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setSysDiskCategory(String sysDiskCategory) {
            this.sysDiskCategory = sysDiskCategory;
            return this;
        }
        public String getSysDiskCategory() {
            return this.sysDiskCategory;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setSysDiskSize(Long sysDiskSize) {
            this.sysDiskSize = sysDiskSize;
            return this;
        }
        public Long getSysDiskSize() {
            return this.sysDiskSize;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setInstanceTypeList(DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList instanceTypeList) {
            this.instanceTypeList = instanceTypeList;
            return this;
        }
        public DescribeScalingGroupInstanceResponseBodyScalingConfigInstanceTypeList getInstanceTypeList() {
            return this.instanceTypeList;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingConfig setSpotPriceLimits(DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits spotPriceLimits) {
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }
        public DescribeScalingGroupInstanceResponseBodyScalingConfigSpotPriceLimits getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger extends TeaModel {
        @NameInMap("LaunchTime")
        public Long launchTime;

        @NameInMap("LaunchExpirationTime")
        public Long launchExpirationTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("RecurrenceEndTime")
        public Long recurrenceEndTime;

        public static DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger self = new DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger setLaunchExpirationTime(Long launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Long getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger setRecurrenceEndTime(Long recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public Long getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Period")
        public Long period;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("MetricDisplayName")
        public String metricDisplayName;

        public static DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger self = new DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setMetricDisplayName(String metricDisplayName) {
            this.metricDisplayName = metricDisplayName;
            return this;
        }
        public String getMetricDisplayName() {
            return this.metricDisplayName;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule extends TeaModel {
        @NameInMap("RuleCategory")
        public String ruleCategory;

        @NameInMap("EssScalingRuleId")
        public String essScalingRuleId;

        @NameInMap("ScalingGroupId")
        public Long scalingGroupId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("AdjustmentType")
        public String adjustmentType;

        @NameInMap("AdjustmentValue")
        public Long adjustmentValue;

        @NameInMap("Cooldown")
        public Long cooldown;

        @NameInMap("Status")
        public String status;

        @NameInMap("LaunchTime")
        public String launchTime;

        @NameInMap("LaunchExpirationTime")
        public Long launchExpirationTime;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("WithGrace")
        public Boolean withGrace;

        @NameInMap("TimeoutWithGrace")
        public Long timeoutWithGrace;

        @NameInMap("SchedulerTrigger")
        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger schedulerTrigger;

        @NameInMap("CloudWatchTrigger")
        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger cloudWatchTrigger;

        public static DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule self = new DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setRuleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setEssScalingRuleId(String essScalingRuleId) {
            this.essScalingRuleId = essScalingRuleId;
            return this;
        }
        public String getEssScalingRuleId() {
            return this.essScalingRuleId;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setScalingGroupId(Long scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public Long getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setAdjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setAdjustmentValue(Long adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Long getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setCooldown(Long cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        public Long getCooldown() {
            return this.cooldown;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setLaunchExpirationTime(Long launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Long getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setWithGrace(Boolean withGrace) {
            this.withGrace = withGrace;
            return this;
        }
        public Boolean getWithGrace() {
            return this.withGrace;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setTimeoutWithGrace(Long timeoutWithGrace) {
            this.timeoutWithGrace = timeoutWithGrace;
            return this;
        }
        public Long getTimeoutWithGrace() {
            return this.timeoutWithGrace;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setSchedulerTrigger(DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger schedulerTrigger) {
            this.schedulerTrigger = schedulerTrigger;
            return this;
        }
        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleSchedulerTrigger getSchedulerTrigger() {
            return this.schedulerTrigger;
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule setCloudWatchTrigger(DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger cloudWatchTrigger) {
            this.cloudWatchTrigger = cloudWatchTrigger;
            return this;
        }
        public DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRuleCloudWatchTrigger getCloudWatchTrigger() {
            return this.cloudWatchTrigger;
        }

    }

    public static class DescribeScalingGroupInstanceResponseBodyScalingRuleList extends TeaModel {
        @NameInMap("ScalingRule")
        public java.util.List<DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule> scalingRule;

        public static DescribeScalingGroupInstanceResponseBodyScalingRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceResponseBodyScalingRuleList self = new DescribeScalingGroupInstanceResponseBodyScalingRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceResponseBodyScalingRuleList setScalingRule(java.util.List<DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule> scalingRule) {
            this.scalingRule = scalingRule;
            return this;
        }
        public java.util.List<DescribeScalingGroupInstanceResponseBodyScalingRuleListScalingRule> getScalingRule() {
            return this.scalingRule;
        }

    }

}
