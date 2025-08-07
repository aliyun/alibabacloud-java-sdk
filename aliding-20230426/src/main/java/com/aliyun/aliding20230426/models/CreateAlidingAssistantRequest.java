// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateAlidingAssistantRequest extends TeaModel {
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
    public java.util.Map<String, String> ext;

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
    public java.util.List<String> recommendPrompts;

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
    public CreateAlidingAssistantRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WelcomeContent")
    public String welcomeContent;

    public static CreateAlidingAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlidingAssistantRequest self = new CreateAlidingAssistantRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlidingAssistantRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CreateAlidingAssistantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAlidingAssistantRequest setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public CreateAlidingAssistantRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateAlidingAssistantRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public CreateAlidingAssistantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlidingAssistantRequest setRecommendPrompts(java.util.List<String> recommendPrompts) {
        this.recommendPrompts = recommendPrompts;
        return this;
    }
    public java.util.List<String> getRecommendPrompts() {
        return this.recommendPrompts;
    }

    public CreateAlidingAssistantRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public CreateAlidingAssistantRequest setSourceIdentityId(String sourceIdentityId) {
        this.sourceIdentityId = sourceIdentityId;
        return this;
    }
    public String getSourceIdentityId() {
        return this.sourceIdentityId;
    }

    public CreateAlidingAssistantRequest setTenantContext(CreateAlidingAssistantRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateAlidingAssistantRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateAlidingAssistantRequest setWelcomeContent(String welcomeContent) {
        this.welcomeContent = welcomeContent;
        return this;
    }
    public String getWelcomeContent() {
        return this.welcomeContent;
    }

    public static class CreateAlidingAssistantRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateAlidingAssistantRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateAlidingAssistantRequestTenantContext self = new CreateAlidingAssistantRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateAlidingAssistantRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
