// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class CheckBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckBusinessResponseBody body;

    public static CheckBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBusinessResponse self = new CheckBusinessResponse();
        return TeaModel.build(map, self);
    }

    public CheckBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBusinessResponse setBody(CheckBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBusinessResponseBody getBody() {
        return this.body;
    }

}
