// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsRequest extends TeaModel {
    /**
     * <p>The external transaction ID.</p>
     * <blockquote>
     * <p>You can ignore this parameter if you do not have special requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abcdefgh</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The recipient\&quot;s mobile number. The format varies based on the destination region:</p>
     * <ul>
     * <li><p>For messages to the Chinese mainland: A mobile number, with or without a country code. Valid prefixes are +, +86, 0086, and 86. Example: 1390000\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>For international messages or messages to Hong Kong, Macao, or Taiwan: Use the format [Country code][Mobile number]. Example: 852000012\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>To send a test message, bind a test mobile number in the <a href="https://dysms.console.aliyun.com/quickstart">console</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To send a message to multiple numbers, separate them with commas (,). You can specify up to 1,000 mobile numbers per request. Bulk sending may have higher latency than sending single messages. For time-sensitive messages such as verification codes, we recommend sending them individually.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature name.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/419282.html">QuerySmsSignList</a> API or view your list of signatures in the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Short Message Service console</a>. You must use a signature that has been <strong>approved</strong>.</p>
     * <blockquote>
     * <ul>
     * <li><p>1\. If a verification code signature and a general-purpose signature share the same name, the general-purpose signature is used by default.</p>
     * </li>
     * <li><p>2\. The system uses the specified signature to send the message.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The upstream SMS extension code. An upstream SMS message is a message sent from a user to a service provider to subscribe to a service, make a query, or perform other tasks. Such messages are charged by the carrier at standard rates.</p>
     * <blockquote>
     * <p>The system assigns a default extension code when a signature is created. Use this parameter to specify a different code. You can ignore this parameter if you do not have special requirements.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>90999</p>
     */
    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    /**
     * <p>The code of the template.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> API or view your list of templates in the <a href="https://dysms.console.aliyun.com/domestic/text/template">Short Message Service console</a>. You must use the code of a template that has been <strong>approved</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_15305****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The values for the template variables, specified as a <strong>JSON string</strong>. This parameter is required if the template contains variables. The JSON string must provide a value for each variable.</p>
     * <blockquote>
     * <ul>
     * <li><p>If the JSON string needs to include line breaks, format it according to standard JSON specifications.</p>
     * </li>
     * <li><p>For more information about template variable formatting, see <a href="https://help.aliyun.com/document_detail/463161.html">SMS template specifications</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;张三&quot;,&quot;number&quot;:&quot;1390000****&quot;}</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    public static SendSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsRequest self = new SendSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendSmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendSmsRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendSmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendSmsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendSmsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendSmsRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendSmsRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

}
