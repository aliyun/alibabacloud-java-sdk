// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateAsyncTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAsyncTranslateResponseBody body;

    public static CreateAsyncTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTranslateResponse self = new CreateAsyncTranslateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAsyncTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAsyncTranslateResponse setBody(CreateAsyncTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAsyncTranslateResponseBody getBody() {
        return this.body;
    }

}
