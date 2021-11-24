// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBasicEndpointGroupResponseBody body;

    public static UpdateBasicEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointGroupResponse self = new UpdateBasicEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicEndpointGroupResponse setBody(UpdateBasicEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
