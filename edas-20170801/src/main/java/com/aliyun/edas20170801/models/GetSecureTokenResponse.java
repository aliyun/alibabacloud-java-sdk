// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSecureTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecureTokenResponseBody body;

    public static GetSecureTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecureTokenResponse self = new GetSecureTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetSecureTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecureTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecureTokenResponse setBody(GetSecureTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecureTokenResponseBody getBody() {
        return this.body;
    }

}
