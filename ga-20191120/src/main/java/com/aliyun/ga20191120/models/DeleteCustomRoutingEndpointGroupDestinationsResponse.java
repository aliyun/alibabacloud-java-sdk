// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointGroupDestinationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomRoutingEndpointGroupDestinationsResponseBody body;

    public static DeleteCustomRoutingEndpointGroupDestinationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointGroupDestinationsResponse self = new DeleteCustomRoutingEndpointGroupDestinationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointGroupDestinationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomRoutingEndpointGroupDestinationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomRoutingEndpointGroupDestinationsResponse setBody(DeleteCustomRoutingEndpointGroupDestinationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

}
