// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateWorkerRequest extends TeaModel {
    @NameInMap("Agents")
    public String agents;

    @NameInMap("Channels")
    public java.util.List<UpdateWorkerRequestChannels> channels;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Credentials")
    public java.util.List<UpdateWorkerRequestCredentials> credentials;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LimitConfig")
    public UpdateWorkerRequestLimitConfig limitConfig;

    @NameInMap("McpServers")
    public java.util.List<UpdateWorkerRequestMcpServers> mcpServers;

    @NameInMap("Model")
    public UpdateWorkerRequestModel model;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Skills")
    public java.util.List<UpdateWorkerRequestSkills> skills;

    @NameInMap("Soul")
    public String soul;

    @NameInMap("Template")
    public UpdateWorkerRequestTemplate template;

    @NameInMap("VersionCode")
    public String versionCode;

    public static UpdateWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerRequest self = new UpdateWorkerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerRequest setAgents(String agents) {
        this.agents = agents;
        return this;
    }
    public String getAgents() {
        return this.agents;
    }

    public UpdateWorkerRequest setChannels(java.util.List<UpdateWorkerRequestChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<UpdateWorkerRequestChannels> getChannels() {
        return this.channels;
    }

    public UpdateWorkerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateWorkerRequest setCredentials(java.util.List<UpdateWorkerRequestCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.List<UpdateWorkerRequestCredentials> getCredentials() {
        return this.credentials;
    }

    public UpdateWorkerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWorkerRequest setLimitConfig(UpdateWorkerRequestLimitConfig limitConfig) {
        this.limitConfig = limitConfig;
        return this;
    }
    public UpdateWorkerRequestLimitConfig getLimitConfig() {
        return this.limitConfig;
    }

    public UpdateWorkerRequest setMcpServers(java.util.List<UpdateWorkerRequestMcpServers> mcpServers) {
        this.mcpServers = mcpServers;
        return this;
    }
    public java.util.List<UpdateWorkerRequestMcpServers> getMcpServers() {
        return this.mcpServers;
    }

    public UpdateWorkerRequest setModel(UpdateWorkerRequestModel model) {
        this.model = model;
        return this;
    }
    public UpdateWorkerRequestModel getModel() {
        return this.model;
    }

    public UpdateWorkerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkerRequest setSkills(java.util.List<UpdateWorkerRequestSkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<UpdateWorkerRequestSkills> getSkills() {
        return this.skills;
    }

    public UpdateWorkerRequest setSoul(String soul) {
        this.soul = soul;
        return this;
    }
    public String getSoul() {
        return this.soul;
    }

    public UpdateWorkerRequest setTemplate(UpdateWorkerRequestTemplate template) {
        this.template = template;
        return this;
    }
    public UpdateWorkerRequestTemplate getTemplate() {
        return this.template;
    }

    public UpdateWorkerRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public static class UpdateWorkerRequestChannelsConfig extends TeaModel {
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

        public static UpdateWorkerRequestChannelsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestChannelsConfig self = new UpdateWorkerRequestChannelsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestChannelsConfig setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public UpdateWorkerRequestChannelsConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateWorkerRequestChannelsConfig setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateWorkerRequestChannelsConfig setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public UpdateWorkerRequestChannelsConfig setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UpdateWorkerRequestChannelsConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public UpdateWorkerRequestChannelsConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        public UpdateWorkerRequestChannelsConfig setStreamingEnabled(Boolean streamingEnabled) {
            this.streamingEnabled = streamingEnabled;
            return this;
        }
        public Boolean getStreamingEnabled() {
            return this.streamingEnabled;
        }

    }

    public static class UpdateWorkerRequestChannelsSecrets extends TeaModel {
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static UpdateWorkerRequestChannelsSecrets build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestChannelsSecrets self = new UpdateWorkerRequestChannelsSecrets();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestChannelsSecrets setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class UpdateWorkerRequestChannels extends TeaModel {
        @NameInMap("Config")
        public UpdateWorkerRequestChannelsConfig config;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Secrets")
        public UpdateWorkerRequestChannelsSecrets secrets;

        @NameInMap("Type")
        public String type;

        public static UpdateWorkerRequestChannels build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestChannels self = new UpdateWorkerRequestChannels();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestChannels setConfig(UpdateWorkerRequestChannelsConfig config) {
            this.config = config;
            return this;
        }
        public UpdateWorkerRequestChannelsConfig getConfig() {
            return this.config;
        }

        public UpdateWorkerRequestChannels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateWorkerRequestChannels setSecrets(UpdateWorkerRequestChannelsSecrets secrets) {
            this.secrets = secrets;
            return this;
        }
        public UpdateWorkerRequestChannelsSecrets getSecrets() {
            return this.secrets;
        }

        public UpdateWorkerRequestChannels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkerRequestCredentials extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static UpdateWorkerRequestCredentials build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestCredentials self = new UpdateWorkerRequestCredentials();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestCredentials setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateWorkerRequestLimitConfig extends TeaModel {
        @NameInMap("LimitType")
        public String limitType;

        @NameInMap("PeriodType")
        public String periodType;

        @NameInMap("UsageLimit")
        public Long usageLimit;

        public static UpdateWorkerRequestLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestLimitConfig self = new UpdateWorkerRequestLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestLimitConfig setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateWorkerRequestLimitConfig setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public UpdateWorkerRequestLimitConfig setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class UpdateWorkerRequestMcpServers extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static UpdateWorkerRequestMcpServers build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestMcpServers self = new UpdateWorkerRequestMcpServers();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateWorkerRequestModel extends TeaModel {
        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelProvider")
        public String modelProvider;

        public static UpdateWorkerRequestModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestModel self = new UpdateWorkerRequestModel();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateWorkerRequestModel setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

    }

    public static class UpdateWorkerRequestSkills extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static UpdateWorkerRequestSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestSkills self = new UpdateWorkerRequestSkills();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestSkills setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdateWorkerRequestSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerRequestSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateWorkerRequestTemplate extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static UpdateWorkerRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkerRequestTemplate self = new UpdateWorkerRequestTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateWorkerRequestTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public UpdateWorkerRequestTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkerRequestTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
