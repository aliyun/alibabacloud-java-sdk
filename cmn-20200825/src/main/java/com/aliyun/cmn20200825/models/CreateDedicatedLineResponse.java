// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDedicatedLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDedicatedLineResponseBody body;

    public static CreateDedicatedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedLineResponse self = new CreateDedicatedLineResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedLineResponse setBody(CreateDedicatedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedLineResponseBody getBody() {
        return this.body;
    }

}
