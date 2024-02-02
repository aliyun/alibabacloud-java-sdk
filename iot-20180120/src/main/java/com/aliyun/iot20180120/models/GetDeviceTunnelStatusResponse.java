// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceTunnelStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceTunnelStatusResponseBody body;

    public static GetDeviceTunnelStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTunnelStatusResponse self = new GetDeviceTunnelStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceTunnelStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceTunnelStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceTunnelStatusResponse setBody(GetDeviceTunnelStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceTunnelStatusResponseBody getBody() {
        return this.body;
    }

}
