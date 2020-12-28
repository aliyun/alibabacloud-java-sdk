// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachNetworkInterfaceResponseBody body;

    public static AttachNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkInterfaceResponse self = new AttachNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public AttachNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachNetworkInterfaceResponse setBody(AttachNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
