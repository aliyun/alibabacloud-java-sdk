// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TranslateResponseBody body;

    public static TranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateResponse self = new TranslateResponse();
        return TeaModel.build(map, self);
    }

    public TranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateResponse setBody(TranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateResponseBody getBody() {
        return this.body;
    }

}
