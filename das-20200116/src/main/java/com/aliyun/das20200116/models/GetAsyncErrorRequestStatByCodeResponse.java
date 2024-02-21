// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatByCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsyncErrorRequestStatByCodeResponseBody body;

    public static GetAsyncErrorRequestStatByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatByCodeResponse self = new GetAsyncErrorRequestStatByCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncErrorRequestStatByCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncErrorRequestStatByCodeResponse setBody(GetAsyncErrorRequestStatByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncErrorRequestStatByCodeResponseBody getBody() {
        return this.body;
    }

}
