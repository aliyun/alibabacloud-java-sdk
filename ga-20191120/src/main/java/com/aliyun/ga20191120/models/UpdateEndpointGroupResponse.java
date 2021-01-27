// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEndpointGroupResponseBody body;

    public static UpdateEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupResponse self = new UpdateEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEndpointGroupResponse setBody(UpdateEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
