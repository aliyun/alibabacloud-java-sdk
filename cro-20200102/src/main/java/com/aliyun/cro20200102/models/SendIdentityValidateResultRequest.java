// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class SendIdentityValidateResultRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("ActionSource")
    public String actionSource;

    @NameInMap("AsToken")
    public String asToken;

    @NameInMap("DeviceEnvironment")
    public java.util.Map<String, ?> deviceEnvironment;

    @NameInMap("EntranceCode")
    public String entranceCode;

    @NameInMap("ExtraData")
    public java.util.Map<String, ?> extraData;

    @NameInMap("OperateSubType")
    public String operateSubType;

    @NameInMap("OperateTime")
    public Long operateTime;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("SiteCode")
    public String siteCode;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserInfo")
    public java.util.Map<String, ?> userInfo;

    @NameInMap("UserInput")
    public String userInput;

    @NameInMap("ValidateFailureReason")
    public String validateFailureReason;

    @NameInMap("ValidateResult")
    public Boolean validateResult;

    @NameInMap("ValidatorTypes")
    public java.util.Map<String, ?> validatorTypes;

    public static SendIdentityValidateResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SendIdentityValidateResultRequest self = new SendIdentityValidateResultRequest();
        return TeaModel.build(map, self);
    }

    public SendIdentityValidateResultRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public SendIdentityValidateResultRequest setActionSource(String actionSource) {
        this.actionSource = actionSource;
        return this;
    }
    public String getActionSource() {
        return this.actionSource;
    }

    public SendIdentityValidateResultRequest setAsToken(String asToken) {
        this.asToken = asToken;
        return this;
    }
    public String getAsToken() {
        return this.asToken;
    }

    public SendIdentityValidateResultRequest setDeviceEnvironment(java.util.Map<String, ?> deviceEnvironment) {
        this.deviceEnvironment = deviceEnvironment;
        return this;
    }
    public java.util.Map<String, ?> getDeviceEnvironment() {
        return this.deviceEnvironment;
    }

    public SendIdentityValidateResultRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public SendIdentityValidateResultRequest setExtraData(java.util.Map<String, ?> extraData) {
        this.extraData = extraData;
        return this;
    }
    public java.util.Map<String, ?> getExtraData() {
        return this.extraData;
    }

    public SendIdentityValidateResultRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public SendIdentityValidateResultRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public SendIdentityValidateResultRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SendIdentityValidateResultRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SendIdentityValidateResultRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SendIdentityValidateResultRequest setUserInfo(java.util.Map<String, ?> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public java.util.Map<String, ?> getUserInfo() {
        return this.userInfo;
    }

    public SendIdentityValidateResultRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

    public SendIdentityValidateResultRequest setValidateFailureReason(String validateFailureReason) {
        this.validateFailureReason = validateFailureReason;
        return this;
    }
    public String getValidateFailureReason() {
        return this.validateFailureReason;
    }

    public SendIdentityValidateResultRequest setValidateResult(Boolean validateResult) {
        this.validateResult = validateResult;
        return this;
    }
    public Boolean getValidateResult() {
        return this.validateResult;
    }

    public SendIdentityValidateResultRequest setValidatorTypes(java.util.Map<String, ?> validatorTypes) {
        this.validatorTypes = validatorTypes;
        return this;
    }
    public java.util.Map<String, ?> getValidatorTypes() {
        return this.validatorTypes;
    }

}
