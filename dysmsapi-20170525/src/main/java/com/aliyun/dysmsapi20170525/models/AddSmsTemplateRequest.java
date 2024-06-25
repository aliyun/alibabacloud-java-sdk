// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the message template. It is one of the reference information for template review. The description cannot exceed 100 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Apply for a template to send verification codes.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The content of the template. The content can be up to 500 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/108253.html">Message template specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>You are applying for mobile registration. The verification code is: ${code}, valid for 5 minutes!</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the template. The name can be up to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun Test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the message. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code</li>
     * <li><strong>1</strong>: notification</li>
     * <li><strong>2</strong>: promotional message</li>
     * <li><strong>3</strong>: message sent to countries or regions outside the Chinese mainland</li>
     * </ul>
     * <blockquote>
     * <p>Only enterprise users can send promotional messages, or send messages to countries or regions outside the Chinese mainland.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static AddSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSmsTemplateRequest self = new AddSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddSmsTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddSmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddSmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddSmsTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public AddSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AddSmsTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
