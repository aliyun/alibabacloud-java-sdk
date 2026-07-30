// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateVirtualBridgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualBridgeResponseBody body;

    public static CreateVirtualBridgeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBridgeResponse self = new CreateVirtualBridgeResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBridgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualBridgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualBridgeResponse setBody(CreateVirtualBridgeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualBridgeResponseBody getBody() {
        return this.body;
    }

}
