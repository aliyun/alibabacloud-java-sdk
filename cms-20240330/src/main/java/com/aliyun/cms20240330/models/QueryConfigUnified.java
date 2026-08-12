// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryConfigUnified extends TeaModel {
    /**
     * <p>The aggregation function (used when type=UMODEL_METRICSET_QUERY / UMODEL_LOGSET_QUERY).</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to perform alert detection only after data is complete (originally used when type=PROMETHEUS_MULTI_QUERY). This field overlaps with enableDataCompleteCheck. Using this field in write path returns 400.</p>
     */
    @NameInMap("checkAfterDataComplete")
    @Deprecated
    public Boolean checkAfterDataComplete;

    /**
     * <p>The dimension list (used when type=CLOUD_MONITORING_QUERY. Each dimension is a key/value string mapping).</p>
     */
    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    /**
     * <p>The duration in seconds (used when type=PROMETHEUS_MULTI_QUERY).</p>
     */
    @NameInMap("durationSecs")
    public Long durationSecs;

    /**
     * <p>Indicates whether the data integrity check is enabled (used when type=PROMETHEUS_SINGLE_QUERY / PROMETHEUS_MULTI_QUERY / PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
     */
    @NameInMap("enableDataCompleteCheck")
    public Boolean enableDataCompleteCheck;

    /**
     * <p>The entity domain (used when type=UMODEL_METRICSET_QUERY / UMODEL_METRICSET_MULTI_QUERY / UMODEL_LOGSET_QUERY. Works with entityType/entityFilters to locate UModel entities).</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>The entity fields to include in the response (used when type=UMODEL_METRICSET_QUERY / UMODEL_METRICSET_MULTI_QUERY / UMODEL_LOGSET_QUERY).</p>
     */
    @NameInMap("entityFields")
    public java.util.List<EntityFields> entityFields;

    /**
     * <p>The entity filter list (used when type=UMODEL_METRICSET_QUERY / UMODEL_METRICSET_MULTI_QUERY / UMODEL_LOGSET_QUERY).</p>
     */
    @NameInMap("entityFilters")
    public java.util.List<EntityFilters> entityFilters;

    /**
     * <p>The entity type (used when type=UMODEL_METRICSET_QUERY / UMODEL_METRICSET_MULTI_QUERY / UMODEL_LOGSET_QUERY).</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The query expression or SPL statement. Recommended when type=PROMETHEUS_SINGLE_QUERY. Optional when type=UMODEL_METRICSET_QUERY for custom SPL. Required when type=UMODEL_LOGSET_QUERY, where an SPL query statement must be provided (the service layer enforces this requirement).</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>The APM filter condition list.</p>
     */
    @NameInMap("filterList")
    public java.util.List<FilterList> filterList;

    /**
     * <p>The list of predefined metric filter values (used when type=PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
     */
    @NameInMap("filterValues")
    public java.util.List<PrometheusMetricFilterValue> filterValues;

    /**
     * <p>The group field list (used when type=SLS_MULTI_QUERY and groupType=custom).</p>
     */
    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    /**
     * <p>The resource group ID (used when type=CLOUD_MONITORING_QUERY and relationType=GROUP).</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The grouping policy (used when type=SLS_MULTI_QUERY): none / label / custom.</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The join list (used when type=SLS_MULTI_QUERY. Maximum of 2: joinings[0] corresponds to the set operation between query 0 and query 1. joinings[1] corresponds to the set operation between query 1 and query 2).</p>
     */
    @NameInMap("joinings")
    public java.util.List<Joinings> joinings;

    /**
     * <p>The label filter conditions (used when type=UMODEL_METRICSET_QUERY. For UMODEL_METRICSET_MULTI_QUERY, place labelFilters in each queries[*] entry).</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<LabelFilters> labelFilters;

    /**
     * <p>The original V1 query JSON string returned as a fallback when type=UNKNOWN_QUERY and read path parsing fails (contains the field values that triggered the failure, such as filter.operator=ABC). The frontend displays this field as read-only when it is not empty.</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>Returned when type=UNKNOWN_QUERY, indicating that this rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The log set name (used when type=UMODEL_LOGSET_QUERY).</p>
     */
    @NameInMap("logSet")
    public String logSet;

    /**
     * <p>The measure group key (optional when type=APM_MULTI_QUERY, corresponds to V1 alertMetricInput.groupKey).</p>
     */
    @NameInMap("measureGroupKey")
    public String measureGroupKey;

    /**
     * <p>The APM measure configuration list.</p>
     */
    @NameInMap("measureList")
    public java.util.List<MeasureList> measureList;

    /**
     * <p>The metric name (required when type=UMODEL_METRICSET_QUERY. Required when type=CLOUD_MONITORING_QUERY, used together with namespace to uniquely identify CloudMonitor monitoring metrics).</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>The metric group ID (used when type=PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
     */
    @NameInMap("metricGroupId")
    public String metricGroupId;

    /**
     * <p>The predefined metric ID (used when type=PROMETHEUS_PREDEFINED_METRIC_QUERY).</p>
     */
    @NameInMap("metricId")
    public String metricId;

    /**
     * <p><strong>[Deprecated]</strong> The list of predefined metric IDs (originally used when type=PROMETHEUS_METRIC_GROUP_QUERY). This query type is deprecated. Write path returns 400.</p>
     */
    @NameInMap("metricIds")
    @Deprecated
    public java.util.List<String> metricIds;

    /**
     * <p>The metric set name (used when type=UMODEL_METRICSET_QUERY).</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>The CloudMonitor namespace (Alibaba Cloud service name, used when type=CLOUD_MONITORING_QUERY).</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The query time offset in seconds (used when type=UMODEL_METRICSET_QUERY / UMODEL_LOGSET_QUERY). Works with windowSecs to implement an offset query over the range [T - windowSecs - offsetSecs, T - offsetSecs]. Valid range: [0, 86400].</p>
     */
    @NameInMap("offsetSecs")
    public Long offsetSecs;

    /**
     * <p>The list of predefined metric parameter values (used when type=PROMETHEUS_PREDEFINED_METRIC_QUERY / PROMETHEUS_METRIC_GROUP_QUERY [deprecated]).</p>
     */
    @NameInMap("paramValues")
    public java.util.List<PrometheusMetricParamValue> paramValues;

    /**
     * <p><strong>[Deprecated]</strong> The legacy Prometheus query statement field. Use expr instead. This field is retained for backward compatibility. The backend automatically normalizes it to expr.</p>
     */
    @NameInMap("promQl")
    @Deprecated
    public String promQl;

    /**
     * <p>The subquery list (polymorphic by type): when type=SLS_MULTI_QUERY, each entry is a SlsNamedQueryEntry (timeUnit/start/end/window/expr). When type=PROMETHEUS_MULTI_QUERY, each entry is a PrometheusNamedQueryEntry (name/expr). When type=UMODEL_METRICSET_MULTI_QUERY, each entry is a MetricSetNamedQueryEntry.</p>
     */
    @NameInMap("queries")
    public java.util.List<Queries> queries;

    /**
     * <p>The resource relation type (used when type=CLOUD_MONITORING_QUERY).</p>
     */
    @NameInMap("relationType")
    public String relationType;

    /**
     * <p>The list of service IDs (used when type=APM_MULTI_QUERY).</p>
     */
    @NameInMap("serviceIdList")
    public java.util.List<String> serviceIdList;

    /**
     * <p>The query type. Valid values and associated fields: PROMETHEUS_SINGLE_QUERY (required: expr. Optional: enableDataCompleteCheck). PROMETHEUS_PREDEFINED_METRIC_QUERY (required: metricGroupId, metricId. Optional: paramValues, filterValues, enableDataCompleteCheck). PROMETHEUS_METRIC_GROUP_QUERY ([deprecated] required: metricGroupId, metricIds. Optional: paramValues, filterValues, enableDataCompleteCheck. Write path returns 400). UMODEL_METRICSET_QUERY (required: metricSet, metric, windowSecs, aggregate. Optional: expr, entityDomain/entityType/entityFilters, labelFilters, entityFields, offsetSecs). UMODEL_METRICSET_MULTI_QUERY (required: queries[*]. Optional: entityDomain/entityType/entityFilters, windowSecs, offsetSecs, aggregate). UMODEL_LOGSET_QUERY (required: logSet, expr, windowSecs, aggregate. Optional: entityDomain/entityType/entityFilters, labelFilters, offsetSecs). APM_MULTI_QUERY (required: serviceIdList, measureList. Optional: filterList, measureGroupKey). CLOUD_MONITORING_QUERY (required: namespace, metric, relationType. When relationType=INSTANCE, dimensions is required. When relationType=GROUP, groupId is required. When relationType=USER, leave both empty). UNKNOWN_QUERY (read-only fallback. Do not use in write path). Do not use non-enumerated values (such as CMS_BASIC_QUERY/SLS_QUERY). The backend returns Invalidtype 400.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The aggregation time window in seconds (used when type=UMODEL_METRICSET_QUERY / UMODEL_LOGSET_QUERY). Valid range: [60, 86400].</p>
     */
    @NameInMap("windowSecs")
    public Long windowSecs;

    public static QueryConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigUnified self = new QueryConfigUnified();
        return TeaModel.build(map, self);
    }

    public QueryConfigUnified setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    @Deprecated
    public QueryConfigUnified setCheckAfterDataComplete(Boolean checkAfterDataComplete) {
        this.checkAfterDataComplete = checkAfterDataComplete;
        return this;
    }
    public Boolean getCheckAfterDataComplete() {
        return this.checkAfterDataComplete;
    }

    public QueryConfigUnified setDimensions(java.util.List<java.util.Map<String, String>> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getDimensions() {
        return this.dimensions;
    }

    public QueryConfigUnified setDurationSecs(Long durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Long getDurationSecs() {
        return this.durationSecs;
    }

    public QueryConfigUnified setEnableDataCompleteCheck(Boolean enableDataCompleteCheck) {
        this.enableDataCompleteCheck = enableDataCompleteCheck;
        return this;
    }
    public Boolean getEnableDataCompleteCheck() {
        return this.enableDataCompleteCheck;
    }

    public QueryConfigUnified setEntityDomain(String entityDomain) {
        this.entityDomain = entityDomain;
        return this;
    }
    public String getEntityDomain() {
        return this.entityDomain;
    }

    public QueryConfigUnified setEntityFields(java.util.List<EntityFields> entityFields) {
        this.entityFields = entityFields;
        return this;
    }
    public java.util.List<EntityFields> getEntityFields() {
        return this.entityFields;
    }

    public QueryConfigUnified setEntityFilters(java.util.List<EntityFilters> entityFilters) {
        this.entityFilters = entityFilters;
        return this;
    }
    public java.util.List<EntityFilters> getEntityFilters() {
        return this.entityFilters;
    }

    public QueryConfigUnified setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public QueryConfigUnified setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public QueryConfigUnified setFilterList(java.util.List<FilterList> filterList) {
        this.filterList = filterList;
        return this;
    }
    public java.util.List<FilterList> getFilterList() {
        return this.filterList;
    }

    public QueryConfigUnified setFilterValues(java.util.List<PrometheusMetricFilterValue> filterValues) {
        this.filterValues = filterValues;
        return this;
    }
    public java.util.List<PrometheusMetricFilterValue> getFilterValues() {
        return this.filterValues;
    }

    public QueryConfigUnified setGroupFieldList(java.util.List<String> groupFieldList) {
        this.groupFieldList = groupFieldList;
        return this;
    }
    public java.util.List<String> getGroupFieldList() {
        return this.groupFieldList;
    }

    public QueryConfigUnified setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryConfigUnified setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryConfigUnified setJoinings(java.util.List<Joinings> joinings) {
        this.joinings = joinings;
        return this;
    }
    public java.util.List<Joinings> getJoinings() {
        return this.joinings;
    }

    public QueryConfigUnified setLabelFilters(java.util.List<LabelFilters> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<LabelFilters> getLabelFilters() {
        return this.labelFilters;
    }

    public QueryConfigUnified setLegacyRaw(String legacyRaw) {
        this.legacyRaw = legacyRaw;
        return this;
    }
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    public QueryConfigUnified setLegacyType(String legacyType) {
        this.legacyType = legacyType;
        return this;
    }
    public String getLegacyType() {
        return this.legacyType;
    }

    public QueryConfigUnified setLogSet(String logSet) {
        this.logSet = logSet;
        return this;
    }
    public String getLogSet() {
        return this.logSet;
    }

    public QueryConfigUnified setMeasureGroupKey(String measureGroupKey) {
        this.measureGroupKey = measureGroupKey;
        return this;
    }
    public String getMeasureGroupKey() {
        return this.measureGroupKey;
    }

    public QueryConfigUnified setMeasureList(java.util.List<MeasureList> measureList) {
        this.measureList = measureList;
        return this;
    }
    public java.util.List<MeasureList> getMeasureList() {
        return this.measureList;
    }

    public QueryConfigUnified setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryConfigUnified setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public QueryConfigUnified setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    @Deprecated
    public QueryConfigUnified setMetricIds(java.util.List<String> metricIds) {
        this.metricIds = metricIds;
        return this;
    }
    public java.util.List<String> getMetricIds() {
        return this.metricIds;
    }

    public QueryConfigUnified setMetricSet(String metricSet) {
        this.metricSet = metricSet;
        return this;
    }
    public String getMetricSet() {
        return this.metricSet;
    }

    public QueryConfigUnified setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryConfigUnified setOffsetSecs(Long offsetSecs) {
        this.offsetSecs = offsetSecs;
        return this;
    }
    public Long getOffsetSecs() {
        return this.offsetSecs;
    }

    public QueryConfigUnified setParamValues(java.util.List<PrometheusMetricParamValue> paramValues) {
        this.paramValues = paramValues;
        return this;
    }
    public java.util.List<PrometheusMetricParamValue> getParamValues() {
        return this.paramValues;
    }

    @Deprecated
    public QueryConfigUnified setPromQl(String promQl) {
        this.promQl = promQl;
        return this;
    }
    public String getPromQl() {
        return this.promQl;
    }

    public QueryConfigUnified setQueries(java.util.List<Queries> queries) {
        this.queries = queries;
        return this;
    }
    public java.util.List<Queries> getQueries() {
        return this.queries;
    }

    public QueryConfigUnified setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public QueryConfigUnified setServiceIdList(java.util.List<String> serviceIdList) {
        this.serviceIdList = serviceIdList;
        return this;
    }
    public java.util.List<String> getServiceIdList() {
        return this.serviceIdList;
    }

    public QueryConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryConfigUnified setWindowSecs(Long windowSecs) {
        this.windowSecs = windowSecs;
        return this;
    }
    public Long getWindowSecs() {
        return this.windowSecs;
    }

}
