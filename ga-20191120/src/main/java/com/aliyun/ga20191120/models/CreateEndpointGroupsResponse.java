// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEndpointGroupsResponseBody body;

    public static CreateEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupsResponse self = new CreateEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEndpointGroupsResponse setBody(CreateEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
