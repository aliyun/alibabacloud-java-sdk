// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateShardTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateShardTaskResponseBody body;

    public static CreateShardTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShardTaskResponse self = new CreateShardTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateShardTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateShardTaskResponse setBody(CreateShardTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateShardTaskResponseBody getBody() {
        return this.body;
    }

}
