// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewDataPipelineRequest extends TeaModel {
    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>Preview error span routing.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The start time of the preview.</p>
     * 
     * <strong>example:</strong>
     * <p>1784563200</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The pipeline type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The named outputs.</p>
     */
    @NameInMap("outputs")
    public java.util.List<PreviewDataPipelineRequestOutputs> outputs;

    /**
     * <p>The pipeline name.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-archive-routing</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The common processors.</p>
     */
    @NameInMap("processors")
    public java.util.List<PreviewDataPipelineRequestProcessors> processors;

    /**
     * <p>The output destinations.</p>
     */
    @NameInMap("sinks")
    public java.util.List<PreviewDataPipelineRequestSinks> sinks;

    /**
     * <p>The data source.</p>
     */
    @NameInMap("source")
    public PreviewDataPipelineRequestSource source;

    /**
     * <p>The end time for the preview.</p>
     * 
     * <strong>example:</strong>
     * <p>1784566800</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    public static PreviewDataPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewDataPipelineRequest self = new PreviewDataPipelineRequest();
        return TeaModel.build(map, self);
    }

    public PreviewDataPipelineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PreviewDataPipelineRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public PreviewDataPipelineRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public PreviewDataPipelineRequest setOutputs(java.util.List<PreviewDataPipelineRequestOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<PreviewDataPipelineRequestOutputs> getOutputs() {
        return this.outputs;
    }

    public PreviewDataPipelineRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public PreviewDataPipelineRequest setProcessors(java.util.List<PreviewDataPipelineRequestProcessors> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<PreviewDataPipelineRequestProcessors> getProcessors() {
        return this.processors;
    }

    public PreviewDataPipelineRequest setSinks(java.util.List<PreviewDataPipelineRequestSinks> sinks) {
        this.sinks = sinks;
        return this;
    }
    public java.util.List<PreviewDataPipelineRequestSinks> getSinks() {
        return this.sinks;
    }

    public PreviewDataPipelineRequest setSource(PreviewDataPipelineRequestSource source) {
        this.source = source;
        return this;
    }
    public PreviewDataPipelineRequestSource getSource() {
        return this.source;
    }

    public PreviewDataPipelineRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigAssignments extends TeaModel {
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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigAssignments self = new PreviewDataPipelineRequestOutputsProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigProjections extends TeaModel {
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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigProjections self = new PreviewDataPipelineRequestOutputsProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigRules extends TeaModel {
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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigRules self = new PreviewDataPipelineRequestOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField extends TeaModel {
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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField self = new PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField field;

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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions self = new PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions setField(PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName extends TeaModel {
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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName self = new PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName extends TeaModel {
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

        public static PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName self = new PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName serviceName;

        public static PreviewDataPipelineRequestOutputsProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigScope self = new PreviewDataPipelineRequestOutputsProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScope setConditions(java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScope setMetricName(PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigScope setServiceName(PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static PreviewDataPipelineRequestOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigSelector self = new PreviewDataPipelineRequestOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static PreviewDataPipelineRequestOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfigTarget self = new PreviewDataPipelineRequestOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigAssignments> assignments;

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
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigRules> rules;

        /**
         * <p>The pipeline processing scope.</p>
         */
        @NameInMap("scope")
        public PreviewDataPipelineRequestOutputsProcessorsConfigScope scope;

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
        public PreviewDataPipelineRequestOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public PreviewDataPipelineRequestOutputsProcessorsConfigTarget target;

        public static PreviewDataPipelineRequestOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessorsConfig self = new PreviewDataPipelineRequestOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setAssignments(java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setProjections(java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setRules(java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setScope(PreviewDataPipelineRequestOutputsProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfigScope getScope() {
            return this.scope;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setSelector(PreviewDataPipelineRequestOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public PreviewDataPipelineRequestOutputsProcessorsConfig setTarget(PreviewDataPipelineRequestOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class PreviewDataPipelineRequestOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public PreviewDataPipelineRequestOutputsProcessorsConfig config;

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

        public static PreviewDataPipelineRequestOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputsProcessors self = new PreviewDataPipelineRequestOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputsProcessors setConfig(PreviewDataPipelineRequestOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public PreviewDataPipelineRequestOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public PreviewDataPipelineRequestOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineRequestOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PreviewDataPipelineRequestOutputs extends TeaModel {
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
        public java.util.List<PreviewDataPipelineRequestOutputsProcessors> processors;

        public static PreviewDataPipelineRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestOutputs self = new PreviewDataPipelineRequestOutputs();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineRequestOutputs setProcessors(java.util.List<PreviewDataPipelineRequestOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigAssignments extends TeaModel {
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

        public static PreviewDataPipelineRequestProcessorsConfigAssignments build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigAssignments self = new PreviewDataPipelineRequestProcessorsConfigAssignments();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigAssignments setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public PreviewDataPipelineRequestProcessorsConfigAssignments setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigProjections extends TeaModel {
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

        public static PreviewDataPipelineRequestProcessorsConfigProjections build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigProjections self = new PreviewDataPipelineRequestProcessorsConfigProjections();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigProjections setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public PreviewDataPipelineRequestProcessorsConfigProjections setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigRules extends TeaModel {
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

        public static PreviewDataPipelineRequestProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigRules self = new PreviewDataPipelineRequestProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public PreviewDataPipelineRequestProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public PreviewDataPipelineRequestProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public PreviewDataPipelineRequestProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public PreviewDataPipelineRequestProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public PreviewDataPipelineRequestProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigScopeConditionsField extends TeaModel {
        /**
         * <p>The JSON object container.</p>
         * 
         * <strong>example:</strong>
         * <p>resources</p>
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

        public static PreviewDataPipelineRequestProcessorsConfigScopeConditionsField build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigScopeConditionsField self = new PreviewDataPipelineRequestProcessorsConfigScopeConditionsField();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditionsField setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditionsField setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditionsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditionsField setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigScopeConditions extends TeaModel {
        /**
         * <p>The field reference.</p>
         */
        @NameInMap("field")
        public PreviewDataPipelineRequestProcessorsConfigScopeConditionsField field;

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

        public static PreviewDataPipelineRequestProcessorsConfigScopeConditions build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigScopeConditions self = new PreviewDataPipelineRequestProcessorsConfigScopeConditions();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditions setField(PreviewDataPipelineRequestProcessorsConfigScopeConditionsField field) {
            this.field = field;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfigScopeConditionsField getField() {
            return this.field;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditions setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeConditions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigScopeMetricName extends TeaModel {
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

        public static PreviewDataPipelineRequestProcessorsConfigScopeMetricName build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigScopeMetricName self = new PreviewDataPipelineRequestProcessorsConfigScopeMetricName();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeMetricName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeMetricName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigScopeServiceName extends TeaModel {
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

        public static PreviewDataPipelineRequestProcessorsConfigScopeServiceName build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigScopeServiceName self = new PreviewDataPipelineRequestProcessorsConfigScopeServiceName();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeServiceName setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public PreviewDataPipelineRequestProcessorsConfigScopeServiceName setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigScope extends TeaModel {
        /**
         * <p>The additional field conditions.</p>
         */
        @NameInMap("conditions")
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigScopeConditions> conditions;

        /**
         * <p>The metric name scope.</p>
         */
        @NameInMap("metricName")
        public PreviewDataPipelineRequestProcessorsConfigScopeMetricName metricName;

        /**
         * <p>The service name scope.</p>
         */
        @NameInMap("serviceName")
        public PreviewDataPipelineRequestProcessorsConfigScopeServiceName serviceName;

        public static PreviewDataPipelineRequestProcessorsConfigScope build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigScope self = new PreviewDataPipelineRequestProcessorsConfigScope();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigScope setConditions(java.util.List<PreviewDataPipelineRequestProcessorsConfigScopeConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigScopeConditions> getConditions() {
            return this.conditions;
        }

        public PreviewDataPipelineRequestProcessorsConfigScope setMetricName(PreviewDataPipelineRequestProcessorsConfigScopeMetricName metricName) {
            this.metricName = metricName;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfigScopeMetricName getMetricName() {
            return this.metricName;
        }

        public PreviewDataPipelineRequestProcessorsConfigScope setServiceName(PreviewDataPipelineRequestProcessorsConfigScopeServiceName serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfigScopeServiceName getServiceName() {
            return this.serviceName;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The list of service names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static PreviewDataPipelineRequestProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigSelector self = new PreviewDataPipelineRequestProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static PreviewDataPipelineRequestProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfigTarget self = new PreviewDataPipelineRequestProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class PreviewDataPipelineRequestProcessorsConfig extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

        /**
         * <p>The list of field assignments.</p>
         */
        @NameInMap("assignments")
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigAssignments> assignments;

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
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigProjections> projections;

        /**
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigRules> rules;

        /**
         * <p>The scope in which pipeline processing takes effect.</p>
         */
        @NameInMap("scope")
        public PreviewDataPipelineRequestProcessorsConfigScope scope;

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
        public PreviewDataPipelineRequestProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public PreviewDataPipelineRequestProcessorsConfigTarget target;

        public static PreviewDataPipelineRequestProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessorsConfig self = new PreviewDataPipelineRequestProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public PreviewDataPipelineRequestProcessorsConfig setAssignments(java.util.List<PreviewDataPipelineRequestProcessorsConfigAssignments> assignments) {
            this.assignments = assignments;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigAssignments> getAssignments() {
            return this.assignments;
        }

        public PreviewDataPipelineRequestProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public PreviewDataPipelineRequestProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public PreviewDataPipelineRequestProcessorsConfig setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public PreviewDataPipelineRequestProcessorsConfig setProjections(java.util.List<PreviewDataPipelineRequestProcessorsConfigProjections> projections) {
            this.projections = projections;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigProjections> getProjections() {
            return this.projections;
        }

        public PreviewDataPipelineRequestProcessorsConfig setRules(java.util.List<PreviewDataPipelineRequestProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public PreviewDataPipelineRequestProcessorsConfig setScope(PreviewDataPipelineRequestProcessorsConfigScope scope) {
            this.scope = scope;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfigScope getScope() {
            return this.scope;
        }

        public PreviewDataPipelineRequestProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public PreviewDataPipelineRequestProcessorsConfig setSelector(PreviewDataPipelineRequestProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public PreviewDataPipelineRequestProcessorsConfig setTarget(PreviewDataPipelineRequestProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class PreviewDataPipelineRequestProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public PreviewDataPipelineRequestProcessorsConfig config;

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

        public static PreviewDataPipelineRequestProcessors build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestProcessors self = new PreviewDataPipelineRequestProcessors();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestProcessors setConfig(PreviewDataPipelineRequestProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public PreviewDataPipelineRequestProcessorsConfig getConfig() {
            return this.config;
        }

        public PreviewDataPipelineRequestProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineRequestProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PreviewDataPipelineRequestSinks extends TeaModel {
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

        public static PreviewDataPipelineRequestSinks build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestSinks self = new PreviewDataPipelineRequestSinks();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public PreviewDataPipelineRequestSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public PreviewDataPipelineRequestSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineRequestSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public PreviewDataPipelineRequestSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PreviewDataPipelineRequestSourceConfigTimeRange extends TeaModel {
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

        public static PreviewDataPipelineRequestSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestSourceConfigTimeRange self = new PreviewDataPipelineRequestSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public PreviewDataPipelineRequestSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class PreviewDataPipelineRequestSourceConfig extends TeaModel {
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
        public PreviewDataPipelineRequestSourceConfigTimeRange timeRange;

        public static PreviewDataPipelineRequestSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestSourceConfig self = new PreviewDataPipelineRequestSourceConfig();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public PreviewDataPipelineRequestSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public PreviewDataPipelineRequestSourceConfig setTimeRange(PreviewDataPipelineRequestSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public PreviewDataPipelineRequestSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class PreviewDataPipelineRequestSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public PreviewDataPipelineRequestSourceConfig config;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static PreviewDataPipelineRequestSource build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineRequestSource self = new PreviewDataPipelineRequestSource();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineRequestSource setConfig(PreviewDataPipelineRequestSourceConfig config) {
            this.config = config;
            return this;
        }
        public PreviewDataPipelineRequestSourceConfig getConfig() {
            return this.config;
        }

        public PreviewDataPipelineRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
