// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceRequest extends TeaModel {
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    @NameInMap("AllowUserToManagePersonalDingTalk")
    public Boolean allowUserToManagePersonalDingTalk;

    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    @NameInMap("EnforceMFAForLogin")
    public Boolean enforceMFAForLogin;

    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    public static SetSecurityPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceRequest self = new SetSecurityPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceRequest setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
        return this;
    }
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    public SetSecurityPreferenceRequest setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
        this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
        return this;
    }
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    public SetSecurityPreferenceRequest setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
        this.allowUserToManageMFADevices = allowUserToManageMFADevices;
        return this;
    }
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    public SetSecurityPreferenceRequest setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
        this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
        return this;
    }
    public Boolean getAllowUserToManagePersonalDingTalk() {
        return this.allowUserToManagePersonalDingTalk;
    }

    public SetSecurityPreferenceRequest setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
        this.enableSaveMFATicket = enableSaveMFATicket;
        return this;
    }
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    public SetSecurityPreferenceRequest setEnforceMFAForLogin(Boolean enforceMFAForLogin) {
        this.enforceMFAForLogin = enforceMFAForLogin;
        return this;
    }
    public Boolean getEnforceMFAForLogin() {
        return this.enforceMFAForLogin;
    }

    public SetSecurityPreferenceRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public SetSecurityPreferenceRequest setLoginSessionDuration(Integer loginSessionDuration) {
        this.loginSessionDuration = loginSessionDuration;
        return this;
    }
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

}
