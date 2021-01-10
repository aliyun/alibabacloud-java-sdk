// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVersionTestResponseBody body;

    public static CreateVersionTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionTestResponse self = new CreateVersionTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateVersionTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVersionTestResponse setBody(CreateVersionTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVersionTestResponseBody getBody() {
        return this.body;
    }

}
