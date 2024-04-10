// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthorizationTokenResponseBody body;

    public static GetAuthorizationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenResponse self = new GetAuthorizationTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthorizationTokenResponse setBody(GetAuthorizationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationTokenResponseBody getBody() {
        return this.body;
    }

}
