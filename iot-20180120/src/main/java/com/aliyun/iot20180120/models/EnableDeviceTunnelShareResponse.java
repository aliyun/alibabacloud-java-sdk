// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class EnableDeviceTunnelShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDeviceTunnelShareResponseBody body;

    public static EnableDeviceTunnelShareResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDeviceTunnelShareResponse self = new EnableDeviceTunnelShareResponse();
        return TeaModel.build(map, self);
    }

    public EnableDeviceTunnelShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDeviceTunnelShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDeviceTunnelShareResponse setBody(EnableDeviceTunnelShareResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDeviceTunnelShareResponseBody getBody() {
        return this.body;
    }

}
