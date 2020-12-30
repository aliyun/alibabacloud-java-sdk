// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateScalingRuleRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("RuleCategory")
    public String ruleCategory;

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
    public java.util.List<CreateScalingRuleRequestSchedulerTrigger> schedulerTrigger;

    @NameInMap("CloudWatchTrigger")
    public java.util.List<CreateScalingRuleRequestCloudWatchTrigger> cloudWatchTrigger;

    public static CreateScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingRuleRequest self = new CreateScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateScalingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScalingRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateScalingRuleRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public CreateScalingRuleRequest setRuleCategory(String ruleCategory) {
        this.ruleCategory = ruleCategory;
        return this;
    }
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    public CreateScalingRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateScalingRuleRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public CreateScalingRuleRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public CreateScalingRuleRequest setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public CreateScalingRuleRequest setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public String getLaunchTime() {
        return this.launchTime;
    }

    public CreateScalingRuleRequest setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public CreateScalingRuleRequest setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public CreateScalingRuleRequest setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public CreateScalingRuleRequest setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
        return this;
    }
    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    public CreateScalingRuleRequest setWithGrace(Boolean withGrace) {
        this.withGrace = withGrace;
        return this;
    }
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public CreateScalingRuleRequest setTimeoutWithGrace(Long timeoutWithGrace) {
        this.timeoutWithGrace = timeoutWithGrace;
        return this;
    }
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    public CreateScalingRuleRequest setSchedulerTrigger(java.util.List<CreateScalingRuleRequestSchedulerTrigger> schedulerTrigger) {
        this.schedulerTrigger = schedulerTrigger;
        return this;
    }
    public java.util.List<CreateScalingRuleRequestSchedulerTrigger> getSchedulerTrigger() {
        return this.schedulerTrigger;
    }

    public CreateScalingRuleRequest setCloudWatchTrigger(java.util.List<CreateScalingRuleRequestCloudWatchTrigger> cloudWatchTrigger) {
        this.cloudWatchTrigger = cloudWatchTrigger;
        return this;
    }
    public java.util.List<CreateScalingRuleRequestCloudWatchTrigger> getCloudWatchTrigger() {
        return this.cloudWatchTrigger;
    }

    public static class CreateScalingRuleRequestSchedulerTrigger extends TeaModel {
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

        public static CreateScalingRuleRequestSchedulerTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestSchedulerTrigger self = new CreateScalingRuleRequestSchedulerTrigger();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestSchedulerTrigger setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public CreateScalingRuleRequestSchedulerTrigger setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public CreateScalingRuleRequestSchedulerTrigger setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public CreateScalingRuleRequestSchedulerTrigger setRecurrenceEndTime(String recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public String getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public CreateScalingRuleRequestSchedulerTrigger setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public String getLaunchTime() {
            return this.launchTime;
        }

    }

    public static class CreateScalingRuleRequestCloudWatchTrigger extends TeaModel {
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

        public static CreateScalingRuleRequestCloudWatchTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingRuleRequestCloudWatchTrigger self = new CreateScalingRuleRequestCloudWatchTrigger();
            return TeaModel.build(map, self);
        }

        public CreateScalingRuleRequestCloudWatchTrigger setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateScalingRuleRequestCloudWatchTrigger setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateScalingRuleRequestCloudWatchTrigger setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public CreateScalingRuleRequestCloudWatchTrigger setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateScalingRuleRequestCloudWatchTrigger setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateScalingRuleRequestCloudWatchTrigger setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

}
