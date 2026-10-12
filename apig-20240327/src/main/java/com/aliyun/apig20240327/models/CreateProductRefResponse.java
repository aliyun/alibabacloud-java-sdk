// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateProductRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductRefResponseBody body;

    public static CreateProductRefResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRefResponse self = new CreateProductRefResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductRefResponse setBody(CreateProductRefResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductRefResponseBody getBody() {
        return this.body;
    }

}
