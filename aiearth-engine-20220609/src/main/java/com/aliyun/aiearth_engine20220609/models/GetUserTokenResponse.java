// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetUserTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserTokenResponseBody body;

    public static GetUserTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenResponse self = new GetUserTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetUserTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserTokenResponse setBody(GetUserTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserTokenResponseBody getBody() {
        return this.body;
    }

}
