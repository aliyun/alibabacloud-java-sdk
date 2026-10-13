// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPublishableProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishableProductsResponseBody body;

    public static ListPublishableProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishableProductsResponse self = new ListPublishableProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishableProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishableProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishableProductsResponse setBody(ListPublishableProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishableProductsResponseBody getBody() {
        return this.body;
    }

}
