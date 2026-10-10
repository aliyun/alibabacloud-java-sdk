// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetContextStoreResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace to which the context store belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The configuration of the context store.</p>
     */
    @NameInMap("config")
    public GetContextStoreResponseBodyConfig config;

    /**
     * <p>The context store name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <p>The type of the context store, such as experience or memory.</p>
     * 
     * <strong>example:</strong>
     * <p>experience</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>The time when the context store was created, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the context store.</p>
     * 
     * <strong>example:</strong>
     * <p>我的上下文库</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The region ID of the context store.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The status of the context store. Valid values:</p>
     * <ul>
     * <li>ACTIVE</li>
     * <li>INITIALIZING</li>
     * <li>FAILED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the context store was last updated, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02T00:00:00Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetContextStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextStoreResponseBody self = new GetContextStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextStoreResponseBody setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetContextStoreResponseBody setConfig(GetContextStoreResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetContextStoreResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetContextStoreResponseBody setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public GetContextStoreResponseBody setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public GetContextStoreResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetContextStoreResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetContextStoreResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetContextStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextStoreResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetContextStoreResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetContextStoreResponseBodyConfigAudit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("droppedCandidates")
        public Boolean droppedCandidates;

        /**
         * <strong>example:</strong>
         * <p>raw</p>
         */
        @NameInMap("queryMode")
        public String queryMode;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("retentionDays")
        public Integer retentionDays;

        public static GetContextStoreResponseBodyConfigAudit build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigAudit self = new GetContextStoreResponseBodyConfigAudit();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigAudit setDroppedCandidates(Boolean droppedCandidates) {
            this.droppedCandidates = droppedCandidates;
            return this;
        }
        public Boolean getDroppedCandidates() {
            return this.droppedCandidates;
        }

        public GetContextStoreResponseBodyConfigAudit setQueryMode(String queryMode) {
            this.queryMode = queryMode;
            return this;
        }
        public String getQueryMode() {
            return this.queryMode;
        }

        public GetContextStoreResponseBodyConfigAudit setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

    }

    public static class GetContextStoreResponseBodyConfigExtractionPolicyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen3.8-flash</p>
         */
        @NameInMap("name")
        public String name;

        public static GetContextStoreResponseBodyConfigExtractionPolicyModel build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigExtractionPolicyModel self = new GetContextStoreResponseBodyConfigExtractionPolicyModel();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigExtractionPolicyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetContextStoreResponseBodyConfigExtractionPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;preference&quot;,&quot;profile&quot;]</p>
         */
        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <strong>example:</strong>
         * <p>只抽取用户的产品偏好</p>
         */
        @NameInMap("customInstructions")
        public String customInstructions;

        /**
         * <strong>example:</strong>
         * <p>[&quot;密码&quot;,&quot;证件号&quot;]</p>
         */
        @NameInMap("excludeRules")
        public java.util.List<String> excludeRules;

        @NameInMap("model")
        public GetContextStoreResponseBodyConfigExtractionPolicyModel model;

        /**
         * <strong>example:</strong>
         * <p>fact</p>
         */
        @NameInMap("preset")
        public String preset;

        public static GetContextStoreResponseBodyConfigExtractionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigExtractionPolicy self = new GetContextStoreResponseBodyConfigExtractionPolicy();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigExtractionPolicy setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicy setCustomInstructions(String customInstructions) {
            this.customInstructions = customInstructions;
            return this;
        }
        public String getCustomInstructions() {
            return this.customInstructions;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicy setExcludeRules(java.util.List<String> excludeRules) {
            this.excludeRules = excludeRules;
            return this;
        }
        public java.util.List<String> getExcludeRules() {
            return this.excludeRules;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicy setModel(GetContextStoreResponseBodyConfigExtractionPolicyModel model) {
            this.model = model;
            return this;
        }
        public GetContextStoreResponseBodyConfigExtractionPolicyModel getModel() {
            return this.model;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicy setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

    public static class GetContextStoreResponseBodyConfigInnerSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>memory_events_0a1b2c3d</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>agentloop-xxx</p>
         */
        @NameInMap("project")
        public String project;

        public static GetContextStoreResponseBodyConfigInnerSource build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigInnerSource self = new GetContextStoreResponseBodyConfigInnerSource();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigInnerSource setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetContextStoreResponseBodyConfigInnerSource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetContextStoreResponseBodyConfigObservability extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>memory-audit</p>
         */
        @NameInMap("auditLogstore")
        public String auditLogstore;

        /**
         * <strong>example:</strong>
         * <p>memory_events_0a1b2c3d</p>
         */
        @NameInMap("eventsLogstore")
        public String eventsLogstore;

        /**
         * <strong>example:</strong>
         * <p>agentloop-xxx</p>
         */
        @NameInMap("project")
        public String project;

        public static GetContextStoreResponseBodyConfigObservability build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigObservability self = new GetContextStoreResponseBodyConfigObservability();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigObservability setAuditLogstore(String auditLogstore) {
            this.auditLogstore = auditLogstore;
            return this;
        }
        public String getAuditLogstore() {
            return this.auditLogstore;
        }

        public GetContextStoreResponseBodyConfigObservability setEventsLogstore(String eventsLogstore) {
            this.eventsLogstore = eventsLogstore;
            return this;
        }
        public String getEventsLogstore() {
            return this.eventsLogstore;
        }

        public GetContextStoreResponseBodyConfigObservability setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetContextStoreResponseBodyConfigOutputDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>memory-my-context-store</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>MemoryRecordV1</p>
         */
        @NameInMap("schemaContract")
        public String schemaContract;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schemaVersion")
        public Integer schemaVersion;

        public static GetContextStoreResponseBodyConfigOutputDataset build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigOutputDataset self = new GetContextStoreResponseBodyConfigOutputDataset();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigOutputDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetContextStoreResponseBodyConfigOutputDataset setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetContextStoreResponseBodyConfigOutputDataset setSchemaContract(String schemaContract) {
            this.schemaContract = schemaContract;
            return this;
        }
        public String getSchemaContract() {
            return this.schemaContract;
        }

        public GetContextStoreResponseBodyConfigOutputDataset setSchemaVersion(Integer schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class GetContextStoreResponseBodyConfigScopePolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;userId&quot;]</p>
         */
        @NameInMap("requiredAnyOf")
        public java.util.List<String> requiredAnyOf;

        public static GetContextStoreResponseBodyConfigScopePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigScopePolicy self = new GetContextStoreResponseBodyConfigScopePolicy();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigScopePolicy setRequiredAnyOf(java.util.List<String> requiredAnyOf) {
            this.requiredAnyOf = requiredAnyOf;
            return this;
        }
        public java.util.List<String> getRequiredAnyOf() {
            return this.requiredAnyOf;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceDatasetCustomFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>客户等级</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("sensitive")
        public Boolean sensitive;

        /**
         * <strong>example:</strong>
         * <p>customerTier</p>
         */
        @NameInMap("sourceField")
        public String sourceField;

        /**
         * <strong>example:</strong>
         * <p>metadata.customerTier</p>
         */
        @NameInMap("target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>extraction-input</p>
         */
        @NameInMap("usage")
        public String usage;

        public static GetContextStoreResponseBodyConfigSourceDatasetCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceDatasetCustomFields self = new GetContextStoreResponseBodyConfigSourceDatasetCustomFields();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceDatasetCustomFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetContextStoreResponseBodyConfigSourceDatasetCustomFields setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public GetContextStoreResponseBodyConfigSourceDatasetCustomFields setSourceField(String sourceField) {
            this.sourceField = sourceField;
            return this;
        }
        public String getSourceField() {
            return this.sourceField;
        }

        public GetContextStoreResponseBodyConfigSourceDatasetCustomFields setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetContextStoreResponseBodyConfigSourceDatasetCustomFields setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceDatasetFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>appId = \&quot;crm-service\&quot;</p>
         */
        @NameInMap("where")
        public String where;

        public static GetContextStoreResponseBodyConfigSourceDatasetFilter build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceDatasetFilter self = new GetContextStoreResponseBodyConfigSourceDatasetFilter();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceDatasetFilter setWhere(String where) {
            this.where = where;
            return this;
        }
        public String getWhere() {
            return this.where;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>follow</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startSeq")
        public Long startSeq;

        /**
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("version")
        public String version;

        public static GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy self = new GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy setStartSeq(Long startSeq) {
            this.startSeq = startSeq;
            return this;
        }
        public Long getStartSeq() {
            return this.startSeq;
        }

        public GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceDataset extends TeaModel {
        @NameInMap("customFields")
        public java.util.List<GetContextStoreResponseBodyConfigSourceDatasetCustomFields> customFields;

        /**
         * <strong>example:</strong>
         * <p>trajectory-with-crm-profile</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        @NameInMap("filter")
        public GetContextStoreResponseBodyConfigSourceDatasetFilter filter;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("pollIntervalSeconds")
        public Integer pollIntervalSeconds;

        /**
         * <strong>example:</strong>
         * <p>MemorySourceV1</p>
         */
        @NameInMap("schemaContract")
        public String schemaContract;

        @NameInMap("versionPolicy")
        public GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy versionPolicy;

        public static GetContextStoreResponseBodyConfigSourceDataset build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceDataset self = new GetContextStoreResponseBodyConfigSourceDataset();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceDataset setCustomFields(java.util.List<GetContextStoreResponseBodyConfigSourceDatasetCustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<GetContextStoreResponseBodyConfigSourceDatasetCustomFields> getCustomFields() {
            return this.customFields;
        }

        public GetContextStoreResponseBodyConfigSourceDataset setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetContextStoreResponseBodyConfigSourceDataset setFilter(GetContextStoreResponseBodyConfigSourceDatasetFilter filter) {
            this.filter = filter;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceDatasetFilter getFilter() {
            return this.filter;
        }

        public GetContextStoreResponseBodyConfigSourceDataset setPollIntervalSeconds(Integer pollIntervalSeconds) {
            this.pollIntervalSeconds = pollIntervalSeconds;
            return this;
        }
        public Integer getPollIntervalSeconds() {
            return this.pollIntervalSeconds;
        }

        public GetContextStoreResponseBodyConfigSourceDataset setSchemaContract(String schemaContract) {
            this.schemaContract = schemaContract;
            return this;
        }
        public String getSchemaContract() {
            return this.schemaContract;
        }

        public GetContextStoreResponseBodyConfigSourceDataset setVersionPolicy(GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy versionPolicy) {
            this.versionPolicy = versionPolicy;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceDatasetVersionPolicy getVersionPolicy() {
            return this.versionPolicy;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceTrajectoryFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;sales-copilot&quot;]</p>
         */
        @NameInMap("agentNames")
        public java.util.List<String> agentNames;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeDegraded")
        public Boolean excludeDegraded;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minStepCount")
        public Integer minStepCount;

        /**
         * <strong>example:</strong>
         * <p>tool_names:&quot;search_order&quot;</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <strong>example:</strong>
         * <p>[&quot;crm-service&quot;,&quot;app-*&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        public static GetContextStoreResponseBodyConfigSourceTrajectoryFilter build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceTrajectoryFilter self = new GetContextStoreResponseBodyConfigSourceTrajectoryFilter();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter setAgentNames(java.util.List<String> agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public java.util.List<String> getAgentNames() {
            return this.agentNames;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter setExcludeDegraded(Boolean excludeDegraded) {
            this.excludeDegraded = excludeDegraded;
            return this;
        }
        public Boolean getExcludeDegraded() {
            return this.excludeDegraded;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter setMinStepCount(Integer minStepCount) {
            this.minStepCount = minStepCount;
            return this;
        }
        public Integer getMinStepCount() {
            return this.minStepCount;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>$.agent_name</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>$.service_names[0]</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>$.trajectory_id</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>$.trajectory_extensions.user_id</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping self = new GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceTrajectory extends TeaModel {
        @NameInMap("filter")
        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter filter;

        /**
         * <strong>example:</strong>
         * <p>agent-trajectory</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("pollIntervalSeconds")
        public Integer pollIntervalSeconds;

        @NameInMap("scopeMapping")
        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping scopeMapping;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static GetContextStoreResponseBodyConfigSourceTrajectory build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceTrajectory self = new GetContextStoreResponseBodyConfigSourceTrajectory();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceTrajectory setFilter(GetContextStoreResponseBodyConfigSourceTrajectoryFilter filter) {
            this.filter = filter;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter getFilter() {
            return this.filter;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectory setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectory setPollIntervalSeconds(Integer pollIntervalSeconds) {
            this.pollIntervalSeconds = pollIntervalSeconds;
            return this;
        }
        public Integer getPollIntervalSeconds() {
            return this.pollIntervalSeconds;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectory setScopeMapping(GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping scopeMapping) {
            this.scopeMapping = scopeMapping;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping getScopeMapping() {
            return this.scopeMapping;
        }

        public GetContextStoreResponseBodyConfigSourceTrajectory setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetContextStoreResponseBodyConfigSource extends TeaModel {
        /**
         * <p>The AgentSpace where the trace data source resides. This is the same as the AgentSpace specified during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        @NameInMap("dataset")
        public GetContextStoreResponseBodyConfigSourceDataset dataset;

        /**
         * <p>The start time for data backfill, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        @NameInMap("trajectory")
        public GetContextStoreResponseBodyConfigSourceTrajectory trajectory;

        /**
         * <strong>example:</strong>
         * <p>trajectory</p>
         */
        @NameInMap("type")
        public String type;

        public static GetContextStoreResponseBodyConfigSource build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSource self = new GetContextStoreResponseBodyConfigSource();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSource setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetContextStoreResponseBodyConfigSource setDataset(GetContextStoreResponseBodyConfigSourceDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceDataset getDataset() {
            return this.dataset;
        }

        public GetContextStoreResponseBodyConfigSource setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetContextStoreResponseBodyConfigSource setTrajectory(GetContextStoreResponseBodyConfigSourceTrajectory trajectory) {
            this.trajectory = trajectory;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceTrajectory getTrajectory() {
            return this.trajectory;
        }

        public GetContextStoreResponseBodyConfigSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceStatus extends TeaModel {
        @NameInMap("checkpoint")
        public java.util.Map<String, ?> checkpoint;

        /**
         * <strong>example:</strong>
         * <p>读取数据源超时</p>
         */
        @NameInMap("lastError")
        public String lastError;

        /**
         * <strong>example:</strong>
         * <p>2026-10-01T08:00:00Z</p>
         */
        @NameInMap("lastWindowAt")
        public String lastWindowAt;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("retryCount")
        public Integer retryCount;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        public static GetContextStoreResponseBodyConfigSourceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceStatus self = new GetContextStoreResponseBodyConfigSourceStatus();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceStatus setCheckpoint(java.util.Map<String, ?> checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public java.util.Map<String, ?> getCheckpoint() {
            return this.checkpoint;
        }

        public GetContextStoreResponseBodyConfigSourceStatus setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public GetContextStoreResponseBodyConfigSourceStatus setLastWindowAt(String lastWindowAt) {
            this.lastWindowAt = lastWindowAt;
            return this;
        }
        public String getLastWindowAt() {
            return this.lastWindowAt;
        }

        public GetContextStoreResponseBodyConfigSourceStatus setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public GetContextStoreResponseBodyConfigSourceStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class GetContextStoreResponseBodyConfigStoragePolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;ADD&quot;,&quot;UPDATE&quot;,&quot;MERGE&quot;,&quot;DELETE&quot;]</p>
         */
        @NameInMap("allowedActions")
        public java.util.List<String> allowedActions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dedupe")
        public Boolean dedupe;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("humanEditProtection")
        public Boolean humanEditProtection;

        /**
         * <strong>example:</strong>
         * <p>semantic</p>
         */
        @NameInMap("mergeKey")
        public String mergeKey;

        /**
         * <strong>example:</strong>
         * <p>upsert</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("similarityThreshold")
        public Double similarityThreshold;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ttlDays")
        public Integer ttlDays;

        public static GetContextStoreResponseBodyConfigStoragePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigStoragePolicy self = new GetContextStoreResponseBodyConfigStoragePolicy();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setAllowedActions(java.util.List<String> allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }
        public java.util.List<String> getAllowedActions() {
            return this.allowedActions;
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setDedupe(Boolean dedupe) {
            this.dedupe = dedupe;
            return this;
        }
        public Boolean getDedupe() {
            return this.dedupe;
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setHumanEditProtection(Boolean humanEditProtection) {
            this.humanEditProtection = humanEditProtection;
            return this;
        }
        public Boolean getHumanEditProtection() {
            return this.humanEditProtection;
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setMergeKey(String mergeKey) {
            this.mergeKey = mergeKey;
            return this;
        }
        public String getMergeKey() {
            return this.mergeKey;
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setSimilarityThreshold(Double similarityThreshold) {
            this.similarityThreshold = similarityThreshold;
            return this;
        }
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        public GetContextStoreResponseBodyConfigStoragePolicy setTtlDays(Integer ttlDays) {
            this.ttlDays = ttlDays;
            return this;
        }
        public Integer getTtlDays() {
            return this.ttlDays;
        }

    }

    public static class GetContextStoreResponseBodyConfig extends TeaModel {
        @NameInMap("audit")
        public GetContextStoreResponseBodyConfigAudit audit;

        @NameInMap("extractionPolicy")
        public GetContextStoreResponseBodyConfigExtractionPolicy extractionPolicy;

        @NameInMap("innerSource")
        public GetContextStoreResponseBodyConfigInnerSource innerSource;

        /**
         * <p>The metadata field mapping. The key is the business field and the value is the storage field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
         */
        @NameInMap("metadataField")
        public java.util.Map<String, String> metadataField;

        /**
         * <p>The experience mining interval. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        @NameInMap("miningInterval")
        public String miningInterval;

        @NameInMap("observability")
        public GetContextStoreResponseBodyConfigObservability observability;

        @NameInMap("outputDataset")
        public GetContextStoreResponseBodyConfigOutputDataset outputDataset;

        @NameInMap("scopePolicy")
        public GetContextStoreResponseBodyConfigScopePolicy scopePolicy;

        /**
         * <p>The list of service names. This works together with source.agentSpace to locate the trace data source. This value cannot be changed in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        /**
         * <p>The datasource config passed in by the user. This serves only as the root identifier of the data source.</p>
         */
        @NameInMap("source")
        public GetContextStoreResponseBodyConfigSource source;

        @NameInMap("sourceStatus")
        public GetContextStoreResponseBodyConfigSourceStatus sourceStatus;

        @NameInMap("storagePolicy")
        public GetContextStoreResponseBodyConfigStoragePolicy storagePolicy;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("strategyVersion")
        public Integer strategyVersion;

        public static GetContextStoreResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfig self = new GetContextStoreResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfig setAudit(GetContextStoreResponseBodyConfigAudit audit) {
            this.audit = audit;
            return this;
        }
        public GetContextStoreResponseBodyConfigAudit getAudit() {
            return this.audit;
        }

        public GetContextStoreResponseBodyConfig setExtractionPolicy(GetContextStoreResponseBodyConfigExtractionPolicy extractionPolicy) {
            this.extractionPolicy = extractionPolicy;
            return this;
        }
        public GetContextStoreResponseBodyConfigExtractionPolicy getExtractionPolicy() {
            return this.extractionPolicy;
        }

        public GetContextStoreResponseBodyConfig setInnerSource(GetContextStoreResponseBodyConfigInnerSource innerSource) {
            this.innerSource = innerSource;
            return this;
        }
        public GetContextStoreResponseBodyConfigInnerSource getInnerSource() {
            return this.innerSource;
        }

        public GetContextStoreResponseBodyConfig setMetadataField(java.util.Map<String, String> metadataField) {
            this.metadataField = metadataField;
            return this;
        }
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        public GetContextStoreResponseBodyConfig setMiningInterval(String miningInterval) {
            this.miningInterval = miningInterval;
            return this;
        }
        public String getMiningInterval() {
            return this.miningInterval;
        }

        public GetContextStoreResponseBodyConfig setObservability(GetContextStoreResponseBodyConfigObservability observability) {
            this.observability = observability;
            return this;
        }
        public GetContextStoreResponseBodyConfigObservability getObservability() {
            return this.observability;
        }

        public GetContextStoreResponseBodyConfig setOutputDataset(GetContextStoreResponseBodyConfigOutputDataset outputDataset) {
            this.outputDataset = outputDataset;
            return this;
        }
        public GetContextStoreResponseBodyConfigOutputDataset getOutputDataset() {
            return this.outputDataset;
        }

        public GetContextStoreResponseBodyConfig setScopePolicy(GetContextStoreResponseBodyConfigScopePolicy scopePolicy) {
            this.scopePolicy = scopePolicy;
            return this;
        }
        public GetContextStoreResponseBodyConfigScopePolicy getScopePolicy() {
            return this.scopePolicy;
        }

        public GetContextStoreResponseBodyConfig setServiceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        public GetContextStoreResponseBodyConfig setSource(GetContextStoreResponseBodyConfigSource source) {
            this.source = source;
            return this;
        }
        public GetContextStoreResponseBodyConfigSource getSource() {
            return this.source;
        }

        public GetContextStoreResponseBodyConfig setSourceStatus(GetContextStoreResponseBodyConfigSourceStatus sourceStatus) {
            this.sourceStatus = sourceStatus;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceStatus getSourceStatus() {
            return this.sourceStatus;
        }

        public GetContextStoreResponseBodyConfig setStoragePolicy(GetContextStoreResponseBodyConfigStoragePolicy storagePolicy) {
            this.storagePolicy = storagePolicy;
            return this;
        }
        public GetContextStoreResponseBodyConfigStoragePolicy getStoragePolicy() {
            return this.storagePolicy;
        }

        public GetContextStoreResponseBodyConfig setStrategyVersion(Integer strategyVersion) {
            this.strategyVersion = strategyVersion;
            return this;
        }
        public Integer getStrategyVersion() {
            return this.strategyVersion;
        }

    }

}
