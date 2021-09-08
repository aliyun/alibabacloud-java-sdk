// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshDeviceTunnelSharePasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshDeviceTunnelSharePasswordResponseBody body;

    public static RefreshDeviceTunnelSharePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDeviceTunnelSharePasswordResponse self = new RefreshDeviceTunnelSharePasswordResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDeviceTunnelSharePasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDeviceTunnelSharePasswordResponse setBody(RefreshDeviceTunnelSharePasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDeviceTunnelSharePasswordResponseBody getBody() {
        return this.body;
    }

}
