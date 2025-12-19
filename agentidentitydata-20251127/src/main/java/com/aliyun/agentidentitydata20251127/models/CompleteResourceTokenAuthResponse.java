// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class CompleteResourceTokenAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompleteResourceTokenAuthResponseBody body;

    public static CompleteResourceTokenAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteResourceTokenAuthResponse self = new CompleteResourceTokenAuthResponse();
        return TeaModel.build(map, self);
    }

    public CompleteResourceTokenAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteResourceTokenAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteResourceTokenAuthResponse setBody(CompleteResourceTokenAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteResourceTokenAuthResponseBody getBody() {
        return this.body;
    }

}
