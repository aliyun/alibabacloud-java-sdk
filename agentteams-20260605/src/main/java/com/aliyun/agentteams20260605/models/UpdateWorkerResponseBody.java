// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateWorkerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateWorkerResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Config")
        public UpdateWorkerResponseBodyDataChannelsConfig config;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("SecretStatus")
        public UpdateWorkerResponseBodyDataChannelsSecretStatus secretStatus;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("LimitType")
        public String limitType;

        @NameInMap("PeriodType")
        public String periodType;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Transport")
        public String transport;

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
        @NameInMap("ModelName")
        public String modelName;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("Agents")
        public String agents;

        @NameInMap("Channels")
        public java.util.List<UpdateWorkerResponseBodyDataChannels> channels;

        @NameInMap("Credentials")
        public java.util.List<UpdateWorkerResponseBodyDataCredentials> credentials;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Groups")
        public java.util.List<UpdateWorkerResponseBodyDataGroups> groups;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LimitConfig")
        public UpdateWorkerResponseBodyDataLimitConfig limitConfig;

        @NameInMap("McpServers")
        public java.util.List<UpdateWorkerResponseBodyDataMcpServers> mcpServers;

        @NameInMap("Model")
        public UpdateWorkerResponseBodyDataModel model;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Skills")
        public java.util.List<UpdateWorkerResponseBodyDataSkills> skills;

        @NameInMap("Soul")
        public String soul;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Template")
        public UpdateWorkerResponseBodyDataTemplate template;

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
