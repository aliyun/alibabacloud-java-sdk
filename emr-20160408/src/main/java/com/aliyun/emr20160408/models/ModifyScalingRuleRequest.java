// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("AdjustmentType")
    public String adjustmentType;

    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("Cooldown")
    public Integer cooldown;

    @NameInMap("LaunchTime")
    public String launchTime;

    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

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
    public java.util.List<ModifyScalingRuleRequestSchedulerTrigger> schedulerTrigger;

    @NameInMap("CloudWatchTrigger")
    public java.util.List<ModifyScalingRuleRequestCloudWatchTrigger> cloudWatchTrigger;

    public static ModifyScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleRequest self = new ModifyScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyScalingRuleRequest setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public ModifyScalingRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyScalingRuleRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public ModifyScalingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyScalingRuleRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ModifyScalingRuleRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ModifyScalingRuleRequest setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public ModifyScalingRuleRequest setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public String getLaunchTime() {
        return this.launchTime;
    }

    public ModifyScalingRuleRequest setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public ModifyScalingRuleRequest setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public ModifyScalingRuleRequest setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public ModifyScalingRuleRequest setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
        return this;
    }
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    public ModifyScalingRuleRequest setWithGrace(Boolean withGrace) {
        this.withGrace = withGrace;
        return this;
    }
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public ModifyScalingRuleRequest setTimeoutWithGrace(Long timeoutWithGrace) {
        this.timeoutWithGrace = timeoutWithGrace;
        return this;
    }
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    public ModifyScalingRuleRequest setSchedulerTrigger(java.util.List<ModifyScalingRuleRequestSchedulerTrigger> schedulerTrigger) {
        this.schedulerTrigger = schedulerTrigger;
        return this;
    }
    public java.util.List<ModifyScalingRuleRequestSchedulerTrigger> getSchedulerTrigger() {
        return this.schedulerTrigger;
    }

    public ModifyScalingRuleRequest setCloudWatchTrigger(java.util.List<ModifyScalingRuleRequestCloudWatchTrigger> cloudWatchTrigger) {
        this.cloudWatchTrigger = cloudWatchTrigger;
        return this;
    }
    public java.util.List<ModifyScalingRuleRequestCloudWatchTrigger> getCloudWatchTrigger() {
        return this.cloudWatchTrigger;
    }

    public static class ModifyScalingRuleRequestSchedulerTrigger extends TeaModel {
        @NameInMap("LaunchExpirationTime")
        public Integer launchExpirationTime;

        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceEndTime")
        public String recurrenceEndTime;

        @NameInMap("LaunchTime")
        public String launchTime;

        public static ModifyScalingRuleRequestSchedulerTrigger build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestSchedulerTrigger self = new ModifyScalingRuleRequestSchedulerTrigger();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestSchedulerTrigger setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public ModifyScalingRuleRequestSchedulerTrigger setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public ModifyScalingRuleRequestSchedulerTrigger setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ModifyScalingRuleRequestSchedulerTrigger setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public ModifyScalingRuleRequestSchedulerTrigger setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

    }

    public static class ModifyScalingRuleRequestCloudWatchTrigger extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public String evaluationCount;

        @NameInMap("Threshold")
        public String threshold;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("Statistics")
        public String statistics;

        public static ModifyScalingRuleRequestCloudWatchTrigger build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingRuleRequestCloudWatchTrigger self = new ModifyScalingRuleRequestCloudWatchTrigger();
            return TeaModel.build(map, self);
        }

        public ModifyScalingRuleRequestCloudWatchTrigger setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ModifyScalingRuleRequestCloudWatchTrigger setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ModifyScalingRuleRequestCloudWatchTrigger setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public ModifyScalingRuleRequestCloudWatchTrigger setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public ModifyScalingRuleRequestCloudWatchTrigger setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ModifyScalingRuleRequestCloudWatchTrigger setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

}
