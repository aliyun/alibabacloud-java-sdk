// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The business scenario.</p>
     * <ul>
     * <li><p>If the associated SMS signature\&quot;s business scenario is &quot;Live App&quot;, the <code>ApplySceneContent</code> parameter must be an app URL starting with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>The <code>ApplySceneContent</code> parameter is required if the associated SMS signature\&quot;s business scenario is &quot;Registered Trademark&quot; or &quot;Name of Enterprise or Public Institution&quot;.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplySceneContent")
    public String applySceneContent;

    /**
     * <p>The type of the international/regional template. This parameter is required when the <strong>TemplateType</strong> parameter is set to <strong>3</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: SMS notification.</p>
     * </li>
     * <li><p><strong>1</strong>: promotional SMS.</p>
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
     * <p>Additional materials, such as supporting documents or business screenshots, to help reviewers understand your business. If <code>TemplateType</code> is set to <code>2</code> (promotional SMS), you must upload proof of user authorization. For more information, see <a href="https://help.aliyun.com/document_detail/312341.html">Upload specifications for user authorization materials</a>.</p>
     */
    @NameInMap("MoreData")
    public String moreDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The SMS signature associated with the template.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("RelatedSignName")
    public String relatedSignName;

    /**
     * <p>Describe your business scenario, including a URL if applicable. You must also provide a complete SMS message example with populated variables. Providing this information as required is critical for template approval.</p>
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
     * <p>The code of the rejected SMS template. You can find the template code on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Messages in Chinese Mainland &gt; Template Management</a> tab in the console or by calling the <a href="~~QuerySmsTemplateList~~">QuerySmsTemplateList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_152550****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The new template content, up to 500 characters long.</p>
     * <p>The template content and its variables must comply with <a href="https://help.aliyun.com/document_detail/463161.html">SMS template specifications</a> to be approved. To increase the approval rate and efficiency, refer to the common examples on the <a href="https://dysms.console.aliyun.com/domestic/text/template/add">Apply for Template</a> page. For more information about variable specifications, see <a href="https://help.aliyun.com/document_detail/2806243.html">TemplateContent parameter variable specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <p>The name of the SMS template, up to 30 characters long. You can find the names of rejected templates on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Messages in Chinese Mainland &gt; Template Management</a> tab in the console or by calling the <a href="~~QuerySmsTemplateList~~">QuerySmsTemplateList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码模板</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The rules for the variables in the template. For details on how to define these rules, see the <a href="https://help.aliyun.com/document_detail/2806243.html">example document</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
     */
    @NameInMap("TemplateRule")
    public String templateRule;

    /**
     * <p>The SMS type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: verification code.</p>
     * </li>
     * <li><p><strong>1</strong>: SMS notification.</p>
     * </li>
     * <li><p><strong>2</strong>: promotional SMS.</p>
     * </li>
     * <li><p><strong>3</strong>: international/regional message.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Only enterprise-verified users can apply for promotional SMS and international/regional messages. For more information about the differences between personal and enterprise accounts, see <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage notes</a>.</p>
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
     * <p>To manage SMS content security, messages that contain traffic-driving information such as phone numbers and URLs may be blocked by carriers, which can cause delivery failures. We recommend that you avoid including such information in your SMS templates to prevent delivery failures.</p>
     * <p>A JSON string that contains a list of traffic-driving information.</p>
     * <blockquote>
     * <p>Notice: The value must be in the JSON format. Convert the value to a string before you pass it in.</p>
     * </blockquote>
     * <h3>1. Fields</h3>
     * <p>{
     * &quot;trafficDrivingType&quot;:&quot;Traffic-driving type&quot;,
     * &quot;trafficDrivingContent&quot;:&quot;Traffic-driving content&quot;,
     * &quot;variableName&quot;:&quot;variable name&quot;,
     * &quot;companyName&quot;:&quot;Name of the enterprise or public institution&quot;,
     * &quot;organizationCode&quot;:&quot;Unified Social Credit Code&quot;,
     * &quot;icpNo&quot;:&quot;ICP filing/permit number&quot;,
     * &quot;icpPicOssKey&quot;:&quot;OSS key of the ICP filing screenshot&quot;,
     * &quot;companyDifferentFromSignQuaReason&quot;:&quot;The reason why the name of the enterprise or public institution is different from that in the SMS signature qualification&quot;
     * }</p>
     * <h3>2. Notes</h3>
     * <ul>
     * <li><p>If the content is not a variable, do not pass the <code>variableName</code> field.</p>
     * </li>
     * <li><p>If the name of the enterprise or public institution is different from that in the SMS signature qualification, provide the <code>companyDifferentFromSignQuaReason</code> field.</p>
     * </li>
     * <li><p>If <code>trafficDrivingType</code> is set to <code>DOMAIN</code>, you must provide all the fields.</p>
     * </li>
     * <li><p>For <code>trafficDrivingType</code> values other than <code>DOMAIN</code>, the <code>trafficDrivingType</code>, <code>trafficDrivingContent</code>, <code>companyName</code>, and <code>organizationCode</code> fields are required. The <code>variableName</code> and <code>companyDifferentFromSignQuaReason</code> fields are optional.</p>
     * </li>
     * </ul>
     * <h3>3. TrafficDrivingType enumeration</h3>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Due to regulatory requirements, mobile numbers are not supported.</p>
     * <ul>
     * <li><p><code>DOMAIN</code>: A domain name.</p>
     * </li>
     * <li><p><code>FIXED_PHONE</code>: A fixed-line phone number.</p>
     * </li>
     * <li><p><code>400_PHONE</code>: A phone number that starts with 400.</p>
     * </li>
     * <li><p><code>800_PHONE</code>: A phone number that starts with 800.</p>
     * </li>
     * <li><p><code>95_PHONE</code>: A phone number that starts with 95.</p>
     * </li>
     * <li><p><code>96_PHONE</code>: A phone number that starts with 96.</p>
     * </li>
     * <li><p><code>1_PHONE</code>: A 3-digit to 8-digit phone number that starts with 1.</p>
     * </li>
     * <li><p><code>OTHER_PHONE</code>: Another type of phone number.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;trafficDrivingType&quot;:&quot;DOMAIN&quot;,&quot;trafficDrivingContent&quot;:&quot;aliyun.com&quot;,&quot;companyName&quot;:&quot;阿里云计算有限公司&quot;,&quot;organizationCode&quot;:&quot;91330<strong><strong>73959654P&quot;,&quot;icpNo&quot;:&quot;浙B2-20</strong></strong>01-4&quot;,&quot;icpPicOssKey&quot;:&quot;db7784d8-cb0c-498f-<strong><strong>-295f1ad6d665_mf29l7nf.png&quot;,&quot;companyDifferentFromSignQuaReason&quot;:&quot;这是一段说明文字&quot;},{&quot;trafficDrivingType&quot;:&quot;1_PHONE&quot;,&quot;trafficDrivingContent&quot;:&quot;1</strong>86&quot;,&quot;variableName&quot;:&quot;my1Phone&quot;,&quot;companyName&quot;:&quot;阿里云计算有限公司&quot;,&quot;organizationCode&quot;:&quot;91330**</strong>73959654P&quot;,&quot;companyDifferentFromSignQuaReason&quot;:&quot;这是一段说明文字&quot;}]</p>
     */
    @NameInMap("TrafficDriving")
    public String trafficDriving;

    public static UpdateSmsTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsTemplateShrinkRequest self = new UpdateSmsTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsTemplateShrinkRequest setApplySceneContent(String applySceneContent) {
        this.applySceneContent = applySceneContent;
        return this;
    }
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    public UpdateSmsTemplateShrinkRequest setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public UpdateSmsTemplateShrinkRequest setMoreDataShrink(String moreDataShrink) {
        this.moreDataShrink = moreDataShrink;
        return this;
    }
    public String getMoreDataShrink() {
        return this.moreDataShrink;
    }

    public UpdateSmsTemplateShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsTemplateShrinkRequest setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public UpdateSmsTemplateShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSmsTemplateShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsTemplateShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmsTemplateShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public UpdateSmsTemplateShrinkRequest setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public UpdateSmsTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateSmsTemplateShrinkRequest setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public UpdateSmsTemplateShrinkRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

    public UpdateSmsTemplateShrinkRequest setTrafficDriving(String trafficDriving) {
        this.trafficDriving = trafficDriving;
        return this;
    }
    public String getTrafficDriving() {
        return this.trafficDriving;
    }

}
