// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextCorrectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextCorrectResponseBody body;

    public static TextCorrectResponse build(java.util.Map<String, ?> map) throws Exception {
        TextCorrectResponse self = new TextCorrectResponse();
        return TeaModel.build(map, self);
    }

    public TextCorrectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextCorrectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextCorrectResponse setBody(TextCorrectResponseBody body) {
        this.body = body;
        return this;
    }
    public TextCorrectResponseBody getBody() {
        return this.body;
    }

}
