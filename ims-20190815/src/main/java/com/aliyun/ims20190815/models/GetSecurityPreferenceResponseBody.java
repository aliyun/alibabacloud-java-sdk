// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityPreference")
    public GetSecurityPreferenceResponseBodySecurityPreference securityPreference;

    public static GetSecurityPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceResponseBody self = new GetSecurityPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityPreferenceResponseBody setSecurityPreference(GetSecurityPreferenceResponseBodySecurityPreference securityPreference) {
        this.securityPreference = securityPreference;
        return this;
    }
    public GetSecurityPreferenceResponseBodySecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
        public Boolean allowUserToManageAccessKeys;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference extends TeaModel {
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

        public static GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnforceMFAForLogin(Boolean enforceMFAForLogin) {
            this.enforceMFAForLogin = enforceMFAForLogin;
            return this;
        }
        public Boolean getEnforceMFAForLogin() {
            return this.enforceMFAForLogin;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setLoginSessionDuration(Integer loginSessionDuration) {
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }
        public Integer getLoginSessionDuration() {
            return this.loginSessionDuration;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference extends TeaModel {
        @NameInMap("AllowUserToManageMFADevices")
        public Boolean allowUserToManageMFADevices;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference extends TeaModel {
        @NameInMap("AllowUserToManagePersonalDingTalk")
        public Boolean allowUserToManagePersonalDingTalk;

        public static GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference self = new GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
            this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
            return this;
        }
        public Boolean getAllowUserToManagePersonalDingTalk() {
            return this.allowUserToManagePersonalDingTalk;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreference extends TeaModel {
        @NameInMap("AccessKeyPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        @NameInMap("LoginProfilePreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        @NameInMap("MFAPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        @NameInMap("PersonalInfoPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference;

        public static GetSecurityPreferenceResponseBodySecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreference self = new GetSecurityPreferenceResponseBodySecurityPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setAccessKeyPreference(GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference) {
            this.accessKeyPreference = accessKeyPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setLoginProfilePreference(GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference) {
            this.loginProfilePreference = loginProfilePreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setMFAPreference(GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference) {
            this.MFAPreference = MFAPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setPersonalInfoPreference(GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference) {
            this.personalInfoPreference = personalInfoPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference getPersonalInfoPreference() {
            return this.personalInfoPreference;
        }

    }

}
