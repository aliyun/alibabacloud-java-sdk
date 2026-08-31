// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgGremlinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecKgGremlinResponseBody body;

    public static ExecKgGremlinResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecKgGremlinResponse self = new ExecKgGremlinResponse();
        return TeaModel.build(map, self);
    }

    public ExecKgGremlinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecKgGremlinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecKgGremlinResponse setBody(ExecKgGremlinResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecKgGremlinResponseBody getBody() {
        return this.body;
    }

}
