// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCsrResponseBody body;

    public static CreateCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCsrResponse self = new CreateCsrResponse();
        return TeaModel.build(map, self);
    }

    public CreateCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCsrResponse setBody(CreateCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCsrResponseBody getBody() {
        return this.body;
    }

}
