// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateResourceCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceCategoryResponseBody body;

    public static CreateResourceCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceCategoryResponse self = new CreateResourceCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceCategoryResponse setBody(CreateResourceCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceCategoryResponseBody getBody() {
        return this.body;
    }

}
