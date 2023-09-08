// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class InsertCustomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertCustomResponseBody body;

    public static InsertCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertCustomResponse self = new InsertCustomResponse();
        return TeaModel.build(map, self);
    }

    public InsertCustomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertCustomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertCustomResponse setBody(InsertCustomResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertCustomResponseBody getBody() {
        return this.body;
    }

}
