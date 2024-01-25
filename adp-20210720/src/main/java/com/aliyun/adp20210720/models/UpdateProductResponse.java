// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductResponseBody body;

    public static UpdateProductResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductResponse self = new UpdateProductResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductResponse setBody(UpdateProductResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductResponseBody getBody() {
        return this.body;
    }

}
