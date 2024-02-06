// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushUnBindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushUnBindResponseBody body;

    public static PushUnBindResponse build(java.util.Map<String, ?> map) throws Exception {
        PushUnBindResponse self = new PushUnBindResponse();
        return TeaModel.build(map, self);
    }

    public PushUnBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushUnBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushUnBindResponse setBody(PushUnBindResponseBody body) {
        this.body = body;
        return this;
    }
    public PushUnBindResponseBody getBody() {
        return this.body;
    }

}
