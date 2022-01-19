// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateStoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateStoryResponse setBody(CreateStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoryResponseBody getBody() {
        return this.body;
    }

}
