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
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
         * <p>The authentication channels. Valid values:<br>email<br>sms<br>totp<br>web_authn</p>
         */
        @NameInMap("AuthenticationChannels")
        public java.util.List<String> authenticationChannels;

        /**
         * <p>Indicates whether the forgot password feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Indicates whether email authentication is enabled for the forgot password feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableEmail")
        public Boolean enableEmail;

        /**
         * <p>Indicates whether Short Message Service (SMS) authentication is enabled for the forgot password feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSms")
        public Boolean enableSms;

        /**
         * <p>The status of the forgot password feature. Valid values: enabled and disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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
