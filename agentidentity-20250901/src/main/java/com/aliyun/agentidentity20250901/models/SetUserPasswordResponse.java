// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetUserPasswordResponseBody body;

    public static SetUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserPasswordResponse self = new SetUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public SetUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserPasswordResponse setBody(SetUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserPasswordResponseBody getBody() {
        return this.body;
    }

}
