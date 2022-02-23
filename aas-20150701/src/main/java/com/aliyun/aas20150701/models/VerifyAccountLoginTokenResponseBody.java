// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class VerifyAccountLoginTokenResponseBody extends TeaModel {
    @NameInMap("LoginToken")
    public VerifyAccountLoginTokenResponseBodyLoginToken loginToken;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyAccountLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAccountLoginTokenResponseBody self = new VerifyAccountLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAccountLoginTokenResponseBody setLoginToken(VerifyAccountLoginTokenResponseBodyLoginToken loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public VerifyAccountLoginTokenResponseBodyLoginToken getLoginToken() {
        return this.loginToken;
    }

    public VerifyAccountLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyAccountLoginTokenResponseBodyLoginToken extends TeaModel {
        @NameInMap("LoginTokenString")
        public String loginTokenString;

        @NameInMap("TargetPk")
        public String targetPk;

        public static VerifyAccountLoginTokenResponseBodyLoginToken build(java.util.Map<String, ?> map) throws Exception {
            VerifyAccountLoginTokenResponseBodyLoginToken self = new VerifyAccountLoginTokenResponseBodyLoginToken();
            return TeaModel.build(map, self);
        }

        public VerifyAccountLoginTokenResponseBodyLoginToken setLoginTokenString(String loginTokenString) {
            this.loginTokenString = loginTokenString;
            return this;
        }
        public String getLoginTokenString() {
            return this.loginTokenString;
        }

        public VerifyAccountLoginTokenResponseBodyLoginToken setTargetPk(String targetPk) {
            this.targetPk = targetPk;
            return this;
        }
        public String getTargetPk() {
            return this.targetPk;
        }

    }

}
