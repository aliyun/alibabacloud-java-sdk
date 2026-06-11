// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleQuery extends TeaModel {
    /**
     * <p>Applicable query type: PROMQL_QUERY.</p>
     * <p>Specifies whether to run the alert check only after the data is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("checkAfterDataComplete")
    public Boolean checkAfterDataComplete;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.</p>
     * <p>A list of filter dimensions for the resource.</p>
     */
    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    /**
     * <p>The realm to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rum</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>Applicable query type: PROMQL_QUERY.</p>
     * <p>The duration for which the alert data persists, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>An array of entity field filters.</p>
     */
    @NameInMap("entityFields")
    public java.util.List<AlertRuleQueryEntityFields> entityFields;

    /**
     * <p>A resource filter used to screen target resources.</p>
     */
    @NameInMap("entityFilter")
    public AlertRuleQueryEntityFilter entityFilter;

    /**
     * <p>Applicable query type: PROMQL_QUERY.</p>
     * <p>The query expression (PromQL).</p>
     * 
     * <strong>example:</strong>
     * <p>sum(sum(max_over_time(kube_pod_status_phase{phase=~\&quot;Pending\&quot;,job=\&quot;_kube-state-metrics\&quot;}[5m])) by (pod)) &gt; 1000</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.</p>
     * <p>The configuration for the join operation on the result sets of subquery 1 (queries[0]) and subquery 2 (queries[1]).</p>
     */
    @NameInMap("firstJoin")
    public AlertRuleSlsQueryJoin firstJoin;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.</p>
     * <p>A list of grouping field names.</p>
     */
    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.</p>
     * <p>The ID of the associated application group. This parameter is valid only when relationType is set to GROUP.</p>
     * 
     * <strong>example:</strong>
     * <p>23423</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.</p>
     * <p>The grouping type. Valid values:</p>
     * <ul>
     * <li><p>none: No grouping.</p>
     * </li>
     * <li><p>label: Automatic grouping by tag.</p>
     * </li>
     * <li><p>custom: Custom grouping by tag.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>label</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>An array of label filters.</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<AlertRuleQueryLabelFilters> labelFilters;

    @NameInMap("markTags")
    public java.util.List<AlertRuleQueryMarkTags> markTags;

    /**
     * <p>The name of the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>The collection of metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_usage</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.</p>
     * <p>The namespace of the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Applicable query types: SLS_MULTI_QUERY and APM_MULTI_QUERY.</p>
     * <p>A list of subqueries.</p>
     * <p>For the SLS_MULTI_QUERY type, you can include up to three subqueries. The number and order of subqueries must match the sub-datasource configurations in datasource.dsList.</p>
     */
    @NameInMap("queries")
    public java.util.List<AlertRuleQueryQueries> queries;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.</p>
     * <p>The resource scope for the rule query. Valid values:</p>
     * <ul>
     * <li><p>USER: All resources under the user ID.</p>
     * </li>
     * <li><p>GROUP: An application group.</p>
     * </li>
     * <li><p>INSTANCE: A list of specified instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("relationType")
    public String relationType;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.</p>
     * <p>The configuration for the join operation on the result sets of subquery 2 (queries[2]) and subquery 3 (queries[3]).</p>
     */
    @NameInMap("secondJoin")
    public AlertRuleSlsQueryJoin secondJoin;

    /**
     * <p>A list of service IDs.</p>
     */
    @NameInMap("serviceIds")
    public java.util.List<String> serviceIds;

    /**
     * <p>The query type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PROMQL_QUERY: A PromQL query.</p>
     * </li>
     * <li><p>SLS_MULTI_QUERY: A Simple Log Service (SLS) query.</p>
     * </li>
     * <li><p>APM_MULTI_QUERY: An APM query.</p>
     * </li>
     * <li><p>CMS_BASIC_QUERY: A basic CloudMonitor query.</p>
     * </li>
     * </ul>
     * <p>Different query types have different valid parameters in the query object. For more information, see the &quot;Applicable query type&quot; description for each parameter.</p>
     * <p>The query type must match the data source type. The mappings are as follows:</p>
     * <ul>
     * <li><p>Prometheus data source (PROMETHEUS_DS): PROMQL_QUERY</p>
     * </li>
     * <li><p>APM data source (APM_DS): APM_MULTI_QUERY</p>
     * </li>
     * <li><p>SLS data source (SLS_MULTI_DS): SLS_MULTI_QUERY</p>
     * </li>
     * <li><p>Basic CloudMonitor data source (CMS_BASIC_DS): CMS_BASIC_QUERY</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMQL_QUERY</p>
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

    public AlertRuleQuery setMarkTags(java.util.List<AlertRuleQueryMarkTags> markTags) {
        this.markTags = markTags;
        return this;
    }
    public java.util.List<AlertRuleQueryMarkTags> getMarkTags() {
        return this.markTags;
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
        /**
         * <p>The name of the entity field.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The value of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>i-abc123</p>
         */
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
        /**
         * <p>The field.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The comparison operator.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The value to match.</p>
         * 
         * <strong>example:</strong>
         * <p>wait_throw</p>
         */
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
        /**
         * <p>The domain of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>rum</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>A list of filter conditions to further screen resources.</p>
         */
        @NameInMap("filters")
        public java.util.List<AlertRuleQueryEntityFilterFilters> filters;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>apm</p>
         */
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
        /**
         * <p>The name of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The comparison operator that determines how to match the label value.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
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

    public static class AlertRuleQueryMarkTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static AlertRuleQueryMarkTags build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleQueryMarkTags self = new AlertRuleQueryMarkTags();
            return TeaModel.build(map, self);
        }

        public AlertRuleQueryMarkTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AlertRuleQueryMarkTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AlertRuleQueryQueriesApmFilters extends TeaModel {
        /**
         * <p>The dimension in the APM metric.</p>
         * 
         * <strong>example:</strong>
         * <p>rpcType</p>
         */
        @NameInMap("dim")
        public String dim;

        /**
         * <p>The filter operation type:</p>
         * <ul>
         * <li><p>eq: Equal to</p>
         * </li>
         * <li><p>neq: Not equal to</p>
         * </li>
         * <li><p>match: Regular expression match</p>
         * </li>
         * <li><p>nmatch: Regular expression non-match</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value that corresponds to the filter operation.</p>
         * 
         * <strong>example:</strong>
         * <p>h3ji7a0y9i@2ac80e27fdfd0a2</p>
         */
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
        /**
         * <p>Applicable query type: APM_MULTI_QUERY.</p>
         * <p>The ID of the predefined Application Performance Management (APM) metric.</p>
         * 
         * <strong>example:</strong>
         * <p>appstat.jvm.ThreadNewCount</p>
         */
        @NameInMap("apmAlertMetricId")
        public String apmAlertMetricId;

        /**
         * <p>Applicable query type: ARMS_MULTI_QUERY.</p>
         * <p>The dimension filter configuration for the APM metric. This parameter must be used with apmAlertMetricId.</p>
         */
        @NameInMap("apmFilters")
        public java.util.List<AlertRuleQueryQueriesApmFilters> apmFilters;

        /**
         * <p>Applicable query type: ARMS_MULTI_QUERY.</p>
         * <p>A list of aggregation dimensions for the query. This specifies the metric dimensions to use for aggregation.</p>
         */
        @NameInMap("apmGroupBy")
        public java.util.List<String> apmGroupBy;

        /**
         * <p>Applicable query type: ARMS_MULTI_QUERY.</p>
         * <p>The duration of the alert data.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The relative end time of the time offset.</p>
         * <p>If you specify start and end, do not specify window.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("end")
        public Long end;

        /**
         * <p>Applicable query types: APM_MULTI_QUERY and SLS_MULTI_QUERY.</p>
         * <p>The query expression.</p>
         * <ul>
         * <li><p>For APM_MULTI_QUERY, this parameter is optional. It is the PromQL expression generated for a predefined metric, used for data preview.</p>
         * </li>
         * <li><p>For SLS_MULTI_QUERY, this parameter is the SQL search statement.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sum by (rpc,acs_arms_service_id,pid,rpcType) (sum_over_time_lorc(arms_app_requests_count_ign_destid_endpoint_parent_ppid_prpc{callKind=~\&quot;http|rpc|custom_entry|server|consumer\&quot;,pid=\&quot;gaddp9ap8q@cb005ffdf44b8ac\&quot;,source=\&quot;apm\&quot;}[1m]))</p>
         */
        @NameInMap("expr")
        public String expr;

        @NameInMap("name")
        public String name;

        @NameInMap("promQl")
        public String promQl;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The relative start time of the time offset for an SLS query.</p>
         * <p>If you specify start and end, do not specify window. For example, if start is 15 and timeUnit is minute, the time offset starts 15 minutes ago.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("start")
        public Long start;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The time unit for the start, end, and window parameters. Valid values: day, hour, minute, and second.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("timeUnit")
        public String timeUnit;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.</p>
         * <p>The query interval for a time frame. If you specify window, do not specify start and end.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public AlertRuleQueryQueries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AlertRuleQueryQueries setPromQl(String promQl) {
            this.promQl = promQl;
            return this;
        }
        public String getPromQl() {
            return this.promQl;
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
