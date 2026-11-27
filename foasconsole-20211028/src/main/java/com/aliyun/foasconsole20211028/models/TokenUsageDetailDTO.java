// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class TokenUsageDetailDTO extends TeaModel {
    /**
     * <p>The associated items of the intelligent assistant, such as jobs and deployments.</p>
     */
    @NameInMap("BizObjects")
    public java.util.List<TokenUsageDetailDTOBizObjects> bizObjects;

    /**
     * <p>namespace</p>
     * 
     * <strong>example:</strong>
     * <p>test-default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The time when the request is initiated, in epoch milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1790651783392</p>
     */
    @NameInMap("OccurredAt")
    public Long occurredAt;

    /**
     * <p>The inspection configuration.</p>
     */
    @NameInMap("ScopeConfig")
    public TokenUsageDetailDTOScopeConfig scopeConfig;

    /**
     * <p>The inspection type.</p>
     * 
     * <strong>example:</strong>
     * <p>TAG</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The session ID shared across multiple requests in the same session.</p>
     * 
     * <strong>example:</strong>
     * <p>conv_1790651642778_azcvjyh</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of jobs covered by the inspection.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalJobs")
    public Integer totalJobs;

    /**
     * <p>The number of tokens consumed by this request.</p>
     * 
     * <strong>example:</strong>
     * <p>1287</p>
     */
    @NameInMap("TotalTokens")
    public Long totalTokens;

    /**
     * <p>The request trigger type, such as cron or manual.</p>
     * 
     * <strong>example:</strong>
     * <p>CRON</p>
     */
    @NameInMap("TriggerSource")
    public String triggerSource;

    /**
     * <p>The token consumption scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>ai_assistant</p>
     */
    @NameInMap("UsageType")
    public String usageType;

    /**
     * <p>workspace</p>
     * 
     * <strong>example:</strong>
     * <p>c278e83dff5b41</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static TokenUsageDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        TokenUsageDetailDTO self = new TokenUsageDetailDTO();
        return TeaModel.build(map, self);
    }

    public TokenUsageDetailDTO setBizObjects(java.util.List<TokenUsageDetailDTOBizObjects> bizObjects) {
        this.bizObjects = bizObjects;
        return this;
    }
    public java.util.List<TokenUsageDetailDTOBizObjects> getBizObjects() {
        return this.bizObjects;
    }

    public TokenUsageDetailDTO setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public TokenUsageDetailDTO setOccurredAt(Long occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }
    public Long getOccurredAt() {
        return this.occurredAt;
    }

    public TokenUsageDetailDTO setScopeConfig(TokenUsageDetailDTOScopeConfig scopeConfig) {
        this.scopeConfig = scopeConfig;
        return this;
    }
    public TokenUsageDetailDTOScopeConfig getScopeConfig() {
        return this.scopeConfig;
    }

    public TokenUsageDetailDTO setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public TokenUsageDetailDTO setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public TokenUsageDetailDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TokenUsageDetailDTO setTotalJobs(Integer totalJobs) {
        this.totalJobs = totalJobs;
        return this;
    }
    public Integer getTotalJobs() {
        return this.totalJobs;
    }

    public TokenUsageDetailDTO setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public TokenUsageDetailDTO setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
        return this;
    }
    public String getTriggerSource() {
        return this.triggerSource;
    }

    public TokenUsageDetailDTO setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public TokenUsageDetailDTO setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class TokenUsageDetailDTOBizObjects extends TeaModel {
        /**
         * <p>The ID of the associated item.</p>
         * 
         * <strong>example:</strong>
         * <p>4c9102f7-51d2-4494-9ea2-468e3c407ad8</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the associated item.</p>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The name of the associated item.</p>
         * 
         * <strong>example:</strong>
         * <p>deployemnt-draft</p>
         */
        @NameInMap("Name")
        public String name;

        public static TokenUsageDetailDTOBizObjects build(java.util.Map<String, ?> map) throws Exception {
            TokenUsageDetailDTOBizObjects self = new TokenUsageDetailDTOBizObjects();
            return TeaModel.build(map, self);
        }

        public TokenUsageDetailDTOBizObjects setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TokenUsageDetailDTOBizObjects setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public TokenUsageDetailDTOBizObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TokenUsageDetailDTOScopeConfig extends TeaModel {
        /**
         * <p>The list of deployments selected for inspection.</p>
         */
        @NameInMap("DeploymentIds")
        public java.util.List<String> deploymentIds;

        /**
         * <p>The tag configuration selected for inspection.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, java.util.List<String>> tags;

        public static TokenUsageDetailDTOScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            TokenUsageDetailDTOScopeConfig self = new TokenUsageDetailDTOScopeConfig();
            return TeaModel.build(map, self);
        }

        public TokenUsageDetailDTOScopeConfig setDeploymentIds(java.util.List<String> deploymentIds) {
            this.deploymentIds = deploymentIds;
            return this;
        }
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        public TokenUsageDetailDTOScopeConfig setTags(java.util.Map<String, java.util.List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

    }

}
