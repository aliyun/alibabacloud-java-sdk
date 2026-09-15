// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateExternalAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateExternalAgentRequestBody body;

    /**
     * <p>The reserved idempotency token. The backend does not provide idempotency guarantees in the current phase.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateExternalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExternalAgentRequest self = new UpdateExternalAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExternalAgentRequest setBody(UpdateExternalAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateExternalAgentRequestBody getBody() {
        return this.body;
    }

    public UpdateExternalAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateExternalAgentRequestBodyModelQuota extends TeaModel {
        /**
         * <p>Specifies whether to enable token quota. Defaults to true if not specified. Set to false to disable and delete existing quota rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. Required by backend validation when quota is enabled. Fixed value: token.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>The quota statistical period. Required by backend validation when quota is enabled. Valid values: day (daily) and month (monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The maximum number of tokens that can be consumed within a single period. Required by backend validation when quota is enabled. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        public static UpdateExternalAgentRequestBodyModelQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyModelQuota self = new UpdateExternalAgentRequestBodyModelQuota();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateExternalAgentRequestBodyModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateExternalAgentRequestBodyModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public UpdateExternalAgentRequestBodyModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class UpdateExternalAgentRequestBodyModel extends TeaModel {
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

        /**
         * <p>The model token quota configuration. If not specified, no quota is configured.</p>
         */
        @NameInMap("quota")
        public UpdateExternalAgentRequestBodyModelQuota quota;

        public static UpdateExternalAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyModel self = new UpdateExternalAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public UpdateExternalAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateExternalAgentRequestBodyModel setQuota(UpdateExternalAgentRequestBodyModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public UpdateExternalAgentRequestBodyModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class UpdateExternalAgentRequestBodySkills extends TeaModel {
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

        public static UpdateExternalAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodySkills self = new UpdateExternalAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateExternalAgentRequestBodyTemplateAiRegistry extends TeaModel {
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

        public static UpdateExternalAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyTemplateAiRegistry self = new UpdateExternalAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateExternalAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public UpdateExternalAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static UpdateExternalAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyTemplate self = new UpdateExternalAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyTemplate setAiRegistry(UpdateExternalAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public UpdateExternalAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class UpdateExternalAgentRequestBodyTools extends TeaModel {
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

        public static UpdateExternalAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyTools self = new UpdateExternalAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateExternalAgentRequestBody extends TeaModel {
        /**
         * <p>The description of the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>A code review agent running in the user environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configuration. Available only when modelSource is set to PLATFORM.</p>
         */
        @NameInMap("model")
        public UpdateExternalAgentRequestBodyModel model;

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
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateExternalAgentRequestBodySkills> skills;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public UpdateExternalAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateExternalAgentRequestBodyTools> tools;

        public static UpdateExternalAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBody self = new UpdateExternalAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExternalAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateExternalAgentRequestBody setModel(UpdateExternalAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public UpdateExternalAgentRequestBodyModel getModel() {
            return this.model;
        }

        public UpdateExternalAgentRequestBody setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public UpdateExternalAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBody setSkills(java.util.List<UpdateExternalAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateExternalAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public UpdateExternalAgentRequestBody setTemplate(UpdateExternalAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateExternalAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public UpdateExternalAgentRequestBody setTools(java.util.List<UpdateExternalAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateExternalAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
