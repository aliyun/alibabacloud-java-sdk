// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordHistoryConfigurationResponseBody extends TeaModel {
    /**
     * <p>The password history configurations.</p>
     */
    @NameInMap("PasswordHistoryConfiguration")
    public GetPasswordHistoryConfigurationResponseBodyPasswordHistoryConfiguration passwordHistoryConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
        /**
         * <p>The maximum number of recent passwords that are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PasswordHistoryMaxRetention")
        public Integer passwordHistoryMaxRetention;

        /**
         * <p>Indicates whether the password history feature is enabled. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
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
