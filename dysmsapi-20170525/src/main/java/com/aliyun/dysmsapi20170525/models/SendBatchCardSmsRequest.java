// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchCardSmsRequest extends TeaModel {
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

    @NameInMap("DigitalTemplateCode")
    public String digitalTemplateCode;

    @NameInMap("DigitalTemplateParamJson")
    public String digitalTemplateParamJson;

    @NameInMap("FallbackType")
    public String fallbackType;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    @NameInMap("SignNameJson")
    public String signNameJson;

    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    @NameInMap("SmsTemplateParamJson")
    public String smsTemplateParamJson;

    @NameInMap("SmsUpExtendCodeJson")
    public String smsUpExtendCodeJson;

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

}
