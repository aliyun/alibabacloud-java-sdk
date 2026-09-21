// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDataPipelinesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of data pipelines.</p>
     */
    @NameInMap("pipelines")
    public java.util.List<ListDataPipelinesResponseBodyPipelines> pipelines;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListDataPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataPipelinesResponseBody self = new ListDataPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataPipelinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataPipelinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataPipelinesResponseBody setPipelines(java.util.List<ListDataPipelinesResponseBodyPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
    public java.util.List<ListDataPipelinesResponseBodyPipelines> getPipelines() {
        return this.pipelines;
    }

    public ListDataPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataPipelinesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments extends TeaModel {
        /**
         * <p>The assignment expression.</p>
         * 
         * <strong>example:</strong>
         * <p>duration / 1000000.0</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The output field.</p>
         * 
         * <strong>example:</strong>
         * <p>latency_ms</p>
         */
        @NameInMap("field")
        public String field;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections extends TeaModel {
        /**
         * <p>The source field.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceName</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The target field.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("target")
        public String target;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules extends TeaModel {
        /**
         * <p>The length of the prefix to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The length of the suffix to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepSuffix")
        public Integer keepSuffix;

        /**
         * <p>The sensitive keywords.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>The mask character.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("maskChar")
        public String maskChar;

        /**
         * <p>The masking mode.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The built-in sensitive types.</p>
         */
        @NameInMap("types")
        public java.util.List<String> types;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField extends TeaModel {
        /**
         * <p>The JSON object container.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("container")
        public String container;

        /**
         * <p>The reference data type.</p>
         * 
         * <strong>example:</strong>
         * <p>ifconfig</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>007</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField field;

        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOB</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The match values.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions setField(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName extends TeaModel {
        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The metric names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;http_requests_total&quot;]</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName extends TeaModel {
        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The match values.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName serviceName;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope setConditions(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope setMetricName(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope setServiceName(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments> assignments;

        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The list of fields.</p>
         */
        @NameInMap("fields")
        public java.util.List<String> fields;

        /**
         * <p>The extended parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The list of field projections.</p>
         */
        @NameInMap("projections")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope scope;

        /**
         * <p>The SPL script.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| extend latency_ms = duration / 1000000</li>
         * </ul>
         */
        @NameInMap("script")
        public String script;

        /**
         * <p>The service selector.</p>
         */
        @NameInMap("selector")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget target;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setAssignments(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setProjections(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setRules(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setScope(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigScope getScope() {
            return this.scope;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setSelector(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setTarget(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig config;

        /**
         * <p>The processor name.</p>
         * 
         * <strong>example:</strong>
         * <p>drop-health-check</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The processor type.</p>
         * 
         * <strong>example:</strong>
         * <p>filter</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataPipelinesResponseBodyPipelinesOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputsProcessors self = new ListDataPipelinesResponseBodyPipelinesOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessors setConfig(ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesOutputs extends TeaModel {
        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>checkout_route</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The branch processors.</p>
         */
        @NameInMap("processors")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessors> processors;

        public static ListDataPipelinesResponseBodyPipelinesOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesOutputs self = new ListDataPipelinesResponseBodyPipelinesOutputs();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPipelinesResponseBodyPipelinesOutputs setProcessors(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments extends TeaModel {
        /**
         * <p>The assignment expression.</p>
         * 
         * <strong>example:</strong>
         * <p>duration / 1000000.0</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The output field.</p>
         * 
         * <strong>example:</strong>
         * <p>latency_ms</p>
         */
        @NameInMap("field")
        public String field;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections extends TeaModel {
        /**
         * <p>The source field.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceName</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The target field.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("target")
        public String target;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules extends TeaModel {
        /**
         * <p>The length of the prefix to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The length of the suffix to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepSuffix")
        public Integer keepSuffix;

        /**
         * <p>The sensitive keywords.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>The mask character.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("maskChar")
        public String maskChar;

        /**
         * <p>The masking mode.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The built-in sensitive types.</p>
         */
        @NameInMap("types")
        public java.util.List<String> types;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField extends TeaModel {
        /**
         * <p>The JSON object container.</p>
         * 
         * <strong>example:</strong>
         * <p>attributes</p>
         */
        @NameInMap("container")
        public String container;

        /**
         * <p>The reference data type.</p>
         * 
         * <strong>example:</strong>
         * <p>Namespace</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-acs-ecs-monitor-1768184111425_acs.metric.prometheus_ecs_userid_cn-hangzhou/rw-918c25ad26e2f45260d304d298b5</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField field;

        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The match values.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions setField(ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName extends TeaModel {
        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The metric names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;http_requests_total&quot;]</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName extends TeaModel {
        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The match values.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName serviceName;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope setConditions(java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope setMetricName(ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope setServiceName(ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments> assignments;

        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The list of fields.</p>
         */
        @NameInMap("fields")
        public java.util.List<String> fields;

        /**
         * <p>The extended parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The list of field projections.</p>
         */
        @NameInMap("projections")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing takes effect.</p>
         */
        @NameInMap("scope")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope scope;

        /**
         * <p>The SPL script.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| extend latency_ms = duration / 1000000</li>
         * </ul>
         */
        @NameInMap("script")
        public String script;

        /**
         * <p>The service selector.</p>
         */
        @NameInMap("selector")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget target;

        public static ListDataPipelinesResponseBodyPipelinesProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessorsConfig self = new ListDataPipelinesResponseBodyPipelinesProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setAssignments(java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setProjections(java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setRules(java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setScope(ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigScope getScope() {
            return this.scope;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setSelector(ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setTarget(ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig config;

        /**
         * <p>The processor name.</p>
         * 
         * <strong>example:</strong>
         * <p>drop-health-check</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The processor type.</p>
         * 
         * <strong>example:</strong>
         * <p>filter</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataPipelinesResponseBodyPipelinesProcessors build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesProcessors self = new ListDataPipelinesResponseBodyPipelinesProcessors();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesProcessors setConfig(ListDataPipelinesResponseBodyPipelinesProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig getConfig() {
            return this.config;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPipelinesResponseBodyPipelinesProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesSinks extends TeaModel {
        /**
         * <p>The list of datasets.</p>
         */
        @NameInMap("datasets")
        public java.util.List<String> datasets;

        /**
         * <p>SLS Logstore</p>
         * 
         * <strong>example:</strong>
         * <p>error-spans</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the output destination.</p>
         * 
         * <strong>example:</strong>
         * <p>error-archive</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>SLS Project</p>
         * 
         * <strong>example:</strong>
         * <p>customer-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The type of the output destination.</p>
         * 
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataPipelinesResponseBodyPipelinesSinks build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesSinks self = new ListDataPipelinesResponseBodyPipelinesSinks();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public ListDataPipelinesResponseBodyPipelinesSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListDataPipelinesResponseBodyPipelinesSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataPipelinesResponseBodyPipelinesSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListDataPipelinesResponseBodyPipelinesSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange extends TeaModel {
        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1722844800</p>
         */
        @NameInMap("from")
        public Long from;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1722848400</p>
         */
        @NameInMap("to")
        public Long to;

        public static ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange self = new ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesSourceConfig extends TeaModel {
        /**
         * <p>The run mode.</p>
         * 
         * <strong>example:</strong>
         * <p>continuous</p>
         */
        @NameInMap("runMode")
        public String runMode;

        /**
         * <p>The read start point.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("startFrom")
        public String startFrom;

        /**
         * <p>The backfill time range.</p>
         */
        @NameInMap("timeRange")
        public ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange timeRange;

        public static ListDataPipelinesResponseBodyPipelinesSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesSourceConfig self = new ListDataPipelinesResponseBodyPipelinesSourceConfig();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public ListDataPipelinesResponseBodyPipelinesSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public ListDataPipelinesResponseBodyPipelinesSourceConfig setTimeRange(ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelinesSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public ListDataPipelinesResponseBodyPipelinesSourceConfig config;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataPipelinesResponseBodyPipelinesSource build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelinesSource self = new ListDataPipelinesResponseBodyPipelinesSource();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelinesSource setConfig(ListDataPipelinesResponseBodyPipelinesSourceConfig config) {
            this.config = config;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesSourceConfig getConfig() {
            return this.config;
        }

        public ListDataPipelinesResponseBodyPipelinesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataPipelinesResponseBodyPipelines extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>This parameter is required.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T05:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The pipeline description.</p>
         * 
         * <strong>example:</strong>
         * <p>Export selected trace services to the target workspace.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The pipeline type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>export</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The named outputs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("outputs")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputs> outputs;

        /**
         * <p>The pipeline name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>export-traces-to-prod</p>
         */
        @NameInMap("pipelineName")
        public String pipelineName;

        /**
         * <p>The common processors.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("processors")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessors> processors;

        /**
         * <p>The signal type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>traces</p>
         */
        @NameInMap("signalType")
        public String signalType;

        /**
         * <p>The output destinations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sinks")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesSinks> sinks;

        /**
         * <p>The data source.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("source")
        public ListDataPipelinesResponseBodyPipelinesSource source;

        /**
         * <p>The running status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status message.</p>
         * 
         * <strong>example:</strong>
         * <p>Pipeline is running.</p>
         */
        @NameInMap("statusMessage")
        public String statusMessage;

        /**
         * <p>The update time.</p>
         * <p>This parameter is required.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T05:10:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The configuration version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("version")
        public Long version;

        public static ListDataPipelinesResponseBodyPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListDataPipelinesResponseBodyPipelines self = new ListDataPipelinesResponseBodyPipelines();
            return TeaModel.build(map, self);
        }

        public ListDataPipelinesResponseBodyPipelines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataPipelinesResponseBodyPipelines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataPipelinesResponseBodyPipelines setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDataPipelinesResponseBodyPipelines setOutputs(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputs> getOutputs() {
            return this.outputs;
        }

        public ListDataPipelinesResponseBodyPipelines setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public ListDataPipelinesResponseBodyPipelines setProcessors(java.util.List<ListDataPipelinesResponseBodyPipelinesProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessors> getProcessors() {
            return this.processors;
        }

        public ListDataPipelinesResponseBodyPipelines setSignalType(String signalType) {
            this.signalType = signalType;
            return this;
        }
        public String getSignalType() {
            return this.signalType;
        }

        public ListDataPipelinesResponseBodyPipelines setSinks(java.util.List<ListDataPipelinesResponseBodyPipelinesSinks> sinks) {
            this.sinks = sinks;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesSinks> getSinks() {
            return this.sinks;
        }

        public ListDataPipelinesResponseBodyPipelines setSource(ListDataPipelinesResponseBodyPipelinesSource source) {
            this.source = source;
            return this;
        }
        public ListDataPipelinesResponseBodyPipelinesSource getSource() {
            return this.source;
        }

        public ListDataPipelinesResponseBodyPipelines setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataPipelinesResponseBodyPipelines setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListDataPipelinesResponseBodyPipelines setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListDataPipelinesResponseBodyPipelines setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
