// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsRequest extends TeaModel {
    /**
     * <p>The card message objects.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SendCardSms</p>
     */
    @NameInMap("CardObjects")
    public java.util.List<SendCardSmsRequestCardObjects> cardObjects;

    /**
     * <p>The code of the card message template. On the <a href="https://dysms.console.aliyun.com/domestic/card">Template Management</a> page of the <strong>Card Messages</strong> module in the console, select the code of an approved card message template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_70</p>
     */
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    /**
     * <p>The code of the fallback digital message template. This parameter is required if you set <strong>FallbackType</strong> to <strong>DIGITALSMS</strong>.</p>
     * <p>You can view the digital message template list on the <a href="https://dysms.console.aliyun.com/domestic/digit">Template Management</a> page of the <strong>Digital Messages</strong> module in the console.</p>
     * <blockquote>
     * <p>The template must be added and approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DIGITAL_SMS_31359****</p>
     */
    @NameInMap("DigitalTemplateCode")
    public String digitalTemplateCode;

    /**
     * <p>The actual values of the variables in the fallback digital message template. This parameter is required if the digital message template specified by <strong>DigitalTemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <p>If the JSON value contains line breaks, follow the standard JSON protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;msg&quot;,&quot;xxxd&quot;}</p>
     */
    @NameInMap("DigitalTemplateParam")
    public String digitalTemplateParam;

    /**
     * <p>The fallback type. Valid values:</p>
     * <ul>
     * <li><strong>SMS</strong>: Falls back to a text message for phone numbers that do not support card messages.</li>
     * <li><strong>DIGITALSMS</strong>: Falls back to a digital message for phone numbers that do not support card messages.</li>
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
     * <p>38d76c9b-4a9a-4c89-afae-61fd8e0e****</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The signature name. You can call the <a href="https://help.aliyun.com/document_detail/419282.html">QuerySmsSignList</a> operation to query the signatures applied for under the current account or view the signature list in the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Short Message Service (SMS) console</a>.</p>
     * <blockquote>
     * <p>The signature must be approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The code of the fallback text message template. This parameter is required if you set <strong>FallbackType</strong> to <strong>SMS</strong>.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> operation to query the templates applied for under the current account or view the template list in the <a href="https://dysms.console.aliyun.com/domestic/text/template">SMS console</a>.</p>
     * <blockquote>
     * <p>The template must be added and approved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_48068****</p>
     */
    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    /**
     * <p>The actual values of the variables in the fallback text message template. This parameter is required if the text message template specified by <strong>SmsTemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <p>If the JSON value contains line breaks, follow the standard JSON protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;jifen&quot;:&quot;积分&quot;}</p>
     */
    @NameInMap("SmsTemplateParam")
    public String smsTemplateParam;

    /**
     * <p>The extension code of the MO message. An MO message is a message sent to the communications service provider to customize a service, perform a query, or handle other business. The message is charged at the standard rate of the carrier.</p>
     * <blockquote>
     * <p>If you do not have such requirements, ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    /**
     * <p>The code of the custom content template.</p>
     * <p>The custom content is sent to the recipient as a text message template combined with a card parsing link. Log on to the <a href="https://dysms.console.aliyun.com/overview">SMS console</a>, choose <strong>Domestic Messages</strong> or <strong>International/HK/MO/TW Messages</strong>, and view the <strong>Template Code</strong> on the <strong>Template Management</strong> tab.</p>
     * <blockquote>
     * <ul>
     * <li>The template code must be added and approved. To send international or Hong Kong, Macao, or Taiwan messages, use an international or Hong Kong, Macao, or Taiwan message template.</li>
     * <li>For example, if the selected text message template is &quot;You have a new message&quot; and the card parsing link is <code>1*.cn/2**d</code>, the final content is <code>You have a new message 1*.cn/2**d</code>. Test the message and control the word count before sending.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SMS_2322****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The actual values of the variables in the custom content template. This parameter is required if the message template specified by <strong>TemplateCode</strong> contains variables.</p>
     * <blockquote>
     * <p>If the JSON value contains line breaks, follow the standard JSON protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;code&quot;: &quot;1111&quot;
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
         * <p>渲染失败后跳转链接。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com">https://alibaba.com</a></p>
         */
        @NameInMap("customUrl")
        public String customUrl;

        /**
         * <p>动态参数。动参变量不需要${}</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param3&quot;:&quot;李四3&quot;,&quot;param1&quot;:&quot;李四&quot;,&quot;param2&quot;:&quot;李四2&quot;}</p>
         */
        @NameInMap("dyncParams")
        public String dyncParams;

        /**
         * <p>接收卡片短信的手机号码。</p>
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
