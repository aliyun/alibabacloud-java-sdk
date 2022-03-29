// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class SendAccountModifyResultShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("ActionSource")
    public String actionSource;

    @NameInMap("AsToken")
    public String asToken;

    @NameInMap("DeviceEnvironment")
    public String deviceEnvironmentShrink;

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
    public String userInfoShrink;

    public static SendAccountModifyResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAccountModifyResultShrinkRequest self = new SendAccountModifyResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendAccountModifyResultShrinkRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public SendAccountModifyResultShrinkRequest setActionSource(String actionSource) {
        this.actionSource = actionSource;
        return this;
    }
    public String getActionSource() {
        return this.actionSource;
    }

    public SendAccountModifyResultShrinkRequest setAsToken(String asToken) {
        this.asToken = asToken;
        return this;
    }
    public String getAsToken() {
        return this.asToken;
    }

    public SendAccountModifyResultShrinkRequest setDeviceEnvironmentShrink(String deviceEnvironmentShrink) {
        this.deviceEnvironmentShrink = deviceEnvironmentShrink;
        return this;
    }
    public String getDeviceEnvironmentShrink() {
        return this.deviceEnvironmentShrink;
    }

    public SendAccountModifyResultShrinkRequest setModifyFailureReason(String modifyFailureReason) {
        this.modifyFailureReason = modifyFailureReason;
        return this;
    }
    public String getModifyFailureReason() {
        return this.modifyFailureReason;
    }

    public SendAccountModifyResultShrinkRequest setModifyResult(Boolean modifyResult) {
        this.modifyResult = modifyResult;
        return this;
    }
    public Boolean getModifyResult() {
        return this.modifyResult;
    }

    public SendAccountModifyResultShrinkRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public SendAccountModifyResultShrinkRequest setNewContent(String newContent) {
        this.newContent = newContent;
        return this;
    }
    public String getNewContent() {
        return this.newContent;
    }

    public SendAccountModifyResultShrinkRequest setOldContent(String oldContent) {
        this.oldContent = oldContent;
        return this;
    }
    public String getOldContent() {
        return this.oldContent;
    }

    public SendAccountModifyResultShrinkRequest setOperateSubType(String operateSubType) {
        this.operateSubType = operateSubType;
        return this;
    }
    public String getOperateSubType() {
        return this.operateSubType;
    }

    public SendAccountModifyResultShrinkRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public SendAccountModifyResultShrinkRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SendAccountModifyResultShrinkRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SendAccountModifyResultShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SendAccountModifyResultShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
