// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CheckComponentsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckComponentsVersionResponseBody body;

    public static CheckComponentsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckComponentsVersionResponse self = new CheckComponentsVersionResponse();
        return TeaModel.build(map, self);
    }

    public CheckComponentsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckComponentsVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckComponentsVersionResponse setBody(CheckComponentsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckComponentsVersionResponseBody getBody() {
        return this.body;
    }

}
