// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcTunnelStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcTunnelStatusResponseBody body;

    public static UpdateCcTunnelStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcTunnelStatusResponse self = new UpdateCcTunnelStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcTunnelStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcTunnelStatusResponse setBody(UpdateCcTunnelStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcTunnelStatusResponseBody getBody() {
        return this.body;
    }

}
