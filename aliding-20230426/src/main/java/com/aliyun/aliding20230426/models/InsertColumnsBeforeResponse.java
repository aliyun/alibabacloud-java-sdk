// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertColumnsBeforeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertColumnsBeforeResponseBody body;

    public static InsertColumnsBeforeResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertColumnsBeforeResponse self = new InsertColumnsBeforeResponse();
        return TeaModel.build(map, self);
    }

    public InsertColumnsBeforeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertColumnsBeforeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertColumnsBeforeResponse setBody(InsertColumnsBeforeResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertColumnsBeforeResponseBody getBody() {
        return this.body;
    }

}
