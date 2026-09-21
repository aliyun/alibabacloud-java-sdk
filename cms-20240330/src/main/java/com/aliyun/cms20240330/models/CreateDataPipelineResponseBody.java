// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDataPipelineResponseBody extends TeaModel {
    /**
     * <p>The data pipeline.</p>
     */
    @NameInMap("pipeline")
    public CreateDataPipelineResponseBodyPipeline pipeline;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateDataPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataPipelineResponseBody self = new CreateDataPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataPipelineResponseBody setPipeline(CreateDataPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public CreateDataPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public CreateDataPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField extends TeaModel {
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
         * <p>field</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField field;

        /**
         * <p>The matching method.</p>
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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setField(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName extends TeaModel {
        /**
         * <p>The matching method.</p>
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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName extends TeaModel {
        /**
         * <p>The matching method.</p>
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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName serviceName;

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setConditions(java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setMetricName(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setServiceName(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> assignments;

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
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope scope;

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
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget target;

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig self = new CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setAssignments(java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setProjections(java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setRules(java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setScope(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope getScope() {
            return this.scope;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setSelector(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setTarget(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig config;

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

        public static CreateDataPipelineResponseBodyPipelineOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputsProcessors self = new CreateDataPipelineResponseBodyPipelineOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessors setConfig(CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineResponseBodyPipelineOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineOutputs extends TeaModel {
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
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessors> processors;

        public static CreateDataPipelineResponseBodyPipelineOutputs build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineOutputs self = new CreateDataPipelineResponseBodyPipelineOutputs();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineResponseBodyPipelineOutputs setProcessors(java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigRules extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigRules self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField extends TeaModel {
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
         * <p>field</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>service.name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField field;

        /**
         * <p>The matching method.</p>
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

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setField(CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName extends TeaModel {
        /**
         * <p>The matching method.</p>
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

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName extends TeaModel {
        /**
         * <p>The matching method.</p>
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

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName serviceName;

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigScope self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScope setConditions(java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScope setMetricName(CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScope setServiceName(CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget self = new CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments> assignments;

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
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScope scope;

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
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget target;

        public static CreateDataPipelineResponseBodyPipelineProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessorsConfig self = new CreateDataPipelineResponseBodyPipelineProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setAssignments(java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setProjections(java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setRules(java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setScope(CreateDataPipelineResponseBodyPipelineProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigScope getScope() {
            return this.scope;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setSelector(CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public CreateDataPipelineResponseBodyPipelineProcessorsConfig setTarget(CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public CreateDataPipelineResponseBodyPipelineProcessorsConfig config;

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

        public static CreateDataPipelineResponseBodyPipelineProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineProcessors self = new CreateDataPipelineResponseBodyPipelineProcessors();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineProcessors setConfig(CreateDataPipelineResponseBodyPipelineProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineProcessorsConfig getConfig() {
            return this.config;
        }

        public CreateDataPipelineResponseBodyPipelineProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineResponseBodyPipelineProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineSinks extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineSinks build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineSinks self = new CreateDataPipelineResponseBodyPipelineSinks();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public CreateDataPipelineResponseBodyPipelineSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateDataPipelineResponseBodyPipelineSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineResponseBodyPipelineSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateDataPipelineResponseBodyPipelineSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange extends TeaModel {
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

        public static CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange self = new CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineSourceConfig extends TeaModel {
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
        public CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange timeRange;

        public static CreateDataPipelineResponseBodyPipelineSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineSourceConfig self = new CreateDataPipelineResponseBodyPipelineSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public CreateDataPipelineResponseBodyPipelineSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public CreateDataPipelineResponseBodyPipelineSourceConfig setTimeRange(CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class CreateDataPipelineResponseBodyPipelineSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public CreateDataPipelineResponseBodyPipelineSourceConfig config;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateDataPipelineResponseBodyPipelineSource build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipelineSource self = new CreateDataPipelineResponseBodyPipelineSource();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipelineSource setConfig(CreateDataPipelineResponseBodyPipelineSourceConfig config) {
            this.config = config;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineSourceConfig getConfig() {
            return this.config;
        }

        public CreateDataPipelineResponseBodyPipelineSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineResponseBodyPipeline extends TeaModel {
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
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputs> outputs;

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
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessors> processors;

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
        public java.util.List<CreateDataPipelineResponseBodyPipelineSinks> sinks;

        /**
         * <p>The data source.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("source")
        public CreateDataPipelineResponseBodyPipelineSource source;

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

        public static CreateDataPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineResponseBodyPipeline self = new CreateDataPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineResponseBodyPipeline setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateDataPipelineResponseBodyPipeline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataPipelineResponseBodyPipeline setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreateDataPipelineResponseBodyPipeline setOutputs(java.util.List<CreateDataPipelineResponseBodyPipelineOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineOutputs> getOutputs() {
            return this.outputs;
        }

        public CreateDataPipelineResponseBodyPipeline setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public CreateDataPipelineResponseBodyPipeline setProcessors(java.util.List<CreateDataPipelineResponseBodyPipelineProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineProcessors> getProcessors() {
            return this.processors;
        }

        public CreateDataPipelineResponseBodyPipeline setSignalType(String signalType) {
            this.signalType = signalType;
            return this;
        }
        public String getSignalType() {
            return this.signalType;
        }

        public CreateDataPipelineResponseBodyPipeline setSinks(java.util.List<CreateDataPipelineResponseBodyPipelineSinks> sinks) {
            this.sinks = sinks;
            return this;
        }
        public java.util.List<CreateDataPipelineResponseBodyPipelineSinks> getSinks() {
            return this.sinks;
        }

        public CreateDataPipelineResponseBodyPipeline setSource(CreateDataPipelineResponseBodyPipelineSource source) {
            this.source = source;
            return this;
        }
        public CreateDataPipelineResponseBodyPipelineSource getSource() {
            return this.source;
        }

        public CreateDataPipelineResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDataPipelineResponseBodyPipeline setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public CreateDataPipelineResponseBodyPipeline setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateDataPipelineResponseBodyPipeline setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
