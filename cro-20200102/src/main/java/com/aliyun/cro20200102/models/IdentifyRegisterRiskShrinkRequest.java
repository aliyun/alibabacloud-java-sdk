// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyRegisterRiskShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

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

    @NameInMap("SiteCode")
    public String siteCode;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    @NameInMap("UserInput")
    public String userInput;

    public static IdentifyRegisterRiskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentifyRegisterRiskShrinkRequest self = new IdentifyRegisterRiskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IdentifyRegisterRiskShrinkRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public IdentifyRegisterRiskShrinkRequest setDeviceEnvironmentShrink(String deviceEnvironmentShrink) {
        this.deviceEnvironmentShrink = deviceEnvironmentShrink;
        return this;
    }
    public String getDeviceEnvironmentShrink() {
        return this.deviceEnvironmentShrink;
    }

    public IdentifyRegisterRiskShrinkRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public IdentifyRegisterRiskShrinkRequest setExtraDataShrink(String extraDataShrink) {
        this.extraDataShrink = extraDataShrink;
        return this;
    }
    public String getExtraDataShrink() {
        return this.extraDataShrink;
    }

    public IdentifyRegisterRiskShrinkRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public IdentifyRegisterRiskShrinkRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public IdentifyRegisterRiskShrinkRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public IdentifyRegisterRiskShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public IdentifyRegisterRiskShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public IdentifyRegisterRiskShrinkRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

}
