// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetAsyncResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncResultResponseBody body;

    public static GetAsyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultResponse self = new GetAsyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncResultResponse setBody(GetAsyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncResultResponseBody getBody() {
        return this.body;
    }

}
