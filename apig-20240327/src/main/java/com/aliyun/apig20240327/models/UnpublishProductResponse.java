// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UnpublishProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnpublishProductResponseBody body;

    public static UnpublishProductResponse build(java.util.Map<String, ?> map) throws Exception {
        UnpublishProductResponse self = new UnpublishProductResponse();
        return TeaModel.build(map, self);
    }

    public UnpublishProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnpublishProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnpublishProductResponse setBody(UnpublishProductResponseBody body) {
        this.body = body;
        return this;
    }
    public UnpublishProductResponseBody getBody() {
        return this.body;
    }

}
