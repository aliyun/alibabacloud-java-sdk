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
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        /**
         * <p>The methods for receiving password initialization notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("PasswordInitializationNotificationChannels")
        public java.util.List<String> passwordInitializationNotificationChannels;

        /**
         * <p>Indicates whether the password initialization feature is enabled. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordInitializationStatus")
        public String passwordInitializationStatus;

        /**
         * <p>The password initialization method. Set the value to random.</p>
         * <ul>
         * <li>random: A randomly generated password is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>random</p>
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
