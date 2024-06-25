// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntlType")
    public Integer intlType;

    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RelatedSignName")
    public String relatedSignName;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
     */
    @NameInMap("TemplateRule")
    public String templateRule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static CreateSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateRequest self = new CreateSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public CreateSmsTemplateRequest setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public CreateSmsTemplateRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public CreateSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsTemplateRequest setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public CreateSmsTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CreateSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateSmsTemplateRequest setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public CreateSmsTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
