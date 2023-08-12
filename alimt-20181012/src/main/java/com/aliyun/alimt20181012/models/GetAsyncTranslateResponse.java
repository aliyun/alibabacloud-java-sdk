// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetAsyncTranslateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncTranslateResponseBody body;

    public static GetAsyncTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTranslateResponse self = new GetAsyncTranslateResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncTranslateResponse setBody(GetAsyncTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncTranslateResponseBody getBody() {
        return this.body;
    }

}
