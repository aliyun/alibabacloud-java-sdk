// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductVideoGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProductVideoGenerationResponseBody body;

    public static ProductVideoGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        ProductVideoGenerationResponse self = new ProductVideoGenerationResponse();
        return TeaModel.build(map, self);
    }

    public ProductVideoGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProductVideoGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProductVideoGenerationResponse setBody(ProductVideoGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public ProductVideoGenerationResponseBody getBody() {
        return this.body;
    }

}
