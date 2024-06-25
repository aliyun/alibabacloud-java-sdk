// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsRequest extends TeaModel {
    /**
     * <p>The objects of the message template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CardObjects")
    public java.util.List<SendCardSmsRequestCardObjects> cardObjects;

    /**
     * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_70</p>
     */
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    /**
     * <p>The code of the digital message template that applies when the card message is rolled back. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_003</p>
     */
    @NameInMap("DigitalTemplateCode")
    public String digitalTemplateCode;

    /**
     * <p>The variables of the digital message template.</p>
     * <blockquote>
     * <p>If you need to add line breaks to the JSON template, make sure that the format is valid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;msg\&quot;,\&quot;xxxd\&quot;}</p>
     */
    @NameInMap("DigitalTemplateParam")
    public String digitalTemplateParam;

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
     * <p>38d76c9b-4a9a-4c89-afae-61fd8e0e****</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The signature. You can view the template code in the <strong>Signature</strong> column on the <strong>Signaturess</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>The signature must be approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The code of the text message template that applies when the card message is rolled back. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved. If you set the <strong>FallbackType</strong> parameter to <strong>SMS</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SIER_TEST_01</p>
     */
    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    /**
     * <p>The variables of the text message template.</p>
     * <blockquote>
     * <p>If you need to add line breaks to the JSON template, make sure that the format is valid.</p>
     * </blockquote>
     */
    @NameInMap("SmsTemplateParam")
    public String smsTemplateParam;

    /**
     * <p>The extension code of the upstream message. Upstream messages are messages sent to the communication service provider. Upstream messages are used to customize a service, complete an inquiry, or send a request. You are charged for sending upstream messages based on the billing standards of the service provider.</p>
     * <blockquote>
     * <p>If you do not need upstream messages, ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    /**
     * <p>The code of the text message template.</p>
     * <p>Log on to the Alibaba Cloud SMS console. In the left-side navigation pane, click <strong>Go Globe</strong> or <strong>Go China</strong>. You can view the message template in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
     * <blockquote>
     * <p>The message templates must be created on the Go Globe page and approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_2322****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The variables of the message template. Format: JSON.</p>
     * <blockquote>
     * <p>If you need to add line breaks to the JSON template, make sure that the format is valid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *       \&quot;code\&quot;: \&quot;1111\&quot;
     * }</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    public static SendCardSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCardSmsRequest self = new SendCardSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendCardSmsRequest setCardObjects(java.util.List<SendCardSmsRequestCardObjects> cardObjects) {
        this.cardObjects = cardObjects;
        return this;
    }
    public java.util.List<SendCardSmsRequestCardObjects> getCardObjects() {
        return this.cardObjects;
    }

    public SendCardSmsRequest setCardTemplateCode(String cardTemplateCode) {
        this.cardTemplateCode = cardTemplateCode;
        return this;
    }
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    public SendCardSmsRequest setDigitalTemplateCode(String digitalTemplateCode) {
        this.digitalTemplateCode = digitalTemplateCode;
        return this;
    }
    public String getDigitalTemplateCode() {
        return this.digitalTemplateCode;
    }

    public SendCardSmsRequest setDigitalTemplateParam(String digitalTemplateParam) {
        this.digitalTemplateParam = digitalTemplateParam;
        return this;
    }
    public String getDigitalTemplateParam() {
        return this.digitalTemplateParam;
    }

    public SendCardSmsRequest setFallbackType(String fallbackType) {
        this.fallbackType = fallbackType;
        return this;
    }
    public String getFallbackType() {
        return this.fallbackType;
    }

    public SendCardSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendCardSmsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendCardSmsRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public SendCardSmsRequest setSmsTemplateParam(String smsTemplateParam) {
        this.smsTemplateParam = smsTemplateParam;
        return this;
    }
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
    }

    public SendCardSmsRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendCardSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendCardSmsRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public static class SendCardSmsRequestCardObjects extends TeaModel {
        /**
         * <p>The URL to which the message is redirected if the message fails to be rendered.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com">https://alibaba.com</a></p>
         */
        @NameInMap("customUrl")
        public String customUrl;

        /**
         * <p>The variables. Special characters, such as $ and {}, do not need to be entered.</p>
         */
        @NameInMap("dyncParams")
        public String dyncParams;

        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("mobile")
        public String mobile;

        public static SendCardSmsRequestCardObjects build(java.util.Map<String, ?> map) throws Exception {
            SendCardSmsRequestCardObjects self = new SendCardSmsRequestCardObjects();
            return TeaModel.build(map, self);
        }

        public SendCardSmsRequestCardObjects setCustomUrl(String customUrl) {
            this.customUrl = customUrl;
            return this;
        }
        public String getCustomUrl() {
            return this.customUrl;
        }

        public SendCardSmsRequestCardObjects setDyncParams(String dyncParams) {
            this.dyncParams = dyncParams;
            return this;
        }
        public String getDyncParams() {
            return this.dyncParams;
        }

        public SendCardSmsRequestCardObjects setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
