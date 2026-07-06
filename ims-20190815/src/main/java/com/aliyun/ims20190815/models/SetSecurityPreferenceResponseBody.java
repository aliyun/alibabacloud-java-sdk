// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17494710-B4BA-4185-BBBB-C1A6ABDE1639</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security preferences.</p>
     */
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
        /**
         * <p>Specifies whether RAM users can manage their own AccessKeys.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserToManageAccessKeys")
        public Boolean allowUserToManageAccessKeys;

        /**
         * <p>Specifies whether RAM users can manage their own API keys. Valid values:</p>
         * <ul>
         * <li><p>true: RAM users can manage their own API keys.</p>
         * </li>
         * <li><p>false: RAM users cannot manage their own API keys.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserToManageServiceCredentials")
        public Boolean allowUserToManageServiceCredentials;

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

        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference setAllowUserToManageServiceCredentials(Boolean allowUserToManageServiceCredentials) {
            this.allowUserToManageServiceCredentials = allowUserToManageServiceCredentials;
            return this;
        }
        public Boolean getAllowUserToManageServiceCredentials() {
            return this.allowUserToManageServiceCredentials;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference extends TeaModel {
        /**
         * <p>Specifies whether RAM users can manage their own passwords.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        /**
         * <p>Specifies whether RAM users can sign in with a passkey.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowUserToLoginWithPasskey")
        public Boolean allowUserToLoginWithPasskey;

        /**
         * <p>Specifies whether to save the verification status for seven days after a RAM user completes multi-factor authentication (MFA) during sign-in.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        /**
         * <p>The login network mask.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        /**
         * <p>The duration of the login session for a RAM user, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        /**
         * <p>The MFA policy for user sign-in. This parameter is the recommended replacement for <code>EnforceMFAForLogin</code>, which is still supported.</p>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        @NameInMap("MFAOperationForLogin")
        public String MFAOperationForLogin;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>autonomous</p>
         */
        @NameInMap("OperationForRiskLogin")
        @Deprecated
        public String operationForRiskLogin;

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

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setAllowUserToLoginWithPasskey(Boolean allowUserToLoginWithPasskey) {
            this.allowUserToLoginWithPasskey = allowUserToLoginWithPasskey;
            return this;
        }
        public Boolean getAllowUserToLoginWithPasskey() {
            return this.allowUserToLoginWithPasskey;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
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

        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setMFAOperationForLogin(String MFAOperationForLogin) {
            this.MFAOperationForLogin = MFAOperationForLogin;
            return this;
        }
        public String getMFAOperationForLogin() {
            return this.MFAOperationForLogin;
        }

        @Deprecated
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setOperationForRiskLogin(String operationForRiskLogin) {
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }
        public String getOperationForRiskLogin() {
            return this.operationForRiskLogin;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference extends TeaModel {
        /**
         * <p>Specifies whether RAM users can manage their own MFA devices.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays extends TeaModel {
        /**
         * <p>The maximum idle period, in days, for an AccessKey of a RAM user. If an AccessKey is not used within the specified period, the system automatically disables it the next day.</p>
         * <p>Default value: 730.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        @NameInMap("MaxIdleDaysForAccessKeys")
        public Integer maxIdleDaysForAccessKeys;

        /**
         * <p>The maximum idle period, in days, for a RAM user. If a RAM user with console sign-in enabled does not sign in within this period, the system automatically disables their console sign-in the next day. This setting does not apply to single sign-on (SSO).</p>
         * <p>Default value: 730.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        @NameInMap("MaxIdleDaysForUsers")
        public Integer maxIdleDaysForUsers;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays self = new SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays setMaxIdleDaysForAccessKeys(Integer maxIdleDaysForAccessKeys) {
            this.maxIdleDaysForAccessKeys = maxIdleDaysForAccessKeys;
            return this;
        }
        public Integer getMaxIdleDaysForAccessKeys() {
            return this.maxIdleDaysForAccessKeys;
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays setMaxIdleDaysForUsers(Integer maxIdleDaysForUsers) {
            this.maxIdleDaysForUsers = maxIdleDaysForUsers;
            return this;
        }
        public Integer getMaxIdleDaysForUsers() {
            return this.maxIdleDaysForUsers;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference extends TeaModel {
        /**
         * <p>Specifies whether RAM users can attach or detach their personal DingTalk accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

    public static class SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference extends TeaModel {
        /**
         * <p>The allowed MFA methods.</p>
         */
        @NameInMap("VerificationTypes")
        public java.util.List<String> verificationTypes;

        public static SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference self = new SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference setVerificationTypes(java.util.List<String> verificationTypes) {
            this.verificationTypes = verificationTypes;
            return this;
        }
        public java.util.List<String> getVerificationTypes() {
            return this.verificationTypes;
        }

    }

    public static class SetSecurityPreferenceResponseBodySecurityPreference extends TeaModel {
        /**
         * <p>The AccessKey preferences.</p>
         */
        @NameInMap("AccessKeyPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        /**
         * <p>The login preferences.</p>
         */
        @NameInMap("LoginProfilePreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        /**
         * <p>The MFA (multi-factor authentication) preferences.</p>
         */
        @NameInMap("MFAPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        /**
         * <p>Settings for the maximum idle period in days.</p>
         */
        @NameInMap("MaxIdleDays")
        public SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays maxIdleDays;

        /**
         * <p>The personal information preferences.</p>
         */
        @NameInMap("PersonalInfoPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference;

        /**
         * <p>The preferences for MFA methods.</p>
         */
        @NameInMap("VerificationPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference verificationPreference;

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

        public SetSecurityPreferenceResponseBodySecurityPreference setMaxIdleDays(SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays maxIdleDays) {
            this.maxIdleDays = maxIdleDays;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays getMaxIdleDays() {
            return this.maxIdleDays;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setPersonalInfoPreference(SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference) {
            this.personalInfoPreference = personalInfoPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference getPersonalInfoPreference() {
            return this.personalInfoPreference;
        }

        public SetSecurityPreferenceResponseBodySecurityPreference setVerificationPreference(SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference verificationPreference) {
            this.verificationPreference = verificationPreference;
            return this;
        }
        public SetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference getVerificationPreference() {
            return this.verificationPreference;
        }

    }

}
