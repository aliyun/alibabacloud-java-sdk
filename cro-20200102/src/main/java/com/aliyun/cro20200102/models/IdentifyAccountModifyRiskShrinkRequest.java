// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyAccountModifyRiskShrinkRequest extends TeaModel {
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

    public static IdentifyAccountModifyRiskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentifyAccountModifyRiskShrinkRequest self = new IdentifyAccountModifyRiskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IdentifyAccountModifyRiskShrinkRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public IdentifyAccountModifyRiskShrinkRequest setDeviceEnvironmentShrink(String deviceEnvironmentShrink) {
        this.deviceEnvironmentShrink = deviceEnvironmentShrink;
        return this;
    }
    public String getDeviceEnvironmentShrink() {
        return this.deviceEnvironmentShrink;
    }

    public IdentifyAccountModifyRiskShrinkRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public IdentifyAccountModifyRiskShrinkRequest setExtraDataShrink(String extraDataShrink) {
        this.extraDataShrink = extraDataShrink;
        return this;
    }
    public String getExtraDataShrink() {
        return this.extraDataShrink;
    }

    public IdentifyAccountModifyRiskShrinkRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public IdentifyAccountModifyRiskShrinkRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public IdentifyAccountModifyRiskShrinkRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public IdentifyAccountModifyRiskShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public IdentifyAccountModifyRiskShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public IdentifyAccountModifyRiskShrinkRequest setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }
    public String getUserInput() {
        return this.userInput;
    }

}
