// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class RetryDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RetryDatabaseResponseBody body;

    public static RetryDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDatabaseResponse self = new RetryDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public RetryDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryDatabaseResponse setBody(RetryDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDatabaseResponseBody getBody() {
        return this.body;
    }

}
