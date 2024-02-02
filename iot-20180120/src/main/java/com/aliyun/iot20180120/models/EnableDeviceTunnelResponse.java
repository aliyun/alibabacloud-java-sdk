// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class EnableDeviceTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDeviceTunnelResponseBody body;

    public static EnableDeviceTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDeviceTunnelResponse self = new EnableDeviceTunnelResponse();
        return TeaModel.build(map, self);
    }

    public EnableDeviceTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDeviceTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDeviceTunnelResponse setBody(EnableDeviceTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDeviceTunnelResponseBody getBody() {
        return this.body;
    }

}
