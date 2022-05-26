// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ChangeAgSecurityMobileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAgSecurityMobileResponseBody body;

    public static ChangeAgSecurityMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgSecurityMobileResponse self = new ChangeAgSecurityMobileResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAgSecurityMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAgSecurityMobileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAgSecurityMobileResponse setBody(ChangeAgSecurityMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAgSecurityMobileResponseBody getBody() {
        return this.body;
    }

}
