// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextTranslateAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextTranslateAsyncResponseBody body;

    public static TextTranslateAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        TextTranslateAsyncResponse self = new TextTranslateAsyncResponse();
        return TeaModel.build(map, self);
    }

    public TextTranslateAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextTranslateAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextTranslateAsyncResponse setBody(TextTranslateAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public TextTranslateAsyncResponseBody getBody() {
        return this.body;
    }

}
