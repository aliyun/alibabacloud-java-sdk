// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateExternalAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the updated external agent.</p>
     */
    @NameInMap("data")
    public UpdateExternalAgentResponseBodyData data;

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

    public static UpdateExternalAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExternalAgentResponseBody self = new UpdateExternalAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExternalAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateExternalAgentResponseBody setData(UpdateExternalAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateExternalAgentResponseBodyData getData() {
        return this.data;
    }

    public UpdateExternalAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateExternalAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateExternalAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExternalAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateExternalAgentResponseBodyDataExternalAgentStatus extends TeaModel {
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
         * <p>The last active time of the external agent in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("lastActiveAt")
        public String lastActiveAt;

        /**
         * <p>The last heartbeat time of the external agent in RFC 3339 format.</p>
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

        public static UpdateExternalAgentResponseBodyDataExternalAgentStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataExternalAgentStatus self = new UpdateExternalAgentResponseBodyDataExternalAgentStatus();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataExternalAgentStatus setHeartbeatStatus(String heartbeatStatus) {
            this.heartbeatStatus = heartbeatStatus;
            return this;
        }
        public String getHeartbeatStatus() {
            return this.heartbeatStatus;
        }

        public UpdateExternalAgentResponseBodyDataExternalAgentStatus setLastActiveAt(String lastActiveAt) {
            this.lastActiveAt = lastActiveAt;
            return this;
        }
        public String getLastActiveAt() {
            return this.lastActiveAt;
        }

        public UpdateExternalAgentResponseBodyDataExternalAgentStatus setLastHeartbeat(String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }
        public String getLastHeartbeat() {
            return this.lastHeartbeat;
        }

        public UpdateExternalAgentResponseBodyDataExternalAgentStatus setLocalIP(String localIP) {
            this.localIP = localIP;
            return this;
        }
        public String getLocalIP() {
            return this.localIP;
        }

        public UpdateExternalAgentResponseBodyDataExternalAgentStatus setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

    }

    public static class UpdateExternalAgentResponseBodyDataModelQuota extends TeaModel {
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

        public static UpdateExternalAgentResponseBodyDataModelQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataModelQuota self = new UpdateExternalAgentResponseBodyDataModelQuota();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public UpdateExternalAgentResponseBodyDataModelQuota setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class UpdateExternalAgentResponseBodyDataModel extends TeaModel {
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
        public UpdateExternalAgentResponseBodyDataModelQuota quota;

        public static UpdateExternalAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataModel self = new UpdateExternalAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public UpdateExternalAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateExternalAgentResponseBodyDataModel setQuota(UpdateExternalAgentResponseBodyDataModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public UpdateExternalAgentResponseBodyDataModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class UpdateExternalAgentResponseBodyDataSkills extends TeaModel {
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

        public static UpdateExternalAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataSkills self = new UpdateExternalAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateExternalAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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

        public static UpdateExternalAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataTemplateAiRegistry self = new UpdateExternalAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateExternalAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public UpdateExternalAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static UpdateExternalAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataTemplate self = new UpdateExternalAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataTemplate setAiRegistry(UpdateExternalAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public UpdateExternalAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class UpdateExternalAgentResponseBodyDataTools extends TeaModel {
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

        public static UpdateExternalAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyDataTools self = new UpdateExternalAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateExternalAgentResponseBodyData extends TeaModel {
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
        public UpdateExternalAgentResponseBodyDataExternalAgentStatus externalAgentStatus;

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
        public UpdateExternalAgentResponseBodyDataModel model;

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
        public java.util.List<UpdateExternalAgentResponseBodyDataSkills> skills;

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
        public UpdateExternalAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateExternalAgentResponseBodyDataTools> tools;

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

        public static UpdateExternalAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentResponseBodyData self = new UpdateExternalAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateExternalAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public UpdateExternalAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateExternalAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public UpdateExternalAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExternalAgentResponseBodyData setExternalAgentStatus(UpdateExternalAgentResponseBodyDataExternalAgentStatus externalAgentStatus) {
            this.externalAgentStatus = externalAgentStatus;
            return this;
        }
        public UpdateExternalAgentResponseBodyDataExternalAgentStatus getExternalAgentStatus() {
            return this.externalAgentStatus;
        }

        public UpdateExternalAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateExternalAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public UpdateExternalAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public UpdateExternalAgentResponseBodyData setModel(UpdateExternalAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public UpdateExternalAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public UpdateExternalAgentResponseBodyData setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public UpdateExternalAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateExternalAgentResponseBodyData setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public UpdateExternalAgentResponseBodyData setSkills(java.util.List<UpdateExternalAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateExternalAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public UpdateExternalAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateExternalAgentResponseBodyData setTemplate(UpdateExternalAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateExternalAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public UpdateExternalAgentResponseBodyData setTools(java.util.List<UpdateExternalAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateExternalAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public UpdateExternalAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateExternalAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
