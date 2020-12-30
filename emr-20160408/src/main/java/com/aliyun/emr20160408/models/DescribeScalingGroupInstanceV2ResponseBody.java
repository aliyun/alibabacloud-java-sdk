// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupInstanceV2ResponseBody extends TeaModel {
    @NameInMap("ScalingConfig")
    public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig scalingConfig;

    @NameInMap("ActiveRuleCategory")
    public String activeRuleCategory;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeoutWithGrace")
    public Long timeoutWithGrace;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("MaxSize")
    public Integer maxSize;

    @NameInMap("MultiAvailablePolicyParam")
    public String multiAvailablePolicyParam;

    @NameInMap("MinSize")
    public Integer minSize;

    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("WithGrace")
    public Boolean withGrace;

    @NameInMap("MultiAvailablePolicy")
    public String multiAvailablePolicy;

    @NameInMap("ScalingRuleList")
    public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList scalingRuleList;

    public static DescribeScalingGroupInstanceV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupInstanceV2ResponseBody self = new DescribeScalingGroupInstanceV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupInstanceV2ResponseBody setScalingConfig(DescribeScalingGroupInstanceV2ResponseBodyScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }
    public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setActiveRuleCategory(String activeRuleCategory) {
        this.activeRuleCategory = activeRuleCategory;
        return this;
    }
    public String getActiveRuleCategory() {
        return this.activeRuleCategory;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setTimeoutWithGrace(Long timeoutWithGrace) {
        this.timeoutWithGrace = timeoutWithGrace;
        return this;
    }
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setMultiAvailablePolicyParam(String multiAvailablePolicyParam) {
        this.multiAvailablePolicyParam = multiAvailablePolicyParam;
        return this;
    }
    public String getMultiAvailablePolicyParam() {
        return this.multiAvailablePolicyParam;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setWithGrace(Boolean withGrace) {
        this.withGrace = withGrace;
        return this;
    }
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setMultiAvailablePolicy(String multiAvailablePolicy) {
        this.multiAvailablePolicy = multiAvailablePolicy;
        return this;
    }
    public String getMultiAvailablePolicy() {
        return this.multiAvailablePolicy;
    }

    public DescribeScalingGroupInstanceV2ResponseBody setScalingRuleList(DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList scalingRuleList) {
        this.scalingRuleList = scalingRuleList;
        return this;
    }
    public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList getScalingRuleList() {
        return this.scalingRuleList;
    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<String> instanceType;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList self = new DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList setInstanceType(java.util.List<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<String> getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit extends TeaModel {
        @NameInMap("PriceLimit")
        public Float priceLimit;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit self = new DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits extends TeaModel {
        @NameInMap("SpotPriceLimit")
        public java.util.List<DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit> spotPriceLimit;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits self = new DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits setSpotPriceLimit(java.util.List<DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimitsSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingConfig extends TeaModel {
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskCount")
        public Integer dataDiskCount;

        @NameInMap("InstanceTypeList")
        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList instanceTypeList;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("SysDiskCategory")
        public String sysDiskCategory;

        @NameInMap("SpotPriceLimits")
        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits spotPriceLimits;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("SysDiskSize")
        public Integer sysDiskSize;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingConfig self = new DescribeScalingGroupInstanceV2ResponseBodyScalingConfig();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setDataDiskCount(Integer dataDiskCount) {
            this.dataDiskCount = dataDiskCount;
            return this;
        }
        public Integer getDataDiskCount() {
            return this.dataDiskCount;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setInstanceTypeList(DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList instanceTypeList) {
            this.instanceTypeList = instanceTypeList;
            return this;
        }
        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigInstanceTypeList getInstanceTypeList() {
            return this.instanceTypeList;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setSysDiskCategory(String sysDiskCategory) {
            this.sysDiskCategory = sysDiskCategory;
            return this;
        }
        public String getSysDiskCategory() {
            return this.sysDiskCategory;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setSpotPriceLimits(DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits spotPriceLimits) {
            this.spotPriceLimits = spotPriceLimits;
            return this;
        }
        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfigSpotPriceLimits getSpotPriceLimits() {
            return this.spotPriceLimits;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingConfig setSysDiskSize(Integer sysDiskSize) {
            this.sysDiskSize = sysDiskSize;
            return this;
        }
        public Integer getSysDiskSize() {
            return this.sysDiskSize;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("MetricDisplayName")
        public String metricDisplayName;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("Statistics")
        public String statistics;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger self = new DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setMetricDisplayName(String metricDisplayName) {
            this.metricDisplayName = metricDisplayName;
            return this;
        }
        public String getMetricDisplayName() {
            return this.metricDisplayName;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger extends TeaModel {
        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceEndTime")
        public Long recurrenceEndTime;

        @NameInMap("LaunchTime")
        public Long launchTime;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger self = new DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger setRecurrenceEndTime(Long recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public Long getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule extends TeaModel {
        @NameInMap("CloudWatchTrigger")
        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger cloudWatchTrigger;

        @NameInMap("Status")
        public String status;

        @NameInMap("AdjustmentType")
        public String adjustmentType;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("TimeoutWithGrace")
        public Long timeoutWithGrace;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("ScalingGroupId")
        public Long scalingGroupId;

        @NameInMap("RuleCategory")
        public String ruleCategory;

        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("Cooldown")
        public Integer cooldown;

        @NameInMap("AdjustmentValue")
        public Integer adjustmentValue;

        @NameInMap("SchedulerTrigger")
        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger schedulerTrigger;

        @NameInMap("LaunchTime")
        public String launchTime;

        @NameInMap("WithGrace")
        public Boolean withGrace;

        @NameInMap("EssScalingRuleId")
        public String essScalingRuleId;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule self = new DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setCloudWatchTrigger(DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger cloudWatchTrigger) {
            this.cloudWatchTrigger = cloudWatchTrigger;
            return this;
        }
        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleCloudWatchTrigger getCloudWatchTrigger() {
            return this.cloudWatchTrigger;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setAdjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setTimeoutWithGrace(Long timeoutWithGrace) {
            this.timeoutWithGrace = timeoutWithGrace;
            return this;
        }
        public Long getTimeoutWithGrace() {
            return this.timeoutWithGrace;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setScalingGroupId(Long scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public Long getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setRuleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setCooldown(Integer cooldown) {
            this.cooldown = cooldown;
            return this;
        }
        public Integer getCooldown() {
            return this.cooldown;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setAdjustmentValue(Integer adjustmentValue) {
            this.adjustmentValue = adjustmentValue;
            return this;
        }
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setSchedulerTrigger(DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger schedulerTrigger) {
            this.schedulerTrigger = schedulerTrigger;
            return this;
        }
        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRuleSchedulerTrigger getSchedulerTrigger() {
            return this.schedulerTrigger;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setWithGrace(Boolean withGrace) {
            this.withGrace = withGrace;
            return this;
        }
        public Boolean getWithGrace() {
            return this.withGrace;
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule setEssScalingRuleId(String essScalingRuleId) {
            this.essScalingRuleId = essScalingRuleId;
            return this;
        }
        public String getEssScalingRuleId() {
            return this.essScalingRuleId;
        }

    }

    public static class DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList extends TeaModel {
        @NameInMap("ScalingRule")
        public java.util.List<DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule> scalingRule;

        public static DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList self = new DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupInstanceV2ResponseBodyScalingRuleList setScalingRule(java.util.List<DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule> scalingRule) {
            this.scalingRule = scalingRule;
            return this;
        }
        public java.util.List<DescribeScalingGroupInstanceV2ResponseBodyScalingRuleListScalingRule> getScalingRule() {
            return this.scalingRule;
        }

    }

}
