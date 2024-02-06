// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushBindResponseBody body;

    public static PushBindResponse build(java.util.Map<String, ?> map) throws Exception {
        PushBindResponse self = new PushBindResponse();
        return TeaModel.build(map, self);
    }

    public PushBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushBindResponse setBody(PushBindResponseBody body) {
        this.body = body;
        return this;
    }
    public PushBindResponseBody getBody() {
        return this.body;
    }

}
