// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDataPipelineRequest extends TeaModel {
    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>Export selected trace services to the target workspace.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The expected version.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

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
    public java.util.List<UpdateDataPipelineRequestOutputs> outputs;

    /**
     * <p>The common processors.</p>
     */
    @NameInMap("processors")
    public java.util.List<UpdateDataPipelineRequestProcessors> processors;

    /**
     * <p>The output destinations.</p>
     */
    @NameInMap("sinks")
    public java.util.List<UpdateDataPipelineRequestSinks> sinks;

    /**
     * <p>The data source.</p>
     */
    @NameInMap("source")
    public UpdateDataPipelineRequestSource source;

    public static UpdateDataPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataPipelineRequest self = new UpdateDataPipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataPipelineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataPipelineRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateDataPipelineRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public UpdateDataPipelineRequest setOutputs(java.util.List<UpdateDataPipelineRequestOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<UpdateDataPipelineRequestOutputs> getOutputs() {
        return this.outputs;
    }

    public UpdateDataPipelineRequest setProcessors(java.util.List<UpdateDataPipelineRequestProcessors> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<UpdateDataPipelineRequestProcessors> getProcessors() {
        return this.processors;
    }

    public UpdateDataPipelineRequest setSinks(java.util.List<UpdateDataPipelineRequestSinks> sinks) {
        this.sinks = sinks;
        return this;
    }
    public java.util.List<UpdateDataPipelineRequestSinks> getSinks() {
        return this.sinks;
    }

    public UpdateDataPipelineRequest setSource(UpdateDataPipelineRequestSource source) {
        this.source = source;
        return this;
    }
    public UpdateDataPipelineRequestSource getSource() {
        return this.source;
    }

    public static class UpdateDataPipelineRequestOutputsProcessorsConfigRules extends TeaModel {
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

        public static UpdateDataPipelineRequestOutputsProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestOutputsProcessorsConfigRules self = new UpdateDataPipelineRequestOutputsProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class UpdateDataPipelineRequestOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static UpdateDataPipelineRequestOutputsProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestOutputsProcessorsConfigSelector self = new UpdateDataPipelineRequestOutputsProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class UpdateDataPipelineRequestOutputsProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static UpdateDataPipelineRequestOutputsProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestOutputsProcessorsConfigTarget self = new UpdateDataPipelineRequestOutputsProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class UpdateDataPipelineRequestOutputsProcessorsConfig extends TeaModel {
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
        public java.util.List<UpdateDataPipelineRequestOutputsProcessorsConfigRules> rules;

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
        public UpdateDataPipelineRequestOutputsProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public UpdateDataPipelineRequestOutputsProcessorsConfigTarget target;

        public static UpdateDataPipelineRequestOutputsProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestOutputsProcessorsConfig self = new UpdateDataPipelineRequestOutputsProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setRules(java.util.List<UpdateDataPipelineRequestOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateDataPipelineRequestOutputsProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setSelector(UpdateDataPipelineRequestOutputsProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public UpdateDataPipelineRequestOutputsProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public UpdateDataPipelineRequestOutputsProcessorsConfig setTarget(UpdateDataPipelineRequestOutputsProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public UpdateDataPipelineRequestOutputsProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class UpdateDataPipelineRequestOutputsProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public UpdateDataPipelineRequestOutputsProcessorsConfig config;

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

        public static UpdateDataPipelineRequestOutputsProcessors build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestOutputsProcessors self = new UpdateDataPipelineRequestOutputsProcessors();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestOutputsProcessors setConfig(UpdateDataPipelineRequestOutputsProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public UpdateDataPipelineRequestOutputsProcessorsConfig getConfig() {
            return this.config;
        }

        public UpdateDataPipelineRequestOutputsProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineRequestOutputsProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineRequestOutputs extends TeaModel {
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
        public java.util.List<UpdateDataPipelineRequestOutputsProcessors> processors;

        public static UpdateDataPipelineRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestOutputs self = new UpdateDataPipelineRequestOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineRequestOutputs setProcessors(java.util.List<UpdateDataPipelineRequestOutputsProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<UpdateDataPipelineRequestOutputsProcessors> getProcessors() {
            return this.processors;
        }

    }

    public static class UpdateDataPipelineRequestProcessorsConfigRules extends TeaModel {
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

        public static UpdateDataPipelineRequestProcessorsConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestProcessorsConfigRules self = new UpdateDataPipelineRequestProcessorsConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestProcessorsConfigRules setKeepPrefix(Integer keepPrefix) {
            this.keepPrefix = keepPrefix;
            return this;
        }
        public Integer getKeepPrefix() {
            return this.keepPrefix;
        }

        public UpdateDataPipelineRequestProcessorsConfigRules setKeepSuffix(Integer keepSuffix) {
            this.keepSuffix = keepSuffix;
            return this;
        }
        public Integer getKeepSuffix() {
            return this.keepSuffix;
        }

        public UpdateDataPipelineRequestProcessorsConfigRules setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public UpdateDataPipelineRequestProcessorsConfigRules setMaskChar(String maskChar) {
            this.maskChar = maskChar;
            return this;
        }
        public String getMaskChar() {
            return this.maskChar;
        }

        public UpdateDataPipelineRequestProcessorsConfigRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateDataPipelineRequestProcessorsConfigRules setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

    }

    public static class UpdateDataPipelineRequestProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-*&quot;,&quot;order-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static UpdateDataPipelineRequestProcessorsConfigSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestProcessorsConfigSelector self = new UpdateDataPipelineRequestProcessorsConfigSelector();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestProcessorsConfigSelector setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class UpdateDataPipelineRequestProcessorsConfigTarget extends TeaModel {
        /**
         * <p>The target workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>target-checkout-ws</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static UpdateDataPipelineRequestProcessorsConfigTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestProcessorsConfigTarget self = new UpdateDataPipelineRequestProcessorsConfigTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestProcessorsConfigTarget setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class UpdateDataPipelineRequestProcessorsConfig extends TeaModel {
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
        public java.util.List<UpdateDataPipelineRequestProcessorsConfigRules> rules;

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
        public UpdateDataPipelineRequestProcessorsConfigSelector selector;

        /**
         * <p>The processing target.</p>
         */
        @NameInMap("target")
        public UpdateDataPipelineRequestProcessorsConfigTarget target;

        public static UpdateDataPipelineRequestProcessorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestProcessorsConfig self = new UpdateDataPipelineRequestProcessorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestProcessorsConfig setApplications(java.util.List<String> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<String> getApplications() {
            return this.applications;
        }

        public UpdateDataPipelineRequestProcessorsConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateDataPipelineRequestProcessorsConfig setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public UpdateDataPipelineRequestProcessorsConfig setRules(java.util.List<UpdateDataPipelineRequestProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateDataPipelineRequestProcessorsConfigRules> getRules() {
            return this.rules;
        }

        public UpdateDataPipelineRequestProcessorsConfig setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public UpdateDataPipelineRequestProcessorsConfig setSelector(UpdateDataPipelineRequestProcessorsConfigSelector selector) {
            this.selector = selector;
            return this;
        }
        public UpdateDataPipelineRequestProcessorsConfigSelector getSelector() {
            return this.selector;
        }

        public UpdateDataPipelineRequestProcessorsConfig setTarget(UpdateDataPipelineRequestProcessorsConfigTarget target) {
            this.target = target;
            return this;
        }
        public UpdateDataPipelineRequestProcessorsConfigTarget getTarget() {
            return this.target;
        }

    }

    public static class UpdateDataPipelineRequestProcessors extends TeaModel {
        /**
         * <p>The processor configuration.</p>
         */
        @NameInMap("config")
        public UpdateDataPipelineRequestProcessorsConfig config;

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

        public static UpdateDataPipelineRequestProcessors build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestProcessors self = new UpdateDataPipelineRequestProcessors();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestProcessors setConfig(UpdateDataPipelineRequestProcessorsConfig config) {
            this.config = config;
            return this;
        }
        public UpdateDataPipelineRequestProcessorsConfig getConfig() {
            return this.config;
        }

        public UpdateDataPipelineRequestProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineRequestProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineRequestSinks extends TeaModel {
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

        public static UpdateDataPipelineRequestSinks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestSinks self = new UpdateDataPipelineRequestSinks();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestSinks setDatasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<String> getDatasets() {
            return this.datasets;
        }

        public UpdateDataPipelineRequestSinks setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateDataPipelineRequestSinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataPipelineRequestSinks setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateDataPipelineRequestSinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataPipelineRequestSourceConfigTimeRange extends TeaModel {
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

        public static UpdateDataPipelineRequestSourceConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestSourceConfigTimeRange self = new UpdateDataPipelineRequestSourceConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestSourceConfigTimeRange setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public UpdateDataPipelineRequestSourceConfigTimeRange setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class UpdateDataPipelineRequestSourceConfig extends TeaModel {
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
        public UpdateDataPipelineRequestSourceConfigTimeRange timeRange;

        public static UpdateDataPipelineRequestSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestSourceConfig self = new UpdateDataPipelineRequestSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestSourceConfig setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public UpdateDataPipelineRequestSourceConfig setStartFrom(String startFrom) {
            this.startFrom = startFrom;
            return this;
        }
        public String getStartFrom() {
            return this.startFrom;
        }

        public UpdateDataPipelineRequestSourceConfig setTimeRange(UpdateDataPipelineRequestSourceConfigTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public UpdateDataPipelineRequestSourceConfigTimeRange getTimeRange() {
            return this.timeRange;
        }

    }

    public static class UpdateDataPipelineRequestSource extends TeaModel {
        /**
         * <p>The datasource config.</p>
         */
        @NameInMap("config")
        public UpdateDataPipelineRequestSourceConfig config;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>traces-default</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateDataPipelineRequestSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataPipelineRequestSource self = new UpdateDataPipelineRequestSource();
            return TeaModel.build(map, self);
        }

        public UpdateDataPipelineRequestSource setConfig(UpdateDataPipelineRequestSourceConfig config) {
            this.config = config;
            return this;
        }
        public UpdateDataPipelineRequestSourceConfig getConfig() {
            return this.config;
        }

        public UpdateDataPipelineRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
