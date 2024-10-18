// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyWithFusionAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyWithFusionAuthTokenResponseBody body;

    public static VerifyWithFusionAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyWithFusionAuthTokenResponse self = new VerifyWithFusionAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyWithFusionAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyWithFusionAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyWithFusionAuthTokenResponse setBody(VerifyWithFusionAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyWithFusionAuthTokenResponseBody getBody() {
        return this.body;
    }

}
