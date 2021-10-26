// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsSmartRequest extends TeaModel {
    @NameInMap("ExtendCode")
    public String extendCode;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("NumberType")
    public String numberType;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParam")
    public String templateParam;

    public static SendSmsSmartRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsSmartRequest self = new SendSmsSmartRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsSmartRequest setExtendCode(String extendCode) {
        this.extendCode = extendCode;
        return this;
    }
    public String getExtendCode() {
        return this.extendCode;
    }

    public SendSmsSmartRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public SendSmsSmartRequest setNumberType(String numberType) {
        this.numberType = numberType;
        return this;
    }
    public String getNumberType() {
        return this.numberType;
    }

    public SendSmsSmartRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendSmsSmartRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendSmsSmartRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendSmsSmartRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendSmsSmartRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

}
