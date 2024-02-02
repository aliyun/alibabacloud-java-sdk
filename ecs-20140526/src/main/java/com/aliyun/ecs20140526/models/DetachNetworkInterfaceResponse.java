// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachNetworkInterfaceResponse setBody(DetachNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
