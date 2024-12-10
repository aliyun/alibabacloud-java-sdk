// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetSupportedZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayIntranetSupportedZoneResponseBody body;

    public static ListGatewayIntranetSupportedZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetSupportedZoneResponse self = new ListGatewayIntranetSupportedZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetSupportedZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayIntranetSupportedZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayIntranetSupportedZoneResponse setBody(ListGatewayIntranetSupportedZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayIntranetSupportedZoneResponseBody getBody() {
        return this.body;
    }

}
