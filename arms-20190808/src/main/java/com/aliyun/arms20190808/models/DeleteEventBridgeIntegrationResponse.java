// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEventBridgeIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventBridgeIntegrationResponseBody body;

    public static DeleteEventBridgeIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventBridgeIntegrationResponse self = new DeleteEventBridgeIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventBridgeIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventBridgeIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventBridgeIntegrationResponse setBody(DeleteEventBridgeIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventBridgeIntegrationResponseBody getBody() {
        return this.body;
    }

}
