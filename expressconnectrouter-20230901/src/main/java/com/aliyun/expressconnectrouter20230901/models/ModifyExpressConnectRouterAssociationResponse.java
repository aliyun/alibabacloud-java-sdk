// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectRouterAssociationResponseBody body;

    public static ModifyExpressConnectRouterAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterAssociationResponse self = new ModifyExpressConnectRouterAssociationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectRouterAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectRouterAssociationResponse setBody(ModifyExpressConnectRouterAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectRouterAssociationResponseBody getBody() {
        return this.body;
    }

}
