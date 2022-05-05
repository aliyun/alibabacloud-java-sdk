// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateEventBridgeIntegrationResponseBody body;

    public static CreateOrUpdateEventBridgeIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateEventBridgeIntegrationResponse self = new CreateOrUpdateEventBridgeIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateEventBridgeIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateEventBridgeIntegrationResponse setBody(CreateOrUpdateEventBridgeIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateEventBridgeIntegrationResponseBody getBody() {
        return this.body;
    }

}
