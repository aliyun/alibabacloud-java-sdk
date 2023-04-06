// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordHistoryConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordHistoryConfiguration")
    public GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration passwordHistoryConfiguration;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordHistoryConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordHistoryConfigurationResponseBody self = new GetPasswordHistoryConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordHistoryConfigurationResponseBody setPasswordHistoryConfiguration(GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration passwordHistoryConfiguration) {
        this.passwordHistoryConfiguration = passwordHistoryConfiguration;
        return this;
    }
    public GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration getPasswordHistoryConfiguration() {
        return this.passwordHistoryConfiguration;
    }

    public GetPasswordHistoryConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration extends TeaModel {
        @NameInMap("PasswordHistoryMaxRetention")
        public Integer passwordHistoryMaxRetention;

        @NameInMap("PasswordHistoryStatus")
        public String passwordHistoryStatus;

        public static GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration self = new GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration setPasswordHistoryMaxRetention(Integer passwordHistoryMaxRetention) {
            this.passwordHistoryMaxRetention = passwordHistoryMaxRetention;
            return this;
        }
        public Integer getPasswordHistoryMaxRetention() {
            return this.passwordHistoryMaxRetention;
        }

        public GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration setPasswordHistoryStatus(String passwordHistoryStatus) {
            this.passwordHistoryStatus = passwordHistoryStatus;
            return this;
        }
        public String getPasswordHistoryStatus() {
            return this.passwordHistoryStatus;
        }

    }

}
