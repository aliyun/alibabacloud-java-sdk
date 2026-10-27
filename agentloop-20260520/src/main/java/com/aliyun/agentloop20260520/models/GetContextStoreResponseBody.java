// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetContextStoreResponseBody extends TeaModel {
    /**
     * <p>The name of the associated AgentSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The context library configuration.</p>
     */
    @NameInMap("config")
    public GetContextStoreResponseBodyConfig config;

    /**
     * <p>The name of the context store.</p>
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
     * <p>My context store</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the region where the context store is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID used to locate the request during troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The status of the context store, such as ACTIVE, INITIALIZING, or FAILED.</p>
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
         * <p>Specifies whether to write item events for dropped recall candidates. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("droppedCandidates")
        public Boolean droppedCandidates;

        /**
         * <p>The recording mode for recall queries. Valid values: raw (plaintext) and hash (HMAC only). Default value: raw.</p>
         * 
         * <strong>example:</strong>
         * <p>raw</p>
         */
        @NameInMap("queryMode")
        public String queryMode;

        /**
         * <p>The number of days to retain audit logs. Valid values: 1 to 180. Default value: 30.</p>
         * 
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

    public static class GetContextStoreResponseBodyConfigExtractionPoliciesModel extends TeaModel {
        /**
         * <p>The name of the extraction model. Currently, only qwen3.8-flash is supported. Internal platform credentials are used.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.8-flash</p>
         */
        @NameInMap("name")
        public String name;

        public static GetContextStoreResponseBodyConfigExtractionPoliciesModel build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigExtractionPoliciesModel self = new GetContextStoreResponseBodyConfigExtractionPoliciesModel();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy extends TeaModel {
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

        public static GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy self = new GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setAllowedActions(java.util.List<String> allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }
        public java.util.List<String> getAllowedActions() {
            return this.allowedActions;
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setDedupe(Boolean dedupe) {
            this.dedupe = dedupe;
            return this;
        }
        public Boolean getDedupe() {
            return this.dedupe;
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setHumanEditProtection(Boolean humanEditProtection) {
            this.humanEditProtection = humanEditProtection;
            return this;
        }
        public Boolean getHumanEditProtection() {
            return this.humanEditProtection;
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setMergeKey(String mergeKey) {
            this.mergeKey = mergeKey;
            return this;
        }
        public String getMergeKey() {
            return this.mergeKey;
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setSimilarityThreshold(Double similarityThreshold) {
            this.similarityThreshold = similarityThreshold;
            return this;
        }
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy setTtlDays(Integer ttlDays) {
            this.ttlDays = ttlDays;
            return this;
        }
        public Integer getTtlDays() {
            return this.ttlDays;
        }

    }

    public static class GetContextStoreResponseBodyConfigExtractionPolicies extends TeaModel {
        /**
         * <p>The list of memory categories.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;preference&quot;,&quot;profile&quot;]</p>
         */
        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <p>The custom extraction instructions. This parameter is required when preset is set to custom. The length must be 1 to 8,000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Extract only user product preferences</p>
         */
        @NameInMap("customInstructions")
        public String customInstructions;

        /**
         * <p>Specifies whether to apply this policy to new inputs. Default value: true. Disabling the policy does not delete historical memories.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of exclusion rules. Content that matches these rules is not extracted.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Password&quot;,&quot;ID number&quot;]</p>
         */
        @NameInMap("excludeRules")
        public java.util.List<String> excludeRules;

        /**
         * <p>The extraction model configuration.</p>
         */
        @NameInMap("model")
        public GetContextStoreResponseBodyConfigExtractionPoliciesModel model;

        /**
         * <p>The display name of the extraction policy.</p>
         * 
         * <strong>example:</strong>
         * <p>User preferences</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The preset policy. Valid values: fact, toc-profile, tob-digital-twin, and custom. Default value: fact.</p>
         * 
         * <strong>example:</strong>
         * <p>fact</p>
         */
        @NameInMap("preset")
        public String preset;

        @NameInMap("storagePolicy")
        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy storagePolicy;

        /**
         * <p>The stable ID of the extraction policy. The ID must start with a letter and can contain only letters, digits, underscores, and hyphens. It can be up to 64 characters in length. The ID must be unique within the same context library. Modifying the name or instructions does not change this ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>preferences</p>
         */
        @NameInMap("strategyId")
        public String strategyId;

        public static GetContextStoreResponseBodyConfigExtractionPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigExtractionPolicies self = new GetContextStoreResponseBodyConfigExtractionPolicies();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setCustomInstructions(String customInstructions) {
            this.customInstructions = customInstructions;
            return this;
        }
        public String getCustomInstructions() {
            return this.customInstructions;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setExcludeRules(java.util.List<String> excludeRules) {
            this.excludeRules = excludeRules;
            return this;
        }
        public java.util.List<String> getExcludeRules() {
            return this.excludeRules;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setModel(GetContextStoreResponseBodyConfigExtractionPoliciesModel model) {
            this.model = model;
            return this;
        }
        public GetContextStoreResponseBodyConfigExtractionPoliciesModel getModel() {
            return this.model;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setStoragePolicy(GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy storagePolicy) {
            this.storagePolicy = storagePolicy;
            return this;
        }
        public GetContextStoreResponseBodyConfigExtractionPoliciesStoragePolicy getStoragePolicy() {
            return this.storagePolicy;
        }

        public GetContextStoreResponseBodyConfigExtractionPolicies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

    }

    public static class GetContextStoreResponseBodyConfigExtractionPolicyModel extends TeaModel {
        /**
         * <p>The name of the extraction model. Currently, only qwen3.8-flash is supported. Internal platform credentials are used.</p>
         * 
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
         * <p>The list of memory categories.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;preference&quot;,&quot;profile&quot;]</p>
         */
        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <p>The custom extraction instructions. This parameter is required when preset is set to custom. The length must be 1 to 8,000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Extract only user product preferences</p>
         */
        @NameInMap("customInstructions")
        public String customInstructions;

        /**
         * <p>The list of exclusion rules. Content that matches these rules is not extracted.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Password&quot;,&quot;ID number&quot;]</p>
         */
        @NameInMap("excludeRules")
        public java.util.List<String> excludeRules;

        /**
         * <p>The extraction model configuration.</p>
         */
        @NameInMap("model")
        public GetContextStoreResponseBodyConfigExtractionPolicyModel model;

        /**
         * <p>The preset policy. Valid values: fact, toc-profile, tob-digital-twin, and custom. Default value: fact.</p>
         * 
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
         * <p>The name of the event Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>memory_events_0a1b2c3d</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the SLS project.</p>
         * 
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
         * <p>The name of the audit Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>memory-audit</p>
         */
        @NameInMap("auditLogstore")
        public String auditLogstore;

        /**
         * <p>The name of the event Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>memory_events_0a1b2c3d</p>
         */
        @NameInMap("eventsLogstore")
        public String eventsLogstore;

        /**
         * <p>The Simple Log Service (SLS) project to which both belong, which is bound to the AgentSpace.</p>
         * 
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
         * <p>The AgentSpace to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>memory-my-context-store</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        /**
         * <p>The row schema contract of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>MemoryRecordV1</p>
         */
        @NameInMap("schemaContract")
        public String schemaContract;

        /**
         * <p>The schema version.</p>
         * 
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
         * <p>Specifies that at least one of the scope fields must be non-empty. Valid values: userId, agentId, appId, and runId.</p>
         * 
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
         * <p>The description of the field. This parameter is required when usage is extraction-input and is appended to the extraction prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer tier</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether the field is a sensitive field.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("sensitive")
        public Boolean sensitive;

        /**
         * <p>The name of the source field.</p>
         * 
         * <strong>example:</strong>
         * <p>customerTier</p>
         */
        @NameInMap("sourceField")
        public String sourceField;

        /**
         * <p>The target path for writing, such as metadata.customerTier.</p>
         * 
         * <strong>example:</strong>
         * <p>metadata.customerTier</p>
         */
        @NameInMap("target")
        public String target;

        /**
         * <p>The usage of the field. Valid values: extraction-input (participates in extraction) and ignore (ignored).</p>
         * 
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
         * <p>The subset of the pipeline where clause, which is pushed down to SQL.</p>
         * 
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
         * <p>The consumption mode. Valid values: follow (incremental consumption based on __dataset_seq) and fixed (full consumption of the specified ACTIVE version at once).</p>
         * 
         * <strong>example:</strong>
         * <p>follow</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The starting __dataset_seq for the follow mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startSeq")
        public Long startSeq;

        /**
         * <p>The dataset version specified for the fixed mode.</p>
         * 
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
        /**
         * <p>The list of custom field declarations.</p>
         */
        @NameInMap("customFields")
        public java.util.List<GetContextStoreResponseBodyConfigSourceDatasetCustomFields> customFields;

        /**
         * <p>The name of the dataset in the same AgentSpace. This parameter cannot be modified after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>trajectory-with-crm-profile</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        /**
         * <p>The row filter condition.</p>
         */
        @NameInMap("filter")
        public GetContextStoreResponseBodyConfigSourceDatasetFilter filter;

        /**
         * <p>The polling interval in seconds. Valid values: 60 to 3600. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("pollIntervalSeconds")
        public Integer pollIntervalSeconds;

        /**
         * <p>The row schema contract of the dataset. In the current phase, this parameter is fixed to MemorySourceV1.</p>
         * 
         * <strong>example:</strong>
         * <p>MemorySourceV1</p>
         */
        @NameInMap("schemaContract")
        public String schemaContract;

        /**
         * <p>The version consumption policy of the dataset.</p>
         */
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
         * <p>The list of agent names. An explicit empty list returns a 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sales-copilot&quot;]</p>
         */
        @NameInMap("agentNames")
        public java.util.List<String> agentNames;

        /**
         * <p>Specifies whether to exclude degraded trajectories. Default value: false (includes degraded trajectories).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("excludeDegraded")
        public Boolean excludeDegraded;

        /**
         * <p>The minimum step count, which must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("minStepCount")
        public Integer minStepCount;

        /**
         * <p>The native Simple Log Service (SLS) query statement. This statement is combined with the preceding conditions using the AND operator.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_names:&quot;search_order&quot;</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>The list of service names. A single trailing asterisk (*) is supported. An explicit empty list returns a 400 error.</p>
         * 
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
         * <p>The JSONPath expression for agentId. Default value: $.agent_name.</p>
         * 
         * <strong>example:</strong>
         * <p>$.agent_name</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The JSONPath expression for appId. Default value: $.service_names[0].</p>
         * 
         * <strong>example:</strong>
         * <p>$.service_names[0]</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The JSONPath expression for runId. Default value: $.trajectory_id.</p>
         * 
         * <strong>example:</strong>
         * <p>$.trajectory_id</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The JSONPath expression for userId. By default, this field is not mapped.</p>
         * 
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
        /**
         * <p>The trajectory filter condition. Multiple conditions are combined with AND, and conditions within a list are combined with OR.</p>
         */
        @NameInMap("filter")
        public GetContextStoreResponseBodyConfigSourceTrajectoryFilter filter;

        /**
         * <p>The name of the trajectory Logstore. Default value: agent-trajectory. This parameter cannot be modified after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-trajectory</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The polling interval in seconds. Valid values: 60 to 3600. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("pollIntervalSeconds")
        public Integer pollIntervalSeconds;

        /**
         * <p>The scope field mapping. The value is a JSONPath expression. Only the $.a.b and $.a[0] formats are supported.</p>
         */
        @NameInMap("scopeMapping")
        public GetContextStoreResponseBodyConfigSourceTrajectoryScopeMapping scopeMapping;

        /**
         * <p>The start time for trajectory consumption in ISO 8601 UTC format. If not specified, the default value is the creation time.</p>
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

    public static class GetContextStoreResponseBodyConfigSourceVersionPolicy extends TeaModel {
        /**
         * <p>The continuous consumption mode. The value is fixed to follow.</p>
         * 
         * <strong>example:</strong>
         * <p>follow</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The initial consumed append sequence number. The value is a decimal string of a non-negative int64 integer. Default value: 0. The __dataset_seq field is used, and the business timestamp is not used as the consumption checkpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("startSeq")
        public String startSeq;

        public static GetContextStoreResponseBodyConfigSourceVersionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetContextStoreResponseBodyConfigSourceVersionPolicy self = new GetContextStoreResponseBodyConfigSourceVersionPolicy();
            return TeaModel.build(map, self);
        }

        public GetContextStoreResponseBodyConfigSourceVersionPolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetContextStoreResponseBodyConfigSourceVersionPolicy setStartSeq(String startSeq) {
            this.startSeq = startSeq;
            return this;
        }
        public String getStartSeq() {
            return this.startSeq;
        }

    }

    public static class GetContextStoreResponseBodyConfigSource extends TeaModel {
        /**
         * <p>The AgentSpace to which the trace data source belongs, which is the same as the AgentSpace to which it belonged when it was created.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The DatasetBinding v1 shared with optimization tasks, which retains fixed column validation, supplementary column usage, and all/window selection.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;version&quot;:1,&quot;selection&quot;:{&quot;mode&quot;:&quot;all&quot;}}</p>
         */
        @NameInMap("binding")
        public java.util.Map<String, ?> binding;

        /**
         * <p>The data source configuration for the memory type dataset. This parameter is required when the type is memory and source.type is dataset.</p>
         */
        @NameInMap("dataset")
        public GetContextStoreResponseBodyConfigSourceDataset dataset;

        /**
         * <p>The name of the source dataset for the experience type in the current AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>reviewed_trajectories</p>
         */
        @NameInMap("datasetName")
        public String datasetName;

        /**
         * <p>The input format of the dataset. For the experience base dataset, the source is atif.</p>
         * 
         * <strong>example:</strong>
         * <p>atif</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The maximum number of records to read from the dataset at a time. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("maxRecords")
        public Integer maxRecords;

        /**
         * <p>The start time for data backfill in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The data source configuration for the memory type trajectory. This parameter is required when the type is memory and source.type is trajectory.</p>
         */
        @NameInMap("trajectory")
        public GetContextStoreResponseBodyConfigSourceTrajectory trajectory;

        /**
         * <p>The source type, which can be trajectory or dataset. For experience, if not specified, the trajectory configuration is used. For Dataset, the datasetName, format, and binding at the current level are used. The default mode is manual. If versionPolicy.mode is set to follow, continuous processing is performed and automatically applied to the experience library. For memory, if not specified, the mode is manual (only written by AddContexts). Otherwise, the trajectory or dataset sub-configuration with the same name is used. This parameter cannot be modified after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The continuous consumption configuration for the native experience library Dataset. The default mode is manual. The follow mode only allows binding.selection.mode to be set to all, and consumes data by append sequence number. This parameter cannot be modified after creation.</p>
         */
        @NameInMap("versionPolicy")
        public GetContextStoreResponseBodyConfigSourceVersionPolicy versionPolicy;

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

        public GetContextStoreResponseBodyConfigSource setBinding(java.util.Map<String, ?> binding) {
            this.binding = binding;
            return this;
        }
        public java.util.Map<String, ?> getBinding() {
            return this.binding;
        }

        public GetContextStoreResponseBodyConfigSource setDataset(GetContextStoreResponseBodyConfigSourceDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceDataset getDataset() {
            return this.dataset;
        }

        public GetContextStoreResponseBodyConfigSource setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetContextStoreResponseBodyConfigSource setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetContextStoreResponseBodyConfigSource setMaxRecords(Integer maxRecords) {
            this.maxRecords = maxRecords;
            return this;
        }
        public Integer getMaxRecords() {
            return this.maxRecords;
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

        public GetContextStoreResponseBodyConfigSource setVersionPolicy(GetContextStoreResponseBodyConfigSourceVersionPolicy versionPolicy) {
            this.versionPolicy = versionPolicy;
            return this;
        }
        public GetContextStoreResponseBodyConfigSourceVersionPolicy getVersionPolicy() {
            return this.versionPolicy;
        }

    }

    public static class GetContextStoreResponseBodyConfigSourceStatus extends TeaModel {
        /**
         * <p>The processing progress. For memory trajectory, the format is {processTimeNs, watermarkMs}. For dataset, the format is {seq}. For manual, the format is {}. For experience Dataset follow, the seq field uses an exact int64 decimal string.</p>
         */
        @NameInMap("checkpoint")
        public java.util.Map<String, ?> checkpoint;

        /**
         * <p>The current reserved sequence window for experience Dataset follow, in the format of {after, until, runId}. All sequence numbers are decimal strings. If a failure occurs, the submitted checkpoint is not advanced.</p>
         */
        @NameInMap("currentWindow")
        public java.util.Map<String, String> currentWindow;

        /**
         * <p>The last desensitized error message. This field is empty when the status is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>Data source read timeout</p>
         */
        @NameInMap("lastError")
        public String lastError;

        /**
         * <p>The run ID of the last successful automatic application to the native experience library. This field is for audit purposes only.</p>
         * 
         * <strong>example:</strong>
         * <p>opr-example</p>
         */
        @NameInMap("lastRunId")
        public String lastRunId;

        /**
         * <p>The last window processing time in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01T08:00:00Z</p>
         */
        @NameInMap("lastWindowAt")
        public String lastWindowAt;

        /**
         * <p>The number of consecutive retries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("retryCount")
        public Integer retryCount;

        /**
         * <p>The state of the data source. Valid values: Validating, Ready, Running, Retrying, Paused, SourceSchemaChanged, and Failed.</p>
         * 
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

        public GetContextStoreResponseBodyConfigSourceStatus setCurrentWindow(java.util.Map<String, String> currentWindow) {
            this.currentWindow = currentWindow;
            return this;
        }
        public java.util.Map<String, String> getCurrentWindow() {
            return this.currentWindow;
        }

        public GetContextStoreResponseBodyConfigSourceStatus setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public GetContextStoreResponseBodyConfigSourceStatus setLastRunId(String lastRunId) {
            this.lastRunId = lastRunId;
            return this;
        }
        public String getLastRunId() {
            return this.lastRunId;
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
         * <p>The allowed storage actions. Default value: all actions. Valid values: ADD, UPDATE, MERGE, and DELETE.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ADD&quot;,&quot;UPDATE&quot;,&quot;MERGE&quot;,&quot;DELETE&quot;]</p>
         */
        @NameInMap("allowedActions")
        public java.util.List<String> allowedActions;

        /**
         * <p>Specifies whether to enable deduplication in event mode. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dedupe")
        public Boolean dedupe;

        /**
         * <p>Specifies whether to enable human edit protection. Default value: true. When enabled, automatic extraction does not overwrite manually modified memories.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("humanEditProtection")
        public Boolean humanEditProtection;

        /**
         * <p>The merge key for upsert operations. Default value: semantic. Valid values: factKey, semantic, and both.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic</p>
         */
        @NameInMap("mergeKey")
        public String mergeKey;

        /**
         * <p>The storage mode. Default value: upsert. Valid values: event (event append) and upsert (merge update).</p>
         * 
         * <strong>example:</strong>
         * <p>upsert</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The similarity threshold for semantic merging. Valid values: 0 to 1. Default value: 0.4.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("similarityThreshold")
        public Double similarityThreshold;

        /**
         * <p>The number of days before memories expire. A value of 0 indicates that memories do not expire.</p>
         * 
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
        /**
         * <p>The audit configuration.</p>
         */
        @NameInMap("audit")
        public GetContextStoreResponseBodyConfigAudit audit;

        /**
         * <p>The extraction policies. You can configure 1 to 10 policies. The strategyVersion parameter indicates the snapshot version of the entire library configuration.</p>
         */
        @NameInMap("extractionPolicies")
        public java.util.List<GetContextStoreResponseBodyConfigExtractionPolicies> extractionPolicies;

        /**
         * <p>The extraction policy for the memory type.</p>
         */
        @NameInMap("extractionPolicy")
        public GetContextStoreResponseBodyConfigExtractionPolicy extractionPolicy;

        /**
         * <p>The system-assigned coordinates of the event Logstore for the memory type. The Logstore is located in the Simple Log Service (SLS) project bound to the AgentSpace.</p>
         */
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
         * <p>The interval for experience mining. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d.</p>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        @NameInMap("miningInterval")
        public String miningInterval;

        /**
         * <p>The name of the internal running task associated with the server. For continuous libraries, it is used to view consumption records in read-only mode. For manual libraries, it can run limited mining. It is not inferred by the client and cannot replace the ingestion and recall criteria of the native experience library.</p>
         * 
         * <strong>example:</strong>
         * <p>experience-review-library</p>
         */
        @NameInMap("miningTaskName")
        public String miningTaskName;

        /**
         * <p>The observability resource coordinates (memory type).</p>
         */
        @NameInMap("observability")
        public GetContextStoreResponseBodyConfigObservability observability;

        /**
         * <p>The location of the memory output dataset (memory type).</p>
         */
        @NameInMap("outputDataset")
        public GetContextStoreResponseBodyConfigOutputDataset outputDataset;

        /**
         * <p>The scope constraint policy.</p>
         */
        @NameInMap("scopePolicy")
        public GetContextStoreResponseBodyConfigScopePolicy scopePolicy;

        /**
         * <p>The list of service names used to locate the trace data source together with source.agentSpace. This parameter cannot be modified in the current phase.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
         */
        @NameInMap("serviceNames")
        public java.util.List<String> serviceNames;

        /**
         * <p>The data source configuration provided by the user, which serves only as the root identifier of the data source.</p>
         */
        @NameInMap("source")
        public GetContextStoreResponseBodyConfigSource source;

        /**
         * <p>The running status of the data source, applicable to the memory type and experience Dataset follow mode. The experience library submits a checkpoint only after it is published and automatically applied successfully. Pausing and restarting retain the checkpoint.</p>
         */
        @NameInMap("sourceStatus")
        public GetContextStoreResponseBodyConfigSourceStatus sourceStatus;

        @NameInMap("storageModes")
        public java.util.List<String> storageModes;

        /**
         * <p>The storage policy for the memory type.</p>
         */
        @NameInMap("storagePolicy")
        public GetContextStoreResponseBodyConfigStoragePolicy storagePolicy;

        /**
         * <p>The currently effective strategy version number for the memory type.</p>
         * 
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

        public GetContextStoreResponseBodyConfig setExtractionPolicies(java.util.List<GetContextStoreResponseBodyConfigExtractionPolicies> extractionPolicies) {
            this.extractionPolicies = extractionPolicies;
            return this;
        }
        public java.util.List<GetContextStoreResponseBodyConfigExtractionPolicies> getExtractionPolicies() {
            return this.extractionPolicies;
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

        public GetContextStoreResponseBodyConfig setMiningTaskName(String miningTaskName) {
            this.miningTaskName = miningTaskName;
            return this;
        }
        public String getMiningTaskName() {
            return this.miningTaskName;
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

        public GetContextStoreResponseBodyConfig setStorageModes(java.util.List<String> storageModes) {
            this.storageModes = storageModes;
            return this;
        }
        public java.util.List<String> getStorageModes() {
            return this.storageModes;
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
