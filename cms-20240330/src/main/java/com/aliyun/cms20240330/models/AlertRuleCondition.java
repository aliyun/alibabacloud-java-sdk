// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleCondition extends TeaModel {
    /**
     * <p>Applicable to the SLS_CONDITION type.</p>
     * <p>The number of times the condition must be met to trigger an alert. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>Applicable to the SLS_CONDITION type.</p>
     * <p>A list of SLS alert conditions.</p>
     */
    @NameInMap("caseList")
    public java.util.List<AlertRuleConditionCaseList> caseList;

    /**
     * <p>Applicable to the APM_CONDITION type.</p>
     * <p>A list of Application Performance Management (APM) alert comparison conditions.</p>
     */
    @NameInMap("compareList")
    public java.util.List<AlertRuleConditionCompareList> compareList;

    /**
     * <p>Applicable to the CMS_BASIC_CONDITION type.</p>
     * <p>This parameter is valid only when escalationType is set to composite. It specifies the alert condition for composite metrics.</p>
     */
    @NameInMap("compositeEscalation")
    public AlertRuleConditionCompositeEscalation compositeEscalation;

    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    /**
     * <p>Applicable to the CMS_BASIC_CONDITION type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>simple: A simple metric condition.</p>
     * </li>
     * <li><p>composite: A composite metric condition.</p>
     * </li>
     * <li><p>express: An expression-based condition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>This parameter is applicable only to the CMS_BASIC_CONDITION condition type.</p>
     * <p>This parameter takes effect when escalationType is set to composite. It defines the conditions for a composite alert based on multiple metrics.</p>
     */
    @NameInMap("expressEscalation")
    public AlertRuleConditionExpressEscalation expressEscalation;

    /**
     * <p>Applicable to the APM_CONDITION type.</p>
     * <p>The alert level for when no data is available. If you do not specify this parameter, no alert is triggered when no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>Applicable to the APM_CONDITION type.</p>
     * <p>The value to use when no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("noDataAppendValue")
    public String noDataAppendValue;

    /**
     * <p>Applicable to the CMS_BASIC_CONDITION type.</p>
     * <p>The method for handling alerts when no monitoring data is available. Valid values:</p>
     * <ul>
     * <li><p>KEEP_LAST_STATE (default): No action is taken.</p>
     * </li>
     * <li><p>INSUFFICIENT_DATA: The alert content indicates that no data is available.</p>
     * </li>
     * <li><p>OK: The status is normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The comparison operation. It determines whether to perform a year-over-year or period-over-period comparison.</p>
     * <ul>
     * <li><p>GT: Greater than.</p>
     * </li>
     * <li><p>GTE: Greater than or equal to.</p>
     * </li>
     * <li><p>LT: Less than.</p>
     * </li>
     * <li><p>LTE: Less than or equal to.</p>
     * </li>
     * <li><p>EQ: Equal to.</p>
     * </li>
     * <li><p>NE: Not equal to.</p>
     * </li>
     * <li><p>YOY_UP: Year-over-year increase.</p>
     * </li>
     * <li><p>YOY_DOWN: Year-over-year decrease.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LT</p>
     */
    @NameInMap("oper")
    public String oper;

    /**
     * <p>Applicable to the APM_CONDITION type.</p>
     * <p>The logical relationship between multiple conditions. Valid values:</p>
     * <ul>
     * <li><p>and</p>
     * </li>
     * <li><p>or</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>Applicable to the CMS_BASIC_CONDITION type.</p>
     * <p>This parameter is valid only when escalationType is set to simple. It specifies the alert condition for a single metric.</p>
     */
    @NameInMap("simpleEscalation")
    public AlertRuleConditionSimpleEscalation simpleEscalation;

    @NameInMap("triggers")
    public java.util.List<AlertRuleConditionTriggers> triggers;

    /**
     * <p>The type of the rule condition. Valid values:</p>
     * <ul>
     * <li><p>SLS_CONDITION: An SLS alert condition.</p>
     * </li>
     * <li><p>APM_CONDITION: An APM alert condition.</p>
     * </li>
     * <li><p>CMS_BASIC_CONDITION: A basic Cloud Monitor alert condition.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS_CONDITION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The threshold that triggers an alert.</p>
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
         * <p>The matching expression. Example: logLevel: error</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel: error</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The expression for matching a quantity. Examples:
         * Combined range: <strong>count</strong> &gt;= 3 &amp;&amp; <strong>count</strong> &lt;= 10
         * Single range: **count** &gt;= 3</p>
         * 
         * <strong>example:</strong>
         * <p>count &gt;= 3</p>
         */
        @NameInMap("countCondition")
        public String countCondition;

        /**
         * <p>The alert level when the condition is met.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The match type. It can be data availability, a specific number of data entries, a data match, or a specific number of data entry matches.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>HasData: Data is available.</p>
         * </li>
         * <li><p>HasDataCount: A specific number of data entries are available.</p>
         * </li>
         * <li><p>HasDataMatch: Data matches the condition.</p>
         * </li>
         * <li><p>HasDataMatchCount: A specific number of data entries match the condition.</p>
         * </li>
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
         * <p>The level corresponding to the threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The threshold for comparison.</p>
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
         * <p>The aggregate function for the time series.</p>
         * <ul>
         * <li><p>count</p>
         * </li>
         * <li><p>sum</p>
         * </li>
         * <li><p>avg</p>
         * </li>
         * <li><p>min</p>
         * </li>
         * <li><p>max</p>
         * </li>
         * <li><p>p90</p>
         * </li>
         * <li><p>p95</p>
         * </li>
         * <li><p>p99</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("aggregate")
        public String aggregate;

        /**
         * <p>The unit of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("baseUnit")
        public String baseUnit;

        /**
         * <p>The unit for display.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("displayUnit")
        public String displayUnit;

        /**
         * <p>The comparison operation. It determines whether to perform a year-over-year or period-over-period comparison.</p>
         * <ul>
         * <li><p>GT: Greater than.</p>
         * </li>
         * <li><p>GTE: Greater than or equal to.</p>
         * </li>
         * <li><p>LT: Less than.</p>
         * </li>
         * <li><p>LTE: Less than or equal to.</p>
         * </li>
         * <li><p>EQ: Equal to.</p>
         * </li>
         * <li><p>NE: Not equal to.</p>
         * </li>
         * <li><p>YOY_UP: Year-over-year increase.</p>
         * </li>
         * <li><p>YOY_DOWN: Year-over-year decrease.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>The threshold for comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("value")
        public Double value;

        /**
         * <p>A list of alert levels for different values.</p>
         */
        @NameInMap("valueLevelList")
        public java.util.List<AlertRuleConditionCompareListValueLevelList> valueLevelList;

        /**
         * <p>The time unit for year-over-year comparison. This parameter is valid only when oper is set to YOY_UP or YOY_DOWN. Valid values: minute, hour, day, week, and month.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("yoyTimeUnit")
        public String yoyTimeUnit;

        /**
         * <p>The time value for year-over-year comparison. Used with yoyTimeUnit.</p>
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
         * <p>The comparison operator for the threshold. Valid values:</p>
         * <ul>
         * <li><p>GreaterThanOrEqualToThreshold: Greater than or equal to.</p>
         * </li>
         * <li><p>GreaterThanThreshold: Greater than.</p>
         * </li>
         * <li><p>LessThanOrEqualToThreshold: Less than or equal to.</p>
         * </li>
         * <li><p>LessThanThreshold: Less than.</p>
         * </li>
         * <li><p>NotEqualToThreshold: Not equal to.</p>
         * </li>
         * <li><p>EqualToThreshold: Equal to.</p>
         * </li>
         * <li><p>GreaterThanYesterday: Higher than the value at the same time yesterday.</p>
         * </li>
         * <li><p>LessThanYesterday: Lower than the value at the same time yesterday.</p>
         * </li>
         * <li><p>GreaterThanLastWeek: Higher than the value at the same time last week.</p>
         * </li>
         * <li><p>LessThanLastWeek: Lower than the value at the same time last week.</p>
         * </li>
         * <li><p>GreaterThanLastPeriod: Higher than the value in the previous period.</p>
         * </li>
         * <li><p>LessThanLastPeriod: Lower than the value in the previous period.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The time window for the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The statistical method. The valid values for this parameter are determined by the Statistics column that corresponds to the MetricName of the specified cloud product. Examples of statistical methods for metrics:</p>
         * <ul>
         * <li><p>$Maximum: The maximum value.</p>
         * </li>
         * <li><p>$Minimum: The minimum value.</p>
         * </li>
         * <li><p>$Average: The average value.</p>
         * </li>
         * <li><p>$Availability: The availability rate. This is typically used for site monitoring.</p>
         * </li>
         * </ul>
         * <p>Note: The dollar sign ($) is a standard prefix for metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>$Maximum</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
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
         * <p>A list of composite conditions for multiple metrics.</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionCompositeEscalationEscalations> escalations;

        /**
         * <p>The alert level that is triggered when the condition is met. Composite metric alerts support only one level.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The relationship between multiple metric conditions. Valid values: and or or.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("relation")
        public String relation;

        /**
         * <p>The number of times the condition must be met to trigger an alert.</p>
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
         * <p>The alert level that is triggered when the condition is met. Expression-based alerts support only one level.</p>
         * <ul>
         * <li><p>CRITICAL</p>
         * </li>
         * <li><p>WARNING</p>
         * </li>
         * <li><p>INFO</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The alert condition expression.</p>
         * 
         * <strong>example:</strong>
         * <p>@cpu_total[60].$Average &gt; 60</p>
         */
        @NameInMap("rawExpression")
        public String rawExpression;

        /**
         * <p>The number of times the condition must be met to trigger an alert.</p>
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
         * <p>The comparison operator for the threshold. Valid values:</p>
         * <ul>
         * <li><p>GreaterThanOrEqualToThreshold: Greater than or equal to.</p>
         * </li>
         * <li><p>GreaterThanThreshold: Greater than.</p>
         * </li>
         * <li><p>LessThanOrEqualToThreshold: Less than or equal to.</p>
         * </li>
         * <li><p>LessThanThreshold: Less than.</p>
         * </li>
         * <li><p>NotEqualToThreshold: Not equal to.</p>
         * </li>
         * <li><p>EqualToThreshold: Equal to.</p>
         * </li>
         * <li><p>GreaterThanYesterday: Higher than the value at the same time yesterday.</p>
         * </li>
         * <li><p>LessThanYesterday: Lower than the value at the same time yesterday.</p>
         * </li>
         * <li><p>GreaterThanLastWeek: Higher than the value at the same time last week.</p>
         * </li>
         * <li><p>LessThanLastWeek: Lower than the value at the same time last week.</p>
         * </li>
         * <li><p>GreaterThanLastPeriod: Higher than the value in the previous period.</p>
         * </li>
         * <li><p>LessThanLastPeriod: Lower than the value in the previous period.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The alert level that is triggered when the condition is met. Expression-based alerts support only one level.</p>
         * <ul>
         * <li><p>CRITICAL</p>
         * </li>
         * <li><p>WARNING</p>
         * </li>
         * <li><p>INFO</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The statistical method. The valid values for this parameter are determined by the Statistics column that corresponds to the MetricName of the specified cloud product. Examples: Maximum, Minimum, and Average.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("threshold")
        public Double threshold;

        /**
         * <p>The number of times the condition must be met to trigger an alert.</p>
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
         * <p>A list of conditions. If an alert rule has multiple levels, each level has a corresponding condition object.</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionSimpleEscalationEscalations> escalations;

        /**
         * <p>Applicable to the CMS_BASIC_CONDITION type.</p>
         * <p>The metric associated with the alert condition.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The time window for the metric, in seconds.</p>
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
