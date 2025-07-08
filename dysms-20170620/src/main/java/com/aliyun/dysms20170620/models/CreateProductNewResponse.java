// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateProductNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductNewResponseBody body;

    public static CreateProductNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductNewResponse self = new CreateProductNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductNewResponse setBody(CreateProductNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductNewResponseBody getBody() {
        return this.body;
    }

}
