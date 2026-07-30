// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteVirtualBridgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirtualBridgeResponseBody body;

    public static DeleteVirtualBridgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBridgeResponse self = new DeleteVirtualBridgeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualBridgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualBridgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualBridgeResponse setBody(DeleteVirtualBridgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualBridgeResponseBody getBody() {
        return this.body;
    }

}
