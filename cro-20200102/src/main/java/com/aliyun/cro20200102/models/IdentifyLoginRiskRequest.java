// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyLoginRiskRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

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

    @NameInMap("SiteCode")
    public String siteCode;

    @NameInMap("SocialNetworkServiceType")
    public String socialNetworkServiceType;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserInfo")
    public java.util.Map<String, ?> userInfo;

    @NameInMap("UserInput")
    public String userInput;

    public static IdentifyLoginRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentifyLoginRiskRequest self = new IdentifyLoginRiskRequest();
        return TeaModel.build(map, self);
    }

    public IdentifyLoginRiskRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public IdentifyLoginRiskRequest setDeviceEnvironment(java.util.Map<String, ?> deviceEnvironment) {
        this.deviceEnvironment = deviceEnvironment;
        return this;
    }
    public java.util.Map<String, ?> getDeviceEnvironment() {
        return this.deviceEnvironment;
    }

    public IdentifyLoginRiskRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public IdentifyLoginRiskRequest setExtraData(java.util.Map<String, ?> extraData) {
        this.extraData = extraData;
        return this;
    }
    public java.util.Map<String, ?> getExtraData() {
        return this.extraData;
    }

    public IdentifyLoginRiskRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public IdentifyLoginRiskRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public IdentifyLoginRiskRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public IdentifyLoginRiskRequest setSocialNetworkServiceType(String socialNetworkServiceType) {
        this.socialNetworkServiceType = socialNetworkServiceType;
        return this;
    }
    public String getSocialNetworkServiceType() {
        return this.socialNetworkServiceType;
    }

    public IdentifyLoginRiskRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public IdentifyLoginRiskRequest setUserInfo(java.util.Map<String, ?> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public java.util.Map<String, ?> getUserInfo() {
        return this.userInfo;
    }

    public IdentifyLoginRiskRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

}
