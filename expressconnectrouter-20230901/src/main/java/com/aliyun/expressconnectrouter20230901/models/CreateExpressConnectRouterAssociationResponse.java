// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressConnectRouterAssociationResponseBody body;

    public static CreateExpressConnectRouterAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectRouterAssociationResponse self = new CreateExpressConnectRouterAssociationResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectRouterAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressConnectRouterAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressConnectRouterAssociationResponse setBody(CreateExpressConnectRouterAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressConnectRouterAssociationResponseBody getBody() {
        return this.body;
    }

}
