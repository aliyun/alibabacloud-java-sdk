// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateComponentIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateComponentIndexResponseBody body;

    public static CreateComponentIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentIndexResponse self = new CreateComponentIndexResponse();
        return TeaModel.build(map, self);
    }

    public CreateComponentIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComponentIndexResponse setBody(CreateComponentIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComponentIndexResponseBody getBody() {
        return this.body;
    }

}
