// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The information about the created external agent.</p>
     */
    @NameInMap("data")
    public CreateExternalAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. The value is 200 when the request succeeds.</p>
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
         * <p>The time when the external agent was last active, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("lastActiveAt")
        public String lastActiveAt;

        /**
         * <p>The time of the last heartbeat from the external agent, in RFC 3339 format.</p>
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

    public static class CreateExternalAgentResponseBodyDataModelQuota extends TeaModel {
        /**
         * <p>Indicates whether the quota is enabled. This field is not returned if no quota is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. Currently, only token is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>Indicates whether the quota has been exceeded in the current cycle. This is a read-only field returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overLimit")
        public Boolean overLimit;

        /**
         * <p>The quota statistical period. day indicates a daily period. month indicates a monthly period.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The gateway quota rule status. This is a read-only field returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>The maximum number of tokens that can be consumed within a single cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The number of tokens consumed in the current cycle. This is a read-only field returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("usedAmount")
        public Long usedAmount;

        public static CreateExternalAgentResponseBodyDataModelQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentResponseBodyDataModelQuota self = new CreateExternalAgentResponseBodyDataModelQuota();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentResponseBodyDataModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateExternalAgentResponseBodyDataModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateExternalAgentResponseBodyDataModelQuota setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public CreateExternalAgentResponseBodyDataModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public CreateExternalAgentResponseBodyDataModelQuota setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public CreateExternalAgentResponseBodyDataModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public CreateExternalAgentResponseBodyDataModelQuota setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class CreateExternalAgentResponseBodyDataModel extends TeaModel {
        /**
         * <p>The model connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("modelConnectionId")
        public String modelConnectionId;

        /**
         * <p>The upstream model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model token quota configuration and the quota usage status in the current cycle. This field is empty if no quota is configured.</p>
         */
        @NameInMap("quota")
        public CreateExternalAgentResponseBodyDataModelQuota quota;

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

        public CreateExternalAgentResponseBodyDataModel setQuota(CreateExternalAgentResponseBodyDataModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateExternalAgentResponseBodyDataModelQuota getQuota() {
            return this.quota;
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
         * <p>This parameter is required.</p>
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
         * <li>pending: Pending.</li>
         * <li>processing: Processing.</li>
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
        public CreateExternalAgentResponseBodyDataModel model;

        /**
         * <p>The model configuration source. PLATFORM indicates that the platform parses and delivers the model configuration. RUNTIME indicates that the external runtime manages the model independently, and the model parameter cannot be specified at the same time. Valid values:</p>
         * <ul>
         * <li>PLATFORM: platform model.</li>
         * <li>RUNTIME: runtime model.</li>
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
         * <p>The external agent status. Valid values:</p>
         * <ul>
         * <li>Creating: Being created.</li>
         * <li>Running: Running.</li>
         * <li>Failed: Failed.</li>
         * <li>Updating: Being updated.</li>
         * <li>Deleting: Being deleted.</li>
         * <li>Deleted: Deleted.</li>
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
