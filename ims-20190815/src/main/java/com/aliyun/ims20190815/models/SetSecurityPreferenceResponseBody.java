// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPreference")
    public SetSecurityPreferenceResponseBodySecurityPreference securityPreference;

    public static SetSecurityPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceResponseBody self = new SetSecurityPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSecurityPreferenceResponseBody setSecurityPreference(SetSecurityPreferenceResponseBodySecurityPreference securityPreference) {
        this.securityPreference = securityPreference;
        return this;
    }
    public SetSecurityPreferenceResponseBodySecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
        public Boolean allowUserToManageAccessKeys;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference extends TeaModel {
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        @NameInMap("EnforceMFAForLogin")
        public Boolean enforceMFAForLogin;

        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnforceMFAForLogin(Boolean enforceMFAForLogin) {
            this.enforceMFAForLogin = enforceMFAForLogin;
            return this;
        }
        public Boolean getEnforceMFAForLogin() {
            return this.enforceMFAForLogin;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginSessionDuration(Integer loginSessionDuration) {
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }
        public Integer getLoginSessionDuration() {
            return this.loginSessionDuration;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference extends TeaModel {
        @NameInMap("AllowUserToManageMFADevices")
        public Boolean allowUserToManageMFADevices;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference extends TeaModel {
        @NameInMap("AllowUserToManagePersonalDingTalk")
        public Boolean allowUserToManagePersonalDingTalk;

        public static SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference self = new SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
            this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
            return this;
        }
        public Boolean getAllowUserToManagePersonalDingTalk() {
            return this.allowUserToManagePersonalDingTalk;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreference extends TeaModel {
        @NameInMap("AccessKeyPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        @NameInMap("LoginProfilePreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        @NameInMap("MFAPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        @NameInMap("PersonalInfoPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference;

        public static SetSecurityPreferenceResponseBodySecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreference self = new SetSecurityPreferenceResponseBodySecurityPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setAccessKeyPreference(SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference) {
            this.accessKeyPreference = accessKeyPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setLoginProfilePreference(SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference) {
            this.loginProfilePreference = loginProfilePreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setMFAPreference(SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference) {
            this.MFAPreference = MFAPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setPersonalInfoPreference(SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference) {
            this.personalInfoPreference = personalInfoPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference getPersonalInfoPreference() {
            return this.personalInfoPreference;
        }

    }

}
