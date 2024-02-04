// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomizedStoryResponseBody body;

    public static CreateCustomizedStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryResponse self = new CreateCustomizedStoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomizedStoryResponse setBody(CreateCustomizedStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedStoryResponseBody getBody() {
        return this.body;
    }

}
