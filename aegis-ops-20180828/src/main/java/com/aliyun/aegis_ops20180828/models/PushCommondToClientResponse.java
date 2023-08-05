// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushCommondToClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushCommondToClientResponseBody body;

    public static PushCommondToClientResponse build(java.util.Map<String, ?> map) throws Exception {
        PushCommondToClientResponse self = new PushCommondToClientResponse();
        return TeaModel.build(map, self);
    }

    public PushCommondToClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushCommondToClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushCommondToClientResponse setBody(PushCommondToClientResponseBody body) {
        this.body = body;
        return this;
    }
    public PushCommondToClientResponseBody getBody() {
        return this.body;
    }

}
