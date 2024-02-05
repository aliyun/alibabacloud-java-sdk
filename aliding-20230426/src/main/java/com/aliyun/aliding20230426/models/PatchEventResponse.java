// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class PatchEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PatchEventResponseBody body;

    public static PatchEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PatchEventResponse self = new PatchEventResponse();
        return TeaModel.build(map, self);
    }

    public PatchEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PatchEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PatchEventResponse setBody(PatchEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PatchEventResponseBody getBody() {
        return this.body;
    }

}
