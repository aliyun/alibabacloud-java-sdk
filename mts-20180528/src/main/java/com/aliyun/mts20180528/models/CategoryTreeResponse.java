// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class CategoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CategoryTreeResponseBody body;

    public static CategoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        CategoryTreeResponse self = new CategoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public CategoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CategoryTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CategoryTreeResponse setBody(CategoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public CategoryTreeResponseBody getBody() {
        return this.body;
    }

}
