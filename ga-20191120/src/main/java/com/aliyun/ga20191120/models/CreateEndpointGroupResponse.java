// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEndpointGroupResponseBody body;

    public static CreateEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupResponse self = new CreateEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEndpointGroupResponse setBody(CreateEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
