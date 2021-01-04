// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcTunnelGrayAndOnlyAllowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcTunnelGrayAndOnlyAllowResponseBody body;

    public static UpdateCcTunnelGrayAndOnlyAllowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcTunnelGrayAndOnlyAllowResponse self = new UpdateCcTunnelGrayAndOnlyAllowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcTunnelGrayAndOnlyAllowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcTunnelGrayAndOnlyAllowResponse setBody(UpdateCcTunnelGrayAndOnlyAllowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcTunnelGrayAndOnlyAllowResponseBody getBody() {
        return this.body;
    }

}
