// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of security preferences.</p>
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
         * <p>Indicates whether RAM users can manage their AccessKey pairs.</p>
         */
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
        /**
         * <p>Indicates whether RAM users can change their passwords.</p>
         */
        @NameInMap("AllowUserToChangePassword")
        public Boolean allowUserToChangePassword;

        /**
         * <p>Indicates whether RAM users can remember the MFA devices for seven days.</p>
         */
        @NameInMap("EnableSaveMFATicket")
        public Boolean enableSaveMFATicket;

        /**
         * <p>The subnet mask.</p>
         */
        @NameInMap("LoginNetworkMasks")
        public String loginNetworkMasks;

        /**
         * <p>The validity period of the logon session of RAM users.</p>
         */
        @NameInMap("LoginSessionDuration")
        public Integer loginSessionDuration;

        /**
         * <p>Indicates whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console.</p>
         */
        @NameInMap("MFAOperationForLogin")
        public String MFAOperationForLogin;

        /**
         * <p>Indicates whether to enable MFA for RAM users who initiated unusual logons.</p>
         */
        @NameInMap("OperationForRiskLogin")
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
         * <p>Indicates whether RAM users can manage their MFA devices.</p>
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

    public static class SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference extends TeaModel {
        /**
         * <p>Indicates whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts.</p>
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
         * <p>The AccessKey pair preference.</p>
         */
        @NameInMap("AccessKeyPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceAccessKeyPreference accessKeyPreference;

        /**
         * <p>The logon preference.</p>
         */
        @NameInMap("LoginProfilePreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceLoginProfilePreference loginProfilePreference;

        /**
         * <p>The MFA preference.</p>
         */
        @NameInMap("MFAPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferenceMFAPreference MFAPreference;

        /**
         * <p>The personal information preference.</p>
         */
        @NameInMap("PersonalInfoPreference")
        public SetSecurityPreferenceResponseBodySecurityPreferencePersonalInfoPreference personalInfoPreference;

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
