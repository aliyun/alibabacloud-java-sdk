// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDataPipelineResponseBody extends TeaModel {
    /**
     * <p>The data pipeline.</p>
     */
    @NameInMap("pipeline")
    public UpdateDataPipelineResponseBodyPipeline pipeline;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDataPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataPipelineResponseBody self = new UpdateDataPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataPipelineResponseBody setPipeline(UpdateDataPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdateDataPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public UpdateDataPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField extends TeaModel {
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
         * <p>instanceId</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField field;

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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setField(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName serviceName;

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setConditions(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setMetricName(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope setServiceName(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> assignments;

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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope scope;

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
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget target;

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setAssignments(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setProjections(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setRules(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setScope(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigScope getScope() {
            return this.scope;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setSelector(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setTarget(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig config;

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

        public static UpdateDataPipelineResponseBodyPipelineOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputsProcessors self = new UpdateDataPipelineResponseBodyPipelineOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessors setConfig(UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineOutputs extends TeaModel {
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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessors> processors;

        public static UpdateDataPipelineResponseBodyPipelineOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineOutputs self = new UpdateDataPipelineResponseBodyPipelineOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineResponseBodyPipelineOutputs setProcessors(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField extends TeaModel {
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
         * <p>field</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The field or dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON literal key path.</p>
         */
        @NameInMap("path")
        public java.util.List<String> path;

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField field;

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

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setField(UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName serviceName;

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope setConditions(java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope setMetricName(UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope setServiceName(UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments> assignments;

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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules> rules;

        /**
         * <p>The scope in which the pipeline processing processor takes effect.</p>
         */
        @NameInMap("scope")
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope scope;

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
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget target;

        public static UpdateDataPipelineResponseBodyPipelineProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessorsConfig self = new UpdateDataPipelineResponseBodyPipelineProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setAssignments(java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setProjections(java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setRules(java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setScope(UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigScope getScope() {
            return this.scope;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setSelector(UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setTarget(UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig config;

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

        public static UpdateDataPipelineResponseBodyPipelineProcessors build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineProcessors self = new UpdateDataPipelineResponseBodyPipelineProcessors();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineProcessors setConfig(UpdateDataPipelineResponseBodyPipelineProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig getConfig() {
            return this.config;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineResponseBodyPipelineProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineSinks extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineSinks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineSinks self = new UpdateDataPipelineResponseBodyPipelineSinks();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public UpdateDataPipelineResponseBodyPipelineSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateDataPipelineResponseBodyPipelineSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineResponseBodyPipelineSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateDataPipelineResponseBodyPipelineSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange extends TeaModel {
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

        public static UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange self = new UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineSourceConfig extends TeaModel {
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
        public UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange timeRange;

        public static UpdateDataPipelineResponseBodyPipelineSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineSourceConfig self = new UpdateDataPipelineResponseBodyPipelineSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public UpdateDataPipelineResponseBodyPipelineSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public UpdateDataPipelineResponseBodyPipelineSourceConfig setTimeRange(UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipelineSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public UpdateDataPipelineResponseBodyPipelineSourceConfig config;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateDataPipelineResponseBodyPipelineSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipelineSource self = new UpdateDataPipelineResponseBodyPipelineSource();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipelineSource setConfig(UpdateDataPipelineResponseBodyPipelineSourceConfig config) {
            this.config = config;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineSourceConfig getConfig() {
            return this.config;
        }

        public UpdateDataPipelineResponseBodyPipelineSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineResponseBodyPipeline extends TeaModel {
        /**
         * <p>The time when the data pipeline was created.</p>
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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputs> outputs;

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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessors> processors;

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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineSinks> sinks;

        /**
         * <p>The data source.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("source")
        public UpdateDataPipelineResponseBodyPipelineSource source;

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

        public static UpdateDataPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineResponseBodyPipeline self = new UpdateDataPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineResponseBodyPipeline setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateDataPipelineResponseBodyPipeline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDataPipelineResponseBodyPipeline setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdateDataPipelineResponseBodyPipeline setOutputs(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputs> getOutputs() {
            return this.outputs;
        }

        public UpdateDataPipelineResponseBodyPipeline setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public UpdateDataPipelineResponseBodyPipeline setProcessors(java.util.List<UpdateDataPipelineResponseBodyPipelineProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessors> getProcessors() {
            return this.processors;
        }

        public UpdateDataPipelineResponseBodyPipeline setSignalType(String signalType) {
            this.signalType = signalType;
            return this;
        }
        public String getSignalType() {
            return this.signalType;
        }

        public UpdateDataPipelineResponseBodyPipeline setSinks(java.util.List<UpdateDataPipelineResponseBodyPipelineSinks> sinks) {
            this.sinks = sinks;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineSinks> getSinks() {
            return this.sinks;
        }

        public UpdateDataPipelineResponseBodyPipeline setSource(UpdateDataPipelineResponseBodyPipelineSource source) {
            this.source = source;
            return this;
        }
        public UpdateDataPipelineResponseBodyPipelineSource getSource() {
            return this.source;
        }

        public UpdateDataPipelineResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateDataPipelineResponseBodyPipeline setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public UpdateDataPipelineResponseBodyPipeline setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateDataPipelineResponseBodyPipeline setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
