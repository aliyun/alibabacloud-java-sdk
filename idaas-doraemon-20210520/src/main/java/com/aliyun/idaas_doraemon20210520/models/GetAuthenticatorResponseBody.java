// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class GetAuthenticatorResponseBody extends TeaModel {
    @NameInMap("Authenticator")
    public GetAuthenticatorResponseBodyAuthenticator authenticator;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthenticatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthenticatorResponseBody self = new GetAuthenticatorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthenticatorResponseBody setAuthenticator(GetAuthenticatorResponseBodyAuthenticator authenticator) {
        this.authenticator = authenticator;
        return this;
    }
    public GetAuthenticatorResponseBodyAuthenticator getAuthenticator() {
        return this.authenticator;
    }

    public GetAuthenticatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthenticatorResponseBodyAuthenticator extends TeaModel {
        @NameInMap("AuthenticatorName")
        public String authenticatorName;

        @NameInMap("AuthenticatorUuid")
        public String authenticatorUuid;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("CustomAuthenticator")
        public String customAuthenticator;

        @NameInMap("LastVerifySourceIp")
        public String lastVerifySourceIp;

        @NameInMap("LastVerifyTime")
        public Long lastVerifyTime;

        @NameInMap("LastVerifyUserAgent")
        public String lastVerifyUserAgent;

        @NameInMap("RegisterSourceIp")
        public String registerSourceIp;

        @NameInMap("RegisterTime")
        public Long registerTime;

        @NameInMap("Type")
        public String type;

        public static GetAuthenticatorResponseBodyAuthenticator build(java.util.Map<String, ?> map) throws Exception {
            GetAuthenticatorResponseBodyAuthenticator self = new GetAuthenticatorResponseBodyAuthenticator();
            return TeaModel.build(map, self);
        }

        public GetAuthenticatorResponseBodyAuthenticator setAuthenticatorName(String authenticatorName) {
            this.authenticatorName = authenticatorName;
            return this;
        }
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        public GetAuthenticatorResponseBodyAuthenticator setAuthenticatorUuid(String authenticatorUuid) {
            this.authenticatorUuid = authenticatorUuid;
            return this;
        }
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        public GetAuthenticatorResponseBodyAuthenticator setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public GetAuthenticatorResponseBodyAuthenticator setCustomAuthenticator(String customAuthenticator) {
            this.customAuthenticator = customAuthenticator;
            return this;
        }
        public String getCustomAuthenticator() {
            return this.customAuthenticator;
        }

        public GetAuthenticatorResponseBodyAuthenticator setLastVerifySourceIp(String lastVerifySourceIp) {
            this.lastVerifySourceIp = lastVerifySourceIp;
            return this;
        }
        public String getLastVerifySourceIp() {
            return this.lastVerifySourceIp;
        }

        public GetAuthenticatorResponseBodyAuthenticator setLastVerifyTime(Long lastVerifyTime) {
            this.lastVerifyTime = lastVerifyTime;
            return this;
        }
        public Long getLastVerifyTime() {
            return this.lastVerifyTime;
        }

        public GetAuthenticatorResponseBodyAuthenticator setLastVerifyUserAgent(String lastVerifyUserAgent) {
            this.lastVerifyUserAgent = lastVerifyUserAgent;
            return this;
        }
        public String getLastVerifyUserAgent() {
            return this.lastVerifyUserAgent;
        }

        public GetAuthenticatorResponseBodyAuthenticator setRegisterSourceIp(String registerSourceIp) {
            this.registerSourceIp = registerSourceIp;
            return this;
        }
        public String getRegisterSourceIp() {
            return this.registerSourceIp;
        }

        public GetAuthenticatorResponseBodyAuthenticator setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public GetAuthenticatorResponseBodyAuthenticator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
