// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The description of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Analyze code changes and generate code review comments</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Code review agent</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The list of knowledge base references, which can contain at most one element.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review-guidelines&quot;}]</p>
     */
    @NameInMap("KnowledgeBases")
    public Object knowledgeBases;

    /**
     * <p>The name of the agent, which is also the unique identifier that cannot be modified after creation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of skill references. For specific fields, refer to the supplementary description of request parameters.</p>
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
     * <p>Check the correctness, security, and maintainability of code changes in the code review, and provide review comments based on severity</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The list of references to MCP server and connector names. The same array supports both types of entries. Specify only one type of reference for each entry. For MCP, omitting items indicates all public tools, and historically specified items retain their original values.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mcpServerName&quot;:&quot;code-repository-mcp&quot;},{&quot;connectorName&quot;:&quot;code-review-data&quot;}]</p>
     */
    @NameInMap("Tools")
    public Object tools;

    /**
     * <p>The visibility scope of the agent. Valid values: user and tenant. Default value: user.</p>
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
