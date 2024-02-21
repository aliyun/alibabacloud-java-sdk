// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsyncErrorRequestStatResultResponseBody body;

    public static GetAsyncErrorRequestStatResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultResponse self = new GetAsyncErrorRequestStatResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncErrorRequestStatResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncErrorRequestStatResultResponse setBody(GetAsyncErrorRequestStatResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncErrorRequestStatResultResponseBody getBody() {
        return this.body;
    }

}
