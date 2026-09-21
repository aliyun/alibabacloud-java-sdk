// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDataPipelineResponseBody extends TeaModel {
    /**
     * <p>The data pipeline.</p>
     */
    @NameInMap("pipeline")
    public GetDataPipelineResponseBodyPipeline pipeline;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDataPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataPipelineResponseBody self = new GetDataPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataPipelineResponseBody setPipeline(GetDataPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetDataPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetDataPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules extends TeaModel {
        /**
         * <p>The retained prefix length.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The retained suffix length.</p>
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

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField extends TeaModel {
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
         * <p>label</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>azone</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField field;

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

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setField(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName extends TeaModel {
        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;http_requests_total&quot;]</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName serviceName;

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setConditions(java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setMetricName(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setServiceName(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig extends TeaModel {
        /**
         * <p>The application list.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The field assignment list.</p>
         */
        @NameInMap("assignments")
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> assignments;

        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The field list.</p>
         */
        @NameInMap("fields")
        public java.util.List<String> fields;

        /**
         * <p>The extended parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The field projection list.</p>
         */
        @NameInMap("projections")
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> projections;

        /**
         * <p>The masking rule list.</p>
         */
        @NameInMap("rules")
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope scope;

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
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget target;

        public static GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig self = new GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setAssignments(java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setProjections(java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setRules(java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setScope(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope getScope() {
            return this.scope;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setSelector(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig setTarget(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig config;

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

        public static GetDataPipelineResponseBodyPipelineOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputsProcessors self = new GetDataPipelineResponseBodyPipelineOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessors setConfig(GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataPipelineResponseBodyPipelineOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineOutputs extends TeaModel {
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
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessors> processors;

        public static GetDataPipelineResponseBodyPipelineOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineOutputs self = new GetDataPipelineResponseBodyPipelineOutputs();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataPipelineResponseBodyPipelineOutputs setProcessors(java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments self = new GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigProjections extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigProjections self = new GetDataPipelineResponseBodyPipelineProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigRules extends TeaModel {
        /**
         * <p>The retained prefix length.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The retained suffix length.</p>
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

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigRules self = new GetDataPipelineResponseBodyPipelineProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField extends TeaModel {
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
         * <p>explorer_link</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>site_check_monitor</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField self = new GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField field;

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

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions self = new GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setField(GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName extends TeaModel {
        /**
         * <p>The match type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXACT</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;http_requests_total&quot;]</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName self = new GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName self = new GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName serviceName;

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigScope self = new GetDataPipelineResponseBodyPipelineProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScope setConditions(java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScope setMetricName(GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigScope setServiceName(GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigSelector self = new GetDataPipelineResponseBodyPipelineProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetDataPipelineResponseBodyPipelineProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfigTarget self = new GetDataPipelineResponseBodyPipelineProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessorsConfig extends TeaModel {
        /**
         * <p>The application list.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The field assignment list.</p>
         */
        @NameInMap("assignments")
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments> assignments;

        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>attributes[&quot;http.route&quot;] != &quot;/health&quot;</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The field list.</p>
         */
        @NameInMap("fields")
        public java.util.List<String> fields;

        /**
         * <p>The extended parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The field projection list.</p>
         */
        @NameInMap("projections")
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigProjections> projections;

        /**
         * <p>The masking rule list.</p>
         */
        @NameInMap("rules")
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScope scope;

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
        public GetDataPipelineResponseBodyPipelineProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public GetDataPipelineResponseBodyPipelineProcessorsConfigTarget target;

        public static GetDataPipelineResponseBodyPipelineProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessorsConfig self = new GetDataPipelineResponseBodyPipelineProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setAssignments(java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setProjections(java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setRules(java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setScope(GetDataPipelineResponseBodyPipelineProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfigScope getScope() {
            return this.scope;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setSelector(GetDataPipelineResponseBodyPipelineProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public GetDataPipelineResponseBodyPipelineProcessorsConfig setTarget(GetDataPipelineResponseBodyPipelineProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public GetDataPipelineResponseBodyPipelineProcessorsConfig config;

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

        public static GetDataPipelineResponseBodyPipelineProcessors build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineProcessors self = new GetDataPipelineResponseBodyPipelineProcessors();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineProcessors setConfig(GetDataPipelineResponseBodyPipelineProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineProcessorsConfig getConfig() {
            return this.config;
        }

        public GetDataPipelineResponseBodyPipelineProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataPipelineResponseBodyPipelineProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineSinks extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineSinks build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineSinks self = new GetDataPipelineResponseBodyPipelineSinks();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public GetDataPipelineResponseBodyPipelineSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetDataPipelineResponseBodyPipelineSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataPipelineResponseBodyPipelineSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetDataPipelineResponseBodyPipelineSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineSourceConfigTimeRange extends TeaModel {
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

        public static GetDataPipelineResponseBodyPipelineSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineSourceConfigTimeRange self = new GetDataPipelineResponseBodyPipelineSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public GetDataPipelineResponseBodyPipelineSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineSourceConfig extends TeaModel {
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
        public GetDataPipelineResponseBodyPipelineSourceConfigTimeRange timeRange;

        public static GetDataPipelineResponseBodyPipelineSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineSourceConfig self = new GetDataPipelineResponseBodyPipelineSourceConfig();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public GetDataPipelineResponseBodyPipelineSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public GetDataPipelineResponseBodyPipelineSourceConfig setTimeRange(GetDataPipelineResponseBodyPipelineSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class GetDataPipelineResponseBodyPipelineSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public GetDataPipelineResponseBodyPipelineSourceConfig config;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static GetDataPipelineResponseBodyPipelineSource build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipelineSource self = new GetDataPipelineResponseBodyPipelineSource();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipelineSource setConfig(GetDataPipelineResponseBodyPipelineSourceConfig config) {
            this.config = config;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineSourceConfig getConfig() {
            return this.config;
        }

        public GetDataPipelineResponseBodyPipelineSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataPipelineResponseBodyPipeline extends TeaModel {
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
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputs> outputs;

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
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessors> processors;

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
        public java.util.List<GetDataPipelineResponseBodyPipelineSinks> sinks;

        /**
         * <p>The data source.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("source")
        public GetDataPipelineResponseBodyPipelineSource source;

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

        public static GetDataPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetDataPipelineResponseBodyPipeline self = new GetDataPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetDataPipelineResponseBodyPipeline setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataPipelineResponseBodyPipeline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataPipelineResponseBodyPipeline setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetDataPipelineResponseBodyPipeline setOutputs(java.util.List<GetDataPipelineResponseBodyPipelineOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineOutputs> getOutputs() {
            return this.outputs;
        }

        public GetDataPipelineResponseBodyPipeline setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public GetDataPipelineResponseBodyPipeline setProcessors(java.util.List<GetDataPipelineResponseBodyPipelineProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineProcessors> getProcessors() {
            return this.processors;
        }

        public GetDataPipelineResponseBodyPipeline setSignalType(String signalType) {
            this.signalType = signalType;
            return this;
        }
        public String getSignalType() {
            return this.signalType;
        }

        public GetDataPipelineResponseBodyPipeline setSinks(java.util.List<GetDataPipelineResponseBodyPipelineSinks> sinks) {
            this.sinks = sinks;
            return this;
        }
        public java.util.List<GetDataPipelineResponseBodyPipelineSinks> getSinks() {
            return this.sinks;
        }

        public GetDataPipelineResponseBodyPipeline setSource(GetDataPipelineResponseBodyPipelineSource source) {
            this.source = source;
            return this;
        }
        public GetDataPipelineResponseBodyPipelineSource getSource() {
            return this.source;
        }

        public GetDataPipelineResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDataPipelineResponseBodyPipeline setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public GetDataPipelineResponseBodyPipeline setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetDataPipelineResponseBodyPipeline setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
