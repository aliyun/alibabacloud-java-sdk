// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ConditionConfigUnified extends TeaModel {
    /**
     * <p>The minimum dynamic baseline deviation or absolute deviation dead zone (effective only for baseline operators in UMODEL_METRICSET_CONDITION and APM_SIMPLE_CONDITION). No alert is triggered if |current value - boundary| &lt; absDeviation. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The aggregation function (APM_SIMPLE_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>The consecutive trigger count threshold (type=SLS_MULTI_CONDITION). An alert is triggered only after the condition is met N times. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>The baseline period (effective only for baseline operators). Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. For weekly periods, the backend automatically expands the historical training window to 14 days or more. Automatic identification cannot return specific identification results.</p>
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
     * <p>The multi-metric composite trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to COMPOSITE. The relation, severity, times, and escalations parameters are required.</p>
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
     * <p>The duration in seconds. This parameter is used by PROMETHEUS_SIMPLE and UMODEL_METRICSET.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>Specifies whether to enable severity-based suppression (type=UMODEL_METRICSET_MULTI_CONDITION / PROMETHEUS_MULTI_CONDITION). Default value: true. When enabled, only the highest severity trigger is reported for the same entity.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    /**
     * <p>The expression type for CLOUD_MONITORING_CONDITION. Valid values: SIMPLE, COMPOSITE, EXPRESS, and PROMETHEUS. Only SIMPLE and COMPOSITE are supported in the write path. Specify the corresponding escalation sub-object based on the type.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>The expression trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to EXPRESS. This parameter is output only in the read path.</p>
     */
    @NameInMap("expressEscalation")
    public CloudMonitoringExpressEscalation expressEscalation;

    /**
     * <p>The original V1 condition JSON string returned when type is set to UNKNOWN_CONDITION and read path parsing fails as a fallback. The frontend displays this field as read-only when it is not empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>The value returned when type is set to UNKNOWN_CONDITION, which indicates that this rule cannot be edited by using the new API. Submit a ticket to contact the CloudMonitor product team.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The log field name. This parameter is used when type is set to UMODEL_LOGSET_CONDITION and matchOperator is set to CONTAINS, EQUALS, or REGEX.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("matchField")
    public String matchField;

    /**
     * <p>The log matching operator (type=UMODEL_LOGSET_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>PRESENT</p>
     */
    @NameInMap("matchOperator")
    public String matchOperator;

    /**
     * <p>The log matching value. This parameter is used when type is set to UMODEL_LOGSET_CONDITION and matchOperator is set to CONTAINS, EQUALS, or REGEX.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("matchValue")
    public String matchValue;

    /**
     * <p>The upper bound of the range. This parameter is used for UMODEL_METRICSET_CONDITION when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range. This parameter is used for UMODEL_METRICSET_CONDITION when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The no-data alert level (SLS_MULTI_CONDITION). APM and Prometheus conditions have been migrated to noDataPolicy and noDataAlertSeverity.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>The no-data alert severity. This parameter takes effect for PROMETHEUS_SIMPLE_CONDITION and PROMETHEUS_MULTI_CONDITION when noDataPolicy is set to NO_DATA_TO_ALERT. SLS_MULTI_CONDITION still uses noDataAlertLevel.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("noDataAlertSeverity")
    public String noDataAlertSeverity;

    /**
     * <p>The compensated value when no data is available (APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). This parameter is nullable.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("noDataAppendValue")
    public Double noDataAppendValue;

    /**
     * <p>The tolerance duration in seconds before determining that no data is available. This parameter applies to UMODEL_METRICSET_CONDITION and UMODEL_METRICSET_MULTI_CONDITION, and takes effect when noDataPolicy is not empty. The no-data policy is applied only after the continuous no-data period exceeds this duration. This is used to offset single-cycle empty queries caused by UModel data write jitter. The value must be a positive integer. If not specified, the backend defaults to the maximum of twice the collection interval and 300.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("noDataDurationSecs")
    public Integer noDataDurationSecs;

    /**
     * <p>The no-data processing policy (CLOUD_MONITORING_CONDITION / PROMETHEUS_MULTI_CONDITION / PROMETHEUS_SIMPLE_CONDITION / APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). Valid values: NO_DATA_TO_OK, NO_DATA_TO_ALERT, KEEP_LAST_STATE, and APPEND_VALUE (APM only).</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
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
     * <p>The PromQL trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to PROMETHEUS. This parameter is output only in the read path.</p>
     */
    @NameInMap("prometheus")
    public CloudMonitoringPrometheusEscalation prometheus;

    /**
     * <p>The logical relation between conditions (APM_COMPOSITE_CONDITION).</p>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The dynamic baseline sensitivity (UMODEL_METRICSET_CONDITION / APM_SIMPLE_CONDITION). This parameter takes effect only when operator is set to ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND. Valid values: HIGH for the narrowest and most sensitive band, MEDIUM, and LOW for the widest and least sensitive band.</p>
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
     * <p>The single-metric multi-level trigger configuration for CLOUD_MONITORING_CONDITION when escalationType is set to SIMPLE. The metricName, period, and escalations parameters are required.</p>
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
     * <p>The trigger list. This parameter is polymorphic by type. CLOUD_MONITORING_CONDITION does not use this field; use simpleEscalation.escalations or compositeEscalation.escalations instead. For SLS_MULTI_CONDITION, each case includes matchField, matchOperator, matchValue, countOperator, countThreshold, and severity, and at least one case is required. For UMODEL_METRICSET_MULTI_CONDITION, each trigger includes severity, durationSecs, and an expression (SIMPLE or COMPOSITE). For PROMETHEUS_MULTI_CONDITION, each trigger includes severity, durationSecs, and an expression (SIMPLE or COMPOSITE). The triggers are sorted by severity priority, and the first match triggers the alert.</p>
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
     * <p>The year-over-year time unit (APM_SIMPLE_CONDITION). This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
     * 
     * <strong>example:</strong>
     * <p>minute</p>
     */
    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    /**
     * <p>The year-over-year time value (APM_SIMPLE_CONDITION). This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
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

    public ConditionConfigUnified setNoDataDurationSecs(Integer noDataDurationSecs) {
        this.noDataDurationSecs = noDataDurationSecs;
        return this;
    }
    public Integer getNoDataDurationSecs() {
        return this.noDataDurationSecs;
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
