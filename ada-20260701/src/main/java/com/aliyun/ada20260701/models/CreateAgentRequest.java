// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The description of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Analyzes code changes and generates CR review comments</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>CR Code Review Agent</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The knowledge base reference list, which contains at most one element.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review-guidelines&quot;}]</p>
     */
    @NameInMap("KnowledgeBases")
    public Object knowledgeBases;

    /**
     * <p>The Agent name, which is also the unique identifier that cannot be modified after creation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Skill reference list. For specific fields, see &quot;Supplementary description of request parameters&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review&quot;}]</p>
     */
    @NameInMap("Skills")
    public Object skills;

    /**
     * <p>The system prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Check the correctness, security, and maintainability of code changes in the CR, and provide review comments by severity</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The reference list of MCP Server and Connector names. The same array supports both types of entries. Each entry specifies one type of reference. If items is omitted for an MCP Server, all public tools are included. Previously specified items retain their original values.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mcpServerName&quot;:&quot;code-repository-mcp&quot;},{&quot;connectorName&quot;:&quot;code-review-data&quot;}]</p>
     */
    @NameInMap("Tools")
    public Object tools;

    /**
     * <p>The visibility scope of the Agent. Valid values:</p>
     * <ul>
     * <li>user</li>
     * <li>tenant</li>
     * </ul>
     * <p>Default value: user.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
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

    public CreateAgentRequest setKnowledgeBases(Object knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
        return this;
    }
    public Object getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public CreateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentRequest setSkills(Object skills) {
        this.skills = skills;
        return this;
    }
    public Object getSkills() {
        return this.skills;
    }

    public CreateAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateAgentRequest setTools(Object tools) {
        this.tools = tools;
        return this;
    }
    public Object getTools() {
        return this.tools;
    }

    public CreateAgentRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
