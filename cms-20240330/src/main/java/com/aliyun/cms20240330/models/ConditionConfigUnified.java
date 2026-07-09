// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ConditionConfigUnified extends TeaModel {
    @NameInMap("aggregate")
    public String aggregate;

    @NameInMap("compareList")
    public java.util.List<ApmCompositeCompareConfig> compareList;

    @NameInMap("compositeEscalation")
    public CloudMonitoringCompositeEscalation compositeEscalation;

    @NameInMap("countOperator")
    public String countOperator;

    @NameInMap("countThreshold")
    public Long countThreshold;

    @NameInMap("durationSecs")
    public Integer durationSecs;

    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    @NameInMap("escalationType")
    public String escalationType;

    @NameInMap("expressEscalation")
    public CloudMonitoringExpressEscalation expressEscalation;

    @NameInMap("legacyRaw")
    public String legacyRaw;

    @NameInMap("legacyType")
    public String legacyType;

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

    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    @NameInMap("operator")
    public String operator;

    @NameInMap("prometheus")
    public CloudMonitoringPrometheusEscalation prometheus;

    @NameInMap("relation")
    public String relation;

    @NameInMap("severity")
    public String severity;

    @NameInMap("simpleEscalation")
    public CloudMonitoringSimpleEscalation simpleEscalation;

    @NameInMap("threshold")
    public Double threshold;

    @NameInMap("thresholdList")
    public java.util.List<ApmThresholdConfig> thresholdList;

    @NameInMap("triggers")
    public java.util.List<MetricSetMultiTrigger> triggers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    @NameInMap("yoyTimeValue")
    public Integer yoyTimeValue;

    public static ConditionConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        ConditionConfigUnified self = new ConditionConfigUnified();
        return TeaModel.build(map, self);
    }

    public ConditionConfigUnified setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public ConditionConfigUnified setCompareList(java.util.List<ApmCompositeCompareConfig> compareList) {
        this.compareList = compareList;
        return this;
    }
    public java.util.List<ApmCompositeCompareConfig> getCompareList() {
        return this.compareList;
    }

    public ConditionConfigUnified setCompositeEscalation(CloudMonitoringCompositeEscalation compositeEscalation) {
        this.compositeEscalation = compositeEscalation;
        return this;
    }
    public CloudMonitoringCompositeEscalation getCompositeEscalation() {
        return this.compositeEscalation;
    }

    public ConditionConfigUnified setCountOperator(String countOperator) {
        this.countOperator = countOperator;
        return this;
    }
    public String getCountOperator() {
        return this.countOperator;
    }

    public ConditionConfigUnified setCountThreshold(Long countThreshold) {
        this.countThreshold = countThreshold;
        return this;
    }
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    public ConditionConfigUnified setDurationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    public ConditionConfigUnified setEnableSeveritySuppression(Boolean enableSeveritySuppression) {
        this.enableSeveritySuppression = enableSeveritySuppression;
        return this;
    }
    public Boolean getEnableSeveritySuppression() {
        return this.enableSeveritySuppression;
    }

    public ConditionConfigUnified setEscalationType(String escalationType) {
        this.escalationType = escalationType;
        return this;
    }
    public String getEscalationType() {
        return this.escalationType;
    }

    public ConditionConfigUnified setExpressEscalation(CloudMonitoringExpressEscalation expressEscalation) {
        this.expressEscalation = expressEscalation;
        return this;
    }
    public CloudMonitoringExpressEscalation getExpressEscalation() {
        return this.expressEscalation;
    }

    public ConditionConfigUnified setLegacyRaw(String legacyRaw) {
        this.legacyRaw = legacyRaw;
        return this;
    }
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    public ConditionConfigUnified setLegacyType(String legacyType) {
        this.legacyType = legacyType;
        return this;
    }
    public String getLegacyType() {
        return this.legacyType;
    }

    public ConditionConfigUnified setMatchField(String matchField) {
        this.matchField = matchField;
        return this;
    }
    public String getMatchField() {
        return this.matchField;
    }

    public ConditionConfigUnified setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    public ConditionConfigUnified setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

    public ConditionConfigUnified setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public ConditionConfigUnified setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public ConditionConfigUnified setNoDataPolicy(String noDataPolicy) {
        this.noDataPolicy = noDataPolicy;
        return this;
    }
    public String getNoDataPolicy() {
        return this.noDataPolicy;
    }

    public ConditionConfigUnified setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConditionConfigUnified setPrometheus(CloudMonitoringPrometheusEscalation prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public CloudMonitoringPrometheusEscalation getPrometheus() {
        return this.prometheus;
    }

    public ConditionConfigUnified setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public ConditionConfigUnified setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ConditionConfigUnified setSimpleEscalation(CloudMonitoringSimpleEscalation simpleEscalation) {
        this.simpleEscalation = simpleEscalation;
        return this;
    }
    public CloudMonitoringSimpleEscalation getSimpleEscalation() {
        return this.simpleEscalation;
    }

    public ConditionConfigUnified setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public ConditionConfigUnified setThresholdList(java.util.List<ApmThresholdConfig> thresholdList) {
        this.thresholdList = thresholdList;
        return this;
    }
    public java.util.List<ApmThresholdConfig> getThresholdList() {
        return this.thresholdList;
    }

    public ConditionConfigUnified setTriggers(java.util.List<MetricSetMultiTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<MetricSetMultiTrigger> getTriggers() {
        return this.triggers;
    }

    public ConditionConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConditionConfigUnified setYoyTimeUnit(String yoyTimeUnit) {
        this.yoyTimeUnit = yoyTimeUnit;
        return this;
    }
    public String getYoyTimeUnit() {
        return this.yoyTimeUnit;
    }

    public ConditionConfigUnified setYoyTimeValue(Integer yoyTimeValue) {
        this.yoyTimeValue = yoyTimeValue;
        return this;
    }
    public Integer getYoyTimeValue() {
        return this.yoyTimeValue;
    }

}
