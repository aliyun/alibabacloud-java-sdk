// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class InitIMConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitIMConnectResponseBody body;

    public static InitIMConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        InitIMConnectResponse self = new InitIMConnectResponse();
        return TeaModel.build(map, self);
    }

    public InitIMConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitIMConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitIMConnectResponse setBody(InitIMConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public InitIMConnectResponseBody getBody() {
        return this.body;
    }

}
