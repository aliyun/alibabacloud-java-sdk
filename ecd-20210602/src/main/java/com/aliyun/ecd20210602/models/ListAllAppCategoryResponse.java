// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAllAppCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllAppCategoryResponseBody body;

    public static ListAllAppCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllAppCategoryResponse self = new ListAllAppCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAllAppCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllAppCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllAppCategoryResponse setBody(ListAllAppCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllAppCategoryResponseBody getBody() {
        return this.body;
    }

}
