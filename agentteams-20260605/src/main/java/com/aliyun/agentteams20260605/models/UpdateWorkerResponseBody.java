// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateWorkerResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public UpdateWorkerResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-XX-XX-XX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerResponseBody self = new UpdateWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWorkerResponseBody setData(UpdateWorkerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWorkerResponseBodyData getData() {
        return this.data;
    }

    public UpdateWorkerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateWorkerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateWorkerResponseBodyDataChannelsConfig extends TeaModel {
        /**
         * <p>The card template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-demo</p>
         */
        @NameInMap("CardTemplateId")
        public String cardTemplateId;

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cli-demo</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The extension configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>extension-demo</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>markdown</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The robot code.</p>
         * 
         * <strong>example:</strong>
         * <p>robot-demo</p>
         */
        @NameInMap("RobotCode")
        public String robotCode;

        /**
         * <p>Indicates whether the thinking process is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowThinking")
        public Boolean showThinking;

        /**
         * <p>Indicates whether tool invocations are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ShowToolCalls")
        public Boolean showToolCalls;

        /**
         * <p>Indicates whether streaming output is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StreamingEnabled")
        public Boolean streamingEnabled;

        public static UpdateWorkerResponseBodyDataChannelsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataChannelsConfig self = new UpdateWorkerResponseBodyDataChannelsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        public UpdateWorkerResponseBodyDataChannelsConfig setStreamingEnabled(Boolean streamingEnabled) {
            this.streamingEnabled = streamingEnabled;
            return this;
        }
        public Boolean getStreamingEnabled() {
            return this.streamingEnabled;
        }

    }

    public static class UpdateWorkerResponseBodyDataChannelsSecretStatus extends TeaModel {
        /**
         * <p>Indicates whether the client secret is set.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ClientSecret")
        public Boolean clientSecret;

        public static UpdateWorkerResponseBodyDataChannelsSecretStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataChannelsSecretStatus self = new UpdateWorkerResponseBodyDataChannelsSecretStatus();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataChannelsSecretStatus setClientSecret(Boolean clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Boolean getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class UpdateWorkerResponseBodyDataChannels extends TeaModel {
        /**
         * <p>The channel configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public UpdateWorkerResponseBodyDataChannelsConfig config;

        /**
         * <p>Indicates whether the channel is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The secret status.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SecretStatus")
        public UpdateWorkerResponseBodyDataChannelsSecretStatus secretStatus;

        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateWorkerResponseBodyDataChannels build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataChannels self = new UpdateWorkerResponseBodyDataChannels();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataChannels setConfig(UpdateWorkerResponseBodyDataChannelsConfig config) {
            this.config = config;
            return this;
        }
        public UpdateWorkerResponseBodyDataChannelsConfig getConfig() {
            return this.config;
        }

        public UpdateWorkerResponseBodyDataChannels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateWorkerResponseBodyDataChannels setSecretStatus(UpdateWorkerResponseBodyDataChannelsSecretStatus secretStatus) {
            this.secretStatus = secretStatus;
            return this;
        }
        public UpdateWorkerResponseBodyDataChannelsSecretStatus getSecretStatus() {
            return this.secretStatus;
        }

        public UpdateWorkerResponseBodyDataChannels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkerResponseBodyDataCredentials extends TeaModel {
        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateWorkerResponseBodyDataCredentials build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataCredentials self = new UpdateWorkerResponseBodyDataCredentials();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataCredentials setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateWorkerResponseBodyDataGroups extends TeaModel {
        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>team-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The group role.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The group type.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateWorkerResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataGroups self = new UpdateWorkerResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerResponseBodyDataGroups setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateWorkerResponseBodyDataGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkerResponseBodyDataLimitConfig extends TeaModel {
        /**
         * <p>The limit type.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        /**
         * <p>The period type.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        /**
         * <p>The usage limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("UsageLimit")
        public Long usageLimit;

        public static UpdateWorkerResponseBodyDataLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataLimitConfig self = new UpdateWorkerResponseBodyDataLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataLimitConfig setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateWorkerResponseBodyDataLimitConfig setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public UpdateWorkerResponseBodyDataLimitConfig setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class UpdateWorkerResponseBodyDataMcpServers extends TeaModel {
        /**
         * <p>The MCP server name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-server-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The MCP transport protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>sse</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
         * <p>The MCP server URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mcp-demo/mcp">https://mcp-demo/mcp</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static UpdateWorkerResponseBodyDataMcpServers build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataMcpServers self = new UpdateWorkerResponseBodyDataMcpServers();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerResponseBodyDataMcpServers setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public UpdateWorkerResponseBodyDataMcpServers setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateWorkerResponseBodyDataModel extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>dashscope</p>
         */
        @NameInMap("ModelProvider")
        public String modelProvider;

        public static UpdateWorkerResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataModel self = new UpdateWorkerResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateWorkerResponseBodyDataModel setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

    }

    public static class UpdateWorkerResponseBodyDataSkills extends TeaModel {
        /**
         * <p>The skill label.</p>
         * 
         * <strong>example:</strong>
         * <p>Code Review.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateWorkerResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataSkills self = new UpdateWorkerResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataSkills setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdateWorkerResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateWorkerResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The template label.</p>
         * 
         * <strong>example:</strong>
         * <p>Default template.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateWorkerResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyDataTemplate self = new UpdateWorkerResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyDataTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdateWorkerResponseBodyDataTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerResponseBodyDataTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateWorkerResponseBodyData extends TeaModel {
        /**
         * <p>The Agent runtime type.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwenpaw</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The Agents configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>agents-demo</p>
         */
        @NameInMap("Agents")
        public String agents;

        /**
         * <p>The list of channels.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Channels")
        public java.util.List<UpdateWorkerResponseBodyDataChannels> channels;

        /**
         * <p>The list of credential bindings.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Credentials")
        public java.util.List<UpdateWorkerResponseBodyDataCredentials> credentials;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The list of team groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Groups")
        public java.util.List<UpdateWorkerResponseBodyDataGroups> groups;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-demo</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The quota configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("LimitConfig")
        public UpdateWorkerResponseBodyDataLimitConfig limitConfig;

        /**
         * <p>The list of MCP servers.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("McpServers")
        public java.util.List<UpdateWorkerResponseBodyDataMcpServers> mcpServers;

        /**
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Model")
        public UpdateWorkerResponseBodyDataModel model;

        /**
         * <p>The Worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of skills.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Skills")
        public java.util.List<UpdateWorkerResponseBodyDataSkills> skills;

        /**
         * <p>The Soul configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>soul-demo</p>
         */
        @NameInMap("Soul")
        public String soul;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-13T10:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The Worker status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Template")
        public UpdateWorkerResponseBodyDataTemplate template;

        /**
         * <p>The Worker version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static UpdateWorkerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerResponseBodyData self = new UpdateWorkerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public UpdateWorkerResponseBodyData setAgents(String agents) {
            this.agents = agents;
            return this;
        }
        public String getAgents() {
            return this.agents;
        }

        public UpdateWorkerResponseBodyData setChannels(java.util.List<UpdateWorkerResponseBodyDataChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<UpdateWorkerResponseBodyDataChannels> getChannels() {
            return this.channels;
        }

        public UpdateWorkerResponseBodyData setCredentials(java.util.List<UpdateWorkerResponseBodyDataCredentials> credentials) {
            this.credentials = credentials;
            return this;
        }
        public java.util.List<UpdateWorkerResponseBodyDataCredentials> getCredentials() {
            return this.credentials;
        }

        public UpdateWorkerResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public UpdateWorkerResponseBodyData setGroups(java.util.List<UpdateWorkerResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<UpdateWorkerResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public UpdateWorkerResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateWorkerResponseBodyData setLimitConfig(UpdateWorkerResponseBodyDataLimitConfig limitConfig) {
            this.limitConfig = limitConfig;
            return this;
        }
        public UpdateWorkerResponseBodyDataLimitConfig getLimitConfig() {
            return this.limitConfig;
        }

        public UpdateWorkerResponseBodyData setMcpServers(java.util.List<UpdateWorkerResponseBodyDataMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<UpdateWorkerResponseBodyDataMcpServers> getMcpServers() {
            return this.mcpServers;
        }

        public UpdateWorkerResponseBodyData setModel(UpdateWorkerResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public UpdateWorkerResponseBodyDataModel getModel() {
            return this.model;
        }

        public UpdateWorkerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateWorkerResponseBodyData setSkills(java.util.List<UpdateWorkerResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateWorkerResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public UpdateWorkerResponseBodyData setSoul(String soul) {
            this.soul = soul;
            return this;
        }
        public String getSoul() {
            return this.soul;
        }

        public UpdateWorkerResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateWorkerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateWorkerResponseBodyData setTemplate(UpdateWorkerResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateWorkerResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public UpdateWorkerResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
