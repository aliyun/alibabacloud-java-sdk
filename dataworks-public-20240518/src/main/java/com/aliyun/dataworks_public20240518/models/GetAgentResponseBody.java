// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    /**
     * <p>The agent details.</p>
     */
    @NameInMap("Agent")
    public GetAgentResponseBodyAgent agent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setAgent(GetAgentResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public GetAgentResponseBodyAgent getAgent() {
        return this.agent;
    }

    public GetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentResponseBodyAgentCallableAgents extends TeaModel {
        /**
         * <p>The sub-agent display name.</p>
         * 
         * <strong>example:</strong>
         * <p>子助手</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The sub-agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sub-agent source.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The sub-agent version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetAgentResponseBodyAgentCallableAgents build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyAgentCallableAgents self = new GetAgentResponseBodyAgentCallableAgents();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyAgentCallableAgents setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyAgentCallableAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentResponseBodyAgentCallableAgents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAgentResponseBodyAgentCallableAgents setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetAgentResponseBodyAgentModel extends TeaModel {
        /**
         * <p>Additional configuration for the model.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The maximum number of tokens to generate in one response.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>Indicates whether streaming output is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Stream")
        public Boolean stream;

        /**
         * <p>The temperature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Temperature")
        public Double temperature;

        /**
         * <p>The top-p.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TopP")
        public Double topP;

        public static GetAgentResponseBodyAgentModel build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyAgentModel self = new GetAgentResponseBodyAgentModel();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyAgentModel setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public GetAgentResponseBodyAgentModel setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public GetAgentResponseBodyAgentModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetAgentResponseBodyAgentModel setStream(Boolean stream) {
            this.stream = stream;
            return this;
        }
        public Boolean getStream() {
            return this.stream;
        }

        public GetAgentResponseBodyAgentModel setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public GetAgentResponseBodyAgentModel setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

    public static class GetAgentResponseBodyAgentSkills extends TeaModel {
        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetAgentResponseBodyAgentSkills build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyAgentSkills self = new GetAgentResponseBodyAgentSkills();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyAgentSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentResponseBodyAgentSkills setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetAgentResponseBodyAgentTools extends TeaModel {
        /**
         * <p><strong>The name of the built-in tool. This parameter applies only when <code>Kind</code> is set to <code>builtin</code>.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>builtin_sql</p>
         */
        @NameInMap("BuiltinName")
        public String builtinName;

        /**
         * <p><strong>The tool type.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>builtin</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p><strong>The selected MCP tool items. This parameter applies only when <code>Kind</code> is set to <code>mcp</code>.</strong></p>
         */
        @NameInMap("McpItems")
        public java.util.List<String> mcpItems;

        /**
         * <p><strong>The name of the associated MCP server. This parameter applies only when <code>Kind</code> is set to <code>mcp</code>.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>server-name</p>
         */
        @NameInMap("McpServerName")
        public String mcpServerName;

        public static GetAgentResponseBodyAgentTools build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyAgentTools self = new GetAgentResponseBodyAgentTools();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyAgentTools setBuiltinName(String builtinName) {
            this.builtinName = builtinName;
            return this;
        }
        public String getBuiltinName() {
            return this.builtinName;
        }

        public GetAgentResponseBodyAgentTools setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetAgentResponseBodyAgentTools setMcpItems(java.util.List<String> mcpItems) {
            this.mcpItems = mcpItems;
            return this;
        }
        public java.util.List<String> getMcpItems() {
            return this.mcpItems;
        }

        public GetAgentResponseBodyAgentTools setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

    }

    public static class GetAgentResponseBodyAgentVisibilityScope extends TeaModel {
        /**
         * <p>A list of project IDs that can view the agent.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>A list of user IDs that can view the agent.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetAgentResponseBodyAgentVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyAgentVisibilityScope self = new GetAgentResponseBodyAgentVisibilityScope();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyAgentVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public GetAgentResponseBodyAgentVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class GetAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>A list of callable sub-agents.</p>
         */
        @NameInMap("CallableAgents")
        public java.util.List<GetAgentResponseBodyAgentCallableAgents> callableAgents;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p><strong>The description.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>数据分析助手</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p><strong>The display name.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>我的助手</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The creation time, as a Unix timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last modification time, as a Unix timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p><strong>Additional metadata.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p><strong>The model configuration.</strong></p>
         */
        @NameInMap("Model")
        public GetAgentResponseBodyAgentModel model;

        /**
         * <p>The ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p><strong>The agent name.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The runtime dependencies.</p>
         */
        @NameInMap("RequiredRuntime")
        public java.util.List<String> requiredRuntime;

        /**
         * <p>A list of skills.</p>
         */
        @NameInMap("Skills")
        public java.util.List<GetAgentResponseBodyAgentSkills> skills;

        /**
         * <p><strong>The system prompt.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>你是一个数据分析助手。</p>
         */
        @NameInMap("SystemPrompt")
        public String systemPrompt;

        /**
         * <p><strong>A list of tools.</strong></p>
         */
        @NameInMap("Tools")
        public java.util.List<GetAgentResponseBodyAgentTools> tools;

        /**
         * <p><strong>The visibility level.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        /**
         * <p>The visibility scope.</p>
         */
        @NameInMap("VisibilityScope")
        public GetAgentResponseBodyAgentVisibilityScope visibilityScope;

        public static GetAgentResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyAgent self = new GetAgentResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyAgent setCallableAgents(java.util.List<GetAgentResponseBodyAgentCallableAgents> callableAgents) {
            this.callableAgents = callableAgents;
            return this;
        }
        public java.util.List<GetAgentResponseBodyAgentCallableAgents> getCallableAgents() {
            return this.callableAgents;
        }

        public GetAgentResponseBodyAgent setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetAgentResponseBodyAgent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentResponseBodyAgent setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAgentResponseBodyAgent setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetAgentResponseBodyAgent setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetAgentResponseBodyAgent setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetAgentResponseBodyAgent setModel(GetAgentResponseBodyAgentModel model) {
            this.model = model;
            return this;
        }
        public GetAgentResponseBodyAgentModel getModel() {
            return this.model;
        }

        public GetAgentResponseBodyAgent setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetAgentResponseBodyAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentResponseBodyAgent setRequiredRuntime(java.util.List<String> requiredRuntime) {
            this.requiredRuntime = requiredRuntime;
            return this;
        }
        public java.util.List<String> getRequiredRuntime() {
            return this.requiredRuntime;
        }

        public GetAgentResponseBodyAgent setSkills(java.util.List<GetAgentResponseBodyAgentSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetAgentResponseBodyAgentSkills> getSkills() {
            return this.skills;
        }

        public GetAgentResponseBodyAgent setSystemPrompt(String systemPrompt) {
            this.systemPrompt = systemPrompt;
            return this;
        }
        public String getSystemPrompt() {
            return this.systemPrompt;
        }

        public GetAgentResponseBodyAgent setTools(java.util.List<GetAgentResponseBodyAgentTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetAgentResponseBodyAgentTools> getTools() {
            return this.tools;
        }

        public GetAgentResponseBodyAgent setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public GetAgentResponseBodyAgent setVisibilityScope(GetAgentResponseBodyAgentVisibilityScope visibilityScope) {
            this.visibilityScope = visibilityScope;
            return this;
        }
        public GetAgentResponseBodyAgentVisibilityScope getVisibilityScope() {
            return this.visibilityScope;
        }

    }

}
