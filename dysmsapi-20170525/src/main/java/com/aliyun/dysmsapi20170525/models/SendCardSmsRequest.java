// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsRequest extends TeaModel {
    @NameInMap("CardObjects")
    public java.util.List<SendCardSmsRequestCardObjects> cardObjects;

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

    @NameInMap("TemplateCode")
    public String templateCode;

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
        @NameInMap("customUrl")
        public String customUrl;

        @NameInMap("dyncParams")
        public String dyncParams;

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
