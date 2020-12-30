// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeScalingRuleResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("TimeoutWithGrace")
    public Long timeoutWithGrace;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cooldown")
    public Integer cooldown;

    @NameInMap("CloudWatchTrigger")
    public DescribeScalingRuleResponseBodyCloudWatchTrigger cloudWatchTrigger;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("AdjustmentType")
    public String adjustmentType;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    @NameInMap("SchedulerTrigger")
    public DescribeScalingRuleResponseBodySchedulerTrigger schedulerTrigger;

    @NameInMap("WithGrace")
    public Boolean withGrace;

    @NameInMap("Id")
    public String id;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleCategory")
    public String ruleCategory;

    public static DescribeScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingRuleResponseBody self = new DescribeScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingRuleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeScalingRuleResponseBody setTimeoutWithGrace(Long timeoutWithGrace) {
        this.timeoutWithGrace = timeoutWithGrace;
        return this;
    }
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

    public DescribeScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingRuleResponseBody setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Integer getCooldown() {
        return this.cooldown;
    }

    public DescribeScalingRuleResponseBody setCloudWatchTrigger(DescribeScalingRuleResponseBodyCloudWatchTrigger cloudWatchTrigger) {
        this.cloudWatchTrigger = cloudWatchTrigger;
        return this;
    }
    public DescribeScalingRuleResponseBodyCloudWatchTrigger getCloudWatchTrigger() {
        return this.cloudWatchTrigger;
    }

    public DescribeScalingRuleResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeScalingRuleResponseBody setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public DescribeScalingRuleResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeScalingRuleResponseBody setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public DescribeScalingRuleResponseBody setSchedulerTrigger(DescribeScalingRuleResponseBodySchedulerTrigger schedulerTrigger) {
        this.schedulerTrigger = schedulerTrigger;
        return this;
    }
    public DescribeScalingRuleResponseBodySchedulerTrigger getSchedulerTrigger() {
        return this.schedulerTrigger;
    }

    public DescribeScalingRuleResponseBody setWithGrace(Boolean withGrace) {
        this.withGrace = withGrace;
        return this;
    }
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public DescribeScalingRuleResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeScalingRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeScalingRuleResponseBody setRuleCategory(String ruleCategory) {
        this.ruleCategory = ruleCategory;
        return this;
    }
    public String getRuleCategory() {
        return this.ruleCategory;
    }

    public static class DescribeScalingRuleResponseBodyCloudWatchTrigger extends TeaModel {
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

        public static DescribeScalingRuleResponseBodyCloudWatchTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRuleResponseBodyCloudWatchTrigger self = new DescribeScalingRuleResponseBodyCloudWatchTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setEvaluationCount(String evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setMetricDisplayName(String metricDisplayName) {
            this.metricDisplayName = metricDisplayName;
            return this;
        }
        public String getMetricDisplayName() {
            return this.metricDisplayName;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeScalingRuleResponseBodyCloudWatchTrigger setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeScalingRuleResponseBodySchedulerTrigger extends TeaModel {
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

        public static DescribeScalingRuleResponseBodySchedulerTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingRuleResponseBodySchedulerTrigger self = new DescribeScalingRuleResponseBodySchedulerTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeScalingRuleResponseBodySchedulerTrigger setLaunchExpirationTime(Integer launchExpirationTime) {
            this.launchExpirationTime = launchExpirationTime;
            return this;
        }
        public Integer getLaunchExpirationTime() {
            return this.launchExpirationTime;
        }

        public DescribeScalingRuleResponseBodySchedulerTrigger setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public DescribeScalingRuleResponseBodySchedulerTrigger setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeScalingRuleResponseBodySchedulerTrigger setRecurrenceEndTime(Long recurrenceEndTime) {
            this.recurrenceEndTime = recurrenceEndTime;
            return this;
        }
        public Long getRecurrenceEndTime() {
            return this.recurrenceEndTime;
        }

        public DescribeScalingRuleResponseBodySchedulerTrigger setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

    }

}
