// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshDeviceTunnelSharePasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RefreshDeviceTunnelSharePasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDeviceTunnelSharePasswordResponse setBody(RefreshDeviceTunnelSharePasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDeviceTunnelSharePasswordResponseBody getBody() {
        return this.body;
    }

}
