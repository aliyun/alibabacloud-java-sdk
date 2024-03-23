// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateProductOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProductOrdersResponseBody body;

    public static CreateProductOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductOrdersResponse self = new CreateProductOrdersResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProductOrdersResponse setBody(CreateProductOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductOrdersResponseBody getBody() {
        return this.body;
    }

}
