// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateWorkerResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("LimitType")
        public String limitType;

        @NameInMap("PeriodType")
        public String periodType;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Transport")
        public String transport;

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
        @NameInMap("ModelName")
        public String modelName;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("Agents")
        public String agents;

        @NameInMap("Credentials")
        public java.util.List<CreateWorkerResponseBodyDataCredentials> credentials;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Groups")
        public java.util.List<CreateWorkerResponseBodyDataGroups> groups;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LimitConfig")
        public CreateWorkerResponseBodyDataLimitConfig limitConfig;

        @NameInMap("McpServers")
        public java.util.List<CreateWorkerResponseBodyDataMcpServers> mcpServers;

        @NameInMap("Model")
        public CreateWorkerResponseBodyDataModel model;

        @NameInMap("Name")
        public String name;

        @NameInMap("Skills")
        public java.util.List<CreateWorkerResponseBodyDataSkills> skills;

        @NameInMap("Soul")
        public String soul;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Template")
        public CreateWorkerResponseBodyDataTemplate template;

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
