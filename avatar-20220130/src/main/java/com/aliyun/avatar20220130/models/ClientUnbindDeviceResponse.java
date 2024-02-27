// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientUnbindDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClientUnbindDeviceResponseBody body;

    public static ClientUnbindDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ClientUnbindDeviceResponse self = new ClientUnbindDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ClientUnbindDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClientUnbindDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClientUnbindDeviceResponse setBody(ClientUnbindDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ClientUnbindDeviceResponseBody getBody() {
        return this.body;
    }

}
