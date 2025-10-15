// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetNetworkZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkZoneResponseBody body;

    public static GetNetworkZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkZoneResponse self = new GetNetworkZoneResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkZoneResponse setBody(GetNetworkZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkZoneResponseBody getBody() {
        return this.body;
    }

}
