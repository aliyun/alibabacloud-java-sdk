// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryConfigUnified extends TeaModel {
    @NameInMap("aggregate")
    public String aggregate;

    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    @NameInMap("enableDataCompleteCheck")
    public Boolean enableDataCompleteCheck;

    @NameInMap("entityDomain")
    public String entityDomain;

    @NameInMap("entityFields")
    public java.util.List<UmodelEntityField> entityFields;

    @NameInMap("entityFilters")
    public java.util.List<UmodelEntityFilter> entityFilters;

    @NameInMap("entityType")
    public String entityType;

    @NameInMap("expr")
    public String expr;

    @NameInMap("filterList")
    public java.util.List<ApmFilterConfig> filterList;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("labelFilters")
    public java.util.List<UmodelLabelFilter> labelFilters;

    @NameInMap("legacyRaw")
    public String legacyRaw;

    @NameInMap("legacyType")
    public String legacyType;

    @NameInMap("logSet")
    public String logSet;

    @NameInMap("measureList")
    public java.util.List<ApmMeasureConfig> measureList;

    @NameInMap("metric")
    public String metric;

    @NameInMap("metricSet")
    public String metricSet;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("offsetSecs")
    public Long offsetSecs;

    @NameInMap("promQl")
    @Deprecated
    public String promQl;

    @NameInMap("queries")
    public java.util.List<MetricSetNamedQueryEntry> queries;

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

    public QueryConfigUnified setDimensions(java.util.List<java.util.Map<String, String>> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getDimensions() {
        return this.dimensions;
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

    public QueryConfigUnified setEntityFields(java.util.List<UmodelEntityField> entityFields) {
        this.entityFields = entityFields;
        return this;
    }
    public java.util.List<UmodelEntityField> getEntityFields() {
        return this.entityFields;
    }

    public QueryConfigUnified setEntityFilters(java.util.List<UmodelEntityFilter> entityFilters) {
        this.entityFilters = entityFilters;
        return this;
    }
    public java.util.List<UmodelEntityFilter> getEntityFilters() {
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

    public QueryConfigUnified setFilterList(java.util.List<ApmFilterConfig> filterList) {
        this.filterList = filterList;
        return this;
    }
    public java.util.List<ApmFilterConfig> getFilterList() {
        return this.filterList;
    }

    public QueryConfigUnified setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryConfigUnified setLabelFilters(java.util.List<UmodelLabelFilter> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<UmodelLabelFilter> getLabelFilters() {
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

    public QueryConfigUnified setMeasureList(java.util.List<ApmMeasureConfig> measureList) {
        this.measureList = measureList;
        return this;
    }
    public java.util.List<ApmMeasureConfig> getMeasureList() {
        return this.measureList;
    }

    public QueryConfigUnified setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
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

    @Deprecated
    public QueryConfigUnified setPromQl(String promQl) {
        this.promQl = promQl;
        return this;
    }
    public String getPromQl() {
        return this.promQl;
    }

    public QueryConfigUnified setQueries(java.util.List<MetricSetNamedQueryEntry> queries) {
        this.queries = queries;
        return this;
    }
    public java.util.List<MetricSetNamedQueryEntry> getQueries() {
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
