// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyTemplateRequest extends TeaModel {
    /**
     * <p>The source channel through which the user accesses the service. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: Direct access through Alibaba Cloud.</li>
     * <li>2: Access through a partner channel.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FromType")
    public Integer fromType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The remarks or application description for the SMS template. This parameter is required only when the templatetype is SMS. Maximum length: 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>for verification</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The body content of the SMS template. This parameter is required only when the templatetype is SMS. Length: 2 to 400 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>hello {name}</p>
     */
    @NameInMap("SmsContent")
    public String smsContent;

    /**
     * <p>The business type of the SMS template. This parameter is required only when the templatetype is SMS. Valid values:</p>
     * <ul>
     * <li>0: verification code</li>
     * <li>2: notification or promotion.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsType")
    public Integer smsType;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>409481</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>The template name. Maximum length: 30 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verification code</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The nickname of the template or the alias of the sender. This parameter is required only when the templatetype is email. Maximum length: 30 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Lisa Gao</p>
     */
    @NameInMap("TemplateNickName")
    public String templateNickName;

    /**
     * <p>The subject of the email template. This parameter is required only when the templatetype is email. Maximum length: 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>REAL\&quot;EN OPEN TONNAGE</p>
     */
    @NameInMap("TemplateSubject")
    public String templateSubject;

    /**
     * <p>The body content of the email. This parameter is required only when the templatetype is email. Maximum size: 1 MB.</p>
     * 
     * <strong>example:</strong>
     * <p>hello {name}</p>
     */
    @NameInMap("TemplateText")
    public String templateText;

    public static ModifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateRequest self = new ModifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateRequest setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }
    public Integer getFromType() {
        return this.fromType;
    }

    public ModifyTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTemplateRequest setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public ModifyTemplateRequest setSmsType(Integer smsType) {
        this.smsType = smsType;
        return this;
    }
    public Integer getSmsType() {
        return this.smsType;
    }

    public ModifyTemplateRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ModifyTemplateRequest setTemplateNickName(String templateNickName) {
        this.templateNickName = templateNickName;
        return this;
    }
    public String getTemplateNickName() {
        return this.templateNickName;
    }

    public ModifyTemplateRequest setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
        return this;
    }
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    public ModifyTemplateRequest setTemplateText(String templateText) {
        this.templateText = templateText;
        return this;
    }
    public String getTemplateText() {
        return this.templateText;
    }

}
