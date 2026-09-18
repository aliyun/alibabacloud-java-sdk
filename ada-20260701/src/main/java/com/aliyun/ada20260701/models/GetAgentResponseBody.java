// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    /**
     * <p>Agent ID。</p>
     * 
     * <strong>example:</strong>
     * <p>agent_00000000000000000000000000000001</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The current configuration revision number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AgentVersion")
    public Long agentVersion;

    /**
     * <p>Indicates whether the current identity can delete the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanDelete")
    public Boolean canDelete;

    /**
     * <p>Indicates whether the current identity can modify the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanModify")
    public Boolean canModify;

    /**
     * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1788332400000</p>
     */
    @NameInMap("CreatedAt")
    public Long createdAt;

    /**
     * <p>The description of the agent. This field may not be returned if it is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>Analyzes code changes and generates CR review comments</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the agent. This field may not be returned if it is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>CR Code Review Agent</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The list of knowledge base references. The list contains at most one element.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review-guidelines&quot;}]</p>
     */
    @NameInMap("KnowledgeBases")
    public Object knowledgeBases;

    /**
     * <p>The display metadata of the agent. For specific fields, see &quot;Supplementary description of response elements&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;iconUrl&quot;:&quot;<a href="https://example.com/icons/code-review-agent.png%22%7D">https://example.com/icons/code-review-agent.png&quot;}</a></p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The saved model configuration. This field is returned only for official agents. The value supports an object array and is compatible with legacy single objects and strings. An empty array returns [ \]. Object arrays preserve the original order, duplicate names, and object fields.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;base&quot;,&quot;default&quot;:true},{&quot;name&quot;:&quot;base&quot;},{&quot;name&quot;:&quot;base&quot;,&quot;settings&quot;:{&quot;thinking&quot;:false,&quot;topK&quot;:5}}]</p>
     */
    @NameInMap("Model")
    public Object model;

    /**
     * <p>The name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the agent is an official agent provided by the platform.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Official")
    public Boolean official;

    /**
     * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of skill references. For specific fields, see &quot;Supplementary description of response elements&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review&quot;}]</p>
     */
    @NameInMap("Skills")
    public Object skills;

    /**
     * <p>The status of the agent. The default status of a newly created agent is <code>draft</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The system prompt. This field may not be returned if it is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>Check the correctness, security, and maintainability of code changes in the CR, and provide review comments by severity</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The list of MCP Server and Connector name references. For element fields, see the following section.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mcpServerName&quot;:&quot;code-repository-mcp&quot;},{&quot;connectorName&quot;:&quot;code-review-data&quot;}]</p>
     */
    @NameInMap("Tools")
    public Object tools;

    /**
     * <p>The most recent update time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1788332700000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    /**
     * <p>The visibility scope of the agent. Valid values: <code>user</code> and <code>tenant</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetAgentResponseBody setAgentVersion(Long agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public Long getAgentVersion() {
        return this.agentVersion;
    }

    public GetAgentResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public GetAgentResponseBody setCanModify(Boolean canModify) {
        this.canModify = canModify;
        return this;
    }
    public Boolean getCanModify() {
        return this.canModify;
    }

    public GetAgentResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetAgentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAgentResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetAgentResponseBody setKnowledgeBases(Object knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
        return this;
    }
    public Object getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public GetAgentResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetAgentResponseBody setModel(Object model) {
        this.model = model;
        return this;
    }
    public Object getModel() {
        return this.model;
    }

    public GetAgentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAgentResponseBody setOfficial(Boolean official) {
        this.official = official;
        return this;
    }
    public Boolean getOfficial() {
        return this.official;
    }

    public GetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentResponseBody setSkills(Object skills) {
        this.skills = skills;
        return this;
    }
    public Object getSkills() {
        return this.skills;
    }

    public GetAgentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAgentResponseBody setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public GetAgentResponseBody setTools(Object tools) {
        this.tools = tools;
        return this;
    }
    public Object getTools() {
        return this.tools;
    }

    public GetAgentResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public GetAgentResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
