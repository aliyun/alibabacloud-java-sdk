// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchSmsRequest extends TeaModel {
    /**
     * <p>An external business ID. It must be a string of fewer than 256 characters.</p>
     * <blockquote>
     * <p>You can leave this parameter empty if you have no special requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abcdefg</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The recipient phone numbers. Format:</p>
     * <ul>
     * <li><p>For domestic SMS: Phone numbers with or without a country code such as <code>+</code>, <code>+86</code>, <code>0086</code>, or <code>86</code>. Example: <code>1590000****</code>.</p>
     * </li>
     * <li><p>For international SMS: The country code followed by the phone number. Example: <code>852000012****</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For time-sensitive messages like verification codes, use the <a href="https://help.aliyun.com/document_detail/419273.html">SendSms</a> operation to send messages individually.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1590000****&quot;,&quot;1350000****&quot;]</p>
     */
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature names. The number of signatures must match the number of phone numbers.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/419282.html">QuerySmsSignList</a> operation or check the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Short Message Service console</a> to find approved signatures. You must use an approved signature.</p>
     * <blockquote>
     * <ul>
     * <li>The system uses the selected signature to send SMS messages.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;阿里云&quot;,&quot;阿里巴巴&quot;]</p>
     */
    @NameInMap("SignNameJson")
    public String signNameJson;

    /**
     * <p>A JSON array of MO SMS extension codes.</p>
     * <blockquote>
     * <p>You can leave this parameter empty if you have no special requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;90999&quot;,&quot;90998&quot;]</p>
     */
    @NameInMap("SmsUpExtendCodeJson")
    public String smsUpExtendCodeJson;

    /**
     * <p>The message template code. You cannot use templates for domestic SMS and international SMS interchangeably.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> operation or check the <a href="https://dysms.console.aliyun.com/domestic/text/template">Short Message Service console</a> to find approved template codes. You must use an approved template code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_15255****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The actual values for the template variables. This parameter is required if the template contains variables.</p>
     * <blockquote>
     * <ul>
     * <li><p>The number of template variable sets must match the number of phone numbers and signatures. The elements in the PhoneNumberJson, SignNameJson, and TemplateParamJson arrays must correspond by index to ensure each message is sent with the correct signature and variable values.</p>
     * </li>
     * <li><p>If you need to include a line break in the JSON string, follow the standard JSON format.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;TemplateParamJson&quot;},{&quot;name&quot;:&quot;TemplateParamJson&quot;}]</p>
     */
    @NameInMap("TemplateParamJson")
    public String templateParamJson;

    public static SendBatchSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBatchSmsRequest self = new SendBatchSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendBatchSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendBatchSmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendBatchSmsRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendBatchSmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendBatchSmsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendBatchSmsRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendBatchSmsRequest setSmsUpExtendCodeJson(String smsUpExtendCodeJson) {
        this.smsUpExtendCodeJson = smsUpExtendCodeJson;
        return this;
    }
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

    public SendBatchSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendBatchSmsRequest setTemplateParamJson(String templateParamJson) {
        this.templateParamJson = templateParamJson;
        return this;
    }
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

}
