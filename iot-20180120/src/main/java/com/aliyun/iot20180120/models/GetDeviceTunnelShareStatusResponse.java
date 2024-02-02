// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceTunnelShareStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceTunnelShareStatusResponseBody body;

    public static GetDeviceTunnelShareStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTunnelShareStatusResponse self = new GetDeviceTunnelShareStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceTunnelShareStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceTunnelShareStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceTunnelShareStatusResponse setBody(GetDeviceTunnelShareStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceTunnelShareStatusResponseBody getBody() {
        return this.body;
    }

}
