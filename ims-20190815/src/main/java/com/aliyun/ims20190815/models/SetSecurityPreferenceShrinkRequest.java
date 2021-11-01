// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceShrinkRequest extends TeaModel {
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    @NameInMap("EnforceMFAForLogin")
    public Boolean enforceMFAForLogin;

    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    @NameInMap("VerificationTypes")
    public String verificationTypesShrink;

    public static SetSecurityPreferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceShrinkRequest self = new SetSecurityPreferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
        return this;
    }
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
        this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
        return this;
    }
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
        this.allowUserToManageMFADevices = allowUserToManageMFADevices;
        return this;
    }
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    public SetSecurityPreferenceShrinkRequest setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
        this.enableSaveMFATicket = enableSaveMFATicket;
        return this;
    }
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    public SetSecurityPreferenceShrinkRequest setEnforceMFAForLogin(Boolean enforceMFAForLogin) {
        this.enforceMFAForLogin = enforceMFAForLogin;
        return this;
    }
    public Boolean getEnforceMFAForLogin() {
        return this.enforceMFAForLogin;
    }

    public SetSecurityPreferenceShrinkRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public SetSecurityPreferenceShrinkRequest setLoginSessionDuration(Integer loginSessionDuration) {
        this.loginSessionDuration = loginSessionDuration;
        return this;
    }
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

    public SetSecurityPreferenceShrinkRequest setVerificationTypesShrink(String verificationTypesShrink) {
        this.verificationTypesShrink = verificationTypesShrink;
        return this;
    }
    public String getVerificationTypesShrink() {
        return this.verificationTypesShrink;
    }

}
