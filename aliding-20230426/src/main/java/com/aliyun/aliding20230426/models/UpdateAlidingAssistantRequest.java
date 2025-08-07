// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateAlidingAssistantRequest extends TeaModel {
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
    public java.util.Map<String, String> ext;

    /**
     * <strong>example:</strong>
     * <p>fallbackContent</p>
     */
    @NameInMap("FallbackContent")
    public String fallbackContent;

    @NameInMap("Feature")
    public java.util.Map<String, String> feature;

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
    public java.util.List<String> recommendPrompts;

    @NameInMap("TenantContext")
    public UpdateAlidingAssistantRequestTenantContext tenantContext;

    @NameInMap("WelcomeContent")
    public String welcomeContent;

    public static UpdateAlidingAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlidingAssistantRequest self = new UpdateAlidingAssistantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlidingAssistantRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public UpdateAlidingAssistantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAlidingAssistantRequest setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public UpdateAlidingAssistantRequest setFallbackContent(String fallbackContent) {
        this.fallbackContent = fallbackContent;
        return this;
    }
    public String getFallbackContent() {
        return this.fallbackContent;
    }

    public UpdateAlidingAssistantRequest setFeature(java.util.Map<String, String> feature) {
        this.feature = feature;
        return this;
    }
    public java.util.Map<String, String> getFeature() {
        return this.feature;
    }

    public UpdateAlidingAssistantRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public UpdateAlidingAssistantRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateAlidingAssistantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlidingAssistantRequest setRecommendPrompts(java.util.List<String> recommendPrompts) {
        this.recommendPrompts = recommendPrompts;
        return this;
    }
    public java.util.List<String> getRecommendPrompts() {
        return this.recommendPrompts;
    }

    public UpdateAlidingAssistantRequest setTenantContext(UpdateAlidingAssistantRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateAlidingAssistantRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateAlidingAssistantRequest setWelcomeContent(String welcomeContent) {
        this.welcomeContent = welcomeContent;
        return this;
    }
    public String getWelcomeContent() {
        return this.welcomeContent;
    }

    public static class UpdateAlidingAssistantRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateAlidingAssistantRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlidingAssistantRequestTenantContext self = new UpdateAlidingAssistantRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateAlidingAssistantRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
