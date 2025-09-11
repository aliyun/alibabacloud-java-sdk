// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TextTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextTranslateResponseBody body;

    public static TextTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateResponse self = new TextTranslateResponse();
        return TeaModel.build(map, self);
    }

    public TextTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextTranslateResponse setBody(TextTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public TextTranslateResponseBody getBody() {
        return this.body;
    }

}
