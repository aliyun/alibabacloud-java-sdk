// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetExternalAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The external agent details.</p>
     */
    @NameInMap("data")
    public GetExternalAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
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

    public static GetExternalAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExternalAgentResponseBody self = new GetExternalAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExternalAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetExternalAgentResponseBody setData(GetExternalAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExternalAgentResponseBodyData getData() {
        return this.data;
    }

    public GetExternalAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetExternalAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExternalAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExternalAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetExternalAgentResponseBodyDataEffectiveResult extends TeaModel {
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

        public static GetExternalAgentResponseBodyDataEffectiveResult build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataEffectiveResult self = new GetExternalAgentResponseBodyDataEffectiveResult();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataEffectiveResult setMatrixUserId(String matrixUserId) {
            this.matrixUserId = matrixUserId;
            return this;
        }
        public String getMatrixUserId() {
            return this.matrixUserId;
        }

        public GetExternalAgentResponseBodyDataEffectiveResult setPersonalRoomId(String personalRoomId) {
            this.personalRoomId = personalRoomId;
            return this;
        }
        public String getPersonalRoomId() {
            return this.personalRoomId;
        }

        public GetExternalAgentResponseBodyDataEffectiveResult setRuntimeAcceptStatus(String runtimeAcceptStatus) {
            this.runtimeAcceptStatus = runtimeAcceptStatus;
            return this;
        }
        public String getRuntimeAcceptStatus() {
            return this.runtimeAcceptStatus;
        }

        public GetExternalAgentResponseBodyDataEffectiveResult setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public GetExternalAgentResponseBodyDataEffectiveResult setRuntimeRequestVersion(Long runtimeRequestVersion) {
            this.runtimeRequestVersion = runtimeRequestVersion;
            return this;
        }
        public Long getRuntimeRequestVersion() {
            return this.runtimeRequestVersion;
        }

        public GetExternalAgentResponseBodyDataEffectiveResult setWorkspacePrefix(String workspacePrefix) {
            this.workspacePrefix = workspacePrefix;
            return this;
        }
        public String getWorkspacePrefix() {
            return this.workspacePrefix;
        }

    }

    public static class GetExternalAgentResponseBodyDataExternalAgentStatus extends TeaModel {
        /**
         * <p>The heartbeat status. Valid values:</p>
         * <ul>
         * <li>ONLINE: The latest heartbeat has not exceeded the configured timeout threshold.</li>
         * <li>STALE: The heartbeat has timed out.</li>
         * <li>UNKNOWN: The heartbeat is missing or has an invalid format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("heartbeatStatus")
        public String heartbeatStatus;

        /**
         * <p>The time when the external agent was last active in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("lastActiveAt")
        public String lastActiveAt;

        /**
         * <p>The time of the last heartbeat from the external agent in RFC 3339 format.</p>
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

        public static GetExternalAgentResponseBodyDataExternalAgentStatus build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataExternalAgentStatus self = new GetExternalAgentResponseBodyDataExternalAgentStatus();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataExternalAgentStatus setHeartbeatStatus(String heartbeatStatus) {
            this.heartbeatStatus = heartbeatStatus;
            return this;
        }
        public String getHeartbeatStatus() {
            return this.heartbeatStatus;
        }

        public GetExternalAgentResponseBodyDataExternalAgentStatus setLastActiveAt(String lastActiveAt) {
            this.lastActiveAt = lastActiveAt;
            return this;
        }
        public String getLastActiveAt() {
            return this.lastActiveAt;
        }

        public GetExternalAgentResponseBodyDataExternalAgentStatus setLastHeartbeat(String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }
        public String getLastHeartbeat() {
            return this.lastHeartbeat;
        }

        public GetExternalAgentResponseBodyDataExternalAgentStatus setLocalIP(String localIP) {
            this.localIP = localIP;
            return this;
        }
        public String getLocalIP() {
            return this.localIP;
        }

        public GetExternalAgentResponseBodyDataExternalAgentStatus setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

    }

    public static class GetExternalAgentResponseBodyDataModel extends TeaModel {
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

        public static GetExternalAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataModel self = new GetExternalAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public GetExternalAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class GetExternalAgentResponseBodyDataSkills extends TeaModel {
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

        public static GetExternalAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataSkills self = new GetExternalAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExternalAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetExternalAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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

        public static GetExternalAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataTemplateAiRegistry self = new GetExternalAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExternalAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetExternalAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public GetExternalAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static GetExternalAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataTemplate self = new GetExternalAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataTemplate setAiRegistry(GetExternalAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public GetExternalAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class GetExternalAgentResponseBodyDataTools extends TeaModel {
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

        public static GetExternalAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyDataTools self = new GetExternalAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExternalAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetExternalAgentResponseBodyData extends TeaModel {
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
         * <p>The external agent description.</p>
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
        public GetExternalAgentResponseBodyDataEffectiveResult effectiveResult;

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
        public GetExternalAgentResponseBodyDataExternalAgentStatus externalAgentStatus;

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
         * <p>The model configuration. Available only when modelSource is set to PLATFORM.</p>
         */
        @NameInMap("model")
        public GetExternalAgentResponseBodyDataModel model;

        /**
         * <p>The model configuration source. Valid values:</p>
         * <ul>
         * <li>PLATFORM: The model configuration is parsed and delivered by the platform.</li>
         * <li>RUNTIME: The model is managed by the external runtime. The model parameter cannot be specified at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PLATFORM</p>
         */
        @NameInMap("modelSource")
        public String modelSource;

        /**
         * <p>The external agent name.</p>
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
        public java.util.List<GetExternalAgentResponseBodyDataSkills> skills;

        /**
         * <p>The external agent status. Valid values:</p>
         * <ul>
         * <li>Creating: The agent is being created.</li>
         * <li>Running: The agent is running.</li>
         * <li>Failed: The agent has failed.</li>
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
        public GetExternalAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<GetExternalAgentResponseBodyDataTools> tools;

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

        public static GetExternalAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExternalAgentResponseBodyData self = new GetExternalAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExternalAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetExternalAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetExternalAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetExternalAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetExternalAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetExternalAgentResponseBodyData setEffectiveResult(GetExternalAgentResponseBodyDataEffectiveResult effectiveResult) {
            this.effectiveResult = effectiveResult;
            return this;
        }
        public GetExternalAgentResponseBodyDataEffectiveResult getEffectiveResult() {
            return this.effectiveResult;
        }

        public GetExternalAgentResponseBodyData setEffectiveSpecVersion(Long effectiveSpecVersion) {
            this.effectiveSpecVersion = effectiveSpecVersion;
            return this;
        }
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        public GetExternalAgentResponseBodyData setExternalAgentStatus(GetExternalAgentResponseBodyDataExternalAgentStatus externalAgentStatus) {
            this.externalAgentStatus = externalAgentStatus;
            return this;
        }
        public GetExternalAgentResponseBodyDataExternalAgentStatus getExternalAgentStatus() {
            return this.externalAgentStatus;
        }

        public GetExternalAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetExternalAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public GetExternalAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public GetExternalAgentResponseBodyData setModel(GetExternalAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public GetExternalAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public GetExternalAgentResponseBodyData setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public GetExternalAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExternalAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetExternalAgentResponseBodyData setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public GetExternalAgentResponseBodyData setSkills(java.util.List<GetExternalAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetExternalAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public GetExternalAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetExternalAgentResponseBodyData setTemplate(GetExternalAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public GetExternalAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public GetExternalAgentResponseBodyData setTools(java.util.List<GetExternalAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetExternalAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public GetExternalAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetExternalAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
