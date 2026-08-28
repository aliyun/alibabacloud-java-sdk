// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The information about the external agent after creation.</p>
     */
    @NameInMap("data")
    public CreateExternalAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result message of the request processing.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateExternalAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentResponseBody self = new CreateExternalAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateExternalAgentResponseBody setData(CreateExternalAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateExternalAgentResponseBodyData getData() {
        return this.data;
    }

    public CreateExternalAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateExternalAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExternalAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExternalAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateExternalAgentResponseBodyDataEffectiveResult extends TeaModel {
        /**
         * <p>The user ID of the agent in Matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>@agent-1:matrix.example.com</p>
         */
        @NameInMap("matrixUserId")
        public String matrixUserId;

        /**
         * <p>The Matrix personal room ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>!room:matrix.example.com</p>
         */
        @NameInMap("personalRoomId")
        public String personalRoomId;

        /**
         * <p>The acceptance status of the runtime for the current request version.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCEPTED</p>
         */
        @NameInMap("runtimeAcceptStatus")
        public String runtimeAcceptStatus;

        /**
         * <p>The runtime instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime-123</p>
         */
        @NameInMap("runtimeId")
        public String runtimeId;

        /**
         * <p>The runtime request version number.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("runtimeRequestVersion")
        public Long runtimeRequestVersion;

        /**
         * <p>The storage prefix of the agent in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agents/agent-1</p>
         */
        @NameInMap("workspacePrefix")
        public String workspacePrefix;

        public static CreateExternalAgentResponseBodyDataEffectiveResult build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataEffectiveResult self = new CreateExternalAgentResponseBodyDataEffectiveResult();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataEffectiveResult setMatrixUserId(String matrixUserId) {
            this.matrixUserId = matrixUserId;
            return this;
        }
        public String getMatrixUserId() {
            return this.matrixUserId;
        }

        public CreateExternalAgentResponseBodyDataEffectiveResult setPersonalRoomId(String personalRoomId) {
            this.personalRoomId = personalRoomId;
            return this;
        }
        public String getPersonalRoomId() {
            return this.personalRoomId;
        }

        public CreateExternalAgentResponseBodyDataEffectiveResult setRuntimeAcceptStatus(String runtimeAcceptStatus) {
            this.runtimeAcceptStatus = runtimeAcceptStatus;
            return this;
        }
        public String getRuntimeAcceptStatus() {
            return this.runtimeAcceptStatus;
        }

        public CreateExternalAgentResponseBodyDataEffectiveResult setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public CreateExternalAgentResponseBodyDataEffectiveResult setRuntimeRequestVersion(Long runtimeRequestVersion) {
            this.runtimeRequestVersion = runtimeRequestVersion;
            return this;
        }
        public Long getRuntimeRequestVersion() {
            return this.runtimeRequestVersion;
        }

        public CreateExternalAgentResponseBodyDataEffectiveResult setWorkspacePrefix(String workspacePrefix) {
            this.workspacePrefix = workspacePrefix;
            return this;
        }
        public String getWorkspacePrefix() {
            return this.workspacePrefix;
        }

    }

    public static class CreateExternalAgentResponseBodyDataExternalAgentStatus extends TeaModel {
        /**
         * <p>The heartbeat status. ONLINE indicates that the most recent heartbeat has not exceeded the configured timeout threshold. STALE indicates that the heartbeat has timed out. UNKNOWN indicates that the heartbeat is missing or has an invalid format. Valid values:</p>
         * <ul>
         * <li>ONLINE: Online.</li>
         * <li>STALE: Heartbeat expired.</li>
         * <li>UNKNOWN: Unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("heartbeatStatus")
        public String heartbeatStatus;

        /**
         * <p>The most recent active time of the external agent in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("lastActiveAt")
        public String lastActiveAt;

        /**
         * <p>The most recent heartbeat time of the external agent in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("lastHeartbeat")
        public String lastHeartbeat;

        /**
         * <p>The local IP address reported by the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.42</p>
         */
        @NameInMap("localIP")
        public String localIP;

        /**
         * <p>The runtime type reported by the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>qwenpaw</p>
         */
        @NameInMap("runtime")
        public String runtime;

        public static CreateExternalAgentResponseBodyDataExternalAgentStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataExternalAgentStatus self = new CreateExternalAgentResponseBodyDataExternalAgentStatus();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataExternalAgentStatus setHeartbeatStatus(String heartbeatStatus) {
            this.heartbeatStatus = heartbeatStatus;
            return this;
        }
        public String getHeartbeatStatus() {
            return this.heartbeatStatus;
        }

        public CreateExternalAgentResponseBodyDataExternalAgentStatus setLastActiveAt(String lastActiveAt) {
            this.lastActiveAt = lastActiveAt;
            return this;
        }
        public String getLastActiveAt() {
            return this.lastActiveAt;
        }

        public CreateExternalAgentResponseBodyDataExternalAgentStatus setLastHeartbeat(String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }
        public String getLastHeartbeat() {
            return this.lastHeartbeat;
        }

        public CreateExternalAgentResponseBodyDataExternalAgentStatus setLocalIP(String localIP) {
            this.localIP = localIP;
            return this;
        }
        public String getLocalIP() {
            return this.localIP;
        }

        public CreateExternalAgentResponseBodyDataExternalAgentStatus setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

    }

    public static class CreateExternalAgentResponseBodyDataModel extends TeaModel {
        /**
         * <p>The model connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("modelConnectionId")
        public String modelConnectionId;

        /**
         * <p>The upstream model name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        public static CreateExternalAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataModel self = new CreateExternalAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public CreateExternalAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class CreateExternalAgentResponseBodyDataSkills extends TeaModel {
        /**
         * <p>The skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-analysis</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateExternalAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataSkills self = new CreateExternalAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateExternalAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
        /**
         * <p>The name of the template in AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-template</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the template in AI Registry.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateExternalAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataTemplateAiRegistry self = new CreateExternalAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateExternalAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public CreateExternalAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static CreateExternalAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataTemplate self = new CreateExternalAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataTemplate setAiRegistry(CreateExternalAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public CreateExternalAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class CreateExternalAgentResponseBodyDataTools extends TeaModel {
        /**
         * <p>The tool name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-reviewer</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tool type. Valid values:</p>
         * <ul>
         * <li>MCP: MCP tool.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateExternalAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataTools self = new CreateExternalAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateExternalAgentResponseBodyData extends TeaModel {
        /**
         * <p>The external agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The description of the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>A code review agent running in the user environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The runtime result corresponding to the currently effective specification.</p>
         */
        @NameInMap("effectiveResult")
        public CreateExternalAgentResponseBodyDataEffectiveResult effectiveResult;

        /**
         * <p>The currently effective specification version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("effectiveSpecVersion")
        public Long effectiveSpecVersion;

        /**
         * <p>The runtime status information reported by the external agent.</p>
         */
        @NameInMap("externalAgentStatus")
        public CreateExternalAgentResponseBodyDataExternalAgentStatus externalAgentStatus;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The latest specification version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The processing status of the latest specification version. Valid values:</p>
         * <ul>
         * <li>pending: Pending processing.</li>
         * <li>processing: Being processed.</li>
         * <li>waiting_retry: Waiting for retry.</li>
         * <li>succeeded: Succeeded.</li>
         * <li>failed: Failed.</li>
         * <li>superseded: Superseded by a newer version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        /**
         * <p>The model configuration. This parameter is available only when modelSource is set to PLATFORM.</p>
         */
        @NameInMap("model")
        public CreateExternalAgentResponseBodyDataModel model;

        /**
         * <p>The source of the model configuration. Valid values:</p>
         * <ul>
         * <li>PLATFORM: The platform parses and delivers the model configuration. You can specify the model parameter.</li>
         * <li>RUNTIME: The external runtime manages the model on its own. You cannot specify the model parameter at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PLATFORM</p>
         */
        @NameInMap("modelSource")
        public String modelSource;

        /**
         * <p>The name of the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-external-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The runtime type reported by the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>qwenpaw</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<CreateExternalAgentResponseBodyDataSkills> skills;

        /**
         * <p>The status of the external agent. Valid values:</p>
         * <ul>
         * <li>Creating: The agent is being created.</li>
         * <li>Running: The agent is running.</li>
         * <li>Failed: The agent creation failed.</li>
         * <li>Updating: The agent is being updated.</li>
         * <li>Deleting: The agent is being deleted.</li>
         * <li>Deleted: The agent has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public CreateExternalAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<CreateExternalAgentResponseBodyDataTools> tools;

        /**
         * <p>The update time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateExternalAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyData self = new CreateExternalAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateExternalAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public CreateExternalAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateExternalAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public CreateExternalAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateExternalAgentResponseBodyData setEffectiveResult(CreateExternalAgentResponseBodyDataEffectiveResult effectiveResult) {
            this.effectiveResult = effectiveResult;
            return this;
        }
        public CreateExternalAgentResponseBodyDataEffectiveResult getEffectiveResult() {
            return this.effectiveResult;
        }

        public CreateExternalAgentResponseBodyData setEffectiveSpecVersion(Long effectiveSpecVersion) {
            this.effectiveSpecVersion = effectiveSpecVersion;
            return this;
        }
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        public CreateExternalAgentResponseBodyData setExternalAgentStatus(CreateExternalAgentResponseBodyDataExternalAgentStatus externalAgentStatus) {
            this.externalAgentStatus = externalAgentStatus;
            return this;
        }
        public CreateExternalAgentResponseBodyDataExternalAgentStatus getExternalAgentStatus() {
            return this.externalAgentStatus;
        }

        public CreateExternalAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateExternalAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public CreateExternalAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public CreateExternalAgentResponseBodyData setModel(CreateExternalAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public CreateExternalAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public CreateExternalAgentResponseBodyData setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public CreateExternalAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateExternalAgentResponseBodyData setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public CreateExternalAgentResponseBodyData setSkills(java.util.List<CreateExternalAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateExternalAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public CreateExternalAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateExternalAgentResponseBodyData setTemplate(CreateExternalAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public CreateExternalAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public CreateExternalAgentResponseBodyData setTools(java.util.List<CreateExternalAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateExternalAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public CreateExternalAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateExternalAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
