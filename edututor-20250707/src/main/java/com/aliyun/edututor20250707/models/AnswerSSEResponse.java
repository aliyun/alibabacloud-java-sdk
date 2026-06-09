// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edututor20250707.models;

import com.aliyun.tea.*;

public class AnswerSSEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnswerSSEResponseBody body;

    public static AnswerSSEResponse build(java.util.Map<String, ?> map) throws Exception {
        AnswerSSEResponse self = new AnswerSSEResponse();
        return TeaModel.build(map, self);
    }

    public AnswerSSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnswerSSEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnswerSSEResponse setBody(AnswerSSEResponseBody body) {
        this.body = body;
        return this;
    }
    public AnswerSSEResponseBody getBody() {
        return this.body;
    }

}
