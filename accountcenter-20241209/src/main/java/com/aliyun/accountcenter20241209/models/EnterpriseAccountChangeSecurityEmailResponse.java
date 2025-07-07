// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountChangeSecurityEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountChangeSecurityEmailResponseBody body;

    public static EnterpriseAccountChangeSecurityEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountChangeSecurityEmailResponse self = new EnterpriseAccountChangeSecurityEmailResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountChangeSecurityEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountChangeSecurityEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountChangeSecurityEmailResponse setBody(EnterpriseAccountChangeSecurityEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountChangeSecurityEmailResponseBody getBody() {
        return this.body;
    }

}
