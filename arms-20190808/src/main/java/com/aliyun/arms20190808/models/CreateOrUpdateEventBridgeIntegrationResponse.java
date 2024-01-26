// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateOrUpdateEventBridgeIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateEventBridgeIntegrationResponse setBody(CreateOrUpdateEventBridgeIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateEventBridgeIntegrationResponseBody getBody() {
        return this.body;
    }

}
