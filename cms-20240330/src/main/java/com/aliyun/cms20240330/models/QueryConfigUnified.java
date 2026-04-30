// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryConfigUnified extends TeaModel {
    /**
     * <p>是否启用数据完整性检查</p>
     */
    @NameInMap("enableDataCompleteCheck")
    public Boolean enableDataCompleteCheck;

    /**
     * <p>实体所属域</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>需要附带返回的实体字段</p>
     */
    @NameInMap("entityFields")
    public java.util.List<UmodelEntityField> entityFields;

    /**
     * <p>实体过滤列表</p>
     */
    @NameInMap("entityFilters")
    public java.util.List<UmodelEntityFilter> entityFilters;

    /**
     * <p>实体类型</p>
     */
    @NameInMap("entityType")
    public String entityType;

    @NameInMap("expr")
    public String expr;

    /**
     * <p>APM 过滤条件列表</p>
     */
    @NameInMap("filterList")
    public java.util.List<ApmFilterConfig> filterList;

    /**
     * <p>标签过滤条件</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<UmodelLabelFilter> labelFilters;

    /**
     * <p>APM 度量配置列表</p>
     */
    @NameInMap("measureList")
    public java.util.List<ApmMeasureConfig> measureList;

    /**
     * <p>指标名称（type=UMODEL_METRICSET_QUERY）</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>指标集名称（type=UMODEL_METRICSET_QUERY）</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>Prometheus 查询语句（type=PROMETHEUS_SINGLE_QUERY）</p>
     */
    @NameInMap("promQl")
    public String promQl;

    /**
     * <p>服务 ID 列表（type=APM_MULTI_QUERY）</p>
     */
    @NameInMap("serviceIdList")
    public java.util.List<String> serviceIdList;

    /**
     * <p>查询类型</p>
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
