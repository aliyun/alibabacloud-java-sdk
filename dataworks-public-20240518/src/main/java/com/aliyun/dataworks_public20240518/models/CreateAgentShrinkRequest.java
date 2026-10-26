// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentShrinkRequest extends TeaModel {
    /**
     * <p>The list of child agents that can be called by this agent.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallableAgents")
    public String callableAgentsShrink;

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
    public String expertSuitesShrink;

    /**
     * <p>The extended metadata in key-value pairs.</p>
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
    public String skillsShrink;

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
     * <p>The visibility scope. The corresponding field is used based on the visibility level.</p>
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

    public CreateAgentShrinkRequest setExpertSuitesShrink(String expertSuitesShrink) {
        this.expertSuitesShrink = expertSuitesShrink;
        return this;
    }
    public String getExpertSuitesShrink() {
        return this.expertSuitesShrink;
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

    public CreateAgentShrinkRequest setPublishImmediately(Boolean publishImmediately) {
        this.publishImmediately = publishImmediately;
        return this;
    }
    public Boolean getPublishImmediately() {
        return this.publishImmediately;
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
