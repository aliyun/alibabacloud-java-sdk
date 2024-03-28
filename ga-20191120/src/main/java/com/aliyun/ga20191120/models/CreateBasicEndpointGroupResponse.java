// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicEndpointGroupResponseBody body;

    public static CreateBasicEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointGroupResponse self = new CreateBasicEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicEndpointGroupResponse setBody(CreateBasicEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
