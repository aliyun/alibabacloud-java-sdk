// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTunnelResponseBody body;

    public static GetTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTunnelResponse self = new GetTunnelResponse();
        return TeaModel.build(map, self);
    }

    public GetTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTunnelResponse setBody(GetTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTunnelResponseBody getBody() {
        return this.body;
    }

}
