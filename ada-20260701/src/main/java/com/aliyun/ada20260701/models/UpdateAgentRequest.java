// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    /**
     * <p>The new description. If this parameter is not passed, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Analyze CR code changes and check for correctness, security, and maintainability</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The new display name. If this parameter is not passed, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>CR Code and Security Review Agent</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The expected current configuration revision number. This parameter is omitted by default. Pass the <code>AgentVersion</code> returned by the most recent <code>GetAgent</code> call when concurrency protection is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExpectedVersion")
    public Long expectedVersion;

    /**
     * <p>The list of knowledge base bindings, which can contain at most one element. If this parameter is not passed, the original value is retained. If a non-empty array is passed, it replaces the original value entirely. If <code>[ ]</code> is passed, all bindings are removed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review-guidelines&quot;}]</p>
     */
    @NameInMap("KnowledgeBases")
    public Object knowledgeBases;

    /**
     * <p>The name of the agent to be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of skill references. If this parameter is not passed, the original value is retained. If a non-empty array is passed, it replaces the original value entirely. If <code>[ ]</code> is passed, all bindings are removed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;code-review&quot;}]</p>
     */
    @NameInMap("Skills")
    public Object skills;

    /**
     * <p>The new system prompt. If this parameter is not passed, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Check for code defects, security risks, and compatibility issues in the CR, and provide actionable modification suggestions</p>
     */
    @NameInMap("SystemPrompt")
    public String systemPrompt;

    /**
     * <p>The list of MCP server and connector name references. The same array supports the coexistence of both types of entries. Specify only one type of reference for each entry. For MCP, omitting items indicates all public tools, and historically specified items retain their original values.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mcpServerName&quot;:&quot;code-repository-mcp&quot;},{&quot;connectorName&quot;:&quot;code-review-data&quot;}]</p>
     */
    @NameInMap("Tools")
    public Object tools;

    /**
     * <p>The new visibility scope. Valid values: <code>user</code> and <code>tenant</code>. If this parameter is not passed, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
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

    public UpdateAgentRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateAgentRequest setKnowledgeBases(Object knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
        return this;
    }
    public Object getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public UpdateAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAgentRequest setSkills(Object skills) {
        this.skills = skills;
        return this;
    }
    public Object getSkills() {
        return this.skills;
    }

    public UpdateAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateAgentRequest setTools(Object tools) {
        this.tools = tools;
        return this;
    }
    public Object getTools() {
        return this.tools;
    }

    public UpdateAgentRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
