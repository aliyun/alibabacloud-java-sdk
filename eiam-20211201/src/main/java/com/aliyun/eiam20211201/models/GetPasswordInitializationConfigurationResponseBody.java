// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordInitializationConfigurationResponseBody extends TeaModel {
    /**
     * <p>The password initialization configurations.</p>
     */
    @NameInMap("PasswordInitializationConfiguration")
    public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration passwordInitializationConfiguration;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordInitializationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordInitializationConfigurationResponseBody self = new GetPasswordInitializationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordInitializationConfigurationResponseBody setPasswordInitializationConfiguration(GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration passwordInitializationConfiguration) {
        this.passwordInitializationConfiguration = passwordInitializationConfiguration;
        return this;
    }
    public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration getPasswordInitializationConfiguration() {
        return this.passwordInitializationConfiguration;
    }

    public GetPasswordInitializationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration extends TeaModel {
        /**
         * <p>Indicates whether forcible password change upon first logon is enabled. Valid values:</p>
         * <br>
         * <p>*   enabled</p>
         * <p>*   disabled</p>
         */
        @NameInMap("PasswordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        /**
         * <p>The methods for receiving password initialization notifications.</p>
         */
        @NameInMap("PasswordInitializationNotificationChannels")
        public java.util.List<String> passwordInitializationNotificationChannels;

        /**
         * <p>Indicates whether the password initialization feature is enabled. Valid values:</p>
         * <br>
         * <p>*   enabled</p>
         * <p>*   disabled</p>
         */
        @NameInMap("PasswordInitializationStatus")
        public String passwordInitializationStatus;

        /**
         * <p>The password initialization method. Set the value to random.</p>
         * <br>
         * <p>*   random: A randomly generated password is used.</p>
         */
        @NameInMap("PasswordInitializationType")
        public String passwordInitializationType;

        public static GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration self = new GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
            this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
            return this;
        }
        public String getPasswordForcedUpdateStatus() {
            return this.passwordForcedUpdateStatus;
        }

        public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration setPasswordInitializationNotificationChannels(java.util.List<String> passwordInitializationNotificationChannels) {
            this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
            return this;
        }
        public java.util.List<String> getPasswordInitializationNotificationChannels() {
            return this.passwordInitializationNotificationChannels;
        }

        public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration setPasswordInitializationStatus(String passwordInitializationStatus) {
            this.passwordInitializationStatus = passwordInitializationStatus;
            return this;
        }
        public String getPasswordInitializationStatus() {
            return this.passwordInitializationStatus;
        }

        public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration setPasswordInitializationType(String passwordInitializationType) {
            this.passwordInitializationType = passwordInitializationType;
            return this;
        }
        public String getPasswordInitializationType() {
            return this.passwordInitializationType;
        }

    }

}
