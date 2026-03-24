// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleCondition extends TeaModel {
    /**
     * <p>适用条件类型：SLS_CONDITION</p>
     * <p>满足条件几次后告警，默认为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>适用条件类型： SLS_CONDITION。</p>
     * <p>SLS告警条件列表</p>
     */
    @NameInMap("caseList")
    public java.util.List<AlertRuleConditionCaseList> caseList;

    /**
     * <p>适用条件类型：APM_CONDITION。</p>
     * <p>APM告警比较条件列表</p>
     */
    @NameInMap("compareList")
    public java.util.List<AlertRuleConditionCompareList> compareList;

    /**
     * <p>适用条件类型：CMS_BASIC_CONDITION</p>
     * <p>escalationType=composite时有效，组合指标告警条件</p>
     */
    @NameInMap("compositeEscalation")
    public AlertRuleConditionCompositeEscalation compositeEscalation;

    /**
     * <p>适用条件类型：CMS_BASIC_CONDITION</p>
     * <p>取值范围: </p>
     * <ul>
     * <li>simple: 简单指标条件</li>
     * <li>composite: 组合指标条件</li>
     * <li>express: 表达式条件</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>适用条件类型：CMS_BASIC_CONDITION。</p>
     * <p>escalationType=composite时有效，多指标组合告警条件。</p>
     */
    @NameInMap("expressEscalation")
    public AlertRuleConditionExpressEscalation expressEscalation;

    /**
     * <p>适用条件类型：APM_CONDITION。</p>
     * <p>无数据时的告警级别，不指定则不对无数据报警</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>适用条件类型：APM_CONDITION。</p>
     * <p>无数据时补偿的值。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("noDataAppendValue")
    public String noDataAppendValue;

    /**
     * <p>适用条件类型：CMS_BASIC_CONDITION。</p>
     * <p>无监控数据时报警的处理方式。取值：</p>
     * <ul>
     * <li>KEEP_LAST_STATE（默认值）：不做任何处理。</li>
     * <li>INSUFFICIENT_DATA：报警内容为无数据。</li>
     * <li>OK：正常。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KEEP_LAST_STATE</p>
     */
    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    /**
     * <p>比较操作，判断是否是同比、环比</p>
     * <ul>
     * <li>大于 GT</li>
     * <li>大于等于 GTE</li>
     * <li>小于 LT</li>
     * <li>小于等于 LTE</li>
     * <li>等于 EQ</li>
     * <li>不等于 NE</li>
     * <li>同比增加 YOY_UP</li>
     * <li>同比减少 YOY_DOWN</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LT</p>
     */
    @NameInMap("oper")
    public String oper;

    /**
     * <p>适用条件类型：APM_CONDITION。</p>
     * <p>多个条件之间的逻辑关系。 取值：</p>
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
     * <p>适用条件类型：CMS_BASIC_CONDITION。</p>
     * <p>仅当escalationType=simple时有效，针对单一指标设置的告警条件</p>
     */
    @NameInMap("simpleEscalation")
    public AlertRuleConditionSimpleEscalation simpleEscalation;

    /**
     * <p>规则条件类型，取值范围：</p>
     * <ul>
     * <li>SLS_CONDITION(SLS告警条件)</li>
     * <li>APM_CONDITION(APM告警条件)</li>
     * <li>CMS_BASIC_CONDITION(基础云监控告警条件)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS_CONDITION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>告警触发的阈值。</p>
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
         * <p>匹配表达式，示例：  logLevel: error</p>
         * 
         * <strong>example:</strong>
         * <p>logLevel: error</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>数量匹配表达式，示例：
         * 区间组合： <strong>count</strong> &gt;= 3 &amp;&amp; <strong>count</strong> &lt;= 10
         * 单区间： __count__ &gt;= 3</p>
         * 
         * <strong>example:</strong>
         * <p>count &gt;= 3</p>
         */
        @NameInMap("countCondition")
        public String countCondition;

        /**
         * <p>满足条件后的告警级别</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>匹配类型： 有数据/有特定条数据/有数据匹配/有特定条数匹配。</p>
         * <p>取值范围：</p>
         * <ul>
         * <li>HasData: 有数据</li>
         * <li>HasDataCount:  有特定条数据</li>
         * <li>HasDataMatch：有数据匹配</li>
         * <li>HasDataMatchCount：有特定条数匹配</li>
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
         * <p>阈值对应的级别</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>对比的阈值</p>
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
         * <p>时间序列后聚合函数</p>
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
         * <p>数据单位</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("baseUnit")
        public String baseUnit;

        /**
         * <p>展示单位</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("displayUnit")
        public String displayUnit;

        /**
         * <p>比较操作，判断是否是同比、环比</p>
         * <ul>
         * <li>大于 GT</li>
         * <li>大于等于 GTE</li>
         * <li>小于 LT</li>
         * <li>小于等于 LTE</li>
         * <li>等于 EQ</li>
         * <li>不等于 NE</li>
         * <li>同比增加 YOY_UP</li>
         * <li>同比减少 YOY_DOWN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GT</p>
         */
        @NameInMap("oper")
        public String oper;

        /**
         * <p>对比的阈值</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("value")
        public Double value;

        /**
         * <p>不同值的报警级别的列表。</p>
         */
        @NameInMap("valueLevelList")
        public java.util.List<AlertRuleConditionCompareListValueLevelList> valueLevelList;

        /**
         * <p>同比时间单位（仅对oper=YOY_UP/YOY_DOWN生效）
         *  minute、hour、day、week、month</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("yoyTimeUnit")
        public String yoyTimeUnit;

        /**
         * <p>同比时间的值，与yoyTimeUnit配合使用</p>
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
         * <p>阈值比较符，取值范围：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>指标名称</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>指标的时间窗口</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("period")
        public Long period;

        /**
         * <p>统计方法，该参数的取值由指定云产品的MetricName对应的Statistics列决定。  监控项的统计方法。取值示例：</p>
         * <ul>
         * <li>$Maximum：最大值。</li>
         * <li>$Minimum：最小值。</li>
         * <li>$Average：平均值。</li>
         * <li>$Availability：可用率（通常用于站点监控）</li>
         * </ul>
         * <p>说明 $为监控项的统一前缀符号。</p>
         * 
         * <strong>example:</strong>
         * <p>$Maximum</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>告警阈值</p>
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
         * <p>多指标的组合条件列表</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionCompositeEscalationEscalations> escalations;

        /**
         * <p>满足条件时触发的告警级别(多指标组合告警仅支持一个级别)</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>多个指标条件之间的关系，取值为and或or</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("relation")
        public String relation;

        /**
         * <p>触发告警需满足条件的次数</p>
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
         * <p>满足条件时触发的告警级别(表达式告警仅支持一个级别)</p>
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
         * <p>告警条件表达式</p>
         * 
         * <strong>example:</strong>
         * <p>@cpu_total[60].$Average &gt; 60</p>
         */
        @NameInMap("rawExpression")
        public String rawExpression;

        /**
         * <p>触发告警需满足条件的次数</p>
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
         * <p>阈值比较符，取值范围：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        /**
         * <p>满足条件时触发的告警级别(表达式告警仅支持一个级别)</p>
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
         * <p>统计方法，该参数的取值由指定云产品的MetricName对应的Statistics列决定，例如：Maximum、Minimum 和 Average</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>告警阈值</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("threshold")
        public Double threshold;

        /**
         * <p>触发告警需满足条件的次数</p>
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
         * <p>条件列表，同一个告警规则对应多个级别的，每一个级别会有一个条件对象。</p>
         */
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionSimpleEscalationEscalations> escalations;

        /**
         * <p>适用条件类型：CMS_BASIC_CONDITION。</p>
         * <p>告警条件关联的指标</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>指标的时间窗口，单位秒</p>
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

}
