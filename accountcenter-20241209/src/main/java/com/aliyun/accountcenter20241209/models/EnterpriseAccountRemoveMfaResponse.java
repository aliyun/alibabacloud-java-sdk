// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountRemoveMfaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountRemoveMfaResponseBody body;

    public static EnterpriseAccountRemoveMfaResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountRemoveMfaResponse self = new EnterpriseAccountRemoveMfaResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountRemoveMfaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountRemoveMfaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountRemoveMfaResponse setBody(EnterpriseAccountRemoveMfaResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountRemoveMfaResponseBody getBody() {
        return this.body;
    }

}
