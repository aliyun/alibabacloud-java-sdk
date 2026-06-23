// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentShrinkRequest extends TeaModel {
    /**
     * <p>The list of sub-Agents that can be called by this Agent.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallableAgents")
    public String callableAgentsShrink;

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
    public String metadataShrink;

    /**
     * <p>The model configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *           &quot;modelName&quot;: &quot;dataworks-public-bailian/qwen-max&quot;
     *         }</p>
     */
    @NameInMap("Model")
    public String modelShrink;

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
    public String skillsShrink;

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
    public String toolsShrink;

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
    public String visibilityScopeShrink;

    public static CreateAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentShrinkRequest self = new CreateAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentShrinkRequest setCallableAgentsShrink(String callableAgentsShrink) {
        this.callableAgentsShrink = callableAgentsShrink;
        return this;
    }
    public String getCallableAgentsShrink() {
        return this.callableAgentsShrink;
    }

    public CreateAgentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAgentShrinkRequest setMetadataShrink(String metadataShrink) {
        this.metadataShrink = metadataShrink;
        return this;
    }
    public String getMetadataShrink() {
        return this.metadataShrink;
    }

    public CreateAgentShrinkRequest setModelShrink(String modelShrink) {
        this.modelShrink = modelShrink;
        return this;
    }
    public String getModelShrink() {
        return this.modelShrink;
    }

    public CreateAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentShrinkRequest setSkillsShrink(String skillsShrink) {
        this.skillsShrink = skillsShrink;
        return this;
    }
    public String getSkillsShrink() {
        return this.skillsShrink;
    }

    public CreateAgentShrinkRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateAgentShrinkRequest setToolsShrink(String toolsShrink) {
        this.toolsShrink = toolsShrink;
        return this;
    }
    public String getToolsShrink() {
        return this.toolsShrink;
    }

    public CreateAgentShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateAgentShrinkRequest setVisibilityScopeShrink(String visibilityScopeShrink) {
        this.visibilityScopeShrink = visibilityScopeShrink;
        return this;
    }
    public String getVisibilityScopeShrink() {
        return this.visibilityScopeShrink;
    }

}
