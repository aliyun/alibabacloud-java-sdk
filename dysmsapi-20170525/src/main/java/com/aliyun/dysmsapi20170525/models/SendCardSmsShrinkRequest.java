// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsShrinkRequest extends TeaModel {
    @NameInMap("CardObjects")
    public String cardObjectsShrink;

    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    @NameInMap("DigitalTemplateCode")
    public String digitalTemplateCode;

    @NameInMap("DigitalTemplateParam")
    public String digitalTemplateParam;

    @NameInMap("FallbackType")
    public String fallbackType;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    @NameInMap("SmsTemplateParam")
    public String smsTemplateParam;

    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    public static SendCardSmsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCardSmsShrinkRequest self = new SendCardSmsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendCardSmsShrinkRequest setCardObjectsShrink(String cardObjectsShrink) {
        this.cardObjectsShrink = cardObjectsShrink;
        return this;
    }
    public String getCardObjectsShrink() {
        return this.cardObjectsShrink;
    }

    public SendCardSmsShrinkRequest setCardTemplateCode(String cardTemplateCode) {
        this.cardTemplateCode = cardTemplateCode;
        return this;
    }
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    public SendCardSmsShrinkRequest setDigitalTemplateCode(String digitalTemplateCode) {
        this.digitalTemplateCode = digitalTemplateCode;
        return this;
    }
    public String getDigitalTemplateCode() {
        return this.digitalTemplateCode;
    }

    public SendCardSmsShrinkRequest setDigitalTemplateParam(String digitalTemplateParam) {
        this.digitalTemplateParam = digitalTemplateParam;
        return this;
    }
    public String getDigitalTemplateParam() {
        return this.digitalTemplateParam;
    }

    public SendCardSmsShrinkRequest setFallbackType(String fallbackType) {
        this.fallbackType = fallbackType;
        return this;
    }
    public String getFallbackType() {
        return this.fallbackType;
    }

    public SendCardSmsShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendCardSmsShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendCardSmsShrinkRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public SendCardSmsShrinkRequest setSmsTemplateParam(String smsTemplateParam) {
        this.smsTemplateParam = smsTemplateParam;
        return this;
    }
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
    }

    public SendCardSmsShrinkRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

}
