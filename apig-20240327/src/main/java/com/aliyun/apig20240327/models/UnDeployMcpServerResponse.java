// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UnDeployMcpServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnDeployMcpServerResponseBody body;

    public static UnDeployMcpServerResponse build(java.util.Map<String, ?> map) throws Exception {
        UnDeployMcpServerResponse self = new UnDeployMcpServerResponse();
        return TeaModel.build(map, self);
    }

    public UnDeployMcpServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnDeployMcpServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnDeployMcpServerResponse setBody(UnDeployMcpServerResponseBody body) {
        this.body = body;
        return this;
    }
    public UnDeployMcpServerResponseBody getBody() {
        return this.body;
    }

}
