// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ConditionConfigUnified extends TeaModel {
    /**
     * <p>The aggregate functions (used by APM_SIMPLE_CONDITION. For UMODEL conditions, the aggregation semantics have been migrated to QueryConfigUnified and this field no longer takes effect).</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>The consecutive trigger count threshold (type=SLS_MULTI_CONDITION). An alert is fired only after the condition is met N times. Default value: 1.</p>
     */
    @NameInMap("alertCount")
    public Integer alertCount;

    /**
     * <p>The list of comparison conditions (APM_COMPOSITE_CONDITION).</p>
     */
    @NameInMap("compareList")
    public java.util.List<CompareList> compareList;

    /**
     * <p>The multi-metric composite trigger configuration for CLOUD_MONITORING_CONDITION when escalationType=COMPOSITE (requires relation, severity, times, escalations).</p>
     */
    @NameInMap("compositeEscalation")
    public CloudMonitoringCompositeEscalation compositeEscalation;

    /**
     * <p>The count comparison operator (type=UMODEL_LOGSET_CONDITION).</p>
     */
    @NameInMap("countOperator")
    public String countOperator;

    /**
     * <p>The count threshold (type=UMODEL_LOGSET_CONDITION).</p>
     */
    @NameInMap("countThreshold")
    public Long countThreshold;

    /**
     * <p>The duration in seconds. Used directly by PROMETHEUS_SIMPLE / UMODEL_METRICSET_CONDITION / UMODEL_LOGSET_CONDITION. For UMODEL_METRICSET_MULTI_CONDITION, this serves as the global default and can be overridden by the durationSecs field in each trigger.</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>Specifies whether to enable severity suppression by highest level (type=UMODEL_METRICSET_MULTI_CONDITION / PROMETHEUS_MULTI_CONDITION). Default value: true. When enabled, only the highest severity trigger is reported for the same entity.</p>
     */
    @NameInMap("enableSeveritySuppression")
    public Boolean enableSeveritySuppression;

    /**
     * <p>The expression type for CLOUD_MONITORING_CONDITION: SIMPLE / COMPOSITE / EXPRESS / PROMETHEUS (write paths support only SIMPLE / COMPOSITE). Specify the corresponding escalation sub-object based on the type.</p>
     */
    @NameInMap("escalationType")
    public String escalationType;

    /**
     * <p>The expression-based trigger configuration for CLOUD_MONITORING_CONDITION when escalationType=EXPRESS (read path output only).</p>
     */
    @NameInMap("expressEscalation")
    public CloudMonitoringExpressEscalation expressEscalation;

    /**
     * <p>The raw V1 condition JSON string returned when type=UNKNOWN_CONDITION and the read path fails to parse the condition. If this field is not empty, display it as read-only on the frontend.</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>Returned when type=UNKNOWN_CONDITION. Indicates that this rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The log field name (used when type=UMODEL_LOGSET_CONDITION and matchOperator=CONTAINS/EQUALS/REGEX).</p>
     */
    @NameInMap("matchField")
    public String matchField;

    /**
     * <p>The log match operator (type=UMODEL_LOGSET_CONDITION).</p>
     */
    @NameInMap("matchOperator")
    public String matchOperator;

    /**
     * <p>The log match value (used when type=UMODEL_LOGSET_CONDITION and matchOperator=CONTAINS/EQUALS/REGEX).</p>
     */
    @NameInMap("matchValue")
    public String matchValue;

    /**
     * <p>The upper bound of the range (used when UMODEL_METRICSET_CONDITION and operator=IN_RANGE/OUT_OF_RANGE).</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range (used when UMODEL_METRICSET_CONDITION and operator=IN_RANGE/OUT_OF_RANGE).</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The no-data alert level (SLS_MULTI_CONDITION). APM and Prometheus conditions have migrated to noDataPolicy + noDataAlertSeverity.</p>
     */
    @NameInMap("noDataAlertLevel")
    public String noDataAlertLevel;

    /**
     * <p>The no-data alert severity level (PROMETHEUS_SIMPLE_CONDITION / PROMETHEUS_MULTI_CONDITION, takes effect when noDataPolicy=NO_DATA_TO_ALERT). SLS_MULTI_CONDITION still uses noDataAlertLevel.</p>
     */
    @NameInMap("noDataAlertSeverity")
    public String noDataAlertSeverity;

    /**
     * <p>The value to append when no data is available (APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION). Nullable.</p>
     */
    @NameInMap("noDataAppendValue")
    public Double noDataAppendValue;

    /**
     * <p>The no-data handling policy (CLOUD_MONITORING_CONDITION / PROMETHEUS_MULTI_CONDITION / PROMETHEUS_SIMPLE_CONDITION / APM_SIMPLE_CONDITION / APM_COMPOSITE_CONDITION): NO_DATA_TO_OK / NO_DATA_TO_ALERT / KEEP_LAST_STATE / APPEND_VALUE (APM only).</p>
     */
    @NameInMap("noDataPolicy")
    public String noDataPolicy;

    /**
     * <p>The comparison operator. For UMODEL_METRICSET_CONDITION: GT (greater than) / GE (greater than or equal to) / LT (less than) / LE (less than or equal to) / EQ (equal to) / NE (not equal to) / IN_RANGE (within range, requires min/max) / OUT_OF_RANGE (outside range, requires min/max) / PRESENT (field exists) / NOT_PRESENT (field does not exist). Not used by UMODEL_LOGSET_CONDITION. For APM_SIMPLE_CONDITION: GT/GTE/LT/LTE/EQ/NE/YOY_UP/YOY_DOWN (YOY_* requires yoyTimeUnit/yoyTimeValue).</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The PromQL-based trigger configuration for CLOUD_MONITORING_CONDITION when escalationType=PROMETHEUS (read path output only).</p>
     */
    @NameInMap("prometheus")
    public CloudMonitoringPrometheusEscalation prometheus;

    /**
     * <p>The logical relationship between conditions (APM_COMPOSITE_CONDITION).</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The severity level (UMODEL_METRICSET_CONDITION / UMODEL_LOGSET_CONDITION / PROMETHEUS_SIMPLE / APM_COMPOSITE).</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The single-metric multi-level trigger configuration for CLOUD_MONITORING_CONDITION when escalationType=SIMPLE (requires metricName, period, escalations).</p>
     */
    @NameInMap("simpleEscalation")
    public CloudMonitoringSimpleEscalation simpleEscalation;

    /**
     * <p>The threshold (used by UMODEL_METRICSET_CONDITION with non-range operators).</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    /**
     * <p>The multi-threshold list (APM_SIMPLE_CONDITION).</p>
     */
    @NameInMap("thresholdList")
    public java.util.List<ThresholdList> thresholdList;

    /**
     * <p>The list of triggers (polymorphic by type. CLOUD_MONITORING_CONDITION does not use this field. Use simpleEscalation.escalations / compositeEscalation.escalations instead). For SLS_MULTI_CONDITION, each case contains matchField / matchOperator / matchValue / countOperator / countThreshold / severity, with at least one required. For UMODEL_METRICSET_MULTI_CONDITION, each trigger contains severity, durationSecs, and an expression (SIMPLE/COMPOSITE). For PROMETHEUS_MULTI_CONDITION, each trigger contains severity, durationSecs, and an expression (SIMPLE/COMPOSITE). Triggers are sorted by severity priority, and the first match fires.</p>
     */
    @NameInMap("triggers")
    public java.util.List<Triggers> triggers;

    /**
     * <p>The detection condition type. Valid values and their required fields: PROMETHEUS_SIMPLE_CONDITION (requires operator, threshold, durationSecs, severity). UMODEL_METRICSET_CONDITION (requires operator, durationSecs, severity. Non-range operators require threshold. operator=IN_RANGE/OUT_OF_RANGE requires min and max). UMODEL_LOGSET_CONDITION (requires matchOperator, durationSecs, severity. matchOperator=CONTAINS/EQUALS/REGEX requires matchField and matchValue. countOperator/countThreshold are optional). UMODEL_METRICSET_MULTI_CONDITION (requires triggers[*]. Optional durationSecs as global default, enableSeveritySuppression). APM_SIMPLE_CONDITION (requires operator, aggregate. Use thresholdList or threshold. operator=YOY_UP/YOY_DOWN requires yoyTimeUnit and yoyTimeValue. Optional noDataPolicy, noDataAppendValue). APM_COMPOSITE_CONDITION (requires compareList, relation, severity. Optional noDataPolicy, noDataAppendValue). CLOUD_MONITORING_CONDITION (requires escalationType. escalationType=SIMPLE requires simpleEscalation. escalationType=COMPOSITE requires compositeEscalation. Optional noDataPolicy). UNKNOWN_CONDITION (read-only fallback. Do not use in write paths). Do not use non-enumerated values such as SLS_CONDITION or CMS_BASIC_CONDITION. The backend returns an Invalidtype 400 error.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The year-over-year time unit (APM_SIMPLE_CONDITION, takes effect only when operator=YOY_UP/YOY_DOWN).</p>
     */
    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    /**
     * <p>The year-over-year time value (APM_SIMPLE_CONDITION, takes effect only when operator=YOY_UP/YOY_DOWN).</p>
     */
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

    public ConditionConfigUnified setAlertCount(Integer alertCount) {
        this.alertCount = alertCount;
        return this;
    }
    public Integer getAlertCount() {
        return this.alertCount;
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
