// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectRouterAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressConnectRouterAssociationResponseBody body;

    public static DeleteExpressConnectRouterAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectRouterAssociationResponse self = new DeleteExpressConnectRouterAssociationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectRouterAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressConnectRouterAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressConnectRouterAssociationResponse setBody(DeleteExpressConnectRouterAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressConnectRouterAssociationResponseBody getBody() {
        return this.body;
    }

}
