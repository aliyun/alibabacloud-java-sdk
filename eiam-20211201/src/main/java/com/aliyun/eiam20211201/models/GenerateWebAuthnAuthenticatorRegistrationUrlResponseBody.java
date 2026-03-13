// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebAuthnAuthenticatorRegistrationUrl")
    public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl webAuthnAuthenticatorRegistrationUrl;

    public static GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody self = new GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBody setWebAuthnAuthenticatorRegistrationUrl(GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl webAuthnAuthenticatorRegistrationUrl) {
        this.webAuthnAuthenticatorRegistrationUrl = webAuthnAuthenticatorRegistrationUrl;
        return this;
    }
    public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl getWebAuthnAuthenticatorRegistrationUrl() {
        return this.webAuthnAuthenticatorRegistrationUrl;
    }

    public static class GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl extends TeaModel {
        /**
         * <p>注册WebAuthn认证器URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://012cnaliyunidaas..com./login/webauthn/registration">https://012cnaliyunidaas..com./login/webauthn/registration</a></p>
         */
        @NameInMap("RegistrationUrl")
        public String registrationUrl;

        /**
         * <p>注册WebAuthn认证器URL参数</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIiwia2lkIjoia2V5X29ueWNzbXNib3Y1bmV2anlncHgyZnlsbjdhIn0</p>
         */
        @NameInMap("RegistrationUrlParameters")
        public String registrationUrlParameters;

        public static GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl build(java.util.Map<String, ?> map) throws Exception {
            GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl self = new GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl();
            return TeaModel.build(map, self);
        }

        public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl setRegistrationUrl(String registrationUrl) {
            this.registrationUrl = registrationUrl;
            return this;
        }
        public String getRegistrationUrl() {
            return this.registrationUrl;
        }

        public GenerateWebAuthnAuthenticatorRegistrationUrlResponseBodyWebAuthnAuthenticatorRegistrationUrl setRegistrationUrlParameters(String registrationUrlParameters) {
            this.registrationUrlParameters = registrationUrlParameters;
            return this;
        }
        public String getRegistrationUrlParameters() {
            return this.registrationUrlParameters;
        }

    }

}
