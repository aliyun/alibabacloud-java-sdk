// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomRoutingEndpointGroupsResponseBody body;

    public static CreateCustomRoutingEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointGroupsResponse self = new CreateCustomRoutingEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomRoutingEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomRoutingEndpointGroupsResponse setBody(CreateCustomRoutingEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomRoutingEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
