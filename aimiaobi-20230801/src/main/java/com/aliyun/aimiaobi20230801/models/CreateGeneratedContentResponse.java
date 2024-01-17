// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateGeneratedContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGeneratedContentResponseBody body;

    public static CreateGeneratedContentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGeneratedContentResponse self = new CreateGeneratedContentResponse();
        return TeaModel.build(map, self);
    }

    public CreateGeneratedContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGeneratedContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGeneratedContentResponse setBody(CreateGeneratedContentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGeneratedContentResponseBody getBody() {
        return this.body;
    }

}
