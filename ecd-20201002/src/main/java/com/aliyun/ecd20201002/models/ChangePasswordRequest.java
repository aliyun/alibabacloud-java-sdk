// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ChangePasswordRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("NewPassword")
    public String newPassword;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OldPassword")
    public String oldPassword;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static ChangePasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordRequest self = new ChangePasswordRequest();
        return TeaModel.build(map, self);
    }

    public ChangePasswordRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ChangePasswordRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ChangePasswordRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ChangePasswordRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public ChangePasswordRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ChangePasswordRequest setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }
    public String getOldPassword() {
        return this.oldPassword;
    }

    public ChangePasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangePasswordRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
