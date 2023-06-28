// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DeleteProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductResponseBody body;

    public static DeleteProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductResponse self = new DeleteProductResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductResponse setBody(DeleteProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductResponseBody getBody() {
        return this.body;
    }

}
