// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewVirtualBridgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewVirtualBridgeResponseBody body;

    public static RenewVirtualBridgeResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewVirtualBridgeResponse self = new RenewVirtualBridgeResponse();
        return TeaModel.build(map, self);
    }

    public RenewVirtualBridgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewVirtualBridgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewVirtualBridgeResponse setBody(RenewVirtualBridgeResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewVirtualBridgeResponseBody getBody() {
        return this.body;
    }

}
