// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SearchProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchProductsResponseBody body;

    public static SearchProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchProductsResponse self = new SearchProductsResponse();
        return TeaModel.build(map, self);
    }

    public SearchProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchProductsResponse setBody(SearchProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchProductsResponseBody getBody() {
        return this.body;
    }

}
