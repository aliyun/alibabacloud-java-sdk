// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyAccountModifyRiskRequest extends TeaModel {
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

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserInfo")
    public java.util.Map<String, ?> userInfo;

    @NameInMap("UserInput")
    public String userInput;

    public static IdentifyAccountModifyRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentifyAccountModifyRiskRequest self = new IdentifyAccountModifyRiskRequest();
        return TeaModel.build(map, self);
    }

    public IdentifyAccountModifyRiskRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public IdentifyAccountModifyRiskRequest setDeviceEnvironment(java.util.Map<String, ?> deviceEnvironment) {
        this.deviceEnvironment = deviceEnvironment;
        return this;
    }
    public java.util.Map<String, ?> getDeviceEnvironment() {
        return this.deviceEnvironment;
    }

    public IdentifyAccountModifyRiskRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public IdentifyAccountModifyRiskRequest setExtraData(java.util.Map<String, ?> extraData) {
        this.extraData = extraData;
        return this;
    }
    public java.util.Map<String, ?> getExtraData() {
        return this.extraData;
    }

    public IdentifyAccountModifyRiskRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public IdentifyAccountModifyRiskRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public IdentifyAccountModifyRiskRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public IdentifyAccountModifyRiskRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public IdentifyAccountModifyRiskRequest setUserInfo(java.util.Map<String, ?> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public java.util.Map<String, ?> getUserInfo() {
        return this.userInfo;
    }

    public IdentifyAccountModifyRiskRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

}
