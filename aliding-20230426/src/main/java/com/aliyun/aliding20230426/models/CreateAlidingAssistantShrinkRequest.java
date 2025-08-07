// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateAlidingAssistantShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f5cb37a0fb44441ab7b74c6f4a679dd3</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Ext")
    public String extShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@lADPDetfgMsFFUvNAkjNAkg</p>
     */
    @NameInMap("Icon")
    public String icon;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Instructions")
    public String instructions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RecommendPrompts")
    public String recommendPromptsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Source")
    public Integer source;

    /**
     * <strong>example:</strong>
     * <p>chatBot-123</p>
     */
    @NameInMap("SourceIdentityId")
    public String sourceIdentityId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WelcomeContent")
    public String welcomeContent;

    public static CreateAlidingAssistantShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlidingAssistantShrinkRequest self = new CreateAlidingAssistantShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlidingAssistantShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CreateAlidingAssistantShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlidingAssistantShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public CreateAlidingAssistantShrinkRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateAlidingAssistantShrinkRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public CreateAlidingAssistantShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlidingAssistantShrinkRequest setRecommendPromptsShrink(String recommendPromptsShrink) {
        this.recommendPromptsShrink = recommendPromptsShrink;
        return this;
    }
    public String getRecommendPromptsShrink() {
        return this.recommendPromptsShrink;
    }

    public CreateAlidingAssistantShrinkRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public CreateAlidingAssistantShrinkRequest setSourceIdentityId(String sourceIdentityId) {
        this.sourceIdentityId = sourceIdentityId;
        return this;
    }
    public String getSourceIdentityId() {
        return this.sourceIdentityId;
    }

    public CreateAlidingAssistantShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateAlidingAssistantShrinkRequest setWelcomeContent(String welcomeContent) {
        this.welcomeContent = welcomeContent;
        return this;
    }
    public String getWelcomeContent() {
        return this.welcomeContent;
    }

}
