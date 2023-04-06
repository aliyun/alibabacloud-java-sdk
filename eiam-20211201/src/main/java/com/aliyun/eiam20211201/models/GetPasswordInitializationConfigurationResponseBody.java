// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordInitializationConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordInitializationConfiguration")
    public GetPasswordInitializationConfigurationResponseBodyPasswordInitializationConfiguration passwordInitializationConfiguration;

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
        @NameInMap("PasswordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        @NameInMap("PasswordInitializationNotificationChannels")
        public java.util.List<String> passwordInitializationNotificationChannels;

        @NameInMap("PasswordInitializationStatus")
        public String passwordInitializationStatus;

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
