// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryAttributeMatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CategoryAttributeMatchResponseBody body;

    public static CategoryAttributeMatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CategoryAttributeMatchResponse self = new CategoryAttributeMatchResponse();
        return TeaModel.build(map, self);
    }

    public CategoryAttributeMatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CategoryAttributeMatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CategoryAttributeMatchResponse setBody(CategoryAttributeMatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CategoryAttributeMatchResponseBody getBody() {
        return this.body;
    }

}
