// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomRoutingEndpointGroupDestinationsResponseBody body;

    public static ListCustomRoutingEndpointGroupDestinationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointGroupDestinationsResponse self = new ListCustomRoutingEndpointGroupDestinationsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointGroupDestinationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomRoutingEndpointGroupDestinationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomRoutingEndpointGroupDestinationsResponse setBody(ListCustomRoutingEndpointGroupDestinationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

}
