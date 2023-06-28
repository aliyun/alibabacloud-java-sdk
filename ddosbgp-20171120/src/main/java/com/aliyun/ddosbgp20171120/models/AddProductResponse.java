// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class AddProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddProductResponseBody body;

    public static AddProductResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProductResponse self = new AddProductResponse();
        return TeaModel.build(map, self);
    }

    public AddProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProductResponse setBody(AddProductResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProductResponseBody getBody() {
        return this.body;
    }

}
