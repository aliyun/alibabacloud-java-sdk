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

    @NameInMap("noDataAppendValue")
    public String noDataAppendValue;

    /**
     * <p>无数据时按什么级别告警，不指定则不对无数据报警</p>
     */
    @NameInMap("nodataAlertLevel")
    public String nodataAlertLevel;

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

    public AlertRuleCondition setNoDataAppendValue(String noDataAppendValue) {
        this.noDataAppendValue = noDataAppendValue;
        return this;
    }
    public String getNoDataAppendValue() {
        return this.noDataAppendValue;
    }

    public AlertRuleCondition setNodataAlertLevel(String nodataAlertLevel) {
        this.nodataAlertLevel = nodataAlertLevel;
        return this;
    }
    public String getNodataAlertLevel() {
        return this.nodataAlertLevel;
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

}
