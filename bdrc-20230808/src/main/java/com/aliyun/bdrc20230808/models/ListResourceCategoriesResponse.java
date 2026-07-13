// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListResourceCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceCategoriesResponseBody body;

    public static ListResourceCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceCategoriesResponse self = new ListResourceCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceCategoriesResponse setBody(ListResourceCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceCategoriesResponseBody getBody() {
        return this.body;
    }

}
