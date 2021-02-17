// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class PutProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutProjectResponseBody body;

    public static PutProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PutProjectResponse self = new PutProjectResponse();
        return TeaModel.build(map, self);
    }

    public PutProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutProjectResponse setBody(PutProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PutProjectResponseBody getBody() {
        return this.body;
    }

}
