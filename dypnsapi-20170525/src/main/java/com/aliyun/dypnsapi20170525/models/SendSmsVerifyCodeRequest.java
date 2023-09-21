// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsVerifyCodeRequest extends TeaModel {
    @NameInMap("CodeLength")
    public Long codeLength;

    @NameInMap("CodeType")
    public Long codeType;

    @NameInMap("CountryCode")
    public String countryCode;

    @NameInMap("DuplicatePolicy")
    public Long duplicatePolicy;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ReturnVerifyCode")
    public Boolean returnVerifyCode;

    @NameInMap("SchemeName")
    public String schemeName;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParam")
    public String templateParam;

    @NameInMap("ValidTime")
    public Long validTime;

    public static SendSmsVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsVerifyCodeRequest self = new SendSmsVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsVerifyCodeRequest setCodeLength(Long codeLength) {
        this.codeLength = codeLength;
        return this;
    }
    public Long getCodeLength() {
        return this.codeLength;
    }

    public SendSmsVerifyCodeRequest setCodeType(Long codeType) {
        this.codeType = codeType;
        return this;
    }
    public Long getCodeType() {
        return this.codeType;
    }

    public SendSmsVerifyCodeRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public SendSmsVerifyCodeRequest setDuplicatePolicy(Long duplicatePolicy) {
        this.duplicatePolicy = duplicatePolicy;
        return this;
    }
    public Long getDuplicatePolicy() {
        return this.duplicatePolicy;
    }

    public SendSmsVerifyCodeRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public SendSmsVerifyCodeRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendSmsVerifyCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendSmsVerifyCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SendSmsVerifyCodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendSmsVerifyCodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendSmsVerifyCodeRequest setReturnVerifyCode(Boolean returnVerifyCode) {
        this.returnVerifyCode = returnVerifyCode;
        return this;
    }
    public Boolean getReturnVerifyCode() {
        return this.returnVerifyCode;
    }

    public SendSmsVerifyCodeRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public SendSmsVerifyCodeRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendSmsVerifyCodeRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendSmsVerifyCodeRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendSmsVerifyCodeRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendSmsVerifyCodeRequest setValidTime(Long validTime) {
        this.validTime = validTime;
        return this;
    }
    public Long getValidTime() {
        return this.validTime;
    }

}
