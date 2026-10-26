// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The list of child agents that can be called by this agent.</p>
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
     * <p>Agent 绑定的已发布专家套件。个人或企业套件使用 SuiteId，可选 Version；官方套件必须显式指定 Source=OFFICIAL 和官方目录中的 SuiteId，不传 Version。未传时创建为空，不会默认加载所有官方套件。</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Source&quot;:&quot;OFFICIAL&quot;,&quot;SuiteId&quot;:&quot;dataworks-data-analysis-extension&quot;},{&quot;SuiteId&quot;:&quot;suite_example&quot;,&quot;Version&quot;:1}]</p>
     */
    @NameInMap("ExpertSuites")
    public java.util.List<CreateAgentRequestExpertSuites> expertSuites;

    /**
     * <p>The extended metadata in key-value pairs.</p>
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
     * <p>The name of the agent. The name must be unique within the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>是否在创建 Agent 后立即发布。true 发布创建的版本；false 或省略保持原有仅创建草稿行为。保存与发布不是原子操作，发布失败时草稿可能已存在；重试前应先查询 Agent，避免重复创建。</p>
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
     * <p>You are a data analytics assistant</p>
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
     * <p>The visibility level.<br>
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
     * <p>The visibility scope. The corresponding field is used based on the visibility level.</p>
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
         * <p>OFFICIAL 表示官方目录资源；DB 表示个人或企业资源。省略时保持原有数据库资源查询语义。官方资源在 Agent 发布时固定制品版本。</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>传入专家套件引用时，每项需提供 SuiteId，由服务端校验。Source=OFFICIAL 时为官方目录 ID；其他情况为专家套件管理返回的 ID。引用资源必须对调用者可见。</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-data-analysis-extension</p>
         */
        @NameInMap("SuiteId")
        public String suiteId;

        /**
         * <p>仅用于个人或企业套件，必须为已发布快照的整数版本号。省略时在 Agent 发布时固定当前已发布版本。Source=OFFICIAL 时不传此字段。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

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
         * <p>Source=OFFICIAL 时传官方目录 ID，不传 Name 或 Version。个人或企业 Skill 不传此字段。</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-semantic</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>OFFICIAL 表示官方目录资源；DB 表示个人或企业资源，省略时保持原有按名称查询语义。</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>仅用于个人或企业 Skill，必须为已发布快照的整数版本。省略时在 Agent 发布时固定当前已发布版本；Source=OFFICIAL 时不传。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

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

    }

    public static class CreateAgentRequestTools extends TeaModel {
        /**
         * <p>The name of the McpServer.</p>
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
