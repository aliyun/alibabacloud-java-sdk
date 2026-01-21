// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class ProductBindBsnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProductBindBsnResponseBody body;

    public static ProductBindBsnResponse build(java.util.Map<String, ?> map) throws Exception {
        ProductBindBsnResponse self = new ProductBindBsnResponse();
        return TeaModel.build(map, self);
    }

    public ProductBindBsnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProductBindBsnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProductBindBsnResponse setBody(ProductBindBsnResponseBody body) {
        this.body = body;
        return this;
    }
    public ProductBindBsnResponseBody getBody() {
        return this.body;
    }

}
