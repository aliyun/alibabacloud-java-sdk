// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class AccountRiskReportShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("AsToken")
    public String asToken;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("DeviceEnvironment")
    public String deviceEnvironmentShrink;

    @NameInMap("EntranceCode")
    public String entranceCode;

    @NameInMap("ExtraData")
    public String extraDataShrink;

    @NameInMap("OperateFailureReason")
    public String operateFailureReason;

    @NameInMap("OperateResult")
    public Boolean operateResult;

    @NameInMap("OperateSubType")
    public String operateSubType;

    @NameInMap("OperateTime")
    public Long operateTime;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("SiteCode")
    public String siteCode;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static AccountRiskReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountRiskReportShrinkRequest self = new AccountRiskReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AccountRiskReportShrinkRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public AccountRiskReportShrinkRequest setAsToken(String asToken) {
        this.asToken = asToken;
        return this;
    }
    public String getAsToken() {
        return this.asToken;
    }

    public AccountRiskReportShrinkRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public AccountRiskReportShrinkRequest setDeviceEnvironmentShrink(String deviceEnvironmentShrink) {
        this.deviceEnvironmentShrink = deviceEnvironmentShrink;
        return this;
    }
    public String getDeviceEnvironmentShrink() {
        return this.deviceEnvironmentShrink;
    }

    public AccountRiskReportShrinkRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public AccountRiskReportShrinkRequest setExtraDataShrink(String extraDataShrink) {
        this.extraDataShrink = extraDataShrink;
        return this;
    }
    public String getExtraDataShrink() {
        return this.extraDataShrink;
    }

    public AccountRiskReportShrinkRequest setOperateFailureReason(String operateFailureReason) {
        this.operateFailureReason = operateFailureReason;
        return this;
    }
    public String getOperateFailureReason() {
        return this.operateFailureReason;
    }

    public AccountRiskReportShrinkRequest setOperateResult(Boolean operateResult) {
        this.operateResult = operateResult;
        return this;
    }
    public Boolean getOperateResult() {
        return this.operateResult;
    }

    public AccountRiskReportShrinkRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public AccountRiskReportShrinkRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public AccountRiskReportShrinkRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public AccountRiskReportShrinkRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public AccountRiskReportShrinkRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public AccountRiskReportShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
