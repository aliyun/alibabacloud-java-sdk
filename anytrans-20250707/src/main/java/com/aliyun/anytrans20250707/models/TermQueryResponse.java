// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TermQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TermQueryResponseBody body;

    public static TermQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TermQueryResponse self = new TermQueryResponse();
        return TeaModel.build(map, self);
    }

    public TermQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TermQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TermQueryResponse setBody(TermQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TermQueryResponseBody getBody() {
        return this.body;
    }

}
