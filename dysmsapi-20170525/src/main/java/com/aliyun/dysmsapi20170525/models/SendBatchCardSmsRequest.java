// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchCardSmsRequest extends TeaModel {
    /**
     * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_3245</p>
     */
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    /**
     * <p>The variables of the card message template.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;customurl\&quot;:\&quot;<a href="http://www.alibaba.com%5C%5C%22,%5C%5C%22dyncParams%5C%5C%22:%5C%5C%22%7B%5C%5C%5C%5C%5C%5C%22a%5C%5C%5C%5C%5C%5C%22:%5C%5C%5C%5C%5C%5C%22hello%5C%5C%5C%5C%5C%5C%22,%5C%5C%5C%5C%5C%5C%22b%5C%5C%5C%5C%5C%5C%22:%5C%5C%5C%5C%5C%5C%22world%5C%5C%5C%5C%5C%5C%22%7D%5C%5C%22%7D%5D">http://www.alibaba.com\\&quot;,\\&quot;dyncParams\\&quot;:\\&quot;{\\\\\\&quot;a\\\\\\&quot;:\\\\\\&quot;hello\\\\\\&quot;,\\\\\\&quot;b\\\\\\&quot;:\\\\\\&quot;world\\\\\\&quot;}\\&quot;}]</a></p>
     */
    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

    /**
     * <p>The code of the digital message template that applies when the card message is rolled back. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DIGITAL_SMS_234080176</p>
     */
    @NameInMap("DigitalTemplateCode")
    public String digitalTemplateCode;

    /**
     * <p>The variables of the digital message template.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;a&quot;:1,&quot;b&quot;:2},{&quot;a&quot;:9,&quot;b&quot;:8}]</p>
     */
    @NameInMap("DigitalTemplateParamJson")
    public String digitalTemplateParamJson;

    /**
     * <p>The rollback type. Valid values:</p>
     * <ul>
     * <li><strong>SMS</strong>: text message</li>
     * <li><strong>DIGITALSMS</strong>: digital message</li>
     * <li><strong>NONE</strong>: none</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS</p>
     */
    @NameInMap("FallbackType")
    public String fallbackType;

    /**
     * <p>The ID that is reserved for the caller of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>16545681783595370</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The mobile numbers of the recipients.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;1390000****\&quot;,\&quot;1370000****\&quot;]&quot;</p>
     */
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    /**
     * <p>The signature. You can view the template code in the <strong>Signature</strong> column on the <strong>Signaturess</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>The signatures must be approved and correspond to the mobile numbers in sequence.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignNameJson")
    public String signNameJson;

    /**
     * <p>The code of the text message template that applies when the card message is rolled back. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_234251075</p>
     */
    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    /**
     * <p>The variables of the text message template.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;a&quot;:1,&quot;b&quot;:2},{&quot;a&quot;:9,&quot;b&quot;:8}]</p>
     */
    @NameInMap("SmsTemplateParamJson")
    public String smsTemplateParamJson;

    /**
     * <p>The extension code of the upstream message.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;6\&quot;,\&quot;6\&quot;]</p>
     */
    @NameInMap("SmsUpExtendCodeJson")
    public String smsUpExtendCodeJson;

    /**
     * <p>The code of the message template.</p>
     * <p>You can log on to the <a href="https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview">Alibaba Cloud console</a>, click <strong>Go China</strong> or <strong>Go Globe</strong> in the left-side navigation pane, and then view the <strong>template code</strong> on the <strong>Templates</strong> tab.</p>
     * <blockquote>
     * <p>You must specify a message template that is created in the SMS console and approved by Alibaba Cloud. If you send messages to countries or regions outside the Chinese mainland, use the corresponding message templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_20375****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The value of the variable in the message template.</p>
     * <blockquote>
     * <p>If you need to add line breaks to the JSON template, make sure that the format is valid. In addition, the sequence of variable values must be the same as that of the mobile numbers and signatures.</p>
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
