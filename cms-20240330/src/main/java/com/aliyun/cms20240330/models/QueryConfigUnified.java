// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryConfigUnified extends TeaModel {
    /**
     * <p>Specifies whether to check for data completeness. A value of <code>true</code> enables the check.</p>
     */
    @NameInMap("enableDataCompleteCheck")
    public Boolean enableDataCompleteCheck;

    /**
     * <p>Specifies the domain of the entity, such as <code>acs</code> for Alibaba Cloud services.</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>A list of entity fields to include in the response.</p>
     */
    @NameInMap("entityFields")
    public java.util.List<UmodelEntityField> entityFields;

    /**
     * <p>A list of filters for selecting specific entities.</p>
     */
    @NameInMap("entityFilters")
    public java.util.List<UmodelEntityFilter> entityFilters;

    /**
     * <p>Specifies the type of the entity, such as <code>EcsInstance</code>.</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>Specifies the expression to post-process query results.</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>A list of Application Performance Monitoring (APM) filter configurations.</p>
     */
    @NameInMap("filterList")
    public java.util.List<ApmFilterConfig> filterList;

    /**
     * <p>A list of filters that match labels.</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<UmodelLabelFilter> labelFilters;

    /**
     * <p>A list of APM measure configurations.</p>
     */
    @NameInMap("measureList")
    public java.util.List<ApmMeasureConfig> measureList;

    /**
     * <p>Specifies the name of the metric to query.</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>Specifies the metric set that contains the metric.</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>Specifies the query string in Prometheus Query Language (PromQL).</p>
     */
    @NameInMap("promQl")
    public String promQl;

    /**
     * <p>A list of service IDs to query.</p>
     */
    @NameInMap("serviceIdList")
    public java.util.List<String> serviceIdList;

    /**
     * <p>The query type.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static QueryConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigUnified self = new QueryConfigUnified();
        return TeaModel.build(map, self);
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

    public QueryConfigUnified setLabelFilters(java.util.List<UmodelLabelFilter> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<UmodelLabelFilter> getLabelFilters() {
        return this.labelFilters;
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

    public QueryConfigUnified setPromQl(String promQl) {
        this.promQl = promQl;
        return this;
    }
    public String getPromQl() {
        return this.promQl;
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

}
