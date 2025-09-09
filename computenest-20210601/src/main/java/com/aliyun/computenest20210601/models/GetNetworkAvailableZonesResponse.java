// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetNetworkAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkAvailableZonesResponseBody body;

    public static GetNetworkAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkAvailableZonesResponse self = new GetNetworkAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkAvailableZonesResponse setBody(GetNetworkAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
