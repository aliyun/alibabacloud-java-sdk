// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointAvailableRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNetworkAccessEndpointAvailableRegionsResponseBody body;

    public static ListNetworkAccessEndpointAvailableRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointAvailableRegionsResponse self = new ListNetworkAccessEndpointAvailableRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointAvailableRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkAccessEndpointAvailableRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkAccessEndpointAvailableRegionsResponse setBody(ListNetworkAccessEndpointAvailableRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkAccessEndpointAvailableRegionsResponseBody getBody() {
        return this.body;
    }

}
