// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckExpandStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckExpandStatusResponseBody body;

    public static CheckExpandStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckExpandStatusResponse self = new CheckExpandStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckExpandStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckExpandStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckExpandStatusResponse setBody(CheckExpandStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckExpandStatusResponseBody getBody() {
        return this.body;
    }

}
