// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class CreateRamTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRamTestResponseBody body;

    public static CreateRamTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRamTestResponse self = new CreateRamTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateRamTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRamTestResponse setBody(CreateRamTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRamTestResponseBody getBody() {
        return this.body;
    }

}
