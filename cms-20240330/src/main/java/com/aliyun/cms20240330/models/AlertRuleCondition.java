// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleCondition extends TeaModel {
    /**
     * <p>Applicable condition type: SLS_CONDITION.</p>
     * <p>The number of times the condition must be met before an alert is triggered. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>Applicable condition type: SLS_CONDITION.</p>
     * <p>The list of Simple Log Service alert conditions.</p>
     */
    @NameInMap("caseList")
    public java.util.List<AlertRuleConditionCaseList> caseList;

    /**
     * <p>Applicable condition type: APM_CONDITION.</p>
     * <p>The list of Application Performance Monitoring (APM) alert comparison conditions.</p>
     */
    @NameInMap("compareList")
    public java.util.List<AlertRuleConditionCompareList> compareList;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
     * <p>This parameter takes effect only when escalationType is set to composite. The composite metric alert condition.</p>
     */
    @NameInMap("compositeEscalation")
    public AlertRuleConditionCompositeEscalation compositeEscalation;

    @NameInMap("countOperator")
    public String countOperator;

    @NameInMap("countThreshold")
    public Long countThreshold;

    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>simple: simple metric condition.</li>
     * <li>composite: composite metric condition.</li>
     * <li>express: expression condition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
     * <p>This parameter takes effect only when escalationType is set to composite. The multi-metric composite alert condition.</p>
     */
    @NameInMap("expressEscalation")
    public AlertRuleConditionExpressEscalation expressEscalation;

    @NameInMap("matchField")
    public String matchField;

    @NameInMap("matchOperator")
    public String matchOperator;

    @NameInMap("matchValue")
    public String matchValue;

    @NameInMap("max")
    public Double max;

    @NameInMap("min")
    public Double min;

    /**
     * <p>Applicable condition type: APM_CONDITION.</p>
     * <p>The alert level when no data is available. If this parameter is not specified, no alert is triggered when no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>Applicable condition type: APM_CONDITION.</p>
     * <p>The compensation value when no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("noDataAppendValue")
    public String noDataAppendValue;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
     * <p>The method used to handle alerts when no monitoring data is available. Valid values:</p>
     * <ul>
     * <li>KEEP_LAST_STATE (default): No action is taken.</li>
     * <li>INSUFFICIENT_DATA: The alert content indicates that no data is available.</li>
     * <li>OK: Normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The comparison operator. Specifies whether to use year-over-year or period-over-period comparison. Valid values:</p>
     * <ul>
     * <li>GT: greater than.</li>
     * <li>GTE: greater than or equal to.</li>
     * <li>LT: less than.</li>
     * <li>LTE: less than or equal to.</li>
     * <li>EQ: equal to.</li>
     * <li>NE: not equal to.</li>
     * <li>YOY_UP: year-over-year increase.</li>
     * <li>YOY_DOWN: year-over-year decrease.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LT</p>
     */
    @NameInMap("oper")
    public String oper;

    /**
     * <p>Applicable condition type: APM_CONDITION.</p>
     * <p>The logical relationship between multiple conditions. Valid values:</p>
     * <ul>
     * <li>and</li>
     * <li>or</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
     * <p>This parameter takes effect only when escalationType is set to simple. The alert condition configured for a single metric.</p>
     */
    @NameInMap("simpleEscalation")
    public AlertRuleConditionSimpleEscalation simpleEscalation;

    @NameInMap("thresholdList")
    public java.util.List<AlertRuleConditionThresholdList> thresholdList;

    @NameInMap("triggers")
    public java.util.List<AlertRuleConditionTriggers> triggers;

    /**
     * <p>The rule condition type. Valid values:</p>
     * <ul>
     * <li>SLS_CONDITION: Simple Log Service alert condition.</li>
     * <li>APM_CONDITION: APM alert condition.</li>
     * <li>CMS_BASIC_CONDITION: CloudMonitor Basic monitoring alert condition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS_CONDITION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The threshold that triggers the alert.</p>
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

    public AlertRuleCondition setCountOperator(String countOperator) {
        this.countOperator = countOperator;
        return this;
    }
    public String getCountOperator() {
        return this.countOperator;
    }

    public AlertRuleCondition setCountThreshold(Long countThreshold) {
        this.countThreshold = countThreshold;
        return this;
    }
    public Long getCountThreshold() {
        return this.countThreshold;
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

    public AlertRuleCondition setMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }
    public String getMatchField() {
        return this.matchField;
    }

    public AlertRuleCondition setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    public AlertRuleCondition setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

    public AlertRuleCondition setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public AlertRuleCondition setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
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

    public AlertRuleCondition setThresholdList(java.util.List<AlertRuleConditionThresholdList> thresholdList) {
        this.thresholdList = thresholdList;
        return this;
    }
    public java.util.List<AlertRuleConditionThresholdList> getThresholdList() {
        return this.thresholdList;
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
         * <p>The match expression. Example: logLevel: error.</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel: error</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>The count match expression. Examples:
         * Range combination: <strong>count</strong> &gt;= 3 &amp;&amp; <strong>count</strong> &lt;= 10
         * Single range: __count__ &gt;= 3</p>
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
         * <p>The match type: has data, has a specific number of data entries, has data match, or has a specific number of data matches.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HasData: has data</li>
         * <li>HasDataCount: has a specific number of data entries</li>
         * <li>HasDataMatch: has data match</li>
         * <li>HasDataMatchCount: has a specific number of data matches</li>
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
         * <p>The comparison threshold.</p>
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
         * <p>The aggregate functions applied after time series aggregation.</p>
         * <ul>
         * <li>count</li>
         * <li>sum</li>
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
         * <p>The data unit.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("baseUnit")
        public String baseUnit;

        /**
         * <p>The display unit.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("displayUnit")
        public String displayUnit;

        /**
         * <p>The comparison operator. Determines whether year-over-year or period-over-period comparison is used.</p>
         * <ul>
         * <li>Greater than: GT</li>
         * <li>Greater than or equal to: GTE</li>
         * <li>Less than: LT</li>
         * <li>Less than or equal to: LTE</li>
         * <li>Equal to: EQ</li>
         * <li>Not equal to: NE</li>
         * <li>Year-over-year increase: YOY_UP</li>
         * <li>Year-over-year decrease: YOY_DOWN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>The comparison threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("value")
        public Double value;

        /**
         * <p>The list of alert levels for different values.</p>
         */
        @NameInMap("valueLevelList")
        public java.util.List<AlertRuleConditionCompareListValueLevelList> valueLevelList;

        /**
         * <p>The time unit for year-over-year comparison. Valid only when oper is set to YOY_UP or YOY_DOWN.
         * Valid values: minute, hour, day, week, month.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("yoyTimeUnit")
        public String yoyTimeUnit;

        /**
         * <p>The value of the year-over-year time period. Used together with yoyTimeUnit.</p>
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
         * <p>The threshold comparison operator. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: Greater than or equal to.</li>
         * <li>GreaterThanThreshold: Greater than.</li>
         * <li>LessThanOrEqualToThreshold: Less than or equal to.</li>
         * <li>LessThanThreshold: Less than.</li>
         * <li>NotEqualToThreshold: Not equal to.</li>
         * <li>EqualToThreshold: Equal to.</li>
         * <li>GreaterThanYesterday: Year-over-year increase compared with the same time yesterday.</li>
         * <li>LessThanYesterday: Year-over-year decrease compared with the same time yesterday.</li>
         * <li>GreaterThanLastWeek: Year-over-year increase compared with the same time last week.</li>
         * <li>LessThanLastWeek: Year-over-year decrease compared with the same time last week.</li>
         * <li>GreaterThanLastPeriod: Period-over-period increase compared with the previous period.</li>
         * <li>LessThanLastPeriod: Period-over-period decrease compared with the previous period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The time window of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>The statistical method. The value of this parameter is determined by the Statistics column corresponding to the MetricName of the specified cloud service. Example values for the statistical method of a metric:</p>
         * <ul>
         * <li>$Maximum: Maximum value.</li>
         * <li>$Minimum: Minimum value.</li>
         * <li>$Average: Average value.</li>
         * <li>$Availability: Availability rate (typically used for site monitoring).</li>
         * </ul>
         * <p>Note: $ is the unified prefix symbol for metrics.</p>
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
         * <p>The list of composite conditions for multiple metrics.</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionCompositeEscalationEscalations> escalations;

        /**
         * <p>The alert level triggered when the condition is met. Composite metric alerts support only one level.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The relationship between multiple metric conditions. Valid values: and, or.</p>
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
         * <p>The alert level triggered when the condition is met. Expression-based alerts support only one level.</p>
         * <ul>
         * <li>CRITICAL</li>
         * <li>WARNING</li>
         * <li>INFO</li>
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
         * <p>The threshold comparison operator. Valid values:</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold: Greater than or equal to.</li>
         * <li>GreaterThanThreshold: Greater than.</li>
         * <li>LessThanOrEqualToThreshold: Less than or equal to.</li>
         * <li>LessThanThreshold: Less than.</li>
         * <li>NotEqualToThreshold: Not equal to.</li>
         * <li>EqualToThreshold: Equal to.</li>
         * <li>GreaterThanYesterday: Year-over-year increase compared with the same time yesterday.</li>
         * <li>LessThanYesterday: Year-over-year decrease compared with the same time yesterday.</li>
         * <li>GreaterThanLastWeek: Year-over-year increase compared with the same time last week.</li>
         * <li>LessThanLastWeek: Year-over-year decrease compared with the same time last week.</li>
         * <li>GreaterThanLastPeriod: Period-over-period increase compared with the previous period.</li>
         * <li>LessThanLastPeriod: Period-over-period decrease compared with the previous period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>The alert level triggered when the condition is met. Expression-based alerts support only one level.</p>
         * <ul>
         * <li>CRITICAL</li>
         * <li>WARNING</li>
         * <li>INFO</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The statistical method. The value of this parameter is determined by the Statistics column corresponding to the MetricName of the specified cloud service. Examples: Maximum, Minimum, and Average.</p>
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
         * <p>The list of conditions. When an alert rule corresponds to multiple levels, each level has a condition object.</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionSimpleEscalationEscalations> escalations;

        /**
         * <p>Applicable condition type: CMS_BASIC_CONDITION.</p>
         * <p>The metric associated with the alert condition.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The time window of the metric. Unit: seconds.</p>
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

    public static class AlertRuleConditionThresholdList extends TeaModel {
        @NameInMap("max")
        public Double max;

        @NameInMap("min")
        public Double min;

        @NameInMap("severity")
        public String severity;

        @NameInMap("threshold")
        public Double threshold;

        public static AlertRuleConditionThresholdList build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleConditionThresholdList self = new AlertRuleConditionThresholdList();
            return TeaModel.build(map, self);
        }

        public AlertRuleConditionThresholdList setMax(Double max) {
            this.max = max;
            return this;
        }
        public Double getMax() {
            return this.max;
        }

        public AlertRuleConditionThresholdList setMin(Double min) {
            this.min = min;
            return this;
        }
        public Double getMin() {
            return this.min;
        }

        public AlertRuleConditionThresholdList setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public AlertRuleConditionThresholdList setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
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
