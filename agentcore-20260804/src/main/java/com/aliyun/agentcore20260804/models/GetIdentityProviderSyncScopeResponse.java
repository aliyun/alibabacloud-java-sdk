// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSyncScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderSyncScopeResponseBody body;

    public static GetIdentityProviderSyncScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSyncScopeResponse self = new GetIdentityProviderSyncScopeResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSyncScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderSyncScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderSyncScopeResponse setBody(GetIdentityProviderSyncScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderSyncScopeResponseBody getBody() {
        return this.body;
    }

}
