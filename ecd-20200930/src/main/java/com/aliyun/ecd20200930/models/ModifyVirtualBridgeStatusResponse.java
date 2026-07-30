// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyVirtualBridgeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVirtualBridgeStatusResponseBody body;

    public static ModifyVirtualBridgeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBridgeStatusResponse self = new ModifyVirtualBridgeStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBridgeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualBridgeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVirtualBridgeStatusResponse setBody(ModifyVirtualBridgeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualBridgeStatusResponseBody getBody() {
        return this.body;
    }

}
