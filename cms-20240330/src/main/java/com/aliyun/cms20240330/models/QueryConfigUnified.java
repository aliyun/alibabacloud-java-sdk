// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryConfigUnified extends TeaModel {
    @NameInMap("aggregate")
    public String aggregate;

    @NameInMap("checkAfterDataComplete")
    @Deprecated
    public Boolean checkAfterDataComplete;

    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    @NameInMap("durationSecs")
    public Long durationSecs;

    @NameInMap("enableDataCompleteCheck")
    public Boolean enableDataCompleteCheck;

    @NameInMap("entityDomain")
    public String entityDomain;

    @NameInMap("entityFields")
    public java.util.List<EntityFields> entityFields;

    @NameInMap("entityFilters")
    public java.util.List<EntityFilters> entityFilters;

    @NameInMap("entityType")
    public String entityType;

    @NameInMap("expr")
    public String expr;

    @NameInMap("filterList")
    public java.util.List<FilterList> filterList;

    @NameInMap("filterValues")
    public java.util.List<PrometheusMetricFilterValue> filterValues;

    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("groupType")
    public String groupType;

    @NameInMap("joinings")
    public java.util.List<Joinings> joinings;

    @NameInMap("labelFilters")
    public java.util.List<LabelFilters> labelFilters;

    @NameInMap("legacyRaw")
    public String legacyRaw;

    @NameInMap("legacyType")
    public String legacyType;

    @NameInMap("logSet")
    public String logSet;

    @NameInMap("measureGroupKey")
    public String measureGroupKey;

    @NameInMap("measureList")
    public java.util.List<MeasureList> measureList;

    @NameInMap("metric")
    public String metric;

    @NameInMap("metricGroupId")
    public String metricGroupId;

    @NameInMap("metricId")
    public String metricId;

    @NameInMap("metricIds")
    @Deprecated
    public java.util.List<String> metricIds;

    @NameInMap("metricSet")
    public String metricSet;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("offsetSecs")
    public Long offsetSecs;

    @NameInMap("paramValues")
    public java.util.List<PrometheusMetricParamValue> paramValues;

    @NameInMap("promQl")
    @Deprecated
    public String promQl;

    @NameInMap("queries")
    public java.util.List<Queries> queries;

    @NameInMap("relationType")
    public String relationType;

    @NameInMap("serviceIdList")
    public java.util.List<String> serviceIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

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
