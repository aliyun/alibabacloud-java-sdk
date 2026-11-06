// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    /**
     * <p>The list of callable sub-agent references. For non-empty references, the referenced sub-agents must be visible. The agent cannot reference itself or form a call loop. Omit this parameter if no modification is required. Do not use an empty array to express general retention or clearing semantics.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;data-analysis&quot;}]</p>
     */
    @NameInMap("CallableAgents")
    public java.util.List<UpdateAgentRequestCallableAgents> callableAgents;

    /**
     * <p>The description of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Data analytics assistant</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>My Assistant</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The agent definition version used for concurrency control. We recommend that you explicitly specify the AgentVersion just obtained from GetAgent for each call. The update is rejected if the version does not match the current version on the server. To ensure compatibility with different deployment versions, do not rely on the server-side processing when this parameter is omitted.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExpectedVersion")
    public Integer expectedVersion;

    /**
     * <p>The list of expert suite references. If omitted, existing references are retained. An explicit empty array clears the references. For official suites, specify only Source=OFFICIAL and SuiteId. Version, VersionSelector, or client artifact fields are not accepted. For custom suites, use SuiteId, and you can explicitly specify an existing integer Version.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SuiteId&quot;:&quot;suite_example&quot;,&quot;Version&quot;:3}]</p>
     */
    @NameInMap("ExpertSuites")
    public java.util.List<UpdateAgentRequestExpertSuites> expertSuites;

    /**
     * <p>The extended metadata. If omitted, existing metadata is retained. If passed, business metadata is updated, and the server retains protected system metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>The model configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *           &quot;modelName&quot;: &quot;dataworks-public-bailian/qwen-max&quot;
     *         }</p>
     */
    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    /**
     * <p>The name of the agent to be updated. Use the Name returned by GetAgent. This field is used to locate the target agent and cannot be used to rename the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to publish the agent immediately after the update. Valid values: true: saves a new draft version first and then requests publishing. false or omitted: saves only the definition. Saving and publishing are not atomic operations. If the operation fails, call GetAgent to read the current version back before retrying, to avoid blindly repeating the update.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PublishImmediately")
    public Boolean publishImmediately;

    /**
     * <p>The list of skill references. Omit this parameter if no modification is required. Do not use an empty array to indicate retention or clearing. For official skills, specify only Source=OFFICIAL and SkillId. Name, Version, VersionSelector, or client artifact fields are not accepted. For custom skills, specify Name, and you can explicitly specify an existing integer Version.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Source&quot;:&quot;OFFICIAL&quot;,&quot;SkillId&quot;:&quot;dataworks-semantic&quot;}]</p>
     */
    @NameInMap("Skills")
    public java.util.List<UpdateAgentRequestSkills> skills;

    /**
     * <p>The system prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>You are an excellent ETL engineer</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The list of tool references. Omit this parameter if no modification is required. The current new backend retains existing tools even if an empty array is passed. A non-empty array replaces the references. Each item must include Kind and the corresponding configuration, and cannot include only Name. Replace the MCP service and tool names in the example with actual values available to the current identity.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Kind&quot;:&quot;MCP_TOOLSET&quot;,&quot;McpServerName&quot;:&quot;mcp-a&quot;,&quot;McpItems&quot;:[&quot;only-this-tool&quot;]}]</p>
     */
    @NameInMap("Tools")
    public java.util.List<UpdateAgentRequestTools> tools;

    /**
     * <p>The visibility level. Valid values: <br><code>TENANT</code>: visible within the account. <br><code>PROJECT</code>: visible to specified projects. <br><code>USER</code>: visible to specified users.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The visibility scope. The corresponding field is used based on the Visibility parameter.</p>
     */
    @NameInMap("VisibilityScope")
    public UpdateAgentRequestVisibilityScope visibilityScope;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRequest setCallableAgents(java.util.List<UpdateAgentRequestCallableAgents> callableAgents) {
        this.callableAgents = callableAgents;
        return this;
    }
    public java.util.List<UpdateAgentRequestCallableAgents> getCallableAgents() {
        return this.callableAgents;
    }

    public UpdateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAgentRequest setExpectedVersion(Integer expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Integer getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateAgentRequest setExpertSuites(java.util.List<UpdateAgentRequestExpertSuites> expertSuites) {
        this.expertSuites = expertSuites;
        return this;
    }
    public java.util.List<UpdateAgentRequestExpertSuites> getExpertSuites() {
        return this.expertSuites;
    }

    public UpdateAgentRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public UpdateAgentRequest setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public UpdateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAgentRequest setPublishImmediately(Boolean publishImmediately) {
        this.publishImmediately = publishImmediately;
        return this;
    }
    public Boolean getPublishImmediately() {
        return this.publishImmediately;
    }

    public UpdateAgentRequest setSkills(java.util.List<UpdateAgentRequestSkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<UpdateAgentRequestSkills> getSkills() {
        return this.skills;
    }

    public UpdateAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateAgentRequest setTools(java.util.List<UpdateAgentRequestTools> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<UpdateAgentRequestTools> getTools() {
        return this.tools;
    }

    public UpdateAgentRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public UpdateAgentRequest setVisibilityScope(UpdateAgentRequestVisibilityScope visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }
    public UpdateAgentRequestVisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static class UpdateAgentRequestCallableAgents extends TeaModel {
        /**
         * <p>The name of the called sub-agent. The agent must be one that the current caller has permissions to use.</p>
         * 
         * <strong>example:</strong>
         * <p>data-analysis</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateAgentRequestCallableAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestCallableAgents self = new UpdateAgentRequestCallableAgents();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestCallableAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateAgentRequestExpertSuites extends TeaModel {
        /**
         * <p>The source of the expert suite. OFFICIAL: official suite. DB or omitted: custom suite. Both types of references use SuiteId. Version fields apply only to custom resources.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the target expert suite. The suite must be one that the current caller has permissions to reference.</p>
         * 
         * <strong>example:</strong>
         * <p>suite_example</p>
         */
        @NameInMap("SuiteId")
        public String suiteId;

        /**
         * <p>The published integer version number of the custom expert suite, used to explicitly select an existing version. Do not pass this field when Source is set to OFFICIAL. This parameter is mutually exclusive with VersionSelector. To obtain explicit and reproducible references, do not rely on the default selection when the version is omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The semantic version selection expression of the custom expert suite, such as ^1.2.3. Use this parameter only when the custom resource version selection capability is deployed on the target server. This parameter is mutually exclusive with Version. This field is not accepted when Source is set to OFFICIAL. To ensure compatibility with servers whose version capabilities are unconfirmed, use an existing integer Version.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static UpdateAgentRequestExpertSuites build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestExpertSuites self = new UpdateAgentRequestExpertSuites();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestExpertSuites setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAgentRequestExpertSuites setSuiteId(String suiteId) {
            this.suiteId = suiteId;
            return this;
        }
        public String getSuiteId() {
            return this.suiteId;
        }

        public UpdateAgentRequestExpertSuites setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public UpdateAgentRequestExpertSuites setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class UpdateAgentRequestSkills extends TeaModel {
        /**
         * <p>The name of the custom skill. Use the Name of a visible custom skill. For official skills, use SkillId.</p>
         * 
         * <strong>example:</strong>
         * <p>my-business-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resource ID of the official skill. This parameter is used when Source is set to OFFICIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-semantic</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The source of the skill. OFFICIAL: official skill, used with SkillId. DB or omitted: custom skill, used with Name.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The published integer version number of the custom skill, used to explicitly select an existing version. Do not pass this field when Source is set to OFFICIAL. This parameter is mutually exclusive with VersionSelector.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The semantic version selection expression of the custom skill, such as ^1.2.3. Use this parameter only when the custom resource version selection capability is deployed on the target server. This parameter is mutually exclusive with Version. This field is not accepted when Source is set to OFFICIAL. To ensure compatibility with servers whose version capabilities are unconfirmed, use an existing integer Version.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static UpdateAgentRequestSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestSkills self = new UpdateAgentRequestSkills();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAgentRequestSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public UpdateAgentRequestSkills setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAgentRequestSkills setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public UpdateAgentRequestSkills setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class UpdateAgentRequestTools extends TeaModel {
        /**
         * <p>The name of the built-in toolset. This parameter is required when Kind is set to BUILTIN_TOOLSET. Use a name supported by the target server. Omit this parameter when Kind is set to MCP_TOOLSET.</p>
         * 
         * <strong>example:</strong>
         * <p>web_search</p>
         */
        @NameInMap("BuiltinName")
        public String builtinName;

        /**
         * <p>The tool type. A valid tool reference must specify BUILTIN_TOOLSET or MCP_TOOLSET. For BUILTIN_TOOLSET, BuiltinName must also be specified. For MCP_TOOLSET, McpServerName must also be specified. The target server validates the reference based on the tool type.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_TOOLSET</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The list of selected MCP tool names. If this parameter is omitted or an empty array is passed, tools are not filtered by name. Each item must be the name of a tool that actually exists in the target service.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;only-this-tool&quot;]</p>
         */
        @NameInMap("McpItems")
        public java.util.List<String> mcpItems;

        /**
         * <p>The MCP service name. This parameter is required when Kind is set to MCP_TOOLSET. The service must be one that the current invoker has permissions to reference and that has an active published version.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-a</p>
         */
        @NameInMap("McpServerName")
        public String mcpServerName;

        /**
         * <p>A field retained from the legacy model. Specifying only Name does not constitute a valid tool configuration and cannot replace Kind, BuiltinName, or McpServerName.</p>
         * 
         * <strong>example:</strong>
         * <p>search_tables</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateAgentRequestTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestTools self = new UpdateAgentRequestTools();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestTools setBuiltinName(String builtinName) {
            this.builtinName = builtinName;
            return this;
        }
        public String getBuiltinName() {
            return this.builtinName;
        }

        public UpdateAgentRequestTools setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdateAgentRequestTools setMcpItems(java.util.List<String> mcpItems) {
            this.mcpItems = mcpItems;
            return this;
        }
        public java.util.List<String> getMcpItems() {
            return this.mcpItems;
        }

        public UpdateAgentRequestTools setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public UpdateAgentRequestTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateAgentRequestVisibilityScope extends TeaModel {
        /**
         * <p>The list of visible project IDs. This parameter takes effect when Visibility is set to <code>PROJECT</code>.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>The list of visible user IDs. This parameter is used when Visibility is set to USER.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateAgentRequestVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentRequestVisibilityScope self = new UpdateAgentRequestVisibilityScope();
            return TeaModel.build(map, self);
        }

        public UpdateAgentRequestVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public UpdateAgentRequestVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
