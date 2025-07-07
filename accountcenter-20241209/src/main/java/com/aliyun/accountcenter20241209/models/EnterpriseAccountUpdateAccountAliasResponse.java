// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateAccountAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountUpdateAccountAliasResponseBody body;

    public static EnterpriseAccountUpdateAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateAccountAliasResponse self = new EnterpriseAccountUpdateAccountAliasResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateAccountAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountUpdateAccountAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountUpdateAccountAliasResponse setBody(EnterpriseAccountUpdateAccountAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountUpdateAccountAliasResponseBody getBody() {
        return this.body;
    }

}
