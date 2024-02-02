// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnswerCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnswerCallResponseBody body;

    public static AnswerCallResponse build(java.util.Map<String, ?> map) throws Exception {
        AnswerCallResponse self = new AnswerCallResponse();
        return TeaModel.build(map, self);
    }

    public AnswerCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnswerCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnswerCallResponse setBody(AnswerCallResponseBody body) {
        this.body = body;
        return this;
    }
    public AnswerCallResponseBody getBody() {
        return this.body;
    }

}
