// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class CreateInstanceTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceTableResponseBody body;

    public static CreateInstanceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTableResponse self = new CreateInstanceTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceTableResponse setBody(CreateInstanceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceTableResponseBody getBody() {
        return this.body;
    }

}
