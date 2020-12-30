// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateType")
    public Integer templateType;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateSubject")
    public String templateSubject;

    @NameInMap("TemplateNickName")
    public String templateNickName;

    @NameInMap("TemplateText")
    public String templateText;

    @NameInMap("SmsType")
    public Integer smsType;

    @NameInMap("SmsContent")
    public String smsContent;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("FromType")
    public Integer fromType;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
        return this;
    }
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    public CreateTemplateRequest setTemplateNickName(String templateNickName) {
        this.templateNickName = templateNickName;
        return this;
    }
    public String getTemplateNickName() {
        return this.templateNickName;
    }

    public CreateTemplateRequest setTemplateText(String templateText) {
        this.templateText = templateText;
        return this;
    }
    public String getTemplateText() {
        return this.templateText;
    }

    public CreateTemplateRequest setSmsType(Integer smsType) {
        this.smsType = smsType;
        return this;
    }
    public Integer getSmsType() {
        return this.smsType;
    }

    public CreateTemplateRequest setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public CreateTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateTemplateRequest setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }
    public Integer getFromType() {
        return this.fromType;
    }

}
