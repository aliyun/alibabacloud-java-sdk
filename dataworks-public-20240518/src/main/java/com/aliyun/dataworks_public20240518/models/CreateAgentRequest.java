// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The list of sub-agents that can be called by this agent.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallableAgents")
    public java.util.List<CreateAgentRequestCallableAgents> callableAgents;

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
     * <p>The released expert suites bound to the agent. For personal or enterprise suites, use SuiteId and optionally specify a fixed Version or VersionSelector. For official suites, you must explicitly set Source to OFFICIAL and specify the SuiteId from the official catalog. Do not specify Version or VersionSelector. If this parameter is not specified, an empty list is created, and official suites are not loaded by default.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Source&quot;:&quot;OFFICIAL&quot;,&quot;SuiteId&quot;:&quot;dataworks-data-analysis-extension&quot;},{&quot;SuiteId&quot;:&quot;suite_example&quot;,&quot;Version&quot;:1}]</p>
     */
    @NameInMap("ExpertSuites")
    public java.util.List<CreateAgentRequestExpertSuites> expertSuites;

    /**
     * <p>The extended metadata as key-value pairs.</p>
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
     * <p>The name of the agent. It must be unique within the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to publish the agent immediately after creation. Valid values:</p>
     * <ul>
     * <li>true: Publishes the created version.</li>
     * <li>false or omitted: Retains the original behavior of creating a draft only.
     * Saving and publishing are not atomic operations. If publishing fails, the draft may already exist. Query the agent before retrying to avoid duplicate creation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PublishImmediately")
    public Boolean publishImmediately;

    /**
     * <p>The list of skills.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Skills")
    public java.util.List<CreateAgentRequestSkills> skills;

    /**
     * <p>The system prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>You are a data analytics assistant.</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The list of tools.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Tools")
    public java.util.List<CreateAgentRequestTools> tools;

    /**
     * <p>The visibility level. Valid values:<br>
     * <code>TENANT</code>: Visible within the account.<br>
     * <code>PROJECT</code>: Visible to specified projects.<br>
     * <code>USER</code>: Visible to specified users.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The visibility scope. The corresponding fields are used based on the Visibility parameter.</p>
     */
    @NameInMap("VisibilityScope")
    public CreateAgentRequestVisibilityScope visibilityScope;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setCallableAgents(java.util.List<CreateAgentRequestCallableAgents> callableAgents) {
        this.callableAgents = callableAgents;
        return this;
    }
    public java.util.List<CreateAgentRequestCallableAgents> getCallableAgents() {
        return this.callableAgents;
    }

    public CreateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAgentRequest setExpertSuites(java.util.List<CreateAgentRequestExpertSuites> expertSuites) {
        this.expertSuites = expertSuites;
        return this;
    }
    public java.util.List<CreateAgentRequestExpertSuites> getExpertSuites() {
        return this.expertSuites;
    }

    public CreateAgentRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateAgentRequest setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public CreateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentRequest setPublishImmediately(Boolean publishImmediately) {
        this.publishImmediately = publishImmediately;
        return this;
    }
    public Boolean getPublishImmediately() {
        return this.publishImmediately;
    }

    public CreateAgentRequest setSkills(java.util.List<CreateAgentRequestSkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<CreateAgentRequestSkills> getSkills() {
        return this.skills;
    }

    public CreateAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateAgentRequest setTools(java.util.List<CreateAgentRequestTools> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<CreateAgentRequestTools> getTools() {
        return this.tools;
    }

    public CreateAgentRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateAgentRequest setVisibilityScope(CreateAgentRequestVisibilityScope visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }
    public CreateAgentRequestVisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static class CreateAgentRequestCallableAgents extends TeaModel {
        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateAgentRequestCallableAgents build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestCallableAgents self = new CreateAgentRequestCallableAgents();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestCallableAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAgentRequestExpertSuites extends TeaModel {
        /**
         * <p>The source of the expert suite. Valid values: OFFICIAL: official catalog resources. DB: personal or enterprise resources. If this parameter is omitted, the original database resource query semantics are retained. For official resources, the artifact version is fixed when the agent is released.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the expert suite. When you specify expert suite references, each item must include a SuiteId, which is verified by the server. When Source is set to OFFICIAL, this is the official catalog ID. Otherwise, this is the ID returned by expert suite management. The referenced resource must be visible to the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-data-analysis-extension</p>
         */
        @NameInMap("SuiteId")
        public String suiteId;

        /**
         * <p>The fixed integer revision number of a released snapshot. This parameter applies only to personal or enterprise suites and is mutually exclusive with VersionSelector. Releasing a new version does not change the fixed reference. If both parameters are omitted, the latest version is used for each new session. Do not specify this parameter when Source is set to OFFICIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The version selection expression. This parameter applies only to personal or enterprise resources and is mutually exclusive with Version. It supports exact semantic versions, latest, and the full npm/node-semver range syntax, such as 1.2.*, ^1.2.3, ~1.2.3, &gt;=1.0.0 &lt;2.0.0, and 1.x || 2.x. If both parameters are omitted, latest is used, and the highest matching released version is selected for each new session. Existing fixed integer references remain unchanged. Do not specify this parameter when Source is set to OFFICIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static CreateAgentRequestExpertSuites build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestExpertSuites self = new CreateAgentRequestExpertSuites();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestExpertSuites setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAgentRequestExpertSuites setSuiteId(String suiteId) {
            this.suiteId = suiteId;
            return this;
        }
        public String getSuiteId() {
            return this.suiteId;
        }

        public CreateAgentRequestExpertSuites setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public CreateAgentRequestExpertSuites setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateAgentRequestSkills extends TeaModel {
        /**
         * <p>The name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The official catalog ID. Specify this parameter when Source is set to OFFICIAL. Do not specify Name, Version, or VersionSelector. Do not specify this parameter for personal or enterprise skills.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-semantic</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The source of the skill. Valid values: OFFICIAL: official catalog resources. DB: personal or enterprise resources. If this parameter is omitted, the original query-by-name semantics are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The fixed integer revision number of a released snapshot. This parameter applies only to personal or enterprise skills and is mutually exclusive with VersionSelector. Releasing a new version does not change the fixed reference. If both parameters are omitted, the latest version is used for each new session. Do not specify this parameter when Source is set to OFFICIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The version selection expression. This parameter applies only to personal or enterprise resources and is mutually exclusive with Version. It supports exact semantic versions, latest, and the full npm/node-semver range syntax, such as 1.2.*, ^1.2.3, ~1.2.3, &gt;=1.0.0 &lt;2.0.0, and 1.x || 2.x. If both parameters are omitted, latest is used, and the highest matching released version is selected for each new session. Existing fixed integer references remain unchanged. Do not specify this parameter when Source is set to OFFICIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static CreateAgentRequestSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestSkills self = new CreateAgentRequestSkills();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAgentRequestSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CreateAgentRequestSkills setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAgentRequestSkills setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public CreateAgentRequestSkills setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateAgentRequestTools extends TeaModel {
        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>server-1</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateAgentRequestTools build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestTools self = new CreateAgentRequestTools();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateAgentRequestVisibilityScope extends TeaModel {
        /**
         * <p>The list of visible project IDs. This parameter takes effect when Visibility is set to <code>PROJECT</code>.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>The list of visible user IDs. This parameter takes effect when Visibility is set to <code>USER</code>.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateAgentRequestVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentRequestVisibilityScope self = new CreateAgentRequestVisibilityScope();
            return TeaModel.build(map, self);
        }

        public CreateAgentRequestVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public CreateAgentRequestVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
