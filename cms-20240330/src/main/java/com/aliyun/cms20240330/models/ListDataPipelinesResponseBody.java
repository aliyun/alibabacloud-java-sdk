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
     * <p>The token for the next page.</p>
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
     * <p>The total number of data pipelines.</p>
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

    public static class ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules extends TeaModel {
        /**
         * <p>The length of the prefix to keep.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The length of the suffix to keep.</p>
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
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules> rules;

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

        public ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfig setRules(java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesOutputsProcessorsConfigRules> getRules() {
            return this.rules;
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
         * <p>The name of the processor.</p>
         * 
         * <strong>example:</strong>
         * <p>drop-health-check</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the processor.</p>
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

    public static class ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules extends TeaModel {
        /**
         * <p>The length of the prefix to keep.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keepPrefix")
        public Integer keepPrefix;

        /**
         * <p>The length of the suffix to keep.</p>
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
         * <p>The list of masking rules.</p>
         */
        @NameInMap("rules")
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules> rules;

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

        public ListDataPipelinesResponseBodyPipelinesProcessorsConfig setRules(java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListDataPipelinesResponseBodyPipelinesProcessorsConfigRules> getRules() {
            return this.rules;
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
         * <p>The name of the processor.</p>
         * 
         * <strong>example:</strong>
         * <p>drop-health-check</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the processor.</p>
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
         * <p>The type of the data source.</p>
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
         * <p>The time when the pipeline was created.</p>
         * <p>This parameter is required.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T05:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>Export selected trace services to the target workspace.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The type of the pipeline.</p>
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
         * <p>The name of the pipeline.</p>
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
         * <p>The time when the pipeline was last updated.</p>
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
