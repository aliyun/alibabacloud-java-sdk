// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateExternalAgentRequestBody body;

    /**
     * <p>The reserved query parameter. The backend does not provide idempotency guarantees for deduplication or restoring the original acceptance result based on this identifier at this time.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateExternalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentRequest self = new CreateExternalAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentRequest setBody(CreateExternalAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalAgentRequestBody getBody() {
        return this.body;
    }

    public CreateExternalAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateExternalAgentRequestBodyEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>Required when a credential reference item is passed. Validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-example</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static CreateExternalAgentRequestBodyEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyEnvironmentCredentialReferences self = new CreateExternalAgentRequestBodyEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class CreateExternalAgentRequestBodyEnvironment extends TeaModel {
        /**
         * <p>This list must be explicitly provided and cannot be null when the environment object is passed. The list is replaced as a whole. If environment is not passed during an update, the original binding is retained. If an empty list is passed or environment is null, the binding is cleared. Only the credential ID is passed, not the actual secret key.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<CreateExternalAgentRequestBodyEnvironmentCredentialReferences> credentialReferences;

        public static CreateExternalAgentRequestBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyEnvironment self = new CreateExternalAgentRequestBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyEnvironment setCredentialReferences(java.util.List<CreateExternalAgentRequestBodyEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<CreateExternalAgentRequestBodyEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

    }

    public static class CreateExternalAgentRequestBodyModelQuota extends TeaModel {
        /**
         * <p>Specifies whether to enable the token quota. Defaults to true if not specified. Passing false disables and deletes existing quota rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. Required and validated by the backend when the quota is enabled. Fixed value: token.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>The quota statistical period. Required and validated by the backend when the quota is enabled. Valid values: day (daily) and month (monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The maximum number of tokens allowed to be consumed in a single period. Required and validated by the backend when the quota is enabled, and must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        public static CreateExternalAgentRequestBodyModelQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyModelQuota self = new CreateExternalAgentRequestBodyModelQuota();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateExternalAgentRequestBodyModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateExternalAgentRequestBodyModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public CreateExternalAgentRequestBodyModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class CreateExternalAgentRequestBodyModel extends TeaModel {
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
         * <p>The model token quota configuration. If not passed, no quota is configured.</p>
         */
        @NameInMap("quota")
        public CreateExternalAgentRequestBodyModelQuota quota;

        public static CreateExternalAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyModel self = new CreateExternalAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public CreateExternalAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateExternalAgentRequestBodyModel setQuota(CreateExternalAgentRequestBodyModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateExternalAgentRequestBodyModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class CreateExternalAgentRequestBodySkillsVersionSelector extends TeaModel {
        /**
         * <p>The version selector type. LABEL selects by tag. VERSION selects by specific version.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The selector value. For LABEL, it is the tag name (such as latest). For VERSION, it is the specific version number.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateExternalAgentRequestBodySkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodySkillsVersionSelector self = new CreateExternalAgentRequestBodySkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodySkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateExternalAgentRequestBodySkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateExternalAgentRequestBodySkills extends TeaModel {
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
         * <p>The skill source type. REFERENCE references the AI Registry. STATIC is statically provided with the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>REFERENCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The skill version field for compatibility with legacy requests. Use sourceType and versionSelector for new requests. Do not submit it in combination with sourceType.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The skill reference version selector. Supports LABEL tags and VERSION specific versions. Defaults to LABEL/latest if omitted. Selectors are not provided for STATIC sources.</p>
         */
        @NameInMap("versionSelector")
        public CreateExternalAgentRequestBodySkillsVersionSelector versionSelector;

        public static CreateExternalAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodySkills self = new CreateExternalAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBodySkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public CreateExternalAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateExternalAgentRequestBodySkills setVersionSelector(CreateExternalAgentRequestBodySkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public CreateExternalAgentRequestBodySkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateExternalAgentRequestBodyTemplateAiRegistry extends TeaModel {
        /**
         * <p>The name of the template in the AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-template</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the template in the AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateExternalAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyTemplateAiRegistry self = new CreateExternalAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateExternalAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public CreateExternalAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static CreateExternalAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyTemplate self = new CreateExternalAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyTemplate setAiRegistry(CreateExternalAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public CreateExternalAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class CreateExternalAgentRequestBodyTools extends TeaModel {
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
         * <p>The tool type. Valid values: MCP (MCP tool).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateExternalAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyTools self = new CreateExternalAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateExternalAgentRequestBody extends TeaModel {
        /**
         * <p>The description of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Code review agent running in the user environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Optional. Credentials can be bound to both PLATFORM and RUNTIME model sources. When passing the object, you must explicitly provide a non-null credentialReferences list. Common environment variables are not supported.</p>
         */
        @NameInMap("environment")
        public CreateExternalAgentRequestBodyEnvironment environment;

        /**
         * <p>The agent instruction, used to guide the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configuration. Available only when modelSource is PLATFORM.</p>
         */
        @NameInMap("model")
        public CreateExternalAgentRequestBodyModel model;

        /**
         * <p>The source of the model configuration. PLATFORM indicates that the platform parses and delivers the model configuration. RUNTIME indicates that the external runtime manages the model itself, and the model parameter cannot be passed at the same time. Valid values: PLATFORM (platform model) and RUNTIME (runtime model).</p>
         * 
         * <strong>example:</strong>
         * <p>PLATFORM</p>
         */
        @NameInMap("modelSource")
        public String modelSource;

        /**
         * <p>The name of the managed agent.</p>
         * <p>This parameter is required.</p>
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
        public java.util.List<CreateExternalAgentRequestBodySkills> skills;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public CreateExternalAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<CreateExternalAgentRequestBodyTools> tools;

        public static CreateExternalAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBody self = new CreateExternalAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateExternalAgentRequestBody setEnvironment(CreateExternalAgentRequestBodyEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public CreateExternalAgentRequestBodyEnvironment getEnvironment() {
            return this.environment;
        }

        public CreateExternalAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateExternalAgentRequestBody setModel(CreateExternalAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public CreateExternalAgentRequestBodyModel getModel() {
            return this.model;
        }

        public CreateExternalAgentRequestBody setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public CreateExternalAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBody setSkills(java.util.List<CreateExternalAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateExternalAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public CreateExternalAgentRequestBody setTemplate(CreateExternalAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public CreateExternalAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public CreateExternalAgentRequestBody setTools(java.util.List<CreateExternalAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateExternalAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
