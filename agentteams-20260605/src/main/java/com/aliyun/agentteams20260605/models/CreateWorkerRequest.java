// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerRequest extends TeaModel {
    @NameInMap("AgentType")
    public String agentType;

    @NameInMap("Agents")
    public String agents;

    @NameInMap("Channels")
    public java.util.List<CreateWorkerRequestChannels> channels;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Credentials")
    public java.util.List<CreateWorkerRequestCredentials> credentials;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("Groups")
    public java.util.List<CreateWorkerRequestGroups> groups;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LimitConfig")
    public CreateWorkerRequestLimitConfig limitConfig;

    @NameInMap("McpServers")
    public java.util.List<CreateWorkerRequestMcpServers> mcpServers;

    @NameInMap("Model")
    public CreateWorkerRequestModel model;

    @NameInMap("Name")
    public String name;

    @NameInMap("Skills")
    public java.util.List<CreateWorkerRequestSkills> skills;

    @NameInMap("Soul")
    public String soul;

    @NameInMap("Subagents")
    public java.util.List<CreateWorkerRequestSubagents> subagents;

    @NameInMap("Template")
    public CreateWorkerRequestTemplate template;

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
        @NameInMap("CardTemplateId")
        public String cardTemplateId;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("MessageType")
        public String messageType;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("ShowThinking")
        public Boolean showThinking;

        @NameInMap("ShowToolCalls")
        public Boolean showToolCalls;

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
        @NameInMap("Config")
        public CreateWorkerRequestChannelsConfig config;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Secrets")
        public CreateWorkerRequestChannelsSecrets secrets;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

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
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        /**
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

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
        @NameInMap("ModelName")
        public String modelName;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Agents")
        public String agents;

        @NameInMap("Skills")
        public java.util.List<CreateWorkerRequestSubagentsSkills> skills;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
