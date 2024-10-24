// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateShrinkRequest extends TeaModel {
    /**
     * <p>If there is an applicable scenario, you can fill it in.</p>
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
     * <li><strong>2</strong>: Promotional message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntlType")
    public Integer intlType;

    /**
     * <p>Additional materials you can upload, such as business proof documents or screenshots, to help reviewers understand your business details.</p>
     * <p>This parameter is optional; please fill it in according to actual needs.</p>
     */
    @NameInMap("MoreData")
    public String moreDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The signature name that the template needs to be associated with. The associated SMS signature must have passed the review.</p>
     * <p>This parameter is mandatory when the TemplateType parameter is <strong>0</strong>, <strong>1</strong>, or <strong>2</strong>.</p>
     * <p><notice>Associating a signature can expedite the review process. Note that this associated signature is unrelated to the signature selected when sending SMS messages.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("RelatedSignName")
    public String relatedSignName;

    /**
     * <p>Please describe the business scenario where you use SMS or provide an online link to the scenario, along with a complete example of the SMS (with variable contents filled), as complete information helps increase the template approval rate. Failure to follow guidelines or leaving this field blank may affect the approval of your template.</p>
     * 
     * <strong>example:</strong>
     * <p>Request verification code SMS.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Template content, up to 500 characters in length.</p>
     * <p>Both the template content and variable content must comply with SMS specifications; otherwise, the template will fail the review. You can also view common template examples on the template application page. Using sample templates can enhance review efficiency and success rates. For variable specifications, see <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example">TemplateContent Variable Parameter Filling Specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>You are applying for mobile registration. The verification code is: ${code}. It is valid for 5 minutes!</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>Template name, up to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunCode</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Template variable rules.</p>
     * <p>For filling in variable rules, refer to the <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example">Sample Documentation</a>.</p>
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
     * <li><strong>2</strong>: Promotional message.</li>
     * <li><strong>3</strong>: International/Hong Kong, Macao, and Taiwan messages.</li>
     * </ul>
     * <blockquote>
     * <p>Only enterprise-verified users can apply for promotional messages and international/Hong Kong, Macao, and Taiwan messages. For details on the differences between personal and enterprise user rights, please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage Instructions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static CreateSmsTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateShrinkRequest self = new CreateSmsTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateShrinkRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public CreateSmsTemplateShrinkRequest setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public CreateSmsTemplateShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public CreateSmsTemplateShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsTemplateShrinkRequest setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public CreateSmsTemplateShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsTemplateShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsTemplateShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsTemplateShrinkRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CreateSmsTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateSmsTemplateShrinkRequest setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public CreateSmsTemplateShrinkRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
