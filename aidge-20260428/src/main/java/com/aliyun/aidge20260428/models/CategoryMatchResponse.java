// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryMatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CategoryMatchResponseBody body;

    public static CategoryMatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CategoryMatchResponse self = new CategoryMatchResponse();
        return TeaModel.build(map, self);
    }

    public CategoryMatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CategoryMatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CategoryMatchResponse setBody(CategoryMatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CategoryMatchResponseBody getBody() {
        return this.body;
    }

}
