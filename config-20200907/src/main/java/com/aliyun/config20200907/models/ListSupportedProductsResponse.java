// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListSupportedProductsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportedProductsResponseBody body;

    public static ListSupportedProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedProductsResponse self = new ListSupportedProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportedProductsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportedProductsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportedProductsResponse setBody(ListSupportedProductsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportedProductsResponseBody getBody() {
        return this.body;
    }

}
