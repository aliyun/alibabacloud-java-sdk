// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class RetryDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryDocResponseBody body;

    public static RetryDocResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDocResponse self = new RetryDocResponse();
        return TeaModel.build(map, self);
    }

    public RetryDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryDocResponse setBody(RetryDocResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDocResponseBody getBody() {
        return this.body;
    }

}
