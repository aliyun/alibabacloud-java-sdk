// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayZoneResponseBody body;

    public static ListGatewayZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayZoneResponse self = new ListGatewayZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayZoneResponse setBody(ListGatewayZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayZoneResponseBody getBody() {
        return this.body;
    }

}
