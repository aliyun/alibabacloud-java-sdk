// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleQuery extends TeaModel {
    @NameInMap("checkAfterDataComplete")
    public Boolean checkAfterDataComplete;

    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    @NameInMap("domain")
    public String domain;

    @NameInMap("duration")
    public Long duration;

    @NameInMap("entityFields")
    public java.util.List<AlertRuleQueryEntityFields> entityFields;

    @NameInMap("entityFilter")
    public AlertRuleQueryEntityFilter entityFilter;

    @NameInMap("expr")
    public String expr;

    @NameInMap("firstJoin")
    public AlertRuleSlsQueryJoin firstJoin;

    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("groupType")
    public String groupType;

    @NameInMap("labelFilters")
    public java.util.List<AlertRuleQueryLabelFilters> labelFilters;

    @NameInMap("metric")
    public String metric;

    @NameInMap("metricSet")
    public String metricSet;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("queries")
    public java.util.List<AlertRuleQueryQueries> queries;

    @NameInMap("relationType")
    public String relationType;

    @NameInMap("secondJoin")
    public AlertRuleSlsQueryJoin secondJoin;

    @NameInMap("serviceIds")
    public java.util.List<String> serviceIds;

    /**
     * <p>查询类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static AlertRuleQuery build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleQuery self = new AlertRuleQuery();
        return TeaModel.build(map, self);
    }

    public AlertRuleQuery setCheckAfterDataComplete(Boolean checkAfterDataComplete) {
        this.checkAfterDataComplete = checkAfterDataComplete;
        return this;
    }
    public Boolean getCheckAfterDataComplete() {
        return this.checkAfterDataComplete;
    }

    public AlertRuleQuery setDimensions(java.util.List<java.util.Map<String, String>> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getDimensions() {
        return this.dimensions;
    }

    public AlertRuleQuery setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AlertRuleQuery setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public AlertRuleQuery setEntityFields(java.util.List<AlertRuleQueryEntityFields> entityFields) {
        this.entityFields = entityFields;
        return this;
    }
    public java.util.List<AlertRuleQueryEntityFields> getEntityFields() {
        return this.entityFields;
    }

    public AlertRuleQuery setEntityFilter(AlertRuleQueryEntityFilter entityFilter) {
        this.entityFilter = entityFilter;
        return this;
    }
    public AlertRuleQueryEntityFilter getEntityFilter() {
        return this.entityFilter;
    }

    public AlertRuleQuery setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public AlertRuleQuery setFirstJoin(AlertRuleSlsQueryJoin firstJoin) {
        this.firstJoin = firstJoin;
        return this;
    }
    public AlertRuleSlsQueryJoin getFirstJoin() {
        return this.firstJoin;
    }

    public AlertRuleQuery setGroupFieldList(java.util.List<String> groupFieldList) {
        this.groupFieldList = groupFieldList;
        return this;
    }
    public java.util.List<String> getGroupFieldList() {
        return this.groupFieldList;
    }

    public AlertRuleQuery setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AlertRuleQuery setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public AlertRuleQuery setLabelFilters(java.util.List<AlertRuleQueryLabelFilters> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<AlertRuleQueryLabelFilters> getLabelFilters() {
        return this.labelFilters;
    }

    public AlertRuleQuery setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public AlertRuleQuery setMetricSet(String metricSet) {
        this.metricSet = metricSet;
        return this;
    }
    public String getMetricSet() {
        return this.metricSet;
    }

    public AlertRuleQuery setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AlertRuleQuery setQueries(java.util.List<AlertRuleQueryQueries> queries) {
        this.queries = queries;
        return this;
    }
    public java.util.List<AlertRuleQueryQueries> getQueries() {
        return this.queries;
    }

    public AlertRuleQuery setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public AlertRuleQuery setSecondJoin(AlertRuleSlsQueryJoin secondJoin) {
        this.secondJoin = secondJoin;
        return this;
    }
    public AlertRuleSlsQueryJoin getSecondJoin() {
        return this.secondJoin;
    }

    public AlertRuleQuery setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    public AlertRuleQuery setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AlertRuleQueryEntityFields extends TeaModel {
        @NameInMap("field")
        public String field;

        @NameInMap("value")
        public String value;

        public static AlertRuleQueryEntityFields build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryEntityFields self = new AlertRuleQueryEntityFields();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryEntityFields setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public AlertRuleQueryEntityFields setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AlertRuleQueryEntityFilterFilters extends TeaModel {
        @NameInMap("field")
        public String field;

        @NameInMap("operator")
        public String operator;

        @NameInMap("value")
        public String value;

        public static AlertRuleQueryEntityFilterFilters build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryEntityFilterFilters self = new AlertRuleQueryEntityFilterFilters();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryEntityFilterFilters setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public AlertRuleQueryEntityFilterFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public AlertRuleQueryEntityFilterFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AlertRuleQueryEntityFilter extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("filters")
        public java.util.List<AlertRuleQueryEntityFilterFilters> filters;

        @NameInMap("type")
        public String type;

        public static AlertRuleQueryEntityFilter build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryEntityFilter self = new AlertRuleQueryEntityFilter();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryEntityFilter setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public AlertRuleQueryEntityFilter setFilters(java.util.List<AlertRuleQueryEntityFilterFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<AlertRuleQueryEntityFilterFilters> getFilters() {
            return this.filters;
        }

        public AlertRuleQueryEntityFilter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AlertRuleQueryLabelFilters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("operator")
        public String operator;

        @NameInMap("value")
        public String value;

        public static AlertRuleQueryLabelFilters build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryLabelFilters self = new AlertRuleQueryLabelFilters();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryLabelFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AlertRuleQueryLabelFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public AlertRuleQueryLabelFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AlertRuleQueryQueriesApmFilters extends TeaModel {
        @NameInMap("dim")
        public String dim;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static AlertRuleQueryQueriesApmFilters build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryQueriesApmFilters self = new AlertRuleQueryQueriesApmFilters();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryQueriesApmFilters setDim(String dim) {
            this.dim = dim;
            return this;
        }
        public String getDim() {
            return this.dim;
        }

        public AlertRuleQueryQueriesApmFilters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AlertRuleQueryQueriesApmFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AlertRuleQueryQueries extends TeaModel {
        @NameInMap("apmAlertMetricId")
        public String apmAlertMetricId;

        @NameInMap("apmFilters")
        public java.util.List<AlertRuleQueryQueriesApmFilters> apmFilters;

        @NameInMap("apmGroupBy")
        public java.util.List<String> apmGroupBy;

        @NameInMap("duration")
        public Long duration;

        /**
         * <p>时间偏移结束时间(相对)，如果指定了start、end，则不指定window。</p>
         */
        @NameInMap("end")
        public Long end;

        /**
         * <p>查询表达式</p>
         */
        @NameInMap("expr")
        public String expr;

        /**
         * <p>sls查询的时间偏移开始时间(相对)，如果指定了start、end，则不指定window。  例如：start=15， timeUnit=minute，表示15分钟前</p>
         */
        @NameInMap("start")
        public Long start;

        /**
         * <p>start和end、window的时间单位： day/hour/minute/second</p>
         */
        @NameInMap("timeUnit")
        public String timeUnit;

        /**
         * <p>整点时间查询区间。  如果指定了window则不指定start、end</p>
         */
        @NameInMap("window")
        public Long window;

        public static AlertRuleQueryQueries build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryQueries self = new AlertRuleQueryQueries();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryQueries setApmAlertMetricId(String apmAlertMetricId) {
            this.apmAlertMetricId = apmAlertMetricId;
            return this;
        }
        public String getApmAlertMetricId() {
            return this.apmAlertMetricId;
        }

        public AlertRuleQueryQueries setApmFilters(java.util.List<AlertRuleQueryQueriesApmFilters> apmFilters) {
            this.apmFilters = apmFilters;
            return this;
        }
        public java.util.List<AlertRuleQueryQueriesApmFilters> getApmFilters() {
            return this.apmFilters;
        }

        public AlertRuleQueryQueries setApmGroupBy(java.util.List<String> apmGroupBy) {
            this.apmGroupBy = apmGroupBy;
            return this;
        }
        public java.util.List<String> getApmGroupBy() {
            return this.apmGroupBy;
        }

        public AlertRuleQueryQueries setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public AlertRuleQueryQueries setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public AlertRuleQueryQueries setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public AlertRuleQueryQueries setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public AlertRuleQueryQueries setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public AlertRuleQueryQueries setWindow(Long window) {
            this.window = window;
            return this;
        }
        public Long getWindow() {
            return this.window;
        }

    }

}
