// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class SendAccountModifyResultRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("ActionSource")
    public String actionSource;

    @NameInMap("AsToken")
    public String asToken;

    @NameInMap("DeviceEnvironment")
    public java.util.Map<String, ?> deviceEnvironment;

    @NameInMap("ModifyFailureReason")
    public String modifyFailureReason;

    @NameInMap("ModifyResult")
    public Boolean modifyResult;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("NewContent")
    public String newContent;

    @NameInMap("OldContent")
    public String oldContent;

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

    public static SendAccountModifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAccountModifyResultRequest self = new SendAccountModifyResultRequest();
        return TeaModel.build(map, self);
    }

    public SendAccountModifyResultRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public SendAccountModifyResultRequest setActionSource(String actionSource) {
        this.actionSource = actionSource;
        return this;
    }
    public String getActionSource() {
        return this.actionSource;
    }

    public SendAccountModifyResultRequest setAsToken(String asToken) {
        this.asToken = asToken;
        return this;
    }
    public String getAsToken() {
        return this.asToken;
    }

    public SendAccountModifyResultRequest setDeviceEnvironment(java.util.Map<String, ?> deviceEnvironment) {
        this.deviceEnvironment = deviceEnvironment;
        return this;
    }
    public java.util.Map<String, ?> getDeviceEnvironment() {
        return this.deviceEnvironment;
    }

    public SendAccountModifyResultRequest setModifyFailureReason(String modifyFailureReason) {
        this.modifyFailureReason = modifyFailureReason;
        return this;
    }
    public String getModifyFailureReason() {
        return this.modifyFailureReason;
    }

    public SendAccountModifyResultRequest setModifyResult(Boolean modifyResult) {
        this.modifyResult = modifyResult;
        return this;
    }
    public Boolean getModifyResult() {
        return this.modifyResult;
    }

    public SendAccountModifyResultRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public SendAccountModifyResultRequest setNewContent(String newContent) {
        this.newContent = newContent;
        return this;
    }
    public String getNewContent() {
        return this.newContent;
    }

    public SendAccountModifyResultRequest setOldContent(String oldContent) {
        this.oldContent = oldContent;
        return this;
    }
    public String getOldContent() {
        return this.oldContent;
    }

    public SendAccountModifyResultRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public SendAccountModifyResultRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public SendAccountModifyResultRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SendAccountModifyResultRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SendAccountModifyResultRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SendAccountModifyResultRequest setUserInfo(java.util.Map<String, ?> userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public java.util.Map<String, ?> getUserInfo() {
        return this.userInfo;
    }

}
