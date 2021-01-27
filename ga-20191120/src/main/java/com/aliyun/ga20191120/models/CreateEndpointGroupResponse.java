// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateEndpointGroupResponse setBody(CreateEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
