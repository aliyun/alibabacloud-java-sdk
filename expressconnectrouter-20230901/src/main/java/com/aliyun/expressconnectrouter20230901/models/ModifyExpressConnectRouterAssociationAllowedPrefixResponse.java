// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterAssociationAllowedPrefixResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectRouterAssociationAllowedPrefixResponseBody body;

    public static ModifyExpressConnectRouterAssociationAllowedPrefixResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterAssociationAllowedPrefixResponse self = new ModifyExpressConnectRouterAssociationAllowedPrefixResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse setBody(ModifyExpressConnectRouterAssociationAllowedPrefixResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectRouterAssociationAllowedPrefixResponseBody getBody() {
        return this.body;
    }

}
