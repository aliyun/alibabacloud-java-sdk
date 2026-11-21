// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryConfigUnified extends TeaModel {
    /**
     * <p>The aggregation function used when the type is UMODEL_METRICSET_QUERY or UMODEL_LOGSET_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to perform alert detection after data completion. This parameter was originally used when the type was PROMETHEUS_MULTI_QUERY. It duplicates enableDataCompleteCheck and returns a 400 error in the write path.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("checkAfterDataComplete")
    @Deprecated
    public Boolean checkAfterDataComplete;

    /**
     * <p>The list of dimensions used when the type is CLOUD_MONITORING_QUERY. Each dimension is a key-value string map.</p>
     */
    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    /**
     * <p>The duration in seconds used when the type is PROMETHEUS_MULTI_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("durationSecs")
    public Long durationSecs;

    /**
     * <p>Specifies whether the data integrity check is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableDataCompleteCheck")
    public Boolean enableDataCompleteCheck;

    /**
     * <p>The domain to which the entity belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>The entity fields to be returned in the response.</p>
     */
    @NameInMap("entityFields")
    public java.util.List<EntityFields> entityFields;

    /**
     * <p>The list of entity filters.</p>
     */
    @NameInMap("entityFilters")
    public java.util.List<EntityFilters> entityFilters;

    /**
     * <p>The type of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s.pod</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The query expression or Search Processing Language (SPL) statement. Recommended when the type is PROMETHEUS_SINGLE_QUERY. Optional when the type is UMODEL_METRICSET_QUERY for custom SPL. Required when the type is UMODEL_LOGSET_QUERY, where an SPL query statement must be provided and validated by the business layer.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>The list of Application Performance Monitoring (APM) filter conditions.</p>
     */
    @NameInMap("filterList")
    public java.util.List<FilterList> filterList;

    /**
     * <p>The list of filter values for predefined metrics when the type is PROMETHEUS_PREDEFINED_METRIC_QUERY or PROMETHEUS_METRIC_GROUP_QUERY [Deprecated].</p>
     */
    @NameInMap("filterValues")
    public java.util.List<PrometheusMetricFilterValue> filterValues;

    /**
     * <p>The list of grouping fields used when the type is SLS_MULTI_QUERY and the groupType is custom.</p>
     */
    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    /**
     * <p>The group ID used when the type is CLOUD_MONITORING_QUERY. This parameter has dual semantics: an og- prefix indicates an observation group (GROUP_V2, where the prefix defines the semantics and relationType is not required, and the backend resolves members through the entity library); a pure number indicates an application group (GROUP_V1 legacy resource group, which requires relationType=GROUP).</p>
     * 
     * <strong>example:</strong>
     * <p>og-845e0a26455f437c</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The grouping strategy used when the type is SLS_MULTI_QUERY. Valid values: none, label, and custom.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>The list of joins used when the type is SLS_MULTI_QUERY. A maximum of two joins are supported. joinings[0] corresponds to the set operation between query 0 and query 1, and joinings[1] corresponds to the set operation between query 1 and query 2.</p>
     */
    @NameInMap("joinings")
    public java.util.List<Joinings> joinings;

    /**
     * <p>The label filter conditions.</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<LabelFilters> labelFilters;

    /**
     * <p>The raw V1 query JSON string returned as a fallback when the type is UNKNOWN_QUERY and parsing fails in the read path. This string includes the field values that triggered the failure, such as filter.operator=ABC. The frontend displays this field in read-only mode when it is not empty.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>The legacy type returned when the type is UNKNOWN_QUERY. This parameter indicates that the rule cannot be edited by using the new API. Submit a ticket to contact the CloudMonitor product team.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The name of the logset when the type is UMODEL_LOGSET_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称</p>
     */
    @NameInMap("logSet")
    public String logSet;

    /**
     * <p>The measure group key. This parameter is optional when the type is APM_MULTI_QUERY and corresponds to alertMetricInput.groupKey in V1.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("measureGroupKey")
    public String measureGroupKey;

    /**
     * <p>The list of APM measure configurations.</p>
     */
    @NameInMap("measureList")
    public java.util.List<MeasureList> measureList;

    /**
     * <p>The name of the metric when the type is UMODEL_METRICSET_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>node_cpu_seconds_total</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>The metric group ID when the type is PROMETHEUS_PREDEFINED_METRIC_QUERY or PROMETHEUS_METRIC_GROUP_QUERY [Deprecated].</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("metricGroupId")
    public String metricGroupId;

    /**
     * <p>The predefined metric ID when the type is PROMETHEUS_PREDEFINED_METRIC_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("metricId")
    public String metricId;

    /**
     * <p><strong>[Deprecated]</strong> The list of predefined metric IDs originally used when the type was PROMETHEUS_METRIC_GROUP_QUERY. This query type is deprecated, and the write path returns a 400 error.</p>
     */
    @NameInMap("metricIds")
    @Deprecated
    public java.util.List<String> metricIds;

    /**
     * <p>The name of the metricset when the type is UMODEL_METRICSET_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>cms.acs_ecs_dashboard.CPUUtilization</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>The CloudMonitor namespace, which is the cloud service name, when the type is CLOUD_MONITORING_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The query time offset in seconds used when the type is UMODEL_METRICSET_QUERY or UMODEL_LOGSET_QUERY. This parameter is used together with windowSecs to implement offset queries in the range of [T - windowSecs - offsetSecs, T - offsetSecs]. Valid values: 0 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("offsetSecs")
    public Long offsetSecs;

    /**
     * <p>The list of parameter values for predefined metrics when the type is PROMETHEUS_PREDEFINED_METRIC_QUERY or PROMETHEUS_METRIC_GROUP_QUERY [Deprecated].</p>
     */
    @NameInMap("paramValues")
    public java.util.List<PrometheusMetricParamValue> paramValues;

    /**
     * <p>The Prometheus query statement when the type is PROMETHEUS_SINGLE_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>avg(rate(node_cpu_seconds_total{mode=&quot;idle&quot;}[5m])) * 100</p>
     */
    @NameInMap("promQl")
    @Deprecated
    public String promQl;

    /**
     * <p>The list of subqueries, which is polymorphic based on the type. When the type is SLS_MULTI_QUERY, each entry is an SlsNamedQueryEntry object containing timeUnit, start, end, window, and expr. When the type is PROMETHEUS_MULTI_QUERY, each entry is a PrometheusNamedQueryEntry object containing name and expr. When the type is UMODEL_METRICSET_MULTI_QUERY, each entry is a MetricSetNamedQueryEntry object.</p>
     */
    @NameInMap("queries")
    public java.util.List<Queries> queries;

    /**
     * <p>The resource association type when the type is CLOUD_MONITORING_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("relationType")
    public String relationType;

    /**
     * <p>The list of service IDs (type=APM_MULTI_QUERY).</p>
     */
    @NameInMap("serviceIdList")
    public java.util.List<String> serviceIdList;

    /**
     * <p>The query type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUS_SINGLE_QUERY</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The aggregation time window in seconds. Used when type=UMODEL_METRICSET_QUERY or UMODEL_LOGSET_QUERY. Valid range: [60, 86400].</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
