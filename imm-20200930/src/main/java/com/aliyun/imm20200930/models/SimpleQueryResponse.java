// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimpleQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SimpleQueryResponseBody body;

    public static SimpleQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SimpleQueryResponse self = new SimpleQueryResponse();
        return TeaModel.build(map, self);
    }

    public SimpleQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SimpleQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SimpleQueryResponse setBody(SimpleQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SimpleQueryResponseBody getBody() {
        return this.body;
    }

}
