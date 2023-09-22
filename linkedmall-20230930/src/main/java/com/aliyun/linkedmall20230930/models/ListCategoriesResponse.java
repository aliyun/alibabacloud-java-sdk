// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CategoryListResult body;

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

    public ListCategoriesResponse setBody(CategoryListResult body) {
        this.body = body;
        return this;
    }
    public CategoryListResult getBody() {
        return this.body;
    }

}
