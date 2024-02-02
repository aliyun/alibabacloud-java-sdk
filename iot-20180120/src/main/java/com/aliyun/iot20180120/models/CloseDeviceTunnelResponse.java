// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CloseDeviceTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseDeviceTunnelResponseBody body;

    public static CloseDeviceTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDeviceTunnelResponse self = new CloseDeviceTunnelResponse();
        return TeaModel.build(map, self);
    }

    public CloseDeviceTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDeviceTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseDeviceTunnelResponse setBody(CloseDeviceTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDeviceTunnelResponseBody getBody() {
        return this.body;
    }

}
