// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCategoriesResponseBody body;

    public static ListCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponse self = new ListCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCategoriesResponse setBody(ListCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCategoriesResponseBody getBody() {
        return this.body;
    }

}
