// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class AccountRiskReportRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("AsToken")
    public String asToken;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("DeviceEnvironment")
    public java.util.Map<String, ?> deviceEnvironment;

    @NameInMap("EntranceCode")
    public String entranceCode;

    @NameInMap("ExtraData")
    public java.util.Map<String, ?> extraData;

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
    public java.util.Map<String, ?> userInfo;

    public static AccountRiskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountRiskReportRequest self = new AccountRiskReportRequest();
        return TeaModel.build(map, self);
    }

    public AccountRiskReportRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public AccountRiskReportRequest setAsToken(String asToken) {
        this.asToken = asToken;
        return this;
    }
    public String getAsToken() {
        return this.asToken;
    }

    public AccountRiskReportRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public AccountRiskReportRequest setDeviceEnvironment(java.util.Map<String, ?> deviceEnvironment) {
        this.deviceEnvironment = deviceEnvironment;
        return this;
    }
    public java.util.Map<String, ?> getDeviceEnvironment() {
        return this.deviceEnvironment;
    }

    public AccountRiskReportRequest setEntranceCode(String entranceCode) {
        this.entranceCode = entranceCode;
        return this;
    }
    public String getEntranceCode() {
        return this.entranceCode;
    }

    public AccountRiskReportRequest setExtraData(java.util.Map<String, ?> extraData) {
        this.extraData = extraData;
        return this;
    }
    public java.util.Map<String, ?> getExtraData() {
        return this.extraData;
    }

    public AccountRiskReportRequest setOperateFailureReason(String operateFailureReason) {
        this.operateFailureReason = operateFailureReason;
        return this;
    }
    public String getOperateFailureReason() {
        return this.operateFailureReason;
    }

    public AccountRiskReportRequest setOperateResult(Boolean operateResult) {
        this.operateResult = operateResult;
        return this;
    }
    public Boolean getOperateResult() {
        return this.operateResult;
    }

    public AccountRiskReportRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public AccountRiskReportRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public AccountRiskReportRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public AccountRiskReportRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public AccountRiskReportRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public AccountRiskReportRequest setUserInfo(java.util.Map<String, ?> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public java.util.Map<String, ?> getUserInfo() {
        return this.userInfo;
    }

}
