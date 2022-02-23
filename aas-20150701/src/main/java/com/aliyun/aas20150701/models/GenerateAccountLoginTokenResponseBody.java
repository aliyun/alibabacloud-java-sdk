// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GenerateAccountLoginTokenResponseBody extends TeaModel {
    @NameInMap("LoginToken")
    public GenerateAccountLoginTokenResponseBodyLoginToken loginToken;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAccountLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAccountLoginTokenResponseBody self = new GenerateAccountLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAccountLoginTokenResponseBody setLoginToken(GenerateAccountLoginTokenResponseBodyLoginToken loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public GenerateAccountLoginTokenResponseBodyLoginToken getLoginToken() {
        return this.loginToken;
    }

    public GenerateAccountLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateAccountLoginTokenResponseBodyLoginToken extends TeaModel {
        @NameInMap("LoginTokenString")
        public String loginTokenString;

        @NameInMap("TargetPk")
        public String targetPk;

        public static GenerateAccountLoginTokenResponseBodyLoginToken build(java.util.Map<String, ?> map) throws Exception {
            GenerateAccountLoginTokenResponseBodyLoginToken self = new GenerateAccountLoginTokenResponseBodyLoginToken();
            return TeaModel.build(map, self);
        }

        public GenerateAccountLoginTokenResponseBodyLoginToken setLoginTokenString(String loginTokenString) {
            this.loginTokenString = loginTokenString;
            return this;
        }
        public String getLoginTokenString() {
            return this.loginTokenString;
        }

        public GenerateAccountLoginTokenResponseBodyLoginToken setTargetPk(String targetPk) {
            this.targetPk = targetPk;
            return this;
        }
        public String getTargetPk() {
            return this.targetPk;
        }

    }

}
