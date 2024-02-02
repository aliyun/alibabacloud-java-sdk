// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AttachNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachNetworkInterfaceResponse setBody(AttachNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
