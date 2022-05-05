// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEventBridgeIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteEventBridgeIntegrationResponse setBody(DeleteEventBridgeIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventBridgeIntegrationResponseBody getBody() {
        return this.body;
    }

}
