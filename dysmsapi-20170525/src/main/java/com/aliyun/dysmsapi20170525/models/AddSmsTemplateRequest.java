// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description for the SMS template application. The length must not exceed 100 characters.</p>
     * <p>This is reference information for template review. Providing a complete application description helps reviewers understand your business scenario and improves review efficiency. Guidelines:</p>
     * <ul>
     * <li>You can provide the usage scenario of business that has been launched.</li>
     * <li>You can provide SMS examples for real scenarios to demonstrate your business scenario.</li>
     * <li>You can provide the variable parameter content, describing the business usage scenario in detail and the reason for choosing this variable attribute.</li>
     * <li>You can provide website links of actual business, registered domain addresses, app market download links, and so on.</li>
     * <li>For login scenarios, you can provide a test account and password.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>申请验证码短信</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The template content. The length must not exceed 500 characters.</p>
     * <p>The template content and variable content must comply with the <a href="https://help.aliyun.com/document_detail/463161.html">SMS template specifications</a>; otherwise, the template review will fail. You can also view common template examples on the <a href="https://dysms.console.aliyun.com/domestic/text/template/add">Apply for template</a> page. Using example templates can improve review efficiency and success rate. For variable specifications, see <a href="https://help.aliyun.com/document_detail/2806243.html">TemplateContent parameter variable specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The template name. The length must not exceed 30 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The SMS type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code.</li>
     * <li><strong>1</strong>: notification SMS.</li>
     * <li><strong>2</strong>: promotional SMS.</li>
     * <li><strong>3</strong>: international/Hong Kong, Macao, and Taiwan messages.</li>
     * </ul>
     * <blockquote>
     * <p>Only enterprise-verified users can apply for promotional SMS and international/Hong Kong, Macao, and Taiwan messages. For details about the differences between individual and enterprise user privileges, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
