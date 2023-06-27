// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateRequest extends TeaModel {
    /**
     * <p>The signature. To query the signature, log on to the [Short Message Service (SMS) console](https://sms-intl.console.aliyun.com/overview) and navigate to the **Signatures** tab of the **Go China** page.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The extension code of the MO message.</p>
     */
    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    /**
     * <p>The code of the message template. To query the code, log on to the [SMS console](https://sms-intl.console.aliyun.com/overview) and navigate to the **Templates** tab of the **Go China** page.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The value of the variable in the message template. If a variable exists in the template, the parameter is required.</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    /**
     * <p>The mobile phone number to which the message is sent. You must add the country code to the beginning of the mobile phone number. Example: 861503871\*\*\*\*.</p>
     * <br>
     * <p>For more information, see [Dialing codes](https://www.alibabacloud.com/help/zh/short-message-service/latest/dialing-codes).</p>
     */
    @NameInMap("To")
    public String to;

    @NameInMap("ValidityPeriod")
    public Long validityPeriod;

    public static SendMessageWithTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateRequest self = new SendMessageWithTemplateRequest();
        return TeaModel.build(map, self);
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
