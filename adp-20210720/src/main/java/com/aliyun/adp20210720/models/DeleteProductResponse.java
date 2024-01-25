// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
