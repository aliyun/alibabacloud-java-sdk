// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The business scenario.</p>
     * <ul>
     * <li><p>If the associated signature\&quot;s use case is &quot;Live App&quot;, <code>ApplySceneContent</code> must be an app URL that starts with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>This parameter is required if the associated signature\&quot;s use case is &quot;Registered Trademark Name&quot; or &quot;organization name&quot;.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    /**
     * <p>The type of the template for international/Hong Kong, Macao, and Taiwan messages. This parameter is required when <strong>TemplateType</strong> is set to <strong>3</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: notification message.</p>
     * </li>
     * <li><p><strong>1</strong>: promotional message.</p>
     * </li>
     * <li><p><strong>2</strong>: verification code.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntlType")
    public Integer intlType;

    /**
     * <p>Additional information. You can upload supporting documents or business screenshots to help reviewers better understand your business scenario. If you are applying for a promotional message template (where <code>TemplateType</code> is <code>2</code>), you must upload user authorization materials. For more information, see <a href="https://help.aliyun.com/document_detail/312341.html">Specifications for Uploading User Authorization Materials</a>.</p>
     */
    @NameInMap("MoreData")
    public String moreDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the signature to associate with the template. The signature must be an approved signature.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if <strong>TemplateType</strong> is set to <strong>0</strong>, <strong>1</strong>, or <strong>2</strong>.</p>
     * </li>
     * <li><p>Associating a signature can expedite the review process. The signature associated here is unrelated to the one you select when sending SMS messages.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>验证码签名</p>
     */
    @NameInMap("RelatedSignName")
    public String relatedSignName;

    /**
     * <p>Describe the business scenario for the SMS messages, or provide a URL for online scenarios. You must also provide a complete SMS example with actual values for any variables. Complete information increases the chance of template approval. Templates that do not provide this information as specified may be rejected.</p>
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
     * <p>The template content. The content must be 500 characters or less.</p>
     * <p>The template content and variables must comply with the <a href="https://help.aliyun.com/document_detail/463161.html">SMS Template Specifications</a>. Templates that do not comply may be rejected. You can find common template examples on the <a href="https://dysms.console.aliyun.com/domestic/text/template/add">Apply for Template</a> page. Using these examples can speed up the review process and increase the approval rate. For variable specifications, see <a href="https://help.aliyun.com/document_detail/2806243.html">Variable Specifications for the TemplateContent Parameter</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The template name. The name must be 30 characters or less.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The rules for variables in the template. For instructions on how to define these rules, see <a href="https://help.aliyun.com/document_detail/2806243.html">Sample Document</a>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required if the message template contains variables.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;characterWithNumber2&quot;}</p>
     */
    @NameInMap("TemplateRule")
    public String templateRule;

    /**
     * <p>The SMS type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: verification code.</p>
     * </li>
     * <li><p><strong>1</strong>: notification message.</p>
     * </li>
     * <li><p><strong>2</strong>: promotional message.</p>
     * </li>
     * <li><p><strong>3</strong>: international/Hong Kong, Macao, and Taiwan messages.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Only enterprise-verified users can apply for promotional messages or international/Hong Kong, Macao, and Taiwan messages. For more information about the differences in privileges between individual and enterprise users, see <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage Notes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    /**
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>To control the security of SMS content, messages that contain traffic-driving information, such as phone numbers and links, may be blocked by carriers, which can lead to delivery failures. To reduce this risk, we recommend that you avoid including such information in message templates.</p>
     * <p>A JSON string that contains a list of traffic-driving information.</p>
     * <blockquote>
     * <p>Notice: The value must be a JSON array serialized into a string.</p>
     * </blockquote>
     * <h3>1. Fields</h3>
     * <p>{
     * &quot;trafficDrivingType&quot;:&quot;traffic driving type&quot;,
     * &quot;trafficDrivingContent&quot;:&quot;traffic driving content&quot;,
     * &quot;variableName&quot;:&quot;variable name&quot;,
     * &quot;companyName&quot;:&quot;organization name&quot;,
     * &quot;organizationCode&quot;:&quot;unified social credit code&quot;,
     * &quot;icpNo&quot;:&quot;ICP filing or license number&quot;,
     * &quot;icpPicOssKey&quot;:&quot;OSS key of the ICP filing screenshot&quot;,
     * &quot;companyDifferentFromSignQuaReason&quot;:&quot;Reason for the discrepancy between the organization name and the signature qualification&quot;
     * }</p>
     * <h3>2. Notes</h3>
     * <ul>
     * <li><p>If the content is not a variable, do not pass the <code>variableName</code> parameter.</p>
     * </li>
     * <li><p>If the organization name is different from the one in the signature qualification, pass the <code>companyDifferentFromSignQuaReason</code> parameter.</p>
     * </li>
     * <li><p>If <code>trafficDrivingType</code> is set to <code>DOMAIN</code>, all parameters in this object are required.</p>
     * </li>
     * <li><p>If <code>trafficDrivingType</code> is set to another value, pass the <code>trafficDrivingType</code>, <code>trafficDrivingContent</code>, <code>variableName</code> (if applicable), <code>companyName</code>, <code>organizationCode</code>, and <code>companyDifferentFromSignQuaReason</code> (if applicable) parameters.</p>
     * </li>
     * </ul>
     * <h3>3. trafficDrivingType enum values</h3>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Due to regulatory requirements, mobile phone numbers are not supported.</p>
     * <ul>
     * <li><p>DOMAIN: A domain link.</p>
     * </li>
     * <li><p>FIXED_PHONE: Fixed-line phone.</p>
     * </li>
     * <li><p>400_PHONE: Phone number prefixed with 400.</p>
     * </li>
     * <li><p>800_PHONE: Phone number prefixed with 800.</p>
     * </li>
     * <li><p>95_PHONE: Phone number prefixed with 95.</p>
     * </li>
     * <li><p>96_PHONE: Phone number prefixed with 96.</p>
     * </li>
     * <li><p>1_PHONE: A 3- to 8-digit phone number that starts with 1.</p>
     * </li>
     * <li><p>OTHER_PHONE: Other phone number.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;trafficDrivingType&quot;:&quot;DOMAIN&quot;,&quot;trafficDrivingContent&quot;:&quot;aliyun.com&quot;,&quot;companyName&quot;:&quot;阿里云计算有限公司&quot;,&quot;organizationCode&quot;:&quot;91330<strong><strong>73959654P&quot;,&quot;icpNo&quot;:&quot;浙B2-20</strong></strong>01-4&quot;,&quot;icpPicOssKey&quot;:&quot;db7784d8-cb0c-498f-<strong><strong>-295f1ad6d665_mf29l7nf.png&quot;, &quot;companyDifferentFromSignQuaReason&quot;:&quot;这是一段说明文字&quot;},{&quot;trafficDrivingType&quot;:&quot;1_PHONE&quot;,&quot;trafficDrivingContent&quot;:&quot;1</strong>86&quot;,&quot;variableName&quot;:&quot;my1Phone&quot;,&quot;companyName&quot;:&quot;阿里云计算有限公司&quot;,&quot;organizationCode&quot;:&quot;91330**</strong>73959654P&quot;,&quot;companyDifferentFromSignQuaReason&quot;:&quot;这是一段说明文字&quot;}]</p>
     */
    @NameInMap("TrafficDriving")
    public String trafficDriving;

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

    public CreateSmsTemplateShrinkRequest setTrafficDriving(String trafficDriving) {
        this.trafficDriving = trafficDriving;
        return this;
    }
    public String getTrafficDriving() {
        return this.trafficDriving;
    }

}
