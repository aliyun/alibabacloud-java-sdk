// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountChangeLoginPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountChangeLoginPasswordResponseBody body;

    public static EnterpriseAccountChangeLoginPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountChangeLoginPasswordResponse self = new EnterpriseAccountChangeLoginPasswordResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountChangeLoginPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountChangeLoginPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountChangeLoginPasswordResponse setBody(EnterpriseAccountChangeLoginPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountChangeLoginPasswordResponseBody getBody() {
        return this.body;
    }

}
