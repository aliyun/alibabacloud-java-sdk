// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutEnvironmentTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutEnvironmentTunnelResponseBody body;

    public static PutEnvironmentTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEnvironmentTunnelResponse self = new PutEnvironmentTunnelResponse();
        return TeaModel.build(map, self);
    }

    public PutEnvironmentTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEnvironmentTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEnvironmentTunnelResponse setBody(PutEnvironmentTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEnvironmentTunnelResponseBody getBody() {
        return this.body;
    }

}
