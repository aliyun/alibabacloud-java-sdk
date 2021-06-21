// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateEndpointGroupsResponse setBody(CreateEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
