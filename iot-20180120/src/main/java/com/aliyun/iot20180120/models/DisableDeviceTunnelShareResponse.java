// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DisableDeviceTunnelShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDeviceTunnelShareResponseBody body;

    public static DisableDeviceTunnelShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceTunnelShareResponse self = new DisableDeviceTunnelShareResponse();
        return TeaModel.build(map, self);
    }

    public DisableDeviceTunnelShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDeviceTunnelShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDeviceTunnelShareResponse setBody(DisableDeviceTunnelShareResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDeviceTunnelShareResponseBody getBody() {
        return this.body;
    }

}
