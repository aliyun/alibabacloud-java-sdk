// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class FetchOAuthAuthenticationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchOAuthAuthenticationTokenResponseBody body;

    public static FetchOAuthAuthenticationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchOAuthAuthenticationTokenResponse self = new FetchOAuthAuthenticationTokenResponse();
        return TeaModel.build(map, self);
    }

    public FetchOAuthAuthenticationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchOAuthAuthenticationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchOAuthAuthenticationTokenResponse setBody(FetchOAuthAuthenticationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchOAuthAuthenticationTokenResponseBody getBody() {
        return this.body;
    }

}
