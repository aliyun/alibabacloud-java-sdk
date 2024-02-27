// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCsrDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCsrDetailResponseBody body;

    public static GetCsrDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsrDetailResponse self = new GetCsrDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCsrDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsrDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsrDetailResponse setBody(GetCsrDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsrDetailResponseBody getBody() {
        return this.body;
    }

}
