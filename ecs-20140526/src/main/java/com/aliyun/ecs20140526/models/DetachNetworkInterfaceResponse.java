// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachNetworkInterfaceResponseBody body;

    public static DetachNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkInterfaceResponse self = new DetachNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DetachNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachNetworkInterfaceResponse setBody(DetachNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
