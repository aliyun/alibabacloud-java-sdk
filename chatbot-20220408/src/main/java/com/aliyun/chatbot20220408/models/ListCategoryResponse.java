// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCategoryResponseBody body;

    public static ListCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCategoryResponse self = new ListCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCategoryResponse setBody(ListCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCategoryResponseBody getBody() {
        return this.body;
    }

}
