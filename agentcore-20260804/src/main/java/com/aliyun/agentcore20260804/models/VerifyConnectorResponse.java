// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyConnectorResponseBody body;

    public static VerifyConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyConnectorResponse self = new VerifyConnectorResponse();
        return TeaModel.build(map, self);
    }

    public VerifyConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyConnectorResponse setBody(VerifyConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyConnectorResponseBody getBody() {
        return this.body;
    }

}
