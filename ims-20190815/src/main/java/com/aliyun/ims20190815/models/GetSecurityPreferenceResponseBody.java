// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30C9068D-FBAA-4998-9986-8A562FED0BC3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about security preferences.</p>
     */
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
        /**
         * <p>Indicates whether RAM users can manage their own AccessKey pairs. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>Indicates whether RAM users can manage their own passwords. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        /**
         * <p>Indicates whether RAM users can log on using passkeys. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowUserToLoginWithPasskey")
        public Boolean allowUserToLoginWithPasskey;

        /**
         * <p>Indicates whether to save the multi-factor authentication (MFA) status for seven days after a RAM user logs on using MFA. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        /**
         * <p>The the IP addresses or CIDR blocks from which RAM users are allowed to sign in to the Alibaba Cloud console.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        /**
         * <p>The duration of a logon session for a RAM user. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        /**
         * <p>Indicates whether MFA is required for logon. This parameter replaces <code>EnforceMFAForLogin</code>. The <code>EnforceMFAForLogin</code> parameter is still valid, but using this new parameter is recommended. Valid values:</p>
         * <ul>
         * <li><p>mandatory: MFA is required for all RAM users. This value corresponds to <code>true</code> for the <code>EnforceMFAForLogin</code> parameter.</p>
         * </li>
         * <li><p>independent (default): The MFA configuration of each RAM user is used. This value corresponds to <code>false</code> for the <code>EnforceMFAForLogin</code> parameter.</p>
         * </li>
         * <li><p>adaptive: MFA is required only for abnormal logons.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        @NameInMap("MFAOperationForLogin")
        public String MFAOperationForLogin;

        /**
         * <p>Indicates whether to use MFA for secondary authentication during an abnormal logon. Valid values:</p>
         * <ul>
         * <li><p>autonomous (default): The secondary authentication can be skipped. The attachment of an MFA device is not required.</p>
         * </li>
         * <li><p>enforceVerify: The secondary authentication is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>autonomous</p>
         */
        @NameInMap("OperationForRiskLogin")
        @Deprecated
        public String operationForRiskLogin;

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

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setAllowUserToLoginWithPasskey(Boolean allowUserToLoginWithPasskey) {
            this.allowUserToLoginWithPasskey = allowUserToLoginWithPasskey;
            return this;
        }
        public Boolean getAllowUserToLoginWithPasskey() {
            return this.allowUserToLoginWithPasskey;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
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

        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setMFAOperationForLogin(String MFAOperationForLogin) {
            this.MFAOperationForLogin = MFAOperationForLogin;
            return this;
        }
        public String getMFAOperationForLogin() {
            return this.MFAOperationForLogin;
        }

        @Deprecated
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference setOperationForRiskLogin(String operationForRiskLogin) {
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }
        public String getOperationForRiskLogin() {
            return this.operationForRiskLogin;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their own MFA devices. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays extends TeaModel {
        /**
         * <p>The maximum idle period for the AccessKey pair of a RAM user. If an AccessKey pair remains unused for this period, it is automatically disabled the next day.</p>
         * <p>Default value: 730.</p>
         * <p>Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        @NameInMap("MaxIdleDaysForAccessKeys")
        public Integer maxIdleDaysForAccessKeys;

        /**
         * <p>The maximum idle period for RAM users. If a RAM user with console logon enabled remains inactive for this period, their console logon is automatically disabled the next day. This does not apply to single sign-on (SSO) logons.</p>
         * <p>Default value: 730.</p>
         * <p>Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>730</p>
         */
        @NameInMap("MaxIdleDaysForUsers")
        public Integer maxIdleDaysForUsers;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays self = new GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays setMaxIdleDaysForAccessKeys(Integer maxIdleDaysForAccessKeys) {
            this.maxIdleDaysForAccessKeys = maxIdleDaysForAccessKeys;
            return this;
        }
        public Integer getMaxIdleDaysForAccessKeys() {
            return this.maxIdleDaysForAccessKeys;
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays setMaxIdleDaysForUsers(Integer maxIdleDaysForUsers) {
            this.maxIdleDaysForUsers = maxIdleDaysForUsers;
            return this;
        }
        public Integer getMaxIdleDaysForUsers() {
            return this.maxIdleDaysForUsers;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can attach or detach their personal DingTalk accounts. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

    public static class GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference extends TeaModel {
        /**
         * <p>The MFA methods.</p>
         */
        @NameInMap("VerificationTypes")
        public java.util.List<String> verificationTypes;

        public static GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference self = new GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference setVerificationTypes(java.util.List<String> verificationTypes) {
            this.verificationTypes = verificationTypes;
            return this;
        }
        public java.util.List<String> getVerificationTypes() {
            return this.verificationTypes;
        }

    }

    public static class GetSecurityPreferenceResponseBodySecurityPreference extends TeaModel {
        /**
         * <p>The AccessKey preference.</p>
         */
        @NameInMap("AccessKeyPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        /**
         * <p>The logon preferences.</p>
         */
        @NameInMap("LoginProfilePreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        /**
         * <p>The MFA preferences.</p>
         */
        @NameInMap("MFAPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        /**
         * <p>The configuration of the maximum idle period.</p>
         */
        @NameInMap("MaxIdleDays")
        public GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays maxIdleDays;

        /**
         * <p>The personal information preferences.</p>
         */
        @NameInMap("PersonalInfoPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference;

        /**
         * <p>The preferences for MFA methods.</p>
         */
        @NameInMap("VerificationPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference verificationPreference;

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

        public GetSecurityPreferenceResponseBodySecurityPreference setMaxIdleDays(GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays maxIdleDays) {
            this.maxIdleDays = maxIdleDays;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceMaxIdleDays getMaxIdleDays() {
            return this.maxIdleDays;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setPersonalInfoPreference(GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference) {
            this.personalInfoPreference = personalInfoPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference getPersonalInfoPreference() {
            return this.personalInfoPreference;
        }

        public GetSecurityPreferenceResponseBodySecurityPreference setVerificationPreference(GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference verificationPreference) {
            this.verificationPreference = verificationPreference;
            return this;
        }
        public GetSecurityPreferenceResponseBodySecurityPreferenceVerificationPreference getVerificationPreference() {
            return this.verificationPreference;
        }

    }

}
