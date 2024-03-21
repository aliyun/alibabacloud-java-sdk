// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoginTokenResponseBody body;

    public static GetLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponse self = new GetLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoginTokenResponse setBody(GetLoginTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginTokenResponseBody getBody() {
        return this.body;
    }

}
