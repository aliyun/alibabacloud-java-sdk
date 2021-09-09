// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateLogstashResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogstashResponseBody body;

    public static CreateLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogstashResponse self = new CreateLogstashResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogstashResponse setBody(CreateLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogstashResponseBody getBody() {
        return this.body;
    }

}
