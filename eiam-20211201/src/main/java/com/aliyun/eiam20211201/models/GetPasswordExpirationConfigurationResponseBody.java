// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordExpirationConfigurationResponseBody extends TeaModel {
    /**
     * <p>The password expiration configurations.</p>
     */
    @NameInMap("PasswordExpirationConfiguration")
    public GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration passwordExpirationConfiguration;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The action to take when a password expires. Valid values:</p>
         * <br>
         * <p>*   forbid_login: Prohibit the user from using the password to log on to IDaaS.</p>
         * <p>*   force_update_password: Force the user to change the password.</p>
         * <p>*   remind_update_password: Remind the user to change the password.</p>
         */
        @NameInMap("PasswordExpirationAction")
        public String passwordExpirationAction;

        /**
         * <p>The methods for receiving password expiration notifications.</p>
         */
        @NameInMap("PasswordExpirationNotificationChannels")
        public java.util.List<String> passwordExpirationNotificationChannels;

        /**
         * <p>The number of days before the expiration date during which password expiration notifications are sent. Unit: day.</p>
         */
        @NameInMap("PasswordExpirationNotificationDuration")
        public Integer passwordExpirationNotificationDuration;

        /**
         * <p>Indicates whether the password expiration notification feature is enabled. Valid values:</p>
         * <br>
         * <p>*   enabled</p>
         * <p>*   disabled</p>
         */
        @NameInMap("PasswordExpirationNotificationStatus")
        public String passwordExpirationNotificationStatus;

        /**
         * <p>Indicates whether the password expiration feature is enabled. Valid values:</p>
         * <br>
         * <p>*   enabled</p>
         * <p>*   disabled</p>
         */
        @NameInMap("PasswordExpirationStatus")
        public String passwordExpirationStatus;

        /**
         * <p>The number of days before which users must change the password to prevent password expiration. Unit: day.</p>
         */
        @NameInMap("PasswordForcedUpdateDuration")
        public Integer passwordForcedUpdateDuration;

        /**
         * <p>The validity period of a password. Unit: day.</p>
         */
        @NameInMap("PasswordValidMaxDay")
        public Integer passwordValidMaxDay;

        public static GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration self = new GetPasswordExpirationConfigurationResponseBodyPasswordExpirationConfiguration();
            return TeaModel.build(map, self);
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
