// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The list of sub-Agents that can be called by this Agent.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallableAgents")
    public java.util.List<String> callableAgents;

    /**
     * <p>The description of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>数据分析助手</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>我的助手</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Extended metadata (key-value pairs).</p>
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
     * <p>The name of the Agent. It must be unique under the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of skills.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Skills")
    public java.util.List<String> skills;

    /**
     * <p>The system prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>你是一个数据分析助手。</p>
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
    public java.util.List<String> tools;

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
     * <p>The visibility scope. The corresponding field is selected based on Visibility.</p>
     */
    @NameInMap("VisibilityScope")
    public CreateAgentRequestVisibilityScope visibilityScope;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setCallableAgents(java.util.List<String> callableAgents) {
        this.callableAgents = callableAgents;
        return this;
    }
    public java.util.List<String> getCallableAgents() {
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

    public CreateAgentRequest setSkills(java.util.List<String> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<String> getSkills() {
        return this.skills;
    }

    public CreateAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateAgentRequest setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
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

    public static class CreateAgentRequestVisibilityScope extends TeaModel {
        /**
         * <p>The list of visible project IDs. Takes effect when Visibility is <code>PROJECT</code>.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>The list of visible user IDs. Takes effect when Visibility is <code>USER</code>.</p>
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
