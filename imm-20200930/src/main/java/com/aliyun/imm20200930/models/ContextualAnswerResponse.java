// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualAnswerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContextualAnswerResponseBody body;

    public static ContextualAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        ContextualAnswerResponse self = new ContextualAnswerResponse();
        return TeaModel.build(map, self);
    }

    public ContextualAnswerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContextualAnswerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContextualAnswerResponse setBody(ContextualAnswerResponseBody body) {
        this.body = body;
        return this;
    }
    public ContextualAnswerResponseBody getBody() {
        return this.body;
    }

}
