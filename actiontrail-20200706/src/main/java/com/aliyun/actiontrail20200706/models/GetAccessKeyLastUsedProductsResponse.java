// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyLastUsedProductsResponseBody body;

    public static GetAccessKeyLastUsedProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedProductsResponse self = new GetAccessKeyLastUsedProductsResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyLastUsedProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyLastUsedProductsResponse setBody(GetAccessKeyLastUsedProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyLastUsedProductsResponseBody getBody() {
        return this.body;
    }

}
