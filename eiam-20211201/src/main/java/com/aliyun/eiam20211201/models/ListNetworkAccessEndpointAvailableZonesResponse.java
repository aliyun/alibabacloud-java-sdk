// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetworkAccessEndpointAvailableZonesResponseBody body;

    public static ListNetworkAccessEndpointAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointAvailableZonesResponse self = new ListNetworkAccessEndpointAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkAccessEndpointAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkAccessEndpointAvailableZonesResponse setBody(ListNetworkAccessEndpointAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkAccessEndpointAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
