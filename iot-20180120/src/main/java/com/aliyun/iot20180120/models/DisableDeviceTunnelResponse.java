// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DisableDeviceTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDeviceTunnelResponseBody body;

    public static DisableDeviceTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceTunnelResponse self = new DisableDeviceTunnelResponse();
        return TeaModel.build(map, self);
    }

    public DisableDeviceTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDeviceTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDeviceTunnelResponse setBody(DisableDeviceTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDeviceTunnelResponseBody getBody() {
        return this.body;
    }

}
