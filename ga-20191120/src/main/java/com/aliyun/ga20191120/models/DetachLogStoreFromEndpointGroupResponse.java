// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachLogStoreFromEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachLogStoreFromEndpointGroupResponseBody body;

    public static DetachLogStoreFromEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachLogStoreFromEndpointGroupResponse self = new DetachLogStoreFromEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DetachLogStoreFromEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachLogStoreFromEndpointGroupResponse setBody(DetachLogStoreFromEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachLogStoreFromEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
