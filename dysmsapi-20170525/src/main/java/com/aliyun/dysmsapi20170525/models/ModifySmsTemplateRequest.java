// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the SMS template application. The description cannot exceed 100 characters in length.</p>
     * <p>This information helps reviewers understand your business scenarios and improves review efficiency. Guidelines:</p>
     * <ul>
     * <li>Provide the use case of your live business.</li>
     * <li>Provide SMS examples for real scenarios to reflect your business scenarios.</li>
     * <li>Provide variable values and describe in detail the business use case and the reason for choosing the variable attributes.</li>
     * <li>Provide the website URL, registered domain name, or application marketplace download link of the actual business.</li>
     * <li>For logon scenarios, provide the test account and password.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>手机注册登录</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The code of the SMS template that failed the review.</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> operation to obtain the code of the SMS template that failed the review.</li>
     * <li>View the code of the SMS template that failed the review on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Templates</a> page.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_15255****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template content. The content cannot exceed 500 characters in length.</p>
     * <p>The template content and variable content must comply with the <a href="https://help.aliyun.com/document_detail/463161.html">SMS template specifications</a>. Otherwise, the template fails the review. You can view common template examples on the <a href="https://dysms.console.aliyun.com/domestic/text/template/add">Apply for Template</a> page. Using sample templates can improve review efficiency and success rate. For variable specifications, see <a href="https://help.aliyun.com/document_detail/2806243.html">TemplateContent variable specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The template name. The name must be 1 to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码模板</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The SMS type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code.</li>
     * <li><strong>1</strong>: SMS notification.</li>
     * <li><strong>2</strong>: promotional message.</li>
     * <li><strong>3</strong>: international or Hong Kong, Macao, and Taiwan message.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
