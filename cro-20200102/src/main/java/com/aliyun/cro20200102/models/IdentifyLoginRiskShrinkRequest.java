// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyLoginRiskShrinkRequest extends TeaModel {
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

    @NameInMap("SocialNetworkServiceType")
    public String socialNetworkServiceType;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    @NameInMap("UserInput")
    public String userInput;

    public static IdentifyLoginRiskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentifyLoginRiskShrinkRequest self = new IdentifyLoginRiskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IdentifyLoginRiskShrinkRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public IdentifyLoginRiskShrinkRequest setDeviceEnvironmentShrink(String deviceEnvironmentShrink) {
        this.deviceEnvironmentShrink = deviceEnvironmentShrink;
        return this;
    }
    public String getDeviceEnvironmentShrink() {
        return this.deviceEnvironmentShrink;
    }

    public IdentifyLoginRiskShrinkRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public IdentifyLoginRiskShrinkRequest setExtraDataShrink(String extraDataShrink) {
        this.extraDataShrink = extraDataShrink;
        return this;
    }
    public String getExtraDataShrink() {
        return this.extraDataShrink;
    }

    public IdentifyLoginRiskShrinkRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public IdentifyLoginRiskShrinkRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public IdentifyLoginRiskShrinkRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public IdentifyLoginRiskShrinkRequest setSocialNetworkServiceType(String socialNetworkServiceType) {
        this.socialNetworkServiceType = socialNetworkServiceType;
        return this;
    }
    public String getSocialNetworkServiceType() {
        return this.socialNetworkServiceType;
    }

    public IdentifyLoginRiskShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public IdentifyLoginRiskShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public IdentifyLoginRiskShrinkRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

}
