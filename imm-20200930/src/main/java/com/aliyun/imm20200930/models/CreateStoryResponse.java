// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateStoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStoryResponseBody body;

    public static CreateStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryResponse self = new CreateStoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStoryResponse setBody(CreateStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoryResponseBody getBody() {
        return this.body;
    }

}
