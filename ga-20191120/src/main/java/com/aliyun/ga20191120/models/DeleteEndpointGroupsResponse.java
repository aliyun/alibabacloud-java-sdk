// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEndpointGroupsResponseBody body;

    public static DeleteEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupsResponse self = new DeleteEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEndpointGroupsResponse setBody(DeleteEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
