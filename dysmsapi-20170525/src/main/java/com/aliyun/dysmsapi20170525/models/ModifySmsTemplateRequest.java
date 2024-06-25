// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the message template. It is one of the reference information for template review. The description cannot exceed 100 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Modify the parameters of the template.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The code of the message template.</p>
     * <p>You can log on to the <a href="https://dysms.console.aliyun.com/dysms.htm">Short Message Service (SMS) console</a>, click <strong>Go China</strong> or <strong>Go Globe</strong> in the left-side navigation pane, and then view the template code on the <strong>Templates</strong> tab. You can also call the <a href="https://help.aliyun.com/document_detail/121208.html">AddSmsTemplate</a> operation to obtain the template code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_15255****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The content of the template. The content must be 1 to 500 characters in length.</p>
     * <blockquote>
     * <p>When you modify a template, design the template content based on the review comments.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>You are applying for mobile registration. The verification code is: ${code}, valid for 5 minutes!</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the template. The name must be 1 to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun verification code</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the message. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code</li>
     * <li><strong>1</strong>: text message</li>
     * <li><strong>2</strong>: promotional message</li>
     * <li><strong>3</strong>: message sent to countries or regions outside the Chinese mainland</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static ModifySmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsTemplateRequest self = new ModifySmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifySmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySmsTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifySmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifySmsTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public ModifySmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ModifySmsTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
