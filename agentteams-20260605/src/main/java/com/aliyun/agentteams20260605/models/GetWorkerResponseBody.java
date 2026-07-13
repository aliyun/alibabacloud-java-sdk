// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWorkerResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerResponseBody self = new GetWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkerResponseBody setData(GetWorkerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkerResponseBodyData getData() {
        return this.data;
    }

    public GetWorkerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkerResponseBodyDataChannelsConfig extends TeaModel {
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

        public static GetWorkerResponseBodyDataChannelsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataChannelsConfig self = new GetWorkerResponseBodyDataChannelsConfig();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataChannelsConfig setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public GetWorkerResponseBodyDataChannelsConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetWorkerResponseBodyDataChannelsConfig setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetWorkerResponseBodyDataChannelsConfig setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public GetWorkerResponseBodyDataChannelsConfig setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public GetWorkerResponseBodyDataChannelsConfig setShowThinking(Boolean showThinking) {
            this.showThinking = showThinking;
            return this;
        }
        public Boolean getShowThinking() {
            return this.showThinking;
        }

        public GetWorkerResponseBodyDataChannelsConfig setShowToolCalls(Boolean showToolCalls) {
            this.showToolCalls = showToolCalls;
            return this;
        }
        public Boolean getShowToolCalls() {
            return this.showToolCalls;
        }

        public GetWorkerResponseBodyDataChannelsConfig setStreamingEnabled(Boolean streamingEnabled) {
            this.streamingEnabled = streamingEnabled;
            return this;
        }
        public Boolean getStreamingEnabled() {
            return this.streamingEnabled;
        }

    }

    public static class GetWorkerResponseBodyDataChannelsSecretStatus extends TeaModel {
        @NameInMap("ClientSecret")
        public Boolean clientSecret;

        public static GetWorkerResponseBodyDataChannelsSecretStatus build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataChannelsSecretStatus self = new GetWorkerResponseBodyDataChannelsSecretStatus();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataChannelsSecretStatus setClientSecret(Boolean clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Boolean getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class GetWorkerResponseBodyDataChannels extends TeaModel {
        @NameInMap("Config")
        public GetWorkerResponseBodyDataChannelsConfig config;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("SecretStatus")
        public GetWorkerResponseBodyDataChannelsSecretStatus secretStatus;

        @NameInMap("Type")
        public String type;

        public static GetWorkerResponseBodyDataChannels build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataChannels self = new GetWorkerResponseBodyDataChannels();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataChannels setConfig(GetWorkerResponseBodyDataChannelsConfig config) {
            this.config = config;
            return this;
        }
        public GetWorkerResponseBodyDataChannelsConfig getConfig() {
            return this.config;
        }

        public GetWorkerResponseBodyDataChannels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetWorkerResponseBodyDataChannels setSecretStatus(GetWorkerResponseBodyDataChannelsSecretStatus secretStatus) {
            this.secretStatus = secretStatus;
            return this;
        }
        public GetWorkerResponseBodyDataChannelsSecretStatus getSecretStatus() {
            return this.secretStatus;
        }

        public GetWorkerResponseBodyDataChannels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkerResponseBodyDataCredentials extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetWorkerResponseBodyDataCredentials build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataCredentials self = new GetWorkerResponseBodyDataCredentials();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataCredentials setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetWorkerResponseBodyDataGroups extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("Type")
        public String type;

        public static GetWorkerResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataGroups self = new GetWorkerResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyDataGroups setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetWorkerResponseBodyDataGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkerResponseBodyDataLimitConfig extends TeaModel {
        @NameInMap("LimitType")
        public String limitType;

        @NameInMap("OverLimit")
        public Boolean overLimit;

        @NameInMap("PeriodType")
        public String periodType;

        @NameInMap("RuleStatus")
        public String ruleStatus;

        @NameInMap("UsageLimit")
        public Long usageLimit;

        @NameInMap("UsedAmount")
        public Long usedAmount;

        public static GetWorkerResponseBodyDataLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataLimitConfig self = new GetWorkerResponseBodyDataLimitConfig();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataLimitConfig setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public GetWorkerResponseBodyDataLimitConfig setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public GetWorkerResponseBodyDataLimitConfig setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public GetWorkerResponseBodyDataLimitConfig setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public GetWorkerResponseBodyDataLimitConfig setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public GetWorkerResponseBodyDataLimitConfig setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class GetWorkerResponseBodyDataMcpServers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Transport")
        public String transport;

        @NameInMap("Url")
        public String url;

        public static GetWorkerResponseBodyDataMcpServers build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataMcpServers self = new GetWorkerResponseBodyDataMcpServers();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyDataMcpServers setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public GetWorkerResponseBodyDataMcpServers setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetWorkerResponseBodyDataModel extends TeaModel {
        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelProvider")
        public String modelProvider;

        public static GetWorkerResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataModel self = new GetWorkerResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetWorkerResponseBodyDataModel setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

    }

    public static class GetWorkerResponseBodyDataSkills extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static GetWorkerResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataSkills self = new GetWorkerResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataSkills setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWorkerResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetWorkerResponseBodyDataSubagentsSkills extends TeaModel {
        @NameInMap("HasSkillMd")
        public Boolean hasSkillMd;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillId")
        public String skillId;

        public static GetWorkerResponseBodyDataSubagentsSkills build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataSubagentsSkills self = new GetWorkerResponseBodyDataSubagentsSkills();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataSubagentsSkills setHasSkillMd(Boolean hasSkillMd) {
            this.hasSkillMd = hasSkillMd;
            return this;
        }
        public Boolean getHasSkillMd() {
            return this.hasSkillMd;
        }

        public GetWorkerResponseBodyDataSubagentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyDataSubagentsSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

    }

    public static class GetWorkerResponseBodyDataSubagents extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("HasAgentsMd")
        public Boolean hasAgentsMd;

        @NameInMap("Name")
        public String name;

        @NameInMap("Skills")
        public java.util.List<GetWorkerResponseBodyDataSubagentsSkills> skills;

        @NameInMap("SourcePath")
        public String sourcePath;

        @NameInMap("SubagentId")
        public String subagentId;

        public static GetWorkerResponseBodyDataSubagents build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataSubagents self = new GetWorkerResponseBodyDataSubagents();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataSubagents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkerResponseBodyDataSubagents setHasAgentsMd(Boolean hasAgentsMd) {
            this.hasAgentsMd = hasAgentsMd;
            return this;
        }
        public Boolean getHasAgentsMd() {
            return this.hasAgentsMd;
        }

        public GetWorkerResponseBodyDataSubagents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyDataSubagents setSkills(java.util.List<GetWorkerResponseBodyDataSubagentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataSubagentsSkills> getSkills() {
            return this.skills;
        }

        public GetWorkerResponseBodyDataSubagents setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetWorkerResponseBodyDataSubagents setSubagentId(String subagentId) {
            this.subagentId = subagentId;
            return this;
        }
        public String getSubagentId() {
            return this.subagentId;
        }

    }

    public static class GetWorkerResponseBodyDataTemplate extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static GetWorkerResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyDataTemplate self = new GetWorkerResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyDataTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWorkerResponseBodyDataTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyDataTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetWorkerResponseBodyData extends TeaModel {
        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("Agents")
        public String agents;

        @NameInMap("Channels")
        public java.util.List<GetWorkerResponseBodyDataChannels> channels;

        @NameInMap("Credentials")
        public java.util.List<GetWorkerResponseBodyDataCredentials> credentials;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Groups")
        public java.util.List<GetWorkerResponseBodyDataGroups> groups;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LimitConfig")
        public GetWorkerResponseBodyDataLimitConfig limitConfig;

        @NameInMap("McpServers")
        public java.util.List<GetWorkerResponseBodyDataMcpServers> mcpServers;

        @NameInMap("Model")
        public GetWorkerResponseBodyDataModel model;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Skills")
        public java.util.List<GetWorkerResponseBodyDataSkills> skills;

        @NameInMap("Soul")
        public String soul;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Subagents")
        public java.util.List<GetWorkerResponseBodyDataSubagents> subagents;

        @NameInMap("Template")
        public GetWorkerResponseBodyDataTemplate template;

        @NameInMap("VersionCode")
        public String versionCode;

        public static GetWorkerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerResponseBodyData self = new GetWorkerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkerResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public GetWorkerResponseBodyData setAgents(String agents) {
            this.agents = agents;
            return this;
        }
        public String getAgents() {
            return this.agents;
        }

        public GetWorkerResponseBodyData setChannels(java.util.List<GetWorkerResponseBodyDataChannels> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataChannels> getChannels() {
            return this.channels;
        }

        public GetWorkerResponseBodyData setCredentials(java.util.List<GetWorkerResponseBodyDataCredentials> credentials) {
            this.credentials = credentials;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataCredentials> getCredentials() {
            return this.credentials;
        }

        public GetWorkerResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetWorkerResponseBodyData setGroups(java.util.List<GetWorkerResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public GetWorkerResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkerResponseBodyData setLimitConfig(GetWorkerResponseBodyDataLimitConfig limitConfig) {
            this.limitConfig = limitConfig;
            return this;
        }
        public GetWorkerResponseBodyDataLimitConfig getLimitConfig() {
            return this.limitConfig;
        }

        public GetWorkerResponseBodyData setMcpServers(java.util.List<GetWorkerResponseBodyDataMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataMcpServers> getMcpServers() {
            return this.mcpServers;
        }

        public GetWorkerResponseBodyData setModel(GetWorkerResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public GetWorkerResponseBodyDataModel getModel() {
            return this.model;
        }

        public GetWorkerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkerResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetWorkerResponseBodyData setSkills(java.util.List<GetWorkerResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public GetWorkerResponseBodyData setSoul(String soul) {
            this.soul = soul;
            return this;
        }
        public String getSoul() {
            return this.soul;
        }

        public GetWorkerResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetWorkerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkerResponseBodyData setSubagents(java.util.List<GetWorkerResponseBodyDataSubagents> subagents) {
            this.subagents = subagents;
            return this;
        }
        public java.util.List<GetWorkerResponseBodyDataSubagents> getSubagents() {
            return this.subagents;
        }

        public GetWorkerResponseBodyData setTemplate(GetWorkerResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public GetWorkerResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public GetWorkerResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
