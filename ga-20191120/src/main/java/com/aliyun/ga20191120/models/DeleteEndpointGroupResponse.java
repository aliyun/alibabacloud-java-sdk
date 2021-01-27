// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEndpointGroupResponseBody body;

    public static DeleteEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupResponse self = new DeleteEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEndpointGroupResponse setBody(DeleteEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
