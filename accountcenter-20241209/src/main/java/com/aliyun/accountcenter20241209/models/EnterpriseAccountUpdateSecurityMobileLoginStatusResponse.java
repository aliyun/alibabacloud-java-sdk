// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateSecurityMobileLoginStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponseBody body;

    public static EnterpriseAccountUpdateSecurityMobileLoginStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateSecurityMobileLoginStatusResponse self = new EnterpriseAccountUpdateSecurityMobileLoginStatusResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponse setBody(EnterpriseAccountUpdateSecurityMobileLoginStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponseBody getBody() {
        return this.body;
    }

}
