// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>Deprecated. This parameter is retained for backward compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("FromType")
    public Integer fromType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Deprecated. This parameter is retained for backward compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Deprecated. This parameter is retained for backward compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("SmsContent")
    public String smsContent;

    /**
     * <p>Deprecated. This parameter is retained for backward compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>Abandoned, historical reasons for compatibility</p>
     */
    @NameInMap("SmsType")
    public Integer smsType;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>template name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The sender name.</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("TemplateNickName")
    public String templateNickName;

    /**
     * <p>The email subject.</p>
     * 
     * <strong>example:</strong>
     * <p>subject test</p>
     */
    @NameInMap("TemplateSubject")
    public String templateSubject;

    /**
     * <p>The email HTML body.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateText")
    public String templateText;

    /**
     * <p>The template type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }
    public Integer getFromType() {
        return this.fromType;
    }

    public CreateTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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

    public CreateTemplateRequest setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public CreateTemplateRequest setSmsType(Integer smsType) {
        this.smsType = smsType;
        return this;
    }
    public Integer getSmsType() {
        return this.smsType;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setTemplateNickName(String templateNickName) {
        this.templateNickName = templateNickName;
        return this;
    }
    public String getTemplateNickName() {
        return this.templateNickName;
    }

    public CreateTemplateRequest setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
        return this;
    }
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    public CreateTemplateRequest setTemplateText(String templateText) {
        this.templateText = templateText;
        return this;
    }
    public String getTemplateText() {
        return this.templateText;
    }

    public CreateTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
