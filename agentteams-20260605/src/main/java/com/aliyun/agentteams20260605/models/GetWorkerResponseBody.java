// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerResponseBody extends TeaModel {
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
    public GetWorkerResponseBodyData data;

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
        /**
         * <p>Indicates whether the client secret has been set.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The channel configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public GetWorkerResponseBodyDataChannelsConfig config;

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
        public GetWorkerResponseBodyDataChannelsSecretStatus secretStatus;

        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
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
        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-demo</p>
         */
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
        /**
         * <p>The quota type.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        /**
         * <p>Indicates whether the quota is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OverLimit")
        public Boolean overLimit;

        /**
         * <p>The period type.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        /**
         * <p>The quota rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("RuleStatus")
        public String ruleStatus;

        /**
         * <p>The quota upper limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("UsageLimit")
        public Long usageLimit;

        /**
         * <p>The used amount.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
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
        /**
         * <p>Indicates whether the skill contains a skill.md file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasSkillMd")
        public Boolean hasSkillMd;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>search</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-demo</p>
         */
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
        /**
         * <p>The sub-Agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sub-Agent description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the sub-Agent contains an agents.md file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAgentsMd")
        public Boolean hasAgentsMd;

        /**
         * <p>The sub-Agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The skill list of the sub-Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Skills")
        public java.util.List<GetWorkerResponseBodyDataSubagentsSkills> skills;

        /**
         * <p>The source path.</p>
         * 
         * <strong>example:</strong>
         * <p>/workspace/sub</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        /**
         * <p>The sub-Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-demo</p>
         */
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
         * <p>The channel list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Channels")
        public java.util.List<GetWorkerResponseBodyDataChannels> channels;

        /**
         * <p>The credential binding list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Credentials")
        public java.util.List<GetWorkerResponseBodyDataCredentials> credentials;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The team group list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Groups")
        public java.util.List<GetWorkerResponseBodyDataGroups> groups;

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
        public GetWorkerResponseBodyDataLimitConfig limitConfig;

        /**
         * <p>The MCP server list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("McpServers")
        public java.util.List<GetWorkerResponseBodyDataMcpServers> mcpServers;

        /**
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Model")
        public GetWorkerResponseBodyDataModel model;

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
         * <p>The skill list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Skills")
        public java.util.List<GetWorkerResponseBodyDataSkills> skills;

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
         * <p>The sub-Agent list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Subagents")
        public java.util.List<GetWorkerResponseBodyDataSubagents> subagents;

        /**
         * <p>The template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Template")
        public GetWorkerResponseBodyDataTemplate template;

        /**
         * <p>The Worker version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
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
