// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SetEnvironmentTunnelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetEnvironmentTunnelResponseBody body;

    public static SetEnvironmentTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentTunnelResponse self = new SetEnvironmentTunnelResponse();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEnvironmentTunnelResponse setBody(SetEnvironmentTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEnvironmentTunnelResponseBody getBody() {
        return this.body;
    }

}
