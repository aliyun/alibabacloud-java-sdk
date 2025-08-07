// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateAlidingAssistantShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("AssistantId")
    public String assistantId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Ext")
    public String extShrink;

    /**
     * <strong>example:</strong>
     * <p>fallbackContent</p>
     */
    @NameInMap("FallbackContent")
    public String fallbackContent;

    @NameInMap("Feature")
    public String featureShrink;

    /**
     * <strong>example:</strong>
     * <p>@lADPDetfgMsFFUvNAkjNAkg</p>
     */
    @NameInMap("Icon")
    public String icon;

    @NameInMap("Instructions")
    public String instructions;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecommendPrompts")
    public String recommendPromptsShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WelcomeContent")
    public String welcomeContent;

    public static UpdateAlidingAssistantShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlidingAssistantShrinkRequest self = new UpdateAlidingAssistantShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlidingAssistantShrinkRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public UpdateAlidingAssistantShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAlidingAssistantShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public UpdateAlidingAssistantShrinkRequest setFallbackContent(String fallbackContent) {
        this.fallbackContent = fallbackContent;
        return this;
    }
    public String getFallbackContent() {
        return this.fallbackContent;
    }

    public UpdateAlidingAssistantShrinkRequest setFeatureShrink(String featureShrink) {
        this.featureShrink = featureShrink;
        return this;
    }
    public String getFeatureShrink() {
        return this.featureShrink;
    }

    public UpdateAlidingAssistantShrinkRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public UpdateAlidingAssistantShrinkRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateAlidingAssistantShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlidingAssistantShrinkRequest setRecommendPromptsShrink(String recommendPromptsShrink) {
        this.recommendPromptsShrink = recommendPromptsShrink;
        return this;
    }
    public String getRecommendPromptsShrink() {
        return this.recommendPromptsShrink;
    }

    public UpdateAlidingAssistantShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateAlidingAssistantShrinkRequest setWelcomeContent(String welcomeContent) {
        this.welcomeContent = welcomeContent;
        return this;
    }
    public String getWelcomeContent() {
        return this.welcomeContent;
    }

}
