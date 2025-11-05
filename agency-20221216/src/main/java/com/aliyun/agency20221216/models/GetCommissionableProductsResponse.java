// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCommissionableProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommissionableProductsResponseBody body;

    public static GetCommissionableProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionableProductsResponse self = new GetCommissionableProductsResponse();
        return TeaModel.build(map, self);
    }

    public GetCommissionableProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommissionableProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommissionableProductsResponse setBody(GetCommissionableProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommissionableProductsResponseBody getBody() {
        return this.body;
    }

}
