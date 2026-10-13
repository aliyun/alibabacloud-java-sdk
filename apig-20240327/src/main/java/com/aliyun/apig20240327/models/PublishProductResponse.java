// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishProductResponseBody body;

    public static PublishProductResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishProductResponse self = new PublishProductResponse();
        return TeaModel.build(map, self);
    }

    public PublishProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishProductResponse setBody(PublishProductResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishProductResponseBody getBody() {
        return this.body;
    }

}
