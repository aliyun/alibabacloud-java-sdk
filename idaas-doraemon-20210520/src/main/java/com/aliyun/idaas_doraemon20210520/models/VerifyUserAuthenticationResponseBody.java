// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyUserAuthenticationResponseBody extends TeaModel {
    @NameInMap("AuthenticateResultInfo")
    public VerifyUserAuthenticationResponseBodyAuthenticateResultInfo authenticateResultInfo;

    @NameInMap("EtasSDKString")
    public String etasSDKString;

    @NameInMap("IdToken")
    public String idToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyResult")
    public Boolean verifyResult;

    public static VerifyUserAuthenticationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserAuthenticationResponseBody self = new VerifyUserAuthenticationResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyUserAuthenticationResponseBody setAuthenticateResultInfo(VerifyUserAuthenticationResponseBodyAuthenticateResultInfo authenticateResultInfo) {
        this.authenticateResultInfo = authenticateResultInfo;
        return this;
    }
    public VerifyUserAuthenticationResponseBodyAuthenticateResultInfo getAuthenticateResultInfo() {
        return this.authenticateResultInfo;
    }

    public VerifyUserAuthenticationResponseBody setEtasSDKString(String etasSDKString) {
        this.etasSDKString = etasSDKString;
        return this;
    }
    public String getEtasSDKString() {
        return this.etasSDKString;
    }

    public VerifyUserAuthenticationResponseBody setIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
    public String getIdToken() {
        return this.idToken;
    }

    public VerifyUserAuthenticationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyUserAuthenticationResponseBody setVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

    public static class VerifyUserAuthenticationResponseBodyAuthenticateResultInfo extends TeaModel {
        @NameInMap("BindHashBase64")
        public String bindHashBase64;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("UserId")
        public String userId;

        public static VerifyUserAuthenticationResponseBodyAuthenticateResultInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyUserAuthenticationResponseBodyAuthenticateResultInfo self = new VerifyUserAuthenticationResponseBodyAuthenticateResultInfo();
            return TeaModel.build(map, self);
        }

        public VerifyUserAuthenticationResponseBodyAuthenticateResultInfo setBindHashBase64(String bindHashBase64) {
            this.bindHashBase64 = bindHashBase64;
            return this;
        }
        public String getBindHashBase64() {
            return this.bindHashBase64;
        }

        public VerifyUserAuthenticationResponseBodyAuthenticateResultInfo setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public VerifyUserAuthenticationResponseBodyAuthenticateResultInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
