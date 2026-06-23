// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordExpirationConfigurationResponseBody extends TeaModel {
    /**
     * <p>The password expiration configuration.</p>
     */
    @NameInMap("PasswordExpirationConfiguration")
    public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration passwordExpirationConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordExpirationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordExpirationConfigurationResponseBody self = new GetPasswordExpirationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordExpirationConfigurationResponseBody setPasswordExpirationConfiguration(GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration passwordExpirationConfiguration) {
        this.passwordExpirationConfiguration = passwordExpirationConfiguration;
        return this;
    }
    public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration getPasswordExpirationConfiguration() {
        return this.passwordExpirationConfiguration;
    }

    public GetPasswordExpirationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration extends TeaModel {
        /**
         * <p>The list of effective authentication source IDs. Default value: [&quot;ia_all&quot;].</p>
         * <ul>
         * <li>ia_all: All authentication sources. If this value is specified, no other values can be specified.</li>
         * <li>ia_password: Account password logon.</li>
         * <li>ia_otp_sms: SMS verification code logon.</li>
         * <li>ia_webauthn: WebAuthn authenticator logon.</li>
         * <li>idp_xxx: Authentication method of a specific identity provider.</li>
         * </ul>
         */
        @NameInMap("EffectiveAuthenticationSourceIds")
        public java.util.List<String> effectiveAuthenticationSourceIds;

        /**
         * <p>The action to take when a password expires. Valid values:</p>
         * <ul>
         * <li>forbid_login: Forbid logon.</li>
         * <li>force_update_password: Force password change.</li>
         * <li>remind_update_password: Remind password change.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>forbid_login</p>
         */
        @NameInMap("PasswordExpirationAction")
        public String passwordExpirationAction;

        /**
         * <p>The list of password expiration notification channels.</p>
         * 
         * <strong>example:</strong>
         * <p>login</p>
         */
        @NameInMap("PasswordExpirationNotificationChannels")
        public java.util.List<String> passwordExpirationNotificationChannels;

        /**
         * <p>The advance notice period before password expiration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("PasswordExpirationNotificationDuration")
        public Integer passwordExpirationNotificationDuration;

        /**
         * <p>The status of password expiration notification. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordExpirationNotificationStatus")
        public String passwordExpirationNotificationStatus;

        /**
         * <p>The status of the password expiration configuration. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordExpirationStatus")
        public String passwordExpirationStatus;

        /**
         * <p>The grace period for forced password change after expiration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PasswordForcedUpdateDuration")
        public Integer passwordForcedUpdateDuration;

        /**
         * <p>The maximum validity period of a password. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("PasswordValidMaxDay")
        public Integer passwordValidMaxDay;

        public static GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration self = new GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setEffectiveAuthenticationSourceIds(java.util.List<String> effectiveAuthenticationSourceIds) {
            this.effectiveAuthenticationSourceIds = effectiveAuthenticationSourceIds;
            return this;
        }
        public java.util.List<String> getEffectiveAuthenticationSourceIds() {
            return this.effectiveAuthenticationSourceIds;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordExpirationAction(String passwordExpirationAction) {
            this.passwordExpirationAction = passwordExpirationAction;
            return this;
        }
        public String getPasswordExpirationAction() {
            return this.passwordExpirationAction;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordExpirationNotificationChannels(java.util.List<String> passwordExpirationNotificationChannels) {
            this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
            return this;
        }
        public java.util.List<String> getPasswordExpirationNotificationChannels() {
            return this.passwordExpirationNotificationChannels;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
            this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
            return this;
        }
        public Integer getPasswordExpirationNotificationDuration() {
            return this.passwordExpirationNotificationDuration;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
            this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
            return this;
        }
        public String getPasswordExpirationNotificationStatus() {
            return this.passwordExpirationNotificationStatus;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordExpirationStatus(String passwordExpirationStatus) {
            this.passwordExpirationStatus = passwordExpirationStatus;
            return this;
        }
        public String getPasswordExpirationStatus() {
            return this.passwordExpirationStatus;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
            this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
            return this;
        }
        public Integer getPasswordForcedUpdateDuration() {
            return this.passwordForcedUpdateDuration;
        }

        public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration setPasswordValidMaxDay(Integer passwordValidMaxDay) {
            this.passwordValidMaxDay = passwordValidMaxDay;
            return this;
        }
        public Integer getPasswordValidMaxDay() {
            return this.passwordValidMaxDay;
        }

    }

}
