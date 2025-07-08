// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateDigitalSmsTemplateNewRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ContentOssKeys")
    public String contentOssKeys;

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

    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateDigitalSmsTemplateNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSmsTemplateNewRequest self = new CreateDigitalSmsTemplateNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSmsTemplateNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDigitalSmsTemplateNewRequest setContentOssKeys(String contentOssKeys) {
        this.contentOssKeys = contentOssKeys;
        return this;
    }
    public String getContentOssKeys() {
        return this.contentOssKeys;
    }

    public CreateDigitalSmsTemplateNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDigitalSmsTemplateNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateDigitalSmsTemplateNewRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateDigitalSmsTemplateNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDigitalSmsTemplateNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDigitalSmsTemplateNewRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CreateDigitalSmsTemplateNewRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
