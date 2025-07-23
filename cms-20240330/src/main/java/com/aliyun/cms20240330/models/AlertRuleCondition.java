// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleCondition extends TeaModel {
    /**
     * <p>type=SLS_CONDITION时指定，满足条件几次后告警，默认为1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>type=SLS_CONDITION时指定</p>
     */
    @NameInMap("caseList")
    public java.util.List<AlertRuleConditionCaseList> caseList;

    @NameInMap("compareList")
    public java.util.List<AlertRuleConditionCompareList> compareList;

    @NameInMap("compositeEscalation")
    public AlertRuleConditionCompositeEscalation compositeEscalation;

    @NameInMap("escalationType")
    public String escalationType;

    @NameInMap("expressEscalation")
    public AlertRuleConditionExpressEscalation expressEscalation;

    /**
     * <p>无数据时按什么级别告警，不指定则不对无数据报警</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    @NameInMap("noDataAppendValue")
    public String noDataAppendValue;

    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    @NameInMap("relation")
    public String relation;

    @NameInMap("simpleEscalation")
    public AlertRuleConditionSimpleEscalation simpleEscalation;

    /**
     * <p>规则条件类型，可选值：SLS_CONDITION</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

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

    public static class AlertRuleConditionCaseList extends TeaModel {
        @NameInMap("condition")
        public String condition;

        @NameInMap("countCondition")
        public String countCondition;

        @NameInMap("level")
        public String level;

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
        @NameInMap("level")
        public String level;

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
        @NameInMap("aggregate")
        public String aggregate;

        @NameInMap("oper")
        public String oper;

        @NameInMap("value")
        public Double value;

        @NameInMap("valueLevelList")
        public java.util.List<AlertRuleConditionCompareListValueLevelList> valueLevelList;

        @NameInMap("yoyTimeUnit")
        public String yoyTimeUnit;

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
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        @NameInMap("metricName")
        public String metricName;

        @NameInMap("period")
        public Long period;

        @NameInMap("statistics")
        public String statistics;

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
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionCompositeEscalationEscalations> escalations;

        @NameInMap("level")
        public String level;

        @NameInMap("relation")
        public String relation;

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
        @NameInMap("level")
        public String level;

        @NameInMap("rawExpression")
        public String rawExpression;

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
        @NameInMap("comparisonOperator")
        public String comparisonOperator;

        @NameInMap("level")
        public String level;

        @NameInMap("statistics")
        public String statistics;

        @NameInMap("threshold")
        public Double threshold;

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
        @NameInMap("escalations")
        public java.util.List<AlertRuleConditionSimpleEscalationEscalations> escalations;

        @NameInMap("metricName")
        public String metricName;

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
