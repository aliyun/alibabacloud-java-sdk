// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DisableConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableConnectorResponseBody body;

    public static DisableConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableConnectorResponse self = new DisableConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DisableConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableConnectorResponse setBody(DisableConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableConnectorResponseBody getBody() {
        return this.body;
    }

}
