// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SignOutOrgAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SignOutOrgAccountResponseBody body;

    public static SignOutOrgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        SignOutOrgAccountResponse self = new SignOutOrgAccountResponse();
        return TeaModel.build(map, self);
    }

    public SignOutOrgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignOutOrgAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignOutOrgAccountResponse setBody(SignOutOrgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public SignOutOrgAccountResponseBody getBody() {
        return this.body;
    }

}
