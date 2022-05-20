// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthTokenResponseBody body;

    public static GetAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenResponse self = new GetAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthTokenResponse setBody(GetAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthTokenResponseBody getBody() {
        return this.body;
    }

}
