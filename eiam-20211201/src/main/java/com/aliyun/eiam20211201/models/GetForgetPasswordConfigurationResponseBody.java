// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetForgetPasswordConfigurationResponseBody extends TeaModel {
    /**
     * <p>The forgot password configuration.</p>
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
         * <p>The list of forgot password authentication channels. Required when ForgetPasswordStatus is set to enabled. Valid values:</p>
         * <ul>
         * <li>email: Email.</li>
         * <li>sms: SMS.</li>
         * <li>totp: OTP dynamic password.</li>
         * <li>web_authn: WebAuthn.</li>
         * </ul>
         */
        @NameInMap("AuthenticationChannels")
        public java.util.List<String> authenticationChannels;

        /**
         * <p><strong>[Deprecated]</strong> Indicates whether the forgot password feature is enabled. This parameter is deprecated. Use the ForgetPasswordStatus parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated: true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> Indicates whether email is enabled as a forgot password authentication method. This parameter is deprecated. Use the AuthenticationChannels parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated: true</p>
         */
        @NameInMap("EnableEmail")
        public Boolean enableEmail;

        /**
         * <p><strong>[Deprecated]</strong> Indicates whether SMS is enabled as a forgot password authentication method. This parameter is deprecated. Use the AuthenticationChannels parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated: true</p>
         */
        @NameInMap("EnableSms")
        public Boolean enableSms;

        /**
         * <p>The forgot password configuration status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
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
