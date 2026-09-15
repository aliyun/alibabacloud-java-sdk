// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class EnableConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableConnectorResponseBody body;

    public static EnableConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableConnectorResponse self = new EnableConnectorResponse();
        return TeaModel.build(map, self);
    }

    public EnableConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableConnectorResponse setBody(EnableConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableConnectorResponseBody getBody() {
        return this.body;
    }

}
