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

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules extends TeaModel {
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

    public static class UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules;

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

        public UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfig setRules(java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineOutputsProcessorsConfigRules> getRules() {
            return this.rules;
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

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules extends TeaModel {
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

    public static class UpdateDataPipelineResponseBodyPipelineProcessorsConfigSelector extends TeaModel {
        /**
         * <p>The service name list.</p>
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
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules> rules;

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

        public UpdateDataPipelineResponseBodyPipelineProcessorsConfig setRules(java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateDataPipelineResponseBodyPipelineProcessorsConfigRules> getRules() {
            return this.rules;
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
         * <p>The data source type.</p>
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
