// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstanceHealthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetInstanceHealthResponseBody body;

    public static SetInstanceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceHealthResponse self = new SetInstanceHealthResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceHealthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstanceHealthResponse setBody(SetInstanceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceHealthResponseBody getBody() {
        return this.body;
    }

}
