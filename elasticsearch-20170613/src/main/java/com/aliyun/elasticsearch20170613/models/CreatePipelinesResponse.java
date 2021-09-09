// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreatePipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePipelinesResponseBody body;

    public static CreatePipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinesResponse self = new CreatePipelinesResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelinesResponse setBody(CreatePipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelinesResponseBody getBody() {
        return this.body;
    }

}
