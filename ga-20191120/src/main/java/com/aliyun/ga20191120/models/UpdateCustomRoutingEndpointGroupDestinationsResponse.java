// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointGroupDestinationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomRoutingEndpointGroupDestinationsResponseBody body;

    public static UpdateCustomRoutingEndpointGroupDestinationsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointGroupDestinationsResponse self = new UpdateCustomRoutingEndpointGroupDestinationsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointGroupDestinationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomRoutingEndpointGroupDestinationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomRoutingEndpointGroupDestinationsResponse setBody(UpdateCustomRoutingEndpointGroupDestinationsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

}
