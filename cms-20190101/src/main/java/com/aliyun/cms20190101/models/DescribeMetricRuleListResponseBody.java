// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleListResponseBody extends TeaModel {
    /**
     * <p>The details of the alert rules.</p>
     */
    @NameInMap("Alarms")
    public DescribeMetricRuleListResponseBodyAlarms alarms;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeMetricRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleListResponseBody self = new DescribeMetricRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleListResponseBody setAlarms(DescribeMetricRuleListResponseBodyAlarms alarms) {
        this.alarms = alarms;
        return this;
    }
    public DescribeMetricRuleListResponseBodyAlarms getAlarms() {
        return this.alarms;
    }

    public DescribeMetricRuleListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMetricRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricRuleListResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList extends TeaModel {
        /**
         * <p>The operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The metric that is used to monitor the cloud service.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The aggregation period of the metric.</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The statistical method of the metric. Valid values:</p>
         * <br>
         * <p>*   $Maximum: the maximum value</p>
         * <p>*   $Minimum: the minimum value</p>
         * <p>*   $Average: the average value</p>
         * <p>*   $Availability: the availability rate (usually used for site monitoring)</p>
         * <br>
         * <p>>  `$` is the prefix of the metric. For information about the Alibaba Cloud services that are supported by CloudMonitor, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList self = new DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList extends TeaModel {
        @NameInMap("ExpressionList")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList> expressionList;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList self = new DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList setExpressionList(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList> expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionListExpressionList> getExpressionList() {
            return this.expressionList;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression extends TeaModel {
        /**
         * <p>The trigger conditions that are created in standard mode.</p>
         */
        @NameInMap("ExpressionList")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList expressionList;

        /**
         * <p>The relationship between the trigger conditions for multiple metrics. Valid values:</p>
         * <br>
         * <p>*   `&&`: An alert is triggered only if all metrics meet the trigger conditions. An alert is triggered only if the results of all expressions specified in the ExpressionList parameter are `true`.</p>
         * <p>*   `||`: An alert is triggered if one of the metrics meets the trigger conditions.</p>
         */
        @NameInMap("ExpressionListJoin")
        public String expressionListJoin;

        /**
         * <p>The trigger conditions that are created by using expressions. You can use expressions to create trigger conditions in the following scenarios:</p>
         * <br>
         * <p>*   Set an alert blacklist for specific resources. For example, if you specify `$instanceId != \"i-io8kfvcpp7x5****\" ``&&`` $Average > 50`, no alert is triggered when the `average metric value` of the `i-io8kfvcpp7x5****` instance exceeds 50.</p>
         * <p>*   Set a special alert threshold for a specified instance in the rule. For example, if you specify `$Average > ($instanceId == \"i-io8kfvcpp7x5****\"? 80: 50)`, an alert is triggered when the `average metric value` of the `i-io8kfvcpp7x5****` instance exceeds 80 or the `average metric value` of other instances exceeds 50.</p>
         * <p>*   Limit the number of instances whose metric values exceed the threshold. For example, if you specify `count($Average > 20) > 3`, an alert is triggered only when the number of instances whose `average metric value` exceeds 20 exceeds three.</p>
         */
        @NameInMap("ExpressionRaw")
        public String expressionRaw;

        /**
         * <p>The level of the alert. Valid values:</p>
         * <br>
         * <p>*   Critical</p>
         * <p>*   Warn</p>
         * <p>*   Info</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression self = new DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setExpressionList(DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList expressionList) {
            this.expressionList = expressionList;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpressionExpressionList getExpressionList() {
            return this.expressionList;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setExpressionListJoin(String expressionListJoin) {
            this.expressionListJoin = expressionListJoin;
            return this;
        }
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setExpressionRaw(String expressionRaw) {
            this.expressionRaw = expressionRaw;
            return this;
        }
        public String getExpressionRaw() {
            return this.expressionRaw;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical extends TeaModel {
        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The additional conditions for triggering Critical-level alerts. The additional conditions take effect when the value of the ComparisonOperator parameter is GreaterThanYesterday, LessThanYesterday, GreaterThanLastWeek, LessThanLastWeek, GreaterThanLastPeriod, or LessThanLastPeriod.</p>
         * <br>
         * <p>For example, the values of the PreCondition, ComparisonOperator, and Threshold parameters are set to $Average>80, GreaterThanYesterday, and 10, respectively. An alert is triggered only when the average metric value is greater than 80 and 10% greater than the average metric value at the same time yesterday.</p>
         * <br>
         * <p>>  $Average is a placeholder that consists of `a dollar sign ($) and the statistical method`. CloudMonitor replaces the placeholder with the aggregated value or original value before value comparison.</p>
         */
        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>The statistical methods for Critical-level alerts.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Critical-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Critical-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo extends TeaModel {
        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The additional conditions for triggering Info-level alerts. The additional conditions take effect when the value of the ComparisonOperator parameter is GreaterThanYesterday, LessThanYesterday, GreaterThanLastWeek, LessThanLastWeek, GreaterThanLastPeriod, or LessThanLastPeriod.</p>
         * <br>
         * <p>For example, the values of the PreCondition, ComparisonOperator, and Threshold parameters are set to $Average>80, GreaterThanYesterday, and 10, respectively. An alert is triggered only when the average metric value is greater than 80 and 10% greater than the average metric value at the same time yesterday.</p>
         * <br>
         * <p>>  $Average is a placeholder that consists of `a dollar sign ($) and the statistical method`. CloudMonitor replaces the placeholder with the aggregated value or original value before value comparison.</p>
         */
        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>The statistical methods for Info-level alerts.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Info-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an Info-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn extends TeaModel {
        /**
         * <p>The comparison operator that is used to compare the metric value with the threshold. Valid values:</p>
         * <br>
         * <p>*   GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
         * <p>*   GreaterThanThreshold: greater than the threshold</p>
         * <p>*   LessThanOrEqualToThreshold: less than or equal to the threshold</p>
         * <p>*   LessThanThreshold: less than the threshold</p>
         * <p>*   NotEqualToThreshold: not equal to the threshold</p>
         * <p>*   GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
         * <p>*   LessThanYesterday: less than the metric value at the same time yesterday</p>
         * <p>*   GreaterThanLastWeek: greater than the metric value at the same time last week</p>
         * <p>*   LessThanLastWeek: less than the metric value at the same time last week</p>
         * <p>*   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
         * <p>*   LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The additional conditions for triggering Warn-level alerts. The additional conditions take effect when the value of the ComparisonOperator parameter is GreaterThanYesterday, LessThanYesterday, GreaterThanLastWeek, LessThanLastWeek, GreaterThanLastPeriod, or LessThanLastPeriod.</p>
         * <br>
         * <p>For example, the values of the PreCondition, ComparisonOperator, and Threshold parameters are set to $Average>80, GreaterThanYesterday, and 10, respectively. An alert is triggered only when the average metric value is greater than 80 and 10% greater than the average metric value at the same time yesterday.</p>
         * <br>
         * <p>>  $Average is a placeholder that consists of `a dollar sign ($) and the statistical method`. CloudMonitor replaces the placeholder with the aggregated value or original value before value comparison.</p>
         */
        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>The statistical methods for Warn-level alerts.</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The threshold for Warn-level alerts.</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before a Warn-level alert is triggered.</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations extends TeaModel {
        /**
         * <p>The conditions for triggering Critical-level alerts.</p>
         */
        @NameInMap("Critical")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical critical;

        /**
         * <p>The conditions for triggering Info-level alerts.</p>
         */
        @NameInMap("Info")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo info;

        /**
         * <p>The conditions for triggering Warn-level alerts.</p>
         */
        @NameInMap("Warn")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn warn;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations self = new DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations setCritical(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsCritical getCritical() {
            return this.critical;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations setInfo(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsInfo getInfo() {
            return this.info;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations setWarn(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels extends TeaModel {
        /**
         * <p>The tag key of the alert rule.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the alert rule.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels self = new DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmLabels extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels> labels;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmLabels self = new DescribeMetricRuleListResponseBodyAlarmsAlarmLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabels setLabels(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmLabelsLabels> getLabels() {
            return this.labels;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations extends TeaModel {
        /**
         * <p>The key of the annotation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the annotation.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations self = new DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations extends TeaModel {
        @NameInMap("Annotations")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations> annotations;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations self = new DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations setAnnotations(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotationsAnnotations> getAnnotations() {
            return this.annotations;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus extends TeaModel {
        /**
         * <p>The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.</p>
         * <br>
         * <p>>  This parameter is equivalent to the annotations parameter of open source Prometheus.</p>
         */
        @NameInMap("Annotations")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations annotations;

        /**
         * <p>The level of the alert. Valid values:</p>
         * <br>
         * <p>*   Critical</p>
         * <p>*   Warn</p>
         * <p>*   Info</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The PromQL query statement.</p>
         * <br>
         * <p>>  The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.</p>
         */
        @NameInMap("PromQL")
        public String promQL;

        /**
         * <p>The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.</p>
         */
        @NameInMap("Times")
        public Long times;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus self = new DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus setAnnotations(DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheusAnnotations getAnnotations() {
            return this.annotations;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus setTimes(Long times) {
            this.times = times;
            return this;
        }
        public Long getTimes() {
            return this.times;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarmsAlarm extends TeaModel {
        /**
         * <p>The status of the alert rule. Valid values:</p>
         * <br>
         * <p>*   OK: The alert rule has no active alerts.</p>
         * <p>*   ALARM: The alert rule has active alerts.</p>
         * <p>*   INSUFFICIENT_DATA: No data is available.</p>
         */
        @NameInMap("AlertState")
        public String alertState;

        /**
         * <p>The trigger conditions for multiple metrics.</p>
         * <br>
         * <p>>  The trigger conditions for a single metric and multiple metrics are mutually exclusive. You cannot specify trigger conditions for a single metric and multiple metrics at the same time.</p>
         */
        @NameInMap("CompositeExpression")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression compositeExpression;

        /**
         * <p>The alert contact group.</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The dimensions of the alert rule.</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The time period during which the alert rule is effective.</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>Indicates whether the alert rule is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The alert rule is enabled.</p>
         * <p>*   false: The alert rule is disabled.</p>
         */
        @NameInMap("EnableState")
        public Boolean enableState;

        /**
         * <p>The conditions for triggering different levels of alerts.</p>
         */
        @NameInMap("Escalations")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations escalations;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the application group.</p>
         * <br>
         * <p>>  If the alert rule is associated with an application group, the name of the application group is returned in this parameter.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tags of the alert rule.</p>
         */
        @NameInMap("Labels")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabels labels;

        /**
         * <p>The subject of the alert notification email.</p>
         */
        @NameInMap("MailSubject")
        public String mailSubject;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The method that is used to handle alerts when no monitoring data is found. Valid values:</p>
         * <br>
         * <p>*   KEEP_LAST_STATE (default value): No operation is performed.</p>
         * <p>*   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.</p>
         * <p>*   OK: The status is considered normal.</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>The time period during which the alert rule is ineffective.</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The statistical period.</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The Prometheus alert rule.</p>
         * <br>
         * <p>>  This parameter is required only when you create a Prometheus alert rule for Hybrid Cloud Monitoring.</p>
         */
        @NameInMap("Prometheus")
        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus prometheus;

        /**
         * <p>The resources that are associated with the alert rule.</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds. Default value: 86400. Minimum value: 3600.</p>
         * <br>
         * <p>Only one alert is reported during each mute period even if the metric value consecutively exceeds the alert rule threshold several times.</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The type of the alert rule. Valid value: METRIC. This value indicates an alert rule for time series metrics.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The callback URL. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static DescribeMetricRuleListResponseBodyAlarmsAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarmsAlarm self = new DescribeMetricRuleListResponseBodyAlarmsAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setCompositeExpression(DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression compositeExpression) {
            this.compositeExpression = compositeExpression;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmCompositeExpression getCompositeExpression() {
            return this.compositeExpression;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEnableState(Boolean enableState) {
            this.enableState = enableState;
            return this;
        }
        public Boolean getEnableState() {
            return this.enableState;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setEscalations(DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmEscalations getEscalations() {
            return this.escalations;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setLabels(DescribeMetricRuleListResponseBodyAlarmsAlarmLabels labels) {
            this.labels = labels;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmLabels getLabels() {
            return this.labels;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setMailSubject(String mailSubject) {
            this.mailSubject = mailSubject;
            return this;
        }
        public String getMailSubject() {
            return this.mailSubject;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setPrometheus(DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus prometheus) {
            this.prometheus = prometheus;
            return this;
        }
        public DescribeMetricRuleListResponseBodyAlarmsAlarmPrometheus getPrometheus() {
            return this.prometheus;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeMetricRuleListResponseBodyAlarmsAlarm setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class DescribeMetricRuleListResponseBodyAlarms extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarm> alarm;

        public static DescribeMetricRuleListResponseBodyAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleListResponseBodyAlarms self = new DescribeMetricRuleListResponseBodyAlarms();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleListResponseBodyAlarms setAlarm(java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeMetricRuleListResponseBodyAlarmsAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
