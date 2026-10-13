// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductCategoriesResponseBody body;

    public static ListProductCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductCategoriesResponse self = new ListProductCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListProductCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductCategoriesResponse setBody(ListProductCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductCategoriesResponseBody getBody() {
        return this.body;
    }

}
