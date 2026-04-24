// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleQuery extends TeaModel {
    /**
     * <p>Applicable query type: PROMQL_QUERY.
     * Whether to perform alert evaluation only after data completeness is ensured.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("checkAfterDataComplete")
    public Boolean checkAfterDataComplete;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.
     * List of filtering dimensions for the resource.</p>
     */
    @NameInMap("dimensions")
    public java.util.List<java.util.Map<String, String>> dimensions;

    /**
     * <p>资源所属的领域。</p>
     * 
     * <strong>example:</strong>
     * <p>rum</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>Applicable query type: PROMQL_QUERY.
     * Duration of alert data, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("duration")
    public Long duration;

    @NameInMap("entityFields")
    public java.util.List<AlertRuleQueryEntityFields> entityFields;

    /**
     * <p>资源过滤器，用于筛选目标资源。</p>
     */
    @NameInMap("entityFilter")
    public AlertRuleQueryEntityFilter entityFilter;

    /**
     * <p>Applicable query type: PROMQL_QUERY.
     * Query expression (PromQL).</p>
     * 
     * <strong>example:</strong>
     * <p>sum(sum(max_over_time(kube_pod_status_phase{phase=~\&quot;Pending\&quot;,job=\&quot;_kube-state-metrics\&quot;}[5m])) by (pod)) &gt; 1000</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.
     * Configuration for the set join operation between the results of subquery 1 (queries[0]) and subquery 2 (queries[1]).</p>
     */
    @NameInMap("firstJoin")
    public AlertRuleSlsQueryJoin firstJoin;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.
     * List of grouping field names.</p>
     */
    @NameInMap("groupFieldList")
    public java.util.List<String> groupFieldList;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.
     * Associated application group ID, valid only when relationType = GROUP.</p>
     * 
     * <strong>example:</strong>
     * <p>23423</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.
     * Grouping type, with the following possible values:</p>
     * <ul>
     * <li>none: No grouping.</li>
     * <li>label: Automatic label grouping.</li>
     * <li>custom: Custom label grouping.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>label</p>
     */
    @NameInMap("groupType")
    public String groupType;

    @NameInMap("labelFilters")
    public java.util.List<AlertRuleQueryLabelFilters> labelFilters;

    @NameInMap("markTags")
    public java.util.List<AlertRuleQueryMarkTags> markTags;

    /**
     * <p>指标名。</p>
     * 
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>监控指标集合。</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_usage</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.
     * Namespace of the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Applicable query types: SLS_MULTI_QUERY, APM_MULTI_QUERY.
     * List of subqueries.</p>
     * <p>For the SLS_MULTI_QUERY type, the list can contain up to three subqueries, and the number and order of subqueries must match the sub-datasource configurations in datasource.dsList.</p>
     */
    @NameInMap("queries")
    public java.util.List<AlertRuleQueryQueries> queries;

    /**
     * <p>Applicable query type: CMS_BASIC_QUERY.
     * Resource scope for the rule query, with the following allowed values:</p>
     * <ul>
     * <li>USER: All resources under the user\&quot;s UID.</li>
     * <li>GROUP: Application group.</li>
     * <li>INSTANCE: Specified list of instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("relationType")
    public String relationType;

    /**
     * <p>Applicable query type: SLS_MULTI_QUERY.
     * Configuration for the set join operation between the results of subquery 2 (queries[2]) and subquery 3 (queries[3]).</p>
     */
    @NameInMap("secondJoin")
    public AlertRuleSlsQueryJoin secondJoin;

    /**
     * <p>Service ID list.</p>
     */
    @NameInMap("serviceIds")
    public java.util.List<String> serviceIds;

    /**
     * <p>Query type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PROMQL_QUERY: PromQL query</li>
     * <li>SLS_MULTI_QUERY: SLS query</li>
     * <li>APM_MULTI_QUERY: APM query</li>
     * <li>CMS_BASIC_QUERY: Basic CloudMonitor query</li>
     * </ul>
     * <p>The valid fields within the query object vary depending on the query type. Refer to the &quot;Applicable query type&quot; description in each field\&quot;s documentation for details.</p>
     * <p>The query type must match the data source type, with the following correspondences:</p>
     * <ul>
     * <li>Prometheus data source (PROMETHEUS_DS): PROMQL_QUERY</li>
     * <li>APM data source (APM_DS): APM_MULTI_QUERY</li>
     * <li>SLS data source (SLS_MULTI_DS): SLS_MULTI_QUERY</li>
     * <li>Basic CloudMonitor data source (CMS_BASIC_DS): CMS_BASIC_QUERY.</li>
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
        /**
         * <p>字段</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>比较运算符。</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>匹配的值。</p>
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
         * <p>资源类型域。</p>
         * 
         * <strong>example:</strong>
         * <p>rum</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>过滤条件列表，用于进一步筛选资源。</p>
         */
        @NameInMap("filters")
        public java.util.List<AlertRuleQueryEntityFilterFilters> filters;

        /**
         * <p>资源类型。</p>
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
         * <p>Dimension in APM metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>rpcType</p>
         */
        @NameInMap("dim")
        public String dim;

        /**
         * <p>Filter operation types:</p>
         * <ul>
         * <li>eq: equals.</li>
         * <li>neq: not equals.</li>
         * <li>match: regular expression match.</li>
         * <li>nmatch: regular expression not match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The corresponding value for the filter operation.</p>
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
         * <p>Applicable query type: APM_MULTI_QUERY.
         * ID of the APM predefined metric.</p>
         * 
         * <strong>example:</strong>
         * <p>appstat.jvm.ThreadNewCount</p>
         */
        @NameInMap("apmAlertMetricId")
        public String apmAlertMetricId;

        /**
         * <p>Applicable query type: ARMS_MULTI_QUERY.
         * Dimension filter configuration for APM metrics. Must be used in conjunction with apmAlertMetricId.</p>
         */
        @NameInMap("apmFilters")
        public java.util.List<AlertRuleQueryQueriesApmFilters> apmFilters;

        /**
         * <p>Applicable query type: ARMS_MULTI_QUERY.
         * List of aggregation dimensions for the query, i.e., the dimensions by which the metric is aggregated.</p>
         */
        @NameInMap("apmGroupBy")
        public java.util.List<String> apmGroupBy;

        /**
         * <p>Applicable query type: ARMS_MULTI_QUERY.
         * Alert (data) duration.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.
         * Time offset end time (relative).
         * If start and end are specified, do not specify window.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("end")
        public Long end;

        /**
         * <p>Applicable query types: APM_MULTI_QUERY, SLS_MULTI_QUERY.
         * Query expression.</p>
         * <ul>
         * <li>For APM_MULTI_QUERY, this field is optional and contains the PromQL generated for predefined metrics (used for data preview).</li>
         * <li>For SLS_MULTI_QUERY, this field contains the SQL query statement.</li>
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
         * <p>Applicable query type: SLS_MULTI_QUERY.
         * SLS query time offset start time (relative).
         * If start and end are specified, do not specify window. For example: start=15, timeUnit=minute, which means 15 minutes ago.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("start")
        public Long start;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.
         * Time units for the start, end, and window parameters: day/hour/minute/second.</p>
         * 
         * <strong>example:</strong>
         * <p>hour</p>
         */
        @NameInMap("timeUnit")
        public String timeUnit;

        /**
         * <p>Applicable query type: SLS_MULTI_QUERY.
         * Exact-hour time query interval. If window is specified, start and end should not be specified.</p>
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
