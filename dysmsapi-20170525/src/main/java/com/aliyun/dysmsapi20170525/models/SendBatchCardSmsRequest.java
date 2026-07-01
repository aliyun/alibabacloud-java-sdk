// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchCardSmsRequest extends TeaModel {
    /**
     * <p>The code of the card SMS template. On the <strong>Card SMS</strong> <a href="https://dysms.console.aliyun.com/domestic/card">Template Management</a> page in the console, select the code of a card SMS template that has been <strong>approved</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_3**5</p>
     */
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    /**
     * <p>The actual values of the variables in the card SMS template. This parameter is required when the card SMS template specified by <strong>CardTemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <p>If the JSON contains line breaks, handle them based on the standard JSON protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;customurl&quot;:&quot;<a href="http://www.alibaba.com%22,%22dyncParams%22:%22%7B%22a%22:%22hello%22,%22b%22:%22world%22%7D%22%7D%5D">http://www.alibaba.com&quot;,&quot;dyncParams&quot;:&quot;{&quot;a&quot;:&quot;hello&quot;,&quot;b&quot;:&quot;world&quot;}&quot;}]</a></p>
     */
    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

    /**
     * <p>The code of the digital SMS template used for fallback. This parameter is required when <strong>FallbackType</strong> is set to <strong>DIGITALSMS</strong> (fallback to digital SMS).</p>
     * <p>You can view the list of digital SMS templates on the <strong>Domestic Digital SMS</strong> <a href="https://dysms.console.aliyun.com/domestic/digit">Template Management</a> page in the console.</p>
     * <blockquote>
     * <p>The template must be added and approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DIGITAL_SMS_23408****</p>
     */
    @NameInMap("DigitalTemplateCode")
    public String digitalTemplateCode;

    /**
     * <p>The actual values of the variables in the digital SMS template. This parameter is required when the fallback digital SMS template specified by <strong>DigitalTemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <p>If the JSON contains line breaks, handle them based on the standard JSON protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;a&quot;:1,&quot;b&quot;:2},{&quot;a&quot;:9,&quot;b&quot;:8}]</p>
     */
    @NameInMap("DigitalTemplateParamJson")
    public String digitalTemplateParamJson;

    /**
     * <p>The fallback type. Valid values:</p>
     * <ul>
     * <li><strong>SMS</strong>: Phone numbers that do not support card SMS messages fall back to text SMS messages.</li>
     * <li><strong>DIGITALSMS</strong>: Phone numbers that do not support card SMS messages fall back to digital SMS messages.</li>
     * <li><strong>NONE</strong>: No fallback is required.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS</p>
     */
    @NameInMap("FallbackType")
    public String fallbackType;

    /**
     * <p>The ID reserved for the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>16545681783595370</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The mobile phone numbers that receive the SMS messages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1390000****&quot;,&quot;1370000****&quot;]</p>
     */
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    /**
     * <p>The name of the SMS signature.
     * You can call the <a href="https://help.aliyun.com/document_detail/419282.html">QuerySmsSignList</a> operation to query the signatures that have been submitted under the current account, or you can view the list of signatures in the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Short Message Service console</a>.</p>
     * <blockquote>
     * <p>The signature must be added and approved. The number of SMS signatures must be the same as the number of phone numbers, and the signatures must be in one-to-one correspondence with the phone numbers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;阿里云&quot;,&quot;阿里巴巴&quot;]</p>
     */
    @NameInMap("SignNameJson")
    public String signNameJson;

    /**
     * <p>The code of the text SMS template used for fallback. This parameter is required when <strong>FallbackType</strong> is set to <strong>SMS</strong> (fallback to text SMS).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> operation to query the templates that have been submitted under the current account, or you can view the list of templates in the <a href="https://dysms.console.aliyun.com/domestic/text/template">Short Message Service console</a>.</p>
     * <blockquote>
     * <p>The template must be added and approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_23425****</p>
     */
    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    /**
     * <p>The actual values of the variables in the text SMS template. This parameter is required when the fallback text SMS template specified by <strong>SmsTemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <p>If the JSON contains line breaks, handle them based on the standard JSON protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;a&quot;:1,&quot;b&quot;:2},{&quot;a&quot;:9,&quot;b&quot;:8}]</p>
     */
    @NameInMap("SmsTemplateParamJson")
    public String smsTemplateParamJson;

    /**
     * <p>The extension code of the MO (mobile-originated) SMS message.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;6\&quot;,\&quot;6\&quot;]</p>
     */
    @NameInMap("SmsUpExtendCodeJson")
    public String smsUpExtendCodeJson;

    /**
     * <p>The code of the custom send content template.</p>
     * <p>The custom content is sent to the terminal in the form of the selected text SMS template plus the card parsing link. You can log on to the <a href="https://dysms.console.aliyun.com/overview">Short Message Service console</a>, choose <strong>Domestic Messages</strong> or <strong>International/Hong Kong, Macao, and Taiwan Messages</strong>, and then view the <strong>Template Code</strong> on the <strong>Template Management</strong> page.</p>
     * <blockquote>
     * <ul>
     * <li>The template must be added and approved. To send international or Hong Kong, Macao, and Taiwan messages, use an international or Hong Kong, Macao, and Taiwan SMS template.</li>
     * <li>For example, the selected text SMS template content is: You have a message to check; the card parsing link is: <code>1*.cn/2**d</code>. The final delivered content is: <code>You have a message to check 1*.cn/2**d</code>. Perform testing and control the number of characters before sending.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_20375****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The actual values of the variables in the custom send content template. This parameter is required when the SMS template specified by <strong>TemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <ul>
     * <li>If the JSON contains line breaks, handle them based on the standard JSON protocol.</li>
     * <li>The number of template variable values must be the same as the number of phone numbers and signatures, and they must be in one-to-one correspondence. This indicates that an SMS message with the corresponding signature is sent to the specified phone number, and the variable parameters in the SMS template are replaced with the corresponding values.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;TemplateParamJson&quot;},{&quot;name&quot;:&quot;TemplateParamJson&quot;}]</p>
     */
    @NameInMap("TemplateParamJson")
    public String templateParamJson;

    public static SendBatchCardSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBatchCardSmsRequest self = new SendBatchCardSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendBatchCardSmsRequest setCardTemplateCode(String cardTemplateCode) {
        this.cardTemplateCode = cardTemplateCode;
        return this;
    }
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    public SendBatchCardSmsRequest setCardTemplateParamJson(String cardTemplateParamJson) {
        this.cardTemplateParamJson = cardTemplateParamJson;
        return this;
    }
    public String getCardTemplateParamJson() {
        return this.cardTemplateParamJson;
    }

    public SendBatchCardSmsRequest setDigitalTemplateCode(String digitalTemplateCode) {
        this.digitalTemplateCode = digitalTemplateCode;
        return this;
    }
    public String getDigitalTemplateCode() {
        return this.digitalTemplateCode;
    }

    public SendBatchCardSmsRequest setDigitalTemplateParamJson(String digitalTemplateParamJson) {
        this.digitalTemplateParamJson = digitalTemplateParamJson;
        return this;
    }
    public String getDigitalTemplateParamJson() {
        return this.digitalTemplateParamJson;
    }

    public SendBatchCardSmsRequest setFallbackType(String fallbackType) {
        this.fallbackType = fallbackType;
        return this;
    }
    public String getFallbackType() {
        return this.fallbackType;
    }

    public SendBatchCardSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendBatchCardSmsRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendBatchCardSmsRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendBatchCardSmsRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public SendBatchCardSmsRequest setSmsTemplateParamJson(String smsTemplateParamJson) {
        this.smsTemplateParamJson = smsTemplateParamJson;
        return this;
    }
    public String getSmsTemplateParamJson() {
        return this.smsTemplateParamJson;
    }

    public SendBatchCardSmsRequest setSmsUpExtendCodeJson(String smsUpExtendCodeJson) {
        this.smsUpExtendCodeJson = smsUpExtendCodeJson;
        return this;
    }
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

    public SendBatchCardSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendBatchCardSmsRequest setTemplateParamJson(String templateParamJson) {
        this.templateParamJson = templateParamJson;
        return this;
    }
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

}
