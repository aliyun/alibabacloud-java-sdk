// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDataPipelineRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>export</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The named outputs.</p>
     */
    @NameInMap("outputs")
    public java.util.List<CreateDataPipelineRequestOutputs> outputs;

    /**
     * <p>The pipeline name.</p>
     * 
     * <strong>example:</strong>
     * <p>export-traces-to-prod</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The common processors.</p>
     */
    @NameInMap("processors")
    public java.util.List<CreateDataPipelineRequestProcessors> processors;

    /**
     * <p>The output destinations.</p>
     */
    @NameInMap("sinks")
    public java.util.List<CreateDataPipelineRequestSinks> sinks;

    /**
     * <p>The data source.</p>
     */
    @NameInMap("source")
    public CreateDataPipelineRequestSource source;

    public static CreateDataPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataPipelineRequest self = new CreateDataPipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataPipelineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataPipelineRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public CreateDataPipelineRequest setOutputs(java.util.List<CreateDataPipelineRequestOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<CreateDataPipelineRequestOutputs> getOutputs() {
        return this.outputs;
    }

    public CreateDataPipelineRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public CreateDataPipelineRequest setProcessors(java.util.List<CreateDataPipelineRequestProcessors> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<CreateDataPipelineRequestProcessors> getProcessors() {
        return this.processors;
    }

    public CreateDataPipelineRequest setSinks(java.util.List<CreateDataPipelineRequestSinks> sinks) {
        this.sinks = sinks;
        return this;
    }
    public java.util.List<CreateDataPipelineRequestSinks> getSinks() {
        return this.sinks;
    }

    public CreateDataPipelineRequest setSource(CreateDataPipelineRequestSource source) {
        this.source = source;
        return this;
    }
    public CreateDataPipelineRequestSource getSource() {
        return this.source;
    }

    public static class CreateDataPipelineRequestOutputsProcessorsConfigRules extends TeaModel {
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

        public static CreateDataPipelineRequestOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestOutputsProcessorsConfigRules self = new CreateDataPipelineRequestOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class CreateDataPipelineRequestOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static CreateDataPipelineRequestOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestOutputsProcessorsConfigSelector self = new CreateDataPipelineRequestOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class CreateDataPipelineRequestOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateDataPipelineRequestOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestOutputsProcessorsConfigTarget self = new CreateDataPipelineRequestOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreateDataPipelineRequestOutputsProcessorsConfig extends TeaModel {
        /**
         * <p>The application list.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

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
         * <p>The masking rule list.</p>
         */
        @NameInMap("rules")
        public java.util.List<CreateDataPipelineRequestOutputsProcessorsConfigRules> rules;

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
        public CreateDataPipelineRequestOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public CreateDataPipelineRequestOutputsProcessorsConfigTarget target;

        public static CreateDataPipelineRequestOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestOutputsProcessorsConfig self = new CreateDataPipelineRequestOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setRules(java.util.List<CreateDataPipelineRequestOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateDataPipelineRequestOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setSelector(CreateDataPipelineRequestOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public CreateDataPipelineRequestOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public CreateDataPipelineRequestOutputsProcessorsConfig setTarget(CreateDataPipelineRequestOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public CreateDataPipelineRequestOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class CreateDataPipelineRequestOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public CreateDataPipelineRequestOutputsProcessorsConfig config;

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

        public static CreateDataPipelineRequestOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestOutputsProcessors self = new CreateDataPipelineRequestOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestOutputsProcessors setConfig(CreateDataPipelineRequestOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public CreateDataPipelineRequestOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public CreateDataPipelineRequestOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineRequestOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineRequestOutputs extends TeaModel {
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
        public java.util.List<CreateDataPipelineRequestOutputsProcessors> processors;

        public static CreateDataPipelineRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestOutputs self = new CreateDataPipelineRequestOutputs();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineRequestOutputs setProcessors(java.util.List<CreateDataPipelineRequestOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<CreateDataPipelineRequestOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class CreateDataPipelineRequestProcessorsConfigRules extends TeaModel {
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

        public static CreateDataPipelineRequestProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestProcessorsConfigRules self = new CreateDataPipelineRequestProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public CreateDataPipelineRequestProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public CreateDataPipelineRequestProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public CreateDataPipelineRequestProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public CreateDataPipelineRequestProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateDataPipelineRequestProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class CreateDataPipelineRequestProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static CreateDataPipelineRequestProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestProcessorsConfigSelector self = new CreateDataPipelineRequestProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class CreateDataPipelineRequestProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateDataPipelineRequestProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestProcessorsConfigTarget self = new CreateDataPipelineRequestProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreateDataPipelineRequestProcessorsConfig extends TeaModel {
        /**
         * <p>The application list.</p>
         */
        @NameInMap("applications")
        public java.util.List<String> applications;

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
         * <p>The masking rule list.</p>
         */
        @NameInMap("rules")
        public java.util.List<CreateDataPipelineRequestProcessorsConfigRules> rules;

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
        public CreateDataPipelineRequestProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public CreateDataPipelineRequestProcessorsConfigTarget target;

        public static CreateDataPipelineRequestProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestProcessorsConfig self = new CreateDataPipelineRequestProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public CreateDataPipelineRequestProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateDataPipelineRequestProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public CreateDataPipelineRequestProcessorsConfig setRules(java.util.List<CreateDataPipelineRequestProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateDataPipelineRequestProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public CreateDataPipelineRequestProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public CreateDataPipelineRequestProcessorsConfig setSelector(CreateDataPipelineRequestProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public CreateDataPipelineRequestProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public CreateDataPipelineRequestProcessorsConfig setTarget(CreateDataPipelineRequestProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public CreateDataPipelineRequestProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class CreateDataPipelineRequestProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public CreateDataPipelineRequestProcessorsConfig config;

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

        public static CreateDataPipelineRequestProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestProcessors self = new CreateDataPipelineRequestProcessors();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestProcessors setConfig(CreateDataPipelineRequestProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public CreateDataPipelineRequestProcessorsConfig getConfig() {
            return this.config;
        }

        public CreateDataPipelineRequestProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineRequestProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineRequestSinks extends TeaModel {
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

        public static CreateDataPipelineRequestSinks build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestSinks self = new CreateDataPipelineRequestSinks();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public CreateDataPipelineRequestSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateDataPipelineRequestSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataPipelineRequestSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateDataPipelineRequestSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataPipelineRequestSourceConfigTimeRange extends TeaModel {
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

        public static CreateDataPipelineRequestSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestSourceConfigTimeRange self = new CreateDataPipelineRequestSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public CreateDataPipelineRequestSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class CreateDataPipelineRequestSourceConfig extends TeaModel {
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
        public CreateDataPipelineRequestSourceConfigTimeRange timeRange;

        public static CreateDataPipelineRequestSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestSourceConfig self = new CreateDataPipelineRequestSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public CreateDataPipelineRequestSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public CreateDataPipelineRequestSourceConfig setTimeRange(CreateDataPipelineRequestSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public CreateDataPipelineRequestSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class CreateDataPipelineRequestSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public CreateDataPipelineRequestSourceConfig config;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateDataPipelineRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPipelineRequestSource self = new CreateDataPipelineRequestSource();
            return TeaModel.build(map, self);
        }

        public CreateDataPipelineRequestSource setConfig(CreateDataPipelineRequestSourceConfig config) {
            this.config = config;
            return this;
        }
        public CreateDataPipelineRequestSourceConfig getConfig() {
            return this.config;
        }

        public CreateDataPipelineRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
