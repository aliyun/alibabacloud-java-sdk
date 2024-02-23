// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenResponseBody body;

    public static GetTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponse self = new GetTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenResponse setBody(GetTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenResponseBody getBody() {
        return this.body;
    }

}
