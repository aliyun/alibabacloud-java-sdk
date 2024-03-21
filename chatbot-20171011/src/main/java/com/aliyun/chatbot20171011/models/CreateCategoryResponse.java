// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCategoryResponseBody body;

    public static CreateCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCategoryResponse self = new CreateCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCategoryResponse setBody(CreateCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCategoryResponseBody getBody() {
        return this.body;
    }

}
