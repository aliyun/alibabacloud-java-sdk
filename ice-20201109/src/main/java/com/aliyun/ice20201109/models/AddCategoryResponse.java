// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCategoryResponseBody body;

    public static AddCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryResponse self = new AddCategoryResponse();
        return TeaModel.build(map, self);
    }

    public AddCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCategoryResponse setBody(AddCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCategoryResponseBody getBody() {
        return this.body;
    }

}
