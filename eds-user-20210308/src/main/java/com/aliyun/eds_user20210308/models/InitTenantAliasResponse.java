// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class InitTenantAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitTenantAliasResponseBody body;

    public static InitTenantAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        InitTenantAliasResponse self = new InitTenantAliasResponse();
        return TeaModel.build(map, self);
    }

    public InitTenantAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitTenantAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitTenantAliasResponse setBody(InitTenantAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public InitTenantAliasResponseBody getBody() {
        return this.body;
    }

}
