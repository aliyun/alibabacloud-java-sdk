// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductResponseBody body;

    public static GetProductResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponse self = new GetProductResponse();
        return TeaModel.build(map, self);
    }

    public GetProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductResponse setBody(GetProductResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductResponseBody getBody() {
        return this.body;
    }

}
