// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeviceTunnelResponseBody body;

    public static CreateDeviceTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceTunnelResponse self = new CreateDeviceTunnelResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeviceTunnelResponse setBody(CreateDeviceTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceTunnelResponseBody getBody() {
        return this.body;
    }

}
