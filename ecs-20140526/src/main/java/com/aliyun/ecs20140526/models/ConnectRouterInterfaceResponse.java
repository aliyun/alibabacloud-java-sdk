// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConnectRouterInterfaceResponseBody body;

    public static ConnectRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConnectRouterInterfaceResponse self = new ConnectRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ConnectRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConnectRouterInterfaceResponse setBody(ConnectRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConnectRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
