// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentTunnelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentTunnelResponseBody body;

    public static ListEnvironmentTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentTunnelResponse self = new ListEnvironmentTunnelResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentTunnelResponse setBody(ListEnvironmentTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentTunnelResponseBody getBody() {
        return this.body;
    }

}
