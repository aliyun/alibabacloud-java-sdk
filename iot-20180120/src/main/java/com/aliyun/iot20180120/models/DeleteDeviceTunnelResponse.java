// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceTunnelResponseBody body;

    public static DeleteDeviceTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceTunnelResponse self = new DeleteDeviceTunnelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceTunnelResponse setBody(DeleteDeviceTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceTunnelResponseBody getBody() {
        return this.body;
    }

}
