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
     * <p>The end time of the preview.</p>
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

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigRules extends TeaModel {
        /**
         * <p>The prefix length to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The suffix length to retain.</p>
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

    public static class PreviewDataPipelineRequestOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
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
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigRules> rules;

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

        public PreviewDataPipelineRequestOutputsProcessorsConfig setRules(java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestOutputsProcessorsConfigRules> getRules() {
            return this.rules;
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

    public static class PreviewDataPipelineRequestProcessorsConfigRules extends TeaModel {
        /**
         * <p>The prefix length to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The suffix length to retain.</p>
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

    public static class PreviewDataPipelineRequestProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
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
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigRules> rules;

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

        public PreviewDataPipelineRequestProcessorsConfig setRules(java.util.List<PreviewDataPipelineRequestProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<PreviewDataPipelineRequestProcessorsConfigRules> getRules() {
            return this.rules;
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
         * <p>The data source type.</p>
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
