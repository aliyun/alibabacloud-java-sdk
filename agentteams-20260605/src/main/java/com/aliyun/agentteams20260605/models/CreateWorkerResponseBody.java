// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public CreateWorkerResponseBodyData data;

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

    public static CreateWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerResponseBody self = new CreateWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkerResponseBody setData(CreateWorkerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWorkerResponseBodyData getData() {
        return this.data;
    }

    public CreateWorkerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateWorkerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkerResponseBodyDataCredentials extends TeaModel {
        /**
         * <p>The credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateWorkerResponseBodyDataCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataCredentials self = new CreateWorkerResponseBodyDataCredentials();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataCredentials setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateWorkerResponseBodyDataGroups extends TeaModel {
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

        public static CreateWorkerResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataGroups self = new CreateWorkerResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerResponseBodyDataGroups setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateWorkerResponseBodyDataGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateWorkerResponseBodyDataLimitConfig extends TeaModel {
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

        public static CreateWorkerResponseBodyDataLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataLimitConfig self = new CreateWorkerResponseBodyDataLimitConfig();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataLimitConfig setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateWorkerResponseBodyDataLimitConfig setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public CreateWorkerResponseBodyDataLimitConfig setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class CreateWorkerResponseBodyDataMcpServers extends TeaModel {
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

        public static CreateWorkerResponseBodyDataMcpServers build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataMcpServers self = new CreateWorkerResponseBodyDataMcpServers();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerResponseBodyDataMcpServers setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public CreateWorkerResponseBodyDataMcpServers setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateWorkerResponseBodyDataModel extends TeaModel {
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

        public static CreateWorkerResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataModel self = new CreateWorkerResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateWorkerResponseBodyDataModel setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

    }

    public static class CreateWorkerResponseBodyDataSkills extends TeaModel {
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

        public static CreateWorkerResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataSkills self = new CreateWorkerResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataSkills setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWorkerResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateWorkerResponseBodyDataTemplate extends TeaModel {
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

        public static CreateWorkerResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyDataTemplate self = new CreateWorkerResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyDataTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateWorkerResponseBodyDataTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerResponseBodyDataTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateWorkerResponseBodyData extends TeaModel {
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
         * <p>The list of credential bindings.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Credentials")
        public java.util.List<CreateWorkerResponseBodyDataCredentials> credentials;

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
        public java.util.List<CreateWorkerResponseBodyDataGroups> groups;

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
        public CreateWorkerResponseBodyDataLimitConfig limitConfig;

        /**
         * <p>The list of MCP servers.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("McpServers")
        public java.util.List<CreateWorkerResponseBodyDataMcpServers> mcpServers;

        /**
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Model")
        public CreateWorkerResponseBodyDataModel model;

        /**
         * <p>The worker name.</p>
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
        public java.util.List<CreateWorkerResponseBodyDataSkills> skills;

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
         * <p>The worker status.</p>
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
        public CreateWorkerResponseBodyDataTemplate template;

        /**
         * <p>The Worker version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static CreateWorkerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkerResponseBodyData self = new CreateWorkerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWorkerResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CreateWorkerResponseBodyData setAgents(String agents) {
            this.agents = agents;
            return this;
        }
        public String getAgents() {
            return this.agents;
        }

        public CreateWorkerResponseBodyData setCredentials(java.util.List<CreateWorkerResponseBodyDataCredentials> credentials) {
            this.credentials = credentials;
            return this;
        }
        public java.util.List<CreateWorkerResponseBodyDataCredentials> getCredentials() {
            return this.credentials;
        }

        public CreateWorkerResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public CreateWorkerResponseBodyData setGroups(java.util.List<CreateWorkerResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<CreateWorkerResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public CreateWorkerResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateWorkerResponseBodyData setLimitConfig(CreateWorkerResponseBodyDataLimitConfig limitConfig) {
            this.limitConfig = limitConfig;
            return this;
        }
        public CreateWorkerResponseBodyDataLimitConfig getLimitConfig() {
            return this.limitConfig;
        }

        public CreateWorkerResponseBodyData setMcpServers(java.util.List<CreateWorkerResponseBodyDataMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<CreateWorkerResponseBodyDataMcpServers> getMcpServers() {
            return this.mcpServers;
        }

        public CreateWorkerResponseBodyData setModel(CreateWorkerResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public CreateWorkerResponseBodyDataModel getModel() {
            return this.model;
        }

        public CreateWorkerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkerResponseBodyData setSkills(java.util.List<CreateWorkerResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateWorkerResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public CreateWorkerResponseBodyData setSoul(String soul) {
            this.soul = soul;
            return this;
        }
        public String getSoul() {
            return this.soul;
        }

        public CreateWorkerResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateWorkerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateWorkerResponseBodyData setTemplate(CreateWorkerResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public CreateWorkerResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public CreateWorkerResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
