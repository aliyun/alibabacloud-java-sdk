// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class SendIdentityValidateResultShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("ActionSource")
    public String actionSource;

    @NameInMap("AsToken")
    public String asToken;

    @NameInMap("DeviceEnvironment")
    public String deviceEnvironmentShrink;

    @NameInMap("EntranceCode")
    public String entranceCode;

    @NameInMap("ExtraData")
    public String extraDataShrink;

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
    public String userInfoShrink;

    @NameInMap("UserInput")
    public String userInput;

    @NameInMap("ValidateFailureReason")
    public String validateFailureReason;

    @NameInMap("ValidateResult")
    public Boolean validateResult;

    @NameInMap("ValidatorTypes")
    public String validatorTypesShrink;

    public static SendIdentityValidateResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendIdentityValidateResultShrinkRequest self = new SendIdentityValidateResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendIdentityValidateResultShrinkRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public SendIdentityValidateResultShrinkRequest setActionSource(String actionSource) {
        this.actionSource = actionSource;
        return this;
    }
    public String getActionSource() {
        return this.actionSource;
    }

    public SendIdentityValidateResultShrinkRequest setAsToken(String asToken) {
        this.asToken = asToken;
        return this;
    }
    public String getAsToken() {
        return this.asToken;
    }

    public SendIdentityValidateResultShrinkRequest setDeviceEnvironmentShrink(String deviceEnvironmentShrink) {
        this.deviceEnvironmentShrink = deviceEnvironmentShrink;
        return this;
    }
    public String getDeviceEnvironmentShrink() {
        return this.deviceEnvironmentShrink;
    }

    public SendIdentityValidateResultShrinkRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public SendIdentityValidateResultShrinkRequest setExtraDataShrink(String extraDataShrink) {
        this.extraDataShrink = extraDataShrink;
        return this;
    }
    public String getExtraDataShrink() {
        return this.extraDataShrink;
    }

    public SendIdentityValidateResultShrinkRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public SendIdentityValidateResultShrinkRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public SendIdentityValidateResultShrinkRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SendIdentityValidateResultShrinkRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SendIdentityValidateResultShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SendIdentityValidateResultShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public SendIdentityValidateResultShrinkRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

    public SendIdentityValidateResultShrinkRequest setValidateFailureReason(String validateFailureReason) {
        this.validateFailureReason = validateFailureReason;
        return this;
    }
    public String getValidateFailureReason() {
        return this.validateFailureReason;
    }

    public SendIdentityValidateResultShrinkRequest setValidateResult(Boolean validateResult) {
        this.validateResult = validateResult;
        return this;
    }
    public Boolean getValidateResult() {
        return this.validateResult;
    }

    public SendIdentityValidateResultShrinkRequest setValidatorTypesShrink(String validatorTypesShrink) {
        this.validatorTypesShrink = validatorTypesShrink;
        return this;
    }
    public String getValidatorTypesShrink() {
        return this.validatorTypesShrink;
    }

}
