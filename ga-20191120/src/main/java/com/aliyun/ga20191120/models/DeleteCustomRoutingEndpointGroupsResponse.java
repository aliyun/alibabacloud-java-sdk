// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomRoutingEndpointGroupsResponseBody body;

    public static DeleteCustomRoutingEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointGroupsResponse self = new DeleteCustomRoutingEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomRoutingEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomRoutingEndpointGroupsResponse setBody(DeleteCustomRoutingEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomRoutingEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
