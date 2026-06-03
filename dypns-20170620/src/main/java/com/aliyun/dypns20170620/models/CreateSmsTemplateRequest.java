// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizUrl")
    public String bizUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsTemplateContent")
    public String smsTemplateContent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsTemplateName")
    public String smsTemplateName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsTemplateRule")
    public String smsTemplateRule;

    public static CreateSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateRequest self = new CreateSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateRequest setBizUrl(String bizUrl) {
        this.bizUrl = bizUrl;
        return this;
    }
    public String getBizUrl() {
        return this.bizUrl;
    }

    public CreateSmsTemplateRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsTemplateRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
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

    public CreateSmsTemplateRequest setSmsTemplateContent(String smsTemplateContent) {
        this.smsTemplateContent = smsTemplateContent;
        return this;
    }
    public String getSmsTemplateContent() {
        return this.smsTemplateContent;
    }

    public CreateSmsTemplateRequest setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
        return this;
    }
    public String getSmsTemplateName() {
        return this.smsTemplateName;
    }

    public CreateSmsTemplateRequest setSmsTemplateRule(String smsTemplateRule) {
        this.smsTemplateRule = smsTemplateRule;
        return this;
    }
    public String getSmsTemplateRule() {
        return this.smsTemplateRule;
    }

}
