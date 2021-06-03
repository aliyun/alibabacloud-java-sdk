// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachLogStoreToEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachLogStoreToEndpointGroupResponseBody body;

    public static AttachLogStoreToEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachLogStoreToEndpointGroupResponse self = new AttachLogStoreToEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public AttachLogStoreToEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachLogStoreToEndpointGroupResponse setBody(AttachLogStoreToEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachLogStoreToEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
