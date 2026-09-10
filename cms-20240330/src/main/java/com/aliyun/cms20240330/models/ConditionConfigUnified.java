// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ConditionConfigUnified extends TeaModel {
    /**
     * <p>The dynamic baseline minimum deviation or absolute deviation dead zone (UMODEL_METRICSET_CONDITION / APM_SIMPLE_CONDITION). Takes effect only for baseline operators. If |current value − boundary| &lt; absDeviation, no alert is fired. The unit is the same as the metric. The value must be &gt;= 0. A value of 0 means no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The aggregate functions (APM_SIMPLE_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>The consecutive trigger count threshold (type=SLS_MULTI_CONDITION). An alert is fired only after the condition is met N times. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>The baseline period. Takes effect only for baseline operators. Valid values: AUTO (automatic detection), DAILY (daily), WEEKLY (weekly), and NONE (no period). When set to WEEKLY, the backend automatically expands the historical training window to at least 14 days. Automatic detection does not return the specific detection result.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("baselinePeriod")
    public String baselinePeriod;

    /**
     * <p>The multiple comparisons (APM_COMPOSITE_CONDITION).</p>
     */
    @NameInMap("compareList")
    public java.util.List<CompareList> compareList;

    /**
     * <p>The multi-metric composite trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to COMPOSITE. Required fields: relation, severity, times, and escalations.</p>
     */
    @NameInMap("compositeEscalation")
    public CloudMonitoringCompositeEscalation compositeEscalation;

    /**
     * <p>The count comparison operator (type=UMODEL_LOGSET_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>GTE</p>
     */
    @NameInMap("countOperator")
    public String countOperator;

    /**
     * <p>The count threshold (type=UMODEL_LOGSET_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("countThreshold")
    public Long countThreshold;

    /**
     * <p>The duration in seconds. Used by PROMETHEUS_SIMPLE and UMODEL_METRICSET.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>Specifies whether to enable severity suppression to the highest level (type=UMODEL_METRICSET_MULTI_CONDITION / PROMETHEUS_MULTI_CONDITION). Default value: true. When enabled, only the highest severity trigger is reported for the same entity.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    /**
     * <p>The expression type for CLOUD_MONITORING_CONDITION. Valid values: SIMPLE, COMPOSITE, EXPRESS, and PROMETHEUS. Only SIMPLE and COMPOSITE are supported in write paths. Specify the corresponding escalation sub-object based on the type.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>The expression-based trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to EXPRESS. This field is output only in read paths.</p>
     */
    @NameInMap("expressEscalation")
    public CloudMonitoringExpressEscalation expressEscalation;

    /**
     * <p>The raw V1 condition JSON string returned when type is set to UNKNOWN_CONDITION and the read path fails to parse the condition. When the frontend detects that this field is not empty, display it as read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>Returned when type is set to UNKNOWN_CONDITION. Indicates that this rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The log field name (used when type is set to UMODEL_LOGSET_CONDITION and matchOperator is set to CONTAINS, EQUALS, or REGEX).</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("matchField")
    public String matchField;

    /**
     * <p>The log match operator (type=UMODEL_LOGSET_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>PRESENT</p>
     */
    @NameInMap("matchOperator")
    public String matchOperator;

    /**
     * <p>The log match value (used when type is set to UMODEL_LOGSET_CONDITION and matchOperator is set to CONTAINS, EQUALS, or REGEX).</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("matchValue")
    public String matchValue;

    /**
     * <p>The upper bound of the range (used when UMODEL_METRICSET_CONDITION operator is set to IN_RANGE or OUT_OF_RANGE).</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range (used when UMODEL_METRICSET_CONDITION operator is set to IN_RANGE or OUT_OF_RANGE).</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The no-data alert level (SLS_MULTI_CONDITION). APM and Prometheus conditions have migrated to noDataPolicy and noDataAlertSeverity.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>The no-data alert severity level (PROMETHEUS_SIMPLE_CONDITION / PROMETHEUS_MULTI_CONDITION). Takes effect only when noDataPolicy is set to NO_DATA_TO_ALERT. SLS_MULTI_CONDITION still uses noDataAlertLevel.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertSeverity")
    public String noDataAlertSeverity;

    /**
     * <p>The value to substitute when no data is available (APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). Nullable.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("noDataAppendValue")
    public Double noDataAppendValue;

    /**
     * <p>The no-data handling policy (CLOUD_MONITORING_CONDITION / PROMETHEUS_MULTI_CONDITION / PROMETHEUS_SIMPLE_CONDITION / APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). Valid values: NO_DATA_TO_OK, NO_DATA_TO_ALERT, KEEP_LAST_STATE, and APPEND_VALUE (APM only).</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The comparison operator (UMODEL_METRICSET_CONDITION or APM_SIMPLE_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>GT</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The PromQL-based trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to PROMETHEUS. This field is output only in read paths.</p>
     */
    @NameInMap("prometheus")
    public CloudMonitoringPrometheusEscalation prometheus;

    /**
     * <p>The logical relationship between conditions (APM_COMPOSITE_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The dynamic baseline sensitivity (UMODEL_METRICSET_CONDITION / APM_SIMPLE_CONDITION). Takes effect only when operator is set to ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND. Valid values: HIGH (narrowest band, most sensitive), MEDIUM, and LOW (widest band, least sensitive).</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("sensitivity")
    public String sensitivity;

    /**
     * <p>The severity level (UMODEL / PROMETHEUS_SIMPLE / APM_COMPOSITE).</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The single-metric multi-level trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to SIMPLE. Required fields: metricName, period, and escalations.</p>
     */
    @NameInMap("simpleEscalation")
    public CloudMonitoringSimpleEscalation simpleEscalation;

    /**
     * <p>The threshold (UMODEL_METRICSET_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    /**
     * <p>The multi-threshold list (APM_SIMPLE_CONDITION).</p>
     */
    @NameInMap("thresholdList")
    public java.util.List<ThresholdList> thresholdList;

    /**
     * <p>The trigger list. This field is polymorphic based on type. CLOUD_MONITORING_CONDITION does not use this field. Use simpleEscalation.escalations or compositeEscalation.escalations instead. For SLS_MULTI_CONDITION, each case contains matchField, matchOperator, matchValue, countOperator, countThreshold, and severity. At least one case is required. For UMODEL_METRICSET_MULTI_CONDITION, each trigger contains severity, durationSecs, and an expression (SIMPLE or COMPOSITE). For PROMETHEUS_MULTI_CONDITION, each trigger contains severity, durationSecs, and an expression (SIMPLE or COMPOSITE). Triggers are sorted by severity priority, and the first match fires.</p>
     */
    @NameInMap("triggers")
    public java.util.List<Triggers> triggers;

    /**
     * <p>The detection condition type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUS_SIMPLE_CONDITION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The year-over-year time unit (APM_SIMPLE_CONDITION). Takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
     * 
     * <strong>example:</strong>
     * <p>minute</p>
     */
    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    /**
     * <p>The year-over-year time value (APM_SIMPLE_CONDITION). Takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("yoyTimeValue")
    public Integer yoyTimeValue;

    public static ConditionConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        ConditionConfigUnified self = new ConditionConfigUnified();
        return TeaModel.build(map, self);
    }

    public ConditionConfigUnified setAbsDeviation(Double absDeviation) {
        this.absDeviation = absDeviation;
        return this;
    }
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    public ConditionConfigUnified setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public ConditionConfigUnified setAlertCount(Integer alertCount) {
        this.alertCount = alertCount;
        return this;
    }
    public Integer getAlertCount() {
        return this.alertCount;
    }

    public ConditionConfigUnified setBaselinePeriod(String baselinePeriod) {
        this.baselinePeriod = baselinePeriod;
        return this;
    }
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    public ConditionConfigUnified setCompareList(java.util.List<CompareList> compareList) {
        this.compareList = compareList;
        return this;
    }
    public java.util.List<CompareList> getCompareList() {
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

    public ConditionConfigUnified setNoDataAlertLevel(String noDataAlertLevel) {
        this.noDataAlertLevel = noDataAlertLevel;
        return this;
    }
    public String getNoDataAlertLevel() {
        return this.noDataAlertLevel;
    }

    public ConditionConfigUnified setNoDataAlertSeverity(String noDataAlertSeverity) {
        this.noDataAlertSeverity = noDataAlertSeverity;
        return this;
    }
    public String getNoDataAlertSeverity() {
        return this.noDataAlertSeverity;
    }

    public ConditionConfigUnified setNoDataAppendValue(Double noDataAppendValue) {
        this.noDataAppendValue = noDataAppendValue;
        return this;
    }
    public Double getNoDataAppendValue() {
        return this.noDataAppendValue;
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

    public ConditionConfigUnified setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public String getSensitivity() {
        return this.sensitivity;
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

    public ConditionConfigUnified setThresholdList(java.util.List<ThresholdList> thresholdList) {
        this.thresholdList = thresholdList;
        return this;
    }
    public java.util.List<ThresholdList> getThresholdList() {
        return this.thresholdList;
    }

    public ConditionConfigUnified setTriggers(java.util.List<Triggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<Triggers> getTriggers() {
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
