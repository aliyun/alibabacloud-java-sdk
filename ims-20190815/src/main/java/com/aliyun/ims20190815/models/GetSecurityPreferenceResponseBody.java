// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of security preferences.</p>
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
         * <p>Specifies whether RAM users can manage their AccessKey pairs. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
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
         * <p>Specifies whether RAM users can change their passwords. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
         */
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        /**
         * <p>Specifies whether to remember the multi-factor authentication (MFA) devices for seven days. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
         */
        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        /**
         * <p>The subnet mask.</p>
         */
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        /**
         * <p>The validity period of the logon session of RAM users. Unit: hours.</p>
         */
        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        /**
         * <p>Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console. This parameter is used to replace the EnforceMFAForLogin parameter. The EnforceMFAForLogin parameter is still valid. However, we recommend that you use the MFAOperationForLogin parameter. Valid values:</p>
         * <br>
         * <p>*   mandatory: MFA is required for all RAM users. If you use the EnforceMFAForLogin parameter, set the value to true.</p>
         * <p>*   independent: User-specific settings are applied. This is the default value. If you use the EnforceMFAForLogin parameter, set the value to false.</p>
         * <p>*   adaptive: MFA is required only for RAM users who initiated unusual logons.</p>
         */
        @NameInMap("MFAOperationForLogin")
        public String MFAOperationForLogin;

        /**
         * <p>Specifies whether to enable MFA for RAM users who initiated unusual logons. Valid values:</p>
         * <br>
         * <p>*   autonomous: yes. MFA is prompted for RAM users who initiated unusual logons. However, the RAM users are allowed to skip MFA. This is the default value.</p>
         * <p>*   enforceVerify: no.</p>
         */
        @NameInMap("OperationForRiskLogin")
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
         * <p>Indicates whether RAM users can manage their MFA devices. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
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

    public static class GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference extends TeaModel {
        /**
         * <p>Specifies whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
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
         * <p>The MFA method.</p>
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
         * <p>The AccessKey pair preference.</p>
         */
        @NameInMap("AccessKeyPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        /**
         * <p>The logon preference.</p>
         */
        @NameInMap("LoginProfilePreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        /**
         * <p>The MFA preference.</p>
         */
        @NameInMap("MFAPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        /**
         * <p>The personal information preference.</p>
         */
        @NameInMap("PersonalInfoPreference")
        public GetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference;

        /**
         * <p>The MFA method preference.</p>
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
