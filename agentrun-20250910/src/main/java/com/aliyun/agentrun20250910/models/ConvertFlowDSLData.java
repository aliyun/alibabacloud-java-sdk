// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConvertFlowDSLData extends TeaModel {
    /**
     * <p>DSL兼容性分析和转换计划</p>
     */
    @NameInMap("conversionPlan")
    public ConvertFlowDSLDataConversionPlan conversionPlan;

    /**
     * <p>转换后的AgentRun Flow配置信息</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("flow")
    public ConvertFlowDSLDataFlow flow;

    /**
     * <p>插件识别或转换过程中的错误信息</p>
     */
    @NameInMap("pluginErrors")
    public java.util.List<ConvertFlowDSLDataPluginErrors> pluginErrors;

    /**
     * <p>需要安装的Toolset配置列表</p>
     */
    @NameInMap("toolsetInstallations")
    public java.util.List<ConvertFlowDSLDataToolsetInstallations> toolsetInstallations;

    public static ConvertFlowDSLData build(java.util.Map<String, ?> map) throws Exception {
        ConvertFlowDSLData self = new ConvertFlowDSLData();
        return TeaModel.build(map, self);
    }

    public ConvertFlowDSLData setConversionPlan(ConvertFlowDSLDataConversionPlan conversionPlan) {
        this.conversionPlan = conversionPlan;
        return this;
    }
    public ConvertFlowDSLDataConversionPlan getConversionPlan() {
        return this.conversionPlan;
    }

    public ConvertFlowDSLData setFlow(ConvertFlowDSLDataFlow flow) {
        this.flow = flow;
        return this;
    }
    public ConvertFlowDSLDataFlow getFlow() {
        return this.flow;
    }

    public ConvertFlowDSLData setPluginErrors(java.util.List<ConvertFlowDSLDataPluginErrors> pluginErrors) {
        this.pluginErrors = pluginErrors;
        return this;
    }
    public java.util.List<ConvertFlowDSLDataPluginErrors> getPluginErrors() {
        return this.pluginErrors;
    }

    public ConvertFlowDSLData setToolsetInstallations(java.util.List<ConvertFlowDSLDataToolsetInstallations> toolsetInstallations) {
        this.toolsetInstallations = toolsetInstallations;
        return this;
    }
    public java.util.List<ConvertFlowDSLDataToolsetInstallations> getToolsetInstallations() {
        return this.toolsetInstallations;
    }

    public static class ConvertFlowDSLDataConversionPlanIssues extends TeaModel {
        /**
         * <p>问题描述</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tool node requires Toolset installation</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>问题的详细信息（JSON对象）</p>
         */
        @NameInMap("details")
        public java.util.Map<String, ?> details;

        /**
         * <p>问题类型：needs_config, needs_conversion, unsupported</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>needs_config</p>
         */
        @NameInMap("issueType")
        public String issueType;

        /**
         * <p>问题严重程度：info, warning, error</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Dify DSL中的节点标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1760514991682</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>节点显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>Google Search</p>
         */
        @NameInMap("nodeTitle")
        public String nodeTitle;

        /**
         * <p>节点类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tool</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <p>解决建议</p>
         * 
         * <strong>example:</strong>
         * <p>Install Toolset &quot;google&quot; before using this flow</p>
         */
        @NameInMap("suggestion")
        public String suggestion;

        public static ConvertFlowDSLDataConversionPlanIssues build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLDataConversionPlanIssues self = new ConvertFlowDSLDataConversionPlanIssues();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLDataConversionPlanIssues setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConvertFlowDSLDataConversionPlanIssues setDetails(java.util.Map<String, ?> details) {
            this.details = details;
            return this;
        }
        public java.util.Map<String, ?> getDetails() {
            return this.details;
        }

        public ConvertFlowDSLDataConversionPlanIssues setIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }
        public String getIssueType() {
            return this.issueType;
        }

        public ConvertFlowDSLDataConversionPlanIssues setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ConvertFlowDSLDataConversionPlanIssues setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ConvertFlowDSLDataConversionPlanIssues setNodeTitle(String nodeTitle) {
            this.nodeTitle = nodeTitle;
            return this;
        }
        public String getNodeTitle() {
            return this.nodeTitle;
        }

        public ConvertFlowDSLDataConversionPlanIssues setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ConvertFlowDSLDataConversionPlanIssues setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ConvertFlowDSLDataConversionPlanSummary extends TeaModel {
        /**
         * <p>完全兼容的节点数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("compatibleNodes")
        public Integer compatibleNodes;

        /**
         * <p>需要手动配置的节点数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodesNeedConfig")
        public Integer nodesNeedConfig;

        /**
         * <p>需要特殊转换处理的节点数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("nodesNeedConversion")
        public Integer nodesNeedConversion;

        /**
         * <p>Dify DSL中的总节点数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalNodes")
        public Integer totalNodes;

        /**
         * <p>不支持的节点数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("unsupportedNodes")
        public Integer unsupportedNodes;

        public static ConvertFlowDSLDataConversionPlanSummary build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLDataConversionPlanSummary self = new ConvertFlowDSLDataConversionPlanSummary();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLDataConversionPlanSummary setCompatibleNodes(Integer compatibleNodes) {
            this.compatibleNodes = compatibleNodes;
            return this;
        }
        public Integer getCompatibleNodes() {
            return this.compatibleNodes;
        }

        public ConvertFlowDSLDataConversionPlanSummary setNodesNeedConfig(Integer nodesNeedConfig) {
            this.nodesNeedConfig = nodesNeedConfig;
            return this;
        }
        public Integer getNodesNeedConfig() {
            return this.nodesNeedConfig;
        }

        public ConvertFlowDSLDataConversionPlanSummary setNodesNeedConversion(Integer nodesNeedConversion) {
            this.nodesNeedConversion = nodesNeedConversion;
            return this;
        }
        public Integer getNodesNeedConversion() {
            return this.nodesNeedConversion;
        }

        public ConvertFlowDSLDataConversionPlanSummary setTotalNodes(Integer totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Integer getTotalNodes() {
            return this.totalNodes;
        }

        public ConvertFlowDSLDataConversionPlanSummary setUnsupportedNodes(Integer unsupportedNodes) {
            this.unsupportedNodes = unsupportedNodes;
            return this;
        }
        public Integer getUnsupportedNodes() {
            return this.unsupportedNodes;
        }

    }

    public static class ConvertFlowDSLDataConversionPlan extends TeaModel {
        /**
         * <p>节点兼容性问题详情</p>
         */
        @NameInMap("issues")
        public java.util.List<ConvertFlowDSLDataConversionPlanIssues> issues;

        /**
         * <p>节点兼容性统计摘要</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("summary")
        public ConvertFlowDSLDataConversionPlanSummary summary;

        public static ConvertFlowDSLDataConversionPlan build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLDataConversionPlan self = new ConvertFlowDSLDataConversionPlan();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLDataConversionPlan setIssues(java.util.List<ConvertFlowDSLDataConversionPlanIssues> issues) {
            this.issues = issues;
            return this;
        }
        public java.util.List<ConvertFlowDSLDataConversionPlanIssues> getIssues() {
            return this.issues;
        }

        public ConvertFlowDSLDataConversionPlan setSummary(ConvertFlowDSLDataConversionPlanSummary summary) {
            this.summary = summary;
            return this;
        }
        public ConvertFlowDSLDataConversionPlanSummary getSummary() {
            return this.summary;
        }

    }

    public static class ConvertFlowDSLDataFlow extends TeaModel {
        /**
         * <p>工作流的FnF State Machine定义（YAML格式）</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("definition")
        public String definition;

        /**
         * <p>工作流的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>Converted from external workflow</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>工作流的环境变量配置</p>
         */
        @NameInMap("environmentConfiguration")
        public EnvironmentConfiguration environmentConfiguration;

        /**
         * <p>转换后的工作流名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dify-flow</p>
         */
        @NameInMap("flowName")
        public String flowName;

        public static ConvertFlowDSLDataFlow build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLDataFlow self = new ConvertFlowDSLDataFlow();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLDataFlow setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ConvertFlowDSLDataFlow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConvertFlowDSLDataFlow setEnvironmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
            this.environmentConfiguration = environmentConfiguration;
            return this;
        }
        public EnvironmentConfiguration getEnvironmentConfiguration() {
            return this.environmentConfiguration;
        }

        public ConvertFlowDSLDataFlow setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

    public static class ConvertFlowDSLDataPluginErrors extends TeaModel {
        /**
         * <p>相关节点的标识符</p>
         * 
         * <strong>example:</strong>
         * <p>1760514996015</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>插件提供商名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>langgenius</p>
         */
        @NameInMap("providerName")
        public String providerName;

        /**
         * <p>错误原因描述</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Plugin not found in marketplace</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>工具名称</p>
         * 
         * <strong>example:</strong>
         * <p>google_search</p>
         */
        @NameInMap("toolName")
        public String toolName;

        public static ConvertFlowDSLDataPluginErrors build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLDataPluginErrors self = new ConvertFlowDSLDataPluginErrors();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLDataPluginErrors setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ConvertFlowDSLDataPluginErrors setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ConvertFlowDSLDataPluginErrors setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ConvertFlowDSLDataPluginErrors setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

    public static class ConvertFlowDSLDataToolsetInstallations extends TeaModel {
        /**
         * <p>Toolset描述</p>
         * 
         * <strong>example:</strong>
         * <p>Google Search Plugin</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Toolset名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>google</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Toolset规格配置（JSON对象）</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("spec")
        public java.util.Map<String, ?> spec;

        public static ConvertFlowDSLDataToolsetInstallations build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLDataToolsetInstallations self = new ConvertFlowDSLDataToolsetInstallations();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLDataToolsetInstallations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ConvertFlowDSLDataToolsetInstallations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ConvertFlowDSLDataToolsetInstallations setSpec(java.util.Map<String, ?> spec) {
            this.spec = spec;
            return this;
        }
        public java.util.Map<String, ?> getSpec() {
            return this.spec;
        }

    }

}
