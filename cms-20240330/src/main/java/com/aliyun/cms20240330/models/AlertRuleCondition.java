// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleCondition extends TeaModel {
    /**
     * <p>Applicable condition type: SLS_CONDITION.
     * Number of times the condition must be met before triggering an alert, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>Applicable condition type: SLS_CONDITION.
     * SLS alert condition list.</p>
     */
    @NameInMap("caseList")
    public java.util.List<AlertRuleConditionCaseList> caseList;

    /**
     * <p>Applicable condition type: APM_CONDITION.
     * APM alert comparison condition list.</p>
     */
    @NameInMap("compareList")
    public java.util.List<AlertRuleConditionCompareList> compareList;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.
     * Valid only when escalationType=composite; composite metric alert condition.</p>
     */
    @NameInMap("compositeEscalation")
    public AlertRuleConditionCompositeEscalation compositeEscalation;

    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.
     * Valid values:</p>
     * <ul>
     * <li>simple: Simple metric condition,</li>
     * <li>composite: Composite metric condition,</li>
     * <li>express: Expression condition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.
     * Valid only when escalationType=composite; multi-metric composite alert condition.</p>
     */
    @NameInMap("expressEscalation")
    public AlertRuleConditionExpressEscalation expressEscalation;

    /**
     * <p>Applicable condition type: APM_CONDITION.
     * Alert severity level when no data is available; if not specified, no alert will be triggered for missing data.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>Applicable condition type: APM_CONDITION.
     * Fallback value when no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("noDataAppendValue")
    public String noDataAppendValue;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.
     * Handling method when no monitoring data is available. Valid values:</p>
     * <ul>
     * <li>KEEP_LAST_STATE (default): No action is taken.</li>
     * <li>INSUFFICIENT_DATA: Alert with &quot;insufficient data&quot; message.</li>
     * <li>OK: Treat as normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    /**
     * <p>Comparison operations to determine whether it is year-over-year (YoY) or month-over-month (MoM):</p>
     * <ul>
     * <li>Greater than (GT),</li>
     * <li>Greater than or equal to (GTE),</li>
     * <li>Less than (LT),</li>
     * <li>Less than or equal to (LTE),</li>
     * <li>Equal to (EQ),</li>
     * <li>Not equal to (NE),</li>
     * <li>Year-over-year increase (YOY_UP),</li>
     * <li>Year-over-year decrease (YOY_DOWN).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LT</p>
     */
    @NameInMap("oper")
    public String oper;

    /**
     * <p>Applicable condition type: APM_CONDITION.
     * Logical relationship between multiple conditions. Valid values: and, or.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.
     * Only valid when escalationType=simple; specifies the alert condition for a single metric.</p>
     */
    @NameInMap("simpleEscalation")
    public AlertRuleConditionSimpleEscalation simpleEscalation;

    @NameInMap("triggers")
    public java.util.List<AlertRuleConditionTriggers> triggers;

    /**
     * <p>Rule condition type, valid values:</p>
     * <p>SLS_CONDITION (SLS alert condition),
     * APM_CONDITION (APM alert condition),
     * CMS_BASIC_CONDITION (Basic Cloud Monitoring alert condition).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS_CONDITION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Alert triggering threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("value")
    public Double value;

    public static AlertRuleCondition build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleCondition self = new AlertRuleCondition();
        return TeaModel.build(map, self);
    }

    public AlertRuleCondition setAlertCount(Integer alertCount) {
        this.alertCount = alertCount;
        return this;
    }
    public Integer getAlertCount() {
        return this.alertCount;
    }

    public AlertRuleCondition setCaseList(java.util.List<AlertRuleConditionCaseList> caseList) {
        this.caseList = caseList;
        return this;
    }
    public java.util.List<AlertRuleConditionCaseList> getCaseList() {
        return this.caseList;
    }

    public AlertRuleCondition setCompareList(java.util.List<AlertRuleConditionCompareList> compareList) {
        this.compareList = compareList;
        return this;
    }
    public java.util.List<AlertRuleConditionCompareList> getCompareList() {
        return this.compareList;
    }

    public AlertRuleCondition setCompositeEscalation(AlertRuleConditionCompositeEscalation compositeEscalation) {
        this.compositeEscalation = compositeEscalation;
        return this;
    }
    public AlertRuleConditionCompositeEscalation getCompositeEscalation() {
        return this.compositeEscalation;
    }

    public AlertRuleCondition setEnableSeveritySuppression(Boolean enableSeveritySuppression) {
        this.enableSeveritySuppression = enableSeveritySuppression;
        return this;
    }
    public Boolean getEnableSeveritySuppression() {
        return this.enableSeveritySuppression;
    }

    public AlertRuleCondition setEscalationType(String escalationType) {
        this.escalationType = escalationType;
        return this;
    }
    public String getEscalationType() {
        return this.escalationType;
    }

    public AlertRuleCondition setExpressEscalation(AlertRuleConditionExpressEscalation expressEscalation) {
        this.expressEscalation = expressEscalation;
        return this;
    }
    public AlertRuleConditionExpressEscalation getExpressEscalation() {
        return this.expressEscalation;
    }

    public AlertRuleCondition setNoDataAlertLevel(String noDataAlertLevel) {
        this.noDataAlertLevel = noDataAlertLevel;
        return this;
    }
    public String getNoDataAlertLevel() {
        return this.noDataAlertLevel;
    }

    public AlertRuleCondition setNoDataAppendValue(String noDataAppendValue) {
        this.noDataAppendValue = noDataAppendValue;
        return this;
    }
    public String getNoDataAppendValue() {
        return this.noDataAppendValue;
    }

    public AlertRuleCondition setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public AlertRuleCondition setOper(String oper) {
        this.oper = oper;
        return this;
    }
    public String getOper() {
        return this.oper;
    }

    public AlertRuleCondition setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public AlertRuleCondition setSimpleEscalation(AlertRuleConditionSimpleEscalation simpleEscalation) {
        this.simpleEscalation = simpleEscalation;
        return this;
    }
    public AlertRuleConditionSimpleEscalation getSimpleEscalation() {
        return this.simpleEscalation;
    }

    public AlertRuleCondition setTriggers(java.util.List<AlertRuleConditionTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<AlertRuleConditionTriggers> getTriggers() {
        return this.triggers;
    }

    public AlertRuleCondition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AlertRuleCondition setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

    public static class AlertRuleConditionCaseList extends TeaModel {
        /**
         * <p>Matching expression, example: logLevel: error.</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel: error</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>Count matching expression, examples: range combination: count &gt;= 3 &amp;&amp; count &lt;= 10; single range: count &gt;= 3.</p>
         * 
         * <strong>example:</strong>
         * <p>count &gt;= 3</p>
         */
        @NameInMap("countCondition")
        public String countCondition;

        /**
         * <p>Alert severity level after condition is met.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Matching type: Has data / Has a specific number of data entries / Has matching data / Has a specific number of matching entries.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HasData: Has data.</li>
         * <li>HasDataCount: Has a specific number of data entries.</li>
         * <li>HasDataMatch: Has matching data.</li>
         * <li>HasDataMatchCount: Has a specific number of matching entries.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HasData</p>
         */
        @NameInMap("type")
        public String type;

        public static AlertRuleConditionCaseList build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionCaseList self = new AlertRuleConditionCaseList();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionCaseList setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public AlertRuleConditionCaseList setCountCondition(String countCondition) {
            this.countCondition = countCondition;
            return this;
        }
        public String getCountCondition() {
            return this.countCondition;
        }

        public AlertRuleConditionCaseList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AlertRuleConditionCaseList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AlertRuleConditionCompareListValueLevelList extends TeaModel {
        /**
         * <p>Severity level corresponding to the threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("value")
        public Double value;

        public static AlertRuleConditionCompareListValueLevelList build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionCompareListValueLevelList self = new AlertRuleConditionCompareListValueLevelList();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionCompareListValueLevelList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AlertRuleConditionCompareListValueLevelList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class AlertRuleConditionCompareList extends TeaModel {
        /**
         * <p>Time series post-aggregation functions:</p>
         * <ul>
         * <li>count</li>
         * <li>sum </li>
         * <li>avg</li>
         * <li>min</li>
         * <li>max</li>
         * <li>p90</li>
         * <li>p95</li>
         * <li>p99</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("aggregate")
        public String aggregate;

        /**
         * <p>Data unit.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("baseUnit")
        public String baseUnit;

        /**
         * <p>Display unit.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("displayUnit")
        public String displayUnit;

        /**
         * <p>Comparison operations to determine whether it is year-over-year (YoY) or month-over-month (MoM):</p>
         * <ul>
         * <li>Greater than (GT),</li>
         * <li>Greater than or equal to (GTE),</li>
         * <li>Less than (LT),</li>
         * <li>Less than or equal to (LTE),</li>
         * <li>Equal to (EQ),</li>
         * <li>Not equal to (NE),</li>
         * <li>Year-over-year increase (YOY_UP),</li>
         * <li>Year-over-year decrease (YOY_DOWN).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>Comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("value")
        public Double value;

        /**
         * <p>List of alert severity levels for different values.</p>
         */
        @NameInMap("valueLevelList")
        public java.util.List<AlertRuleConditionCompareListValueLevelList> valueLevelList;

        /**
         * <p>Year-over-year time unit (only applicable when oper=YOY_UP/YOY_DOWN): minute, hour, day, week, month.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("yoyTimeUnit")
        public String yoyTimeUnit;

        /**
         * <p>Year-over-year time value, used in conjunction with yoyTimeUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("yoyTimeValue")
        public Integer yoyTimeValue;

        public static AlertRuleConditionCompareList build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionCompareList self = new AlertRuleConditionCompareList();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionCompareList setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public AlertRuleConditionCompareList setBaseUnit(String baseUnit) {
            this.baseUnit = baseUnit;
            return this;
        }
        public String getBaseUnit() {
            return this.baseUnit;
        }

        public AlertRuleConditionCompareList setDisplayUnit(String displayUnit) {
            this.displayUnit = displayUnit;
            return this;
        }
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        public AlertRuleConditionCompareList setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public AlertRuleConditionCompareList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

        public AlertRuleConditionCompareList setValueLevelList(java.util.List<AlertRuleConditionCompareListValueLevelList> valueLevelList) {
            this.valueLevelList = valueLevelList;
            return this;
        }
        public java.util.List<AlertRuleConditionCompareListValueLevelList> getValueLevelList() {
            return this.valueLevelList;
        }

        public AlertRuleConditionCompareList setYoyTimeUnit(String yoyTimeUnit) {
            this.yoyTimeUnit = yoyTimeUnit;
            return this;
        }
        public String getYoyTimeUnit() {
            return this.yoyTimeUnit;
        }

        public AlertRuleConditionCompareList setYoyTimeValue(Integer yoyTimeValue) {
            this.yoyTimeValue = yoyTimeValue;
            return this;
        }
        public Integer getYoyTimeValue() {
            return this.yoyTimeValue;
        }

    }

    public static class AlertRuleConditionCompositeEscalationEscalations extends TeaModel {
        /**
         * <p>Threshold comparison operator, valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to.</li>
         * <li>GreaterThanThreshold: greater than.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to.</li>
         * <li>LessThanThreshold: less than.</li>
         * <li>NotEqualToThreshold: not equal to.</li>
         * <li>EqualToThreshold: equal to.</li>
         * <li>GreaterThanYesterday: increased compared to the same time yesterday.</li>
         * <li>LessThanYesterday: decreased compared to the same time yesterday.</li>
         * <li>GreaterThanLastWeek: increased compared to the same time last week.</li>
         * <li>LessThanLastWeek: decreased compared to the same time last week.</li>
         * <li>GreaterThanLastPeriod: increased compared to the previous period (MoM).</li>
         * <li>LessThanLastPeriod: decreased compared to the previous period (MoM).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>Metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>Metric time window.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>Statistical method; the value of this parameter is determined by the Statistics column corresponding to the specified cloud product\&quot;s MetricName. This represents the statistical method for the monitoring metric. Example values:</p>
         * <ul>
         * <li>$Maximum: maximum value.</li>
         * <li>$Minimum: minimum value.</li>
         * <li>$Average: average value.</li>
         * <li>$Availability: availability (typically used for site monitoring).
         * Note: &quot;$&quot; is a unified prefix symbol for monitoring metrics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>$Maximum</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>Alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("threshold")
        public Double threshold;

        public static AlertRuleConditionCompositeEscalationEscalations build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionCompositeEscalationEscalations self = new AlertRuleConditionCompositeEscalationEscalations();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionCompositeEscalationEscalations setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public AlertRuleConditionCompositeEscalationEscalations setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public AlertRuleConditionCompositeEscalationEscalations setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public AlertRuleConditionCompositeEscalationEscalations setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public AlertRuleConditionCompositeEscalationEscalations setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

    }

    public static class AlertRuleConditionCompositeEscalation extends TeaModel {
        /**
         * <p>List of multi-metric composite conditions.</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionCompositeEscalationEscalations> escalations;

        /**
         * <p>Alert severity level triggered when the condition is met (multi-metric composite alerts support only one level).</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Relationship between multiple metric conditions; valid values are &quot;and&quot; or &quot;or&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("relation")
        public String relation;

        /**
         * <p>Number of times the condition must be met to trigger an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("times")
        public Integer times;

        public static AlertRuleConditionCompositeEscalation build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionCompositeEscalation self = new AlertRuleConditionCompositeEscalation();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionCompositeEscalation setEscalations(java.util.List<AlertRuleConditionCompositeEscalationEscalations> escalations) {
            this.escalations = escalations;
            return this;
        }
        public java.util.List<AlertRuleConditionCompositeEscalationEscalations> getEscalations() {
            return this.escalations;
        }

        public AlertRuleConditionCompositeEscalation setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AlertRuleConditionCompositeEscalation setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public AlertRuleConditionCompositeEscalation setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class AlertRuleConditionExpressEscalation extends TeaModel {
        /**
         * <p>Alert severity level triggered when the condition is met (expression-based alerts support only one level): </p>
         * <ul>
         * <li>CRITICAL </li>
         * <li>WARNING </li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Alert condition expression.</p>
         * 
         * <strong>example:</strong>
         * <p>@cpu_total[60].$Average &gt; 60</p>
         */
        @NameInMap("rawExpression")
        public String rawExpression;

        /**
         * <p>Number of times the condition must be met to trigger an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("times")
        public Integer times;

        public static AlertRuleConditionExpressEscalation build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionExpressEscalation self = new AlertRuleConditionExpressEscalation();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionExpressEscalation setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AlertRuleConditionExpressEscalation setRawExpression(String rawExpression) {
            this.rawExpression = rawExpression;
            return this;
        }
        public String getRawExpression() {
            return this.rawExpression;
        }

        public AlertRuleConditionExpressEscalation setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class AlertRuleConditionSimpleEscalationEscalations extends TeaModel {
        /**
         * <p>Threshold comparison operator, valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: greater than or equal to.</li>
         * <li>GreaterThanThreshold: greater than.</li>
         * <li>LessThanOrEqualToThreshold: less than or equal to.</li>
         * <li>LessThanThreshold: less than.</li>
         * <li>NotEqualToThreshold: not equal to.</li>
         * <li>EqualToThreshold: equal to.</li>
         * <li>GreaterThanYesterday: increased compared to the same time yesterday.</li>
         * <li>LessThanYesterday: decreased compared to the same time yesterday.</li>
         * <li>GreaterThanLastWeek: increased compared to the same time last week.</li>
         * <li>LessThanLastWeek: decreased compared to the same time last week.</li>
         * <li>GreaterThanLastPeriod: increased compared to the previous period (MoM).</li>
         * <li>LessThanLastPeriod: decreased compared to the previous period (MoM).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>Alert severity level triggered when the condition is met (expression-based alerts support only one level): </p>
         * <ul>
         * <li>CRITICAL </li>
         * <li>WARNING </li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Statistical method; the value of this parameter is determined by the Statistics column corresponding to the specified cloud product\&quot;s MetricName, for example: Maximum, Minimum, and Average.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>Alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("threshold")
        public Double threshold;

        /**
         * <p>Number of times the condition must be met to trigger an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("times")
        public Integer times;

        public static AlertRuleConditionSimpleEscalationEscalations build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionSimpleEscalationEscalations self = new AlertRuleConditionSimpleEscalationEscalations();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionSimpleEscalationEscalations setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public AlertRuleConditionSimpleEscalationEscalations setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AlertRuleConditionSimpleEscalationEscalations setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public AlertRuleConditionSimpleEscalationEscalations setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public AlertRuleConditionSimpleEscalationEscalations setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class AlertRuleConditionSimpleEscalation extends TeaModel {
        /**
         * <p>List of conditions; for an alert rule with multiple severity levels, each level corresponds to one condition object.</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionSimpleEscalationEscalations> escalations;

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.
         * Metric associated with the alert condition.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>Metric time window, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        public static AlertRuleConditionSimpleEscalation build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionSimpleEscalation self = new AlertRuleConditionSimpleEscalation();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionSimpleEscalation setEscalations(java.util.List<AlertRuleConditionSimpleEscalationEscalations> escalations) {
            this.escalations = escalations;
            return this;
        }
        public java.util.List<AlertRuleConditionSimpleEscalationEscalations> getEscalations() {
            return this.escalations;
        }

        public AlertRuleConditionSimpleEscalation setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public AlertRuleConditionSimpleEscalation setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

    public static class AlertRuleConditionTriggersExpressionConditions extends TeaModel {
        @NameInMap("expressionType")
        public String expressionType;

        @NameInMap("operator")
        public String operator;

        @NameInMap("queryName")
        public String queryName;

        @NameInMap("threshold")
        public Double threshold;

        public static AlertRuleConditionTriggersExpressionConditions build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionTriggersExpressionConditions self = new AlertRuleConditionTriggersExpressionConditions();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionTriggersExpressionConditions setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public AlertRuleConditionTriggersExpressionConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public AlertRuleConditionTriggersExpressionConditions setQueryName(String queryName) {
            this.queryName = queryName;
            return this;
        }
        public String getQueryName() {
            return this.queryName;
        }

        public AlertRuleConditionTriggersExpressionConditions setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

    }

    public static class AlertRuleConditionTriggersExpression extends TeaModel {
        @NameInMap("conditions")
        public java.util.List<AlertRuleConditionTriggersExpressionConditions> conditions;

        @NameInMap("expressionType")
        public String expressionType;

        @NameInMap("logicOperator")
        public String logicOperator;

        public static AlertRuleConditionTriggersExpression build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionTriggersExpression self = new AlertRuleConditionTriggersExpression();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionTriggersExpression setConditions(java.util.List<AlertRuleConditionTriggersExpressionConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<AlertRuleConditionTriggersExpressionConditions> getConditions() {
            return this.conditions;
        }

        public AlertRuleConditionTriggersExpression setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public AlertRuleConditionTriggersExpression setLogicOperator(String logicOperator) {
            this.logicOperator = logicOperator;
            return this;
        }
        public String getLogicOperator() {
            return this.logicOperator;
        }

    }

    public static class AlertRuleConditionTriggers extends TeaModel {
        @NameInMap("durationSecs")
        public Integer durationSecs;

        @NameInMap("expression")
        public AlertRuleConditionTriggersExpression expression;

        @NameInMap("severity")
        public String severity;

        public static AlertRuleConditionTriggers build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionTriggers self = new AlertRuleConditionTriggers();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionTriggers setDurationSecs(Integer durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }
        public Integer getDurationSecs() {
            return this.durationSecs;
        }

        public AlertRuleConditionTriggers setExpression(AlertRuleConditionTriggersExpression expression) {
            this.expression = expression;
            return this;
        }
        public AlertRuleConditionTriggersExpression getExpression() {
            return this.expression;
        }

        public AlertRuleConditionTriggers setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

}
