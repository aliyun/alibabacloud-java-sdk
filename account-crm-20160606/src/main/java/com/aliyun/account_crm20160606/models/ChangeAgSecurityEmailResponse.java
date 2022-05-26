// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ChangeAgSecurityEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAgSecurityEmailResponseBody body;

    public static ChangeAgSecurityEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgSecurityEmailResponse self = new ChangeAgSecurityEmailResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAgSecurityEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAgSecurityEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAgSecurityEmailResponse setBody(ChangeAgSecurityEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAgSecurityEmailResponseBody getBody() {
        return this.body;
    }

}
