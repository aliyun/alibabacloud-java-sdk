// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetForgetPasswordConfigurationResponseBody extends TeaModel {
    /**
     * <p>The forgot password configurations.</p>
     */
    @NameInMap("OpenForgetPasswordConfiguration")
    public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration openForgetPasswordConfiguration;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetForgetPasswordConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetForgetPasswordConfigurationResponseBody self = new GetForgetPasswordConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetForgetPasswordConfigurationResponseBody setOpenForgetPasswordConfiguration(GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration openForgetPasswordConfiguration) {
        this.openForgetPasswordConfiguration = openForgetPasswordConfiguration;
        return this;
    }
    public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration getOpenForgetPasswordConfiguration() {
        return this.openForgetPasswordConfiguration;
    }

    public GetForgetPasswordConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration extends TeaModel {
        /**
         * <p>表示忘记密码认证渠道。枚举取值:email(邮件)、sms(短信)</p>
         */
        @NameInMap("AuthenticationChannels")
        public java.util.List<String> authenticationChannels;

        /**
         * <p>Indicates whether the forgot password feature is enabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Indicates whether email authentication is enabled for the forgot password feature.</p>
         */
        @NameInMap("EnableEmail")
        public Boolean enableEmail;

        /**
         * <p>Indicates whether Short Message Service (SMS) authentication is enabled for the forgot password feature.</p>
         */
        @NameInMap("EnableSms")
        public Boolean enableSms;

        /**
         * <p>表示忘记密码配置状态。枚举取值:enabled(开启)、disabled(禁用)</p>
         */
        @NameInMap("ForgetPasswordStatus")
        public String forgetPasswordStatus;

        public static GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration self = new GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration();
            return TeaModel.build(map, self);
        }

        public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration setAuthenticationChannels(java.util.List<String> authenticationChannels) {
            this.authenticationChannels = authenticationChannels;
            return this;
        }
        public java.util.List<String> getAuthenticationChannels() {
            return this.authenticationChannels;
        }

        public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration setEnableEmail(Boolean enableEmail) {
            this.enableEmail = enableEmail;
            return this;
        }
        public Boolean getEnableEmail() {
            return this.enableEmail;
        }

        public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration setEnableSms(Boolean enableSms) {
            this.enableSms = enableSms;
            return this;
        }
        public Boolean getEnableSms() {
            return this.enableSms;
        }

        public GetForgetPasswordConfigurationResponseBodyOpenForgetPasswordConfiguration setForgetPasswordStatus(String forgetPasswordStatus) {
            this.forgetPasswordStatus = forgetPasswordStatus;
            return this;
        }
        public String getForgetPasswordStatus() {
            return this.forgetPasswordStatus;
        }

    }

}
