// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsVerifyCodeRequest extends TeaModel {
    /**
     * <p>The length of the verification code. Default value: 4. Valid values: 4 to 8.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CodeLength")
    public Long codeLength;

    /**
     * <p>The type of the generated verification code. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: digits only</li>
     * <li>2: uppercase letters only</li>
     * <li>3: lowercase letters only</li>
     * <li>4: uppercase and lowercase letters</li>
     * <li>5: digits and uppercase letters</li>
     * <li>6: digits and lowercase letters</li>
     * <li>7: digits and uppercase and lowercase letters</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CodeType")
    public Long codeType;

    /**
     * <p>The country code of the phone number. SMS verification codes can be sent only by using phone numbers in the Chinese mainland. Default value: 86.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>Specifies how to handle the verification codes received earlier in a case where verification codes are sent to the same phone number for the same scenario within the validity period.</p>
     * <ul>
     * <li>1 (default): The latest verification code overwrites the verification codes received earlier. In this case, verification codes received earlier expire.</li>
     * <li>2: Verification codes within their validity period are valid and can be used for verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DuplicatePolicy")
    public Long duplicatePolicy;

    /**
     * <p>The time interval. Unit: seconds. Default value: 60. This parameter specifies how often you can send a verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The external ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12358794Aqzaq</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86130****0000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to return a verification code.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReturnVerifyCode")
    public Boolean returnVerifyCode;

    /**
     * <p>The verification service name. If this parameter is not specified, the default service is used. The name can be up to 20 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    /**
     * <p>The signature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun Test</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The extension code of the upstream text message. Upstream text messages are text messages sent to the communication service provider. Upstream text messages are used to customize a service, complete an inquiry, or send a request. You are charged for sending upstream text messages based on the billing standards of the service provider.</p>
     * <blockquote>
     * <p> The extension code is automatically generated by the system when the signature is generated. You do not need to specify the extension code. You can skip this parameter based on your business requirements. If you want to use custom extension codes, contact your account manager.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1213123</p>
     */
    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    /**
     * <p>The code of the text message template.</p>
     * <p>Log on to the <a href="https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview">SMS console</a>. In the left-side navigation pane, click <strong>Go China</strong> or <strong>Go Globe</strong>. You can view the text message template code in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
     * <blockquote>
     * <p> The text message templates must be created on the Go Globe page and approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>azsq_*****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The value of the variable in the text message template. The verification code is replaced with &quot;##code##&quot;.</p>
     * <p>Example 1: For a system-defined template that contains variables, if the template content is &quot;Your verification code is ${code} and valid for 5 minutes. Do not disclose the verification code to others.&quot;, specify the value of this parameter as {&quot;code&quot;:&quot;##code##&quot;}</p>
     * <p>Example 2: For a custom template, if the template content is ${content}, specify the value of this parameter as {&quot;content&quot;:&quot;Your verification code is ##code## and must be used within 5 minutes.&quot;}.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If line breaks are required in JSON-formatted data, they must meet the relevant requirements that are specified in the standard JSON protocol.</p>
     * </li>
     * <li><p>For more information about template variables, see <a href="https://help.aliyun.com/document_detail/108253.html">SMS template specifications</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;##code##&quot;}</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    /**
     * <p>The validity period of the verification code. Unit: seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ValidTime")
    public Long validTime;

    public static SendSmsVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsVerifyCodeRequest self = new SendSmsVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsVerifyCodeRequest setCodeLength(Long codeLength) {
        this.codeLength = codeLength;
        return this;
    }
    public Long getCodeLength() {
        return this.codeLength;
    }

    public SendSmsVerifyCodeRequest setCodeType(Long codeType) {
        this.codeType = codeType;
        return this;
    }
    public Long getCodeType() {
        return this.codeType;
    }

    public SendSmsVerifyCodeRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public SendSmsVerifyCodeRequest setDuplicatePolicy(Long duplicatePolicy) {
        this.duplicatePolicy = duplicatePolicy;
        return this;
    }
    public Long getDuplicatePolicy() {
        return this.duplicatePolicy;
    }

    public SendSmsVerifyCodeRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public SendSmsVerifyCodeRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendSmsVerifyCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendSmsVerifyCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SendSmsVerifyCodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendSmsVerifyCodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendSmsVerifyCodeRequest setReturnVerifyCode(Boolean returnVerifyCode) {
        this.returnVerifyCode = returnVerifyCode;
        return this;
    }
    public Boolean getReturnVerifyCode() {
        return this.returnVerifyCode;
    }

    public SendSmsVerifyCodeRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public SendSmsVerifyCodeRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendSmsVerifyCodeRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendSmsVerifyCodeRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendSmsVerifyCodeRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendSmsVerifyCodeRequest setValidTime(Long validTime) {
        this.validTime = validTime;
        return this;
    }
    public Long getValidTime() {
        return this.validTime;
    }

}
