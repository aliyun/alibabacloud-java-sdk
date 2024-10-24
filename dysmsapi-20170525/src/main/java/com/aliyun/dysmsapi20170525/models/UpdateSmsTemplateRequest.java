// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsTemplateRequest extends TeaModel {
    /**
     * <p>Application scenarios, instructions as follows:</p>
     * <ul>
     * <li>For registered websites, please enter the MIIT-registered domain with HTTP or HTTPS.</li>
     * <li>For launched apps, provide the app store display link with HTTP or HTTPS, ensuring the app is online.</li>
     * <li>For public accounts or mini-programs, enter the full name of the public account or mini-program, ensuring they are online.</li>
     * <li>For e-commerce platform stores, applicable only to enterprise users, enter the display link of the e-commerce store with HTTP or HTTPS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    /**
     * <p>International/Hong Kong, Macao, and Taiwan template type. When the <strong>TemplateType</strong> parameter is <strong>3</strong>, this parameter is required for international/Hong Kong, Macao, and Taiwan templates, with values:</p>
     * <ul>
     * <li><strong>0</strong>: Verification code.</li>
     * <li><strong>1</strong>: SMS notification.</li>
     * <li><strong>2</strong>: Promotional SMS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntlType")
    public Integer intlType;

    /**
     * <p>Additional information, such as uploading business proof documents or screenshots, to help reviewers understand your business details. Optional and can be left unset.</p>
     */
    @NameInMap("MoreData")
    public java.util.List<String> moreData;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>SMS signature associated with the template during the application.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("RelatedSignName")
    public String relatedSignName;

    /**
     * <p>Explanation for the SMS template application, which serves as a reference for template review.</p>
     * 
     * <strong>example:</strong>
     * <p>登录场景使用验证码</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Template Code of an unapproved template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_152550****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>Template content, up to 500 characters in length.</p>
     * <p>Both the template content and variable content must comply with SMS regulations; otherwise, the template will fail the review. You can also view common template examples on the template application page. Using sample templates can enhance review efficiency and success rates. Variable specifications can be found in <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example?spm">TemplateContent Parameter Variable Specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>Template name, up to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Template variable rules.</p>
     * <p>For guidance on filling variable rules, refer to the <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example?spm">Sample Documentation</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
     */
    @NameInMap("TemplateRule")
    public String templateRule;

    /**
     * <p>SMS type. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Verification code.</li>
     * <li><strong>1</strong>: SMS notification.</li>
     * <li><strong>2</strong>: Promotional SMS.</li>
     * <li><strong>3</strong>: International/Hong Kong, Macao, and Taiwan messages.</li>
     * </ul>
     * <blockquote>
     * <p>Only enterprise-certified users can apply for promotional SMS and international/Hong Kong, Macao, and Taiwan messages. Details on differences between personal and enterprise user rights are available in <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage Guidelines</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static UpdateSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsTemplateRequest self = new UpdateSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsTemplateRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public UpdateSmsTemplateRequest setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public UpdateSmsTemplateRequest setMoreData(java.util.List<String> moreData) {
        this.moreData = moreData;
        return this;
    }
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    public UpdateSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsTemplateRequest setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public UpdateSmsTemplateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public UpdateSmsTemplateRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public UpdateSmsTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateSmsTemplateRequest setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public UpdateSmsTemplateRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
