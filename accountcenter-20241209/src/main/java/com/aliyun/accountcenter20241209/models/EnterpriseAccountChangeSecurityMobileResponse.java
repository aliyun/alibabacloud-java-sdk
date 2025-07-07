// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountChangeSecurityMobileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountChangeSecurityMobileResponseBody body;

    public static EnterpriseAccountChangeSecurityMobileResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountChangeSecurityMobileResponse self = new EnterpriseAccountChangeSecurityMobileResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountChangeSecurityMobileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountChangeSecurityMobileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountChangeSecurityMobileResponse setBody(EnterpriseAccountChangeSecurityMobileResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountChangeSecurityMobileResponseBody getBody() {
        return this.body;
    }

}
