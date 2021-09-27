// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class PutEnvironmentTunnelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutEnvironmentTunnelResponse setBody(PutEnvironmentTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEnvironmentTunnelResponseBody getBody() {
        return this.body;
    }

}
