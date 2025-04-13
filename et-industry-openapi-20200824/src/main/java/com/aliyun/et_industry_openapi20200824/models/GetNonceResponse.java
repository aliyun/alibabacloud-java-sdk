// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class GetNonceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNonceResponseBody body;

    public static GetNonceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNonceResponse self = new GetNonceResponse();
        return TeaModel.build(map, self);
    }

    public GetNonceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNonceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNonceResponse setBody(GetNonceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNonceResponseBody getBody() {
        return this.body;
    }

}
