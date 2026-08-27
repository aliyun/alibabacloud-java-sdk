// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerRequest extends TeaModel {
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
     * <p>The list of channel configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Channels")
    public java.util.List<CreateWorkerRequestChannels> channels;

    /**
     * <p>The idempotency token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-demo</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of credential bindings.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Credentials")
    public java.util.List<CreateWorkerRequestCredentials> credentials;

    /**
     * <p>The deployment type.</p>
     * 
     * <strong>example:</strong>
     * <p>SelfHosted</p>
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
    public java.util.List<CreateWorkerRequestGroups> groups;

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
    public CreateWorkerRequestLimitConfig limitConfig;

    /**
     * <p>The list of MCP servers.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("McpServers")
    public java.util.List<CreateWorkerRequestMcpServers> mcpServers;

    /**
     * <p>The model configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Model")
    public CreateWorkerRequestModel model;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of skills.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Skills")
    public java.util.List<CreateWorkerRequestSkills> skills;

    /**
     * <p>The Soul configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>soul-demo</p>
     */
    @NameInMap("Soul")
    public String soul;

    /**
     * <p>The list of sub-agents.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Subagents")
    public java.util.List<CreateWorkerRequestSubagents> subagents;

    /**
     * <p>The template configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Template")
    public CreateWorkerRequestTemplate template;

    /**
     * <p>The Worker version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static CreateWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerRequest self = new CreateWorkerRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkerRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public CreateWorkerRequest setAgents(String agents) {
        this.agents = agents;
        return this;
    }
    public String getAgents() {
        return this.agents;
    }

    public CreateWorkerRequest setChannels(java.util.List<CreateWorkerRequestChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<CreateWorkerRequestChannels> getChannels() {
        return this.channels;
    }

    public CreateWorkerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWorkerRequest setCredentials(java.util.List<CreateWorkerRequestCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.List<CreateWorkerRequestCredentials> getCredentials() {
        return this.credentials;
    }

    public CreateWorkerRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateWorkerRequest setGroups(java.util.List<CreateWorkerRequestGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<CreateWorkerRequestGroups> getGroups() {
        return this.groups;
    }

    public CreateWorkerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateWorkerRequest setLimitConfig(CreateWorkerRequestLimitConfig limitConfig) {
        this.limitConfig = limitConfig;
        return this;
    }
    public CreateWorkerRequestLimitConfig getLimitConfig() {
        return this.limitConfig;
    }

    public CreateWorkerRequest setMcpServers(java.util.List<CreateWorkerRequestMcpServers> mcpServers) {
        this.mcpServers = mcpServers;
        return this;
    }
    public java.util.List<CreateWorkerRequestMcpServers> getMcpServers() {
        return this.mcpServers;
    }

    public CreateWorkerRequest setModel(CreateWorkerRequestModel model) {
        this.model = model;
        return this;
    }
    public CreateWorkerRequestModel getModel() {
        return this.model;
    }

    public CreateWorkerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkerRequest setSkills(java.util.List<CreateWorkerRequestSkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<CreateWorkerRequestSkills> getSkills() {
        return this.skills;
    }

    public CreateWorkerRequest setSoul(String soul) {
        this.soul = soul;
        return this;
    }
    public String getSoul() {
        return this.soul;
    }

    public CreateWorkerRequest setSubagents(java.util.List<CreateWorkerRequestSubagents> subagents) {
        this.subagents = subagents;
        return this;
    }
    public java.util.List<CreateWorkerRequestSubagents> getSubagents() {
        return this.subagents;
    }

    public CreateWorkerRequest setTemplate(CreateWorkerRequestTemplate template) {
        this.template = template;
        return this;
    }
    public CreateWorkerRequestTemplate getTemplate() {
        return this.template;
    }

    public CreateWorkerRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public static class CreateWorkerRequestChannelsConfig extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-demo</p>
         */
        @NameInMap("CardTemplateId")
        public String cardTemplateId;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>cli-demo</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>extension-demo</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>markdown</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>robot-demo</p>
         */
        @NameInMap("RobotCode")
        public String robotCode;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowThinking")
        public Boolean showThinking;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ShowToolCalls")
        public Boolean showToolCalls;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StreamingEnabled")
        public Boolean streamingEnabled;

        public static CreateWorkerRequestChannelsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestChannelsConfig self = new CreateWorkerRequestChannelsConfig();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestChannelsConfig setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public CreateWorkerRequestChannelsConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateWorkerRequestChannelsConfig setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CreateWorkerRequestChannelsConfig setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public CreateWorkerRequestChannelsConfig setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public CreateWorkerRequestChannelsConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public CreateWorkerRequestChannelsConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        public CreateWorkerRequestChannelsConfig setStreamingEnabled(Boolean streamingEnabled) {
            this.streamingEnabled = streamingEnabled;
            return this;
        }
        public Boolean getStreamingEnabled() {
            return this.streamingEnabled;
        }

    }

    public static class CreateWorkerRequestChannelsSecrets extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>secret-demo</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static CreateWorkerRequestChannelsSecrets build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestChannelsSecrets self = new CreateWorkerRequestChannelsSecrets();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestChannelsSecrets setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class CreateWorkerRequestChannels extends TeaModel {
        /**
         * <p>The channel configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public CreateWorkerRequestChannelsConfig config;

        /**
         * <p>Specifies whether the channel is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The channel secrets.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Secrets")
        public CreateWorkerRequestChannelsSecrets secrets;

        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateWorkerRequestChannels build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestChannels self = new CreateWorkerRequestChannels();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestChannels setConfig(CreateWorkerRequestChannelsConfig config) {
            this.config = config;
            return this;
        }
        public CreateWorkerRequestChannelsConfig getConfig() {
            return this.config;
        }

        public CreateWorkerRequestChannels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateWorkerRequestChannels setSecrets(CreateWorkerRequestChannelsSecrets secrets) {
            this.secrets = secrets;
            return this;
        }
        public CreateWorkerRequestChannelsSecrets getSecrets() {
            return this.secrets;
        }

        public CreateWorkerRequestChannels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateWorkerRequestCredentials extends TeaModel {
        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateWorkerRequestCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestCredentials self = new CreateWorkerRequestCredentials();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestCredentials setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateWorkerRequestGroups extends TeaModel {
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

        public static CreateWorkerRequestGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestGroups self = new CreateWorkerRequestGroups();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerRequestGroups setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateWorkerRequestGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateWorkerRequestLimitConfig extends TeaModel {
        /**
         * <p>The quota type.</p>
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
         * <p>The quota limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("UsageLimit")
        public Long usageLimit;

        public static CreateWorkerRequestLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestLimitConfig self = new CreateWorkerRequestLimitConfig();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestLimitConfig setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateWorkerRequestLimitConfig setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public CreateWorkerRequestLimitConfig setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class CreateWorkerRequestMcpServers extends TeaModel {
        /**
         * <p>The MCP server name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-server-demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateWorkerRequestMcpServers build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestMcpServers self = new CreateWorkerRequestMcpServers();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateWorkerRequestModel extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ModelProvider")
        public String modelProvider;

        public static CreateWorkerRequestModel build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestModel self = new CreateWorkerRequestModel();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateWorkerRequestModel setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

    }

    public static class CreateWorkerRequestSkills extends TeaModel {
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

        public static CreateWorkerRequestSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestSkills self = new CreateWorkerRequestSkills();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestSkills setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWorkerRequestSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerRequestSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateWorkerRequestSubagentsSkills extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>Label.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateWorkerRequestSubagentsSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestSubagentsSkills self = new CreateWorkerRequestSubagentsSkills();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestSubagentsSkills setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWorkerRequestSubagentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerRequestSubagentsSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateWorkerRequestSubagents extends TeaModel {
        /**
         * <p>The sub-agent configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>agents-demo</p>
         */
        @NameInMap("Agents")
        public String agents;

        /**
         * <p>The list of sub-agent skills.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Skills")
        public java.util.List<CreateWorkerRequestSubagentsSkills> skills;

        /**
         * <p>The sub-agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-demo</p>
         */
        @NameInMap("SubagentId")
        public String subagentId;

        public static CreateWorkerRequestSubagents build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestSubagents self = new CreateWorkerRequestSubagents();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestSubagents setAgents(String agents) {
            this.agents = agents;
            return this;
        }
        public String getAgents() {
            return this.agents;
        }

        public CreateWorkerRequestSubagents setSkills(java.util.List<CreateWorkerRequestSubagentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateWorkerRequestSubagentsSkills> getSkills() {
            return this.skills;
        }

        public CreateWorkerRequestSubagents setSubagentId(String subagentId) {
            this.subagentId = subagentId;
            return this;
        }
        public String getSubagentId() {
            return this.subagentId;
        }

    }

    public static class CreateWorkerRequestTemplate extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>Label.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateWorkerRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerRequestTemplate self = new CreateWorkerRequestTemplate();
            return TeaModel.build(map, self);
        }

        public CreateWorkerRequestTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWorkerRequestTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerRequestTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
