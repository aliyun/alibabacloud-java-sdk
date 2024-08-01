// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>5739</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The signature. To query the signature, log on to the <a href="https://sms-intl.console.aliyun.com/overview">Short Message Service (SMS) console</a> and navigate to the <strong>Signatures</strong> tab of the <strong>Go China</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alicloud321</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The extension code of the MO message.</p>
     * 
     * <strong>example:</strong>
     * <p>90999</p>
     */
    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    /**
     * <p>The code of the message template. To query the code, log on to the <a href="https://sms-intl.console.aliyun.com/overview">SMS console</a> and navigate to the <strong>Templates</strong> tab of the <strong>Go China</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The value of the variable in the message template. If a variable exists in the template, the parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;1234&quot;,&quot;product&quot;:&quot;ytx&quot;}</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    /**
     * <p>The mobile phone number to which the message is sent. You must add the country code to the beginning of the mobile phone number. Example: 861503871\<em>\</em>\<em>\</em>.</p>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/sms/product-overview/dialing-codes?spm=a2c63.p38356.0.0.367279cbwQFoeM">Dialing codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861503871****</p>
     */
    @NameInMap("To")
    public String to;

    /**
     * <p>The validity period of the message.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ValidityPeriod")
    public Long validityPeriod;

    public static SendMessageWithTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateRequest self = new SendMessageWithTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageWithTemplateRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SendMessageWithTemplateRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageWithTemplateRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendMessageWithTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendMessageWithTemplateRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendMessageWithTemplateRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendMessageWithTemplateRequest setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

}
