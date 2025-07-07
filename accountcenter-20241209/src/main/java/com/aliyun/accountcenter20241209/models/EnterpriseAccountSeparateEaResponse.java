// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountSeparateEaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountSeparateEaResponseBody body;

    public static EnterpriseAccountSeparateEaResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountSeparateEaResponse self = new EnterpriseAccountSeparateEaResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountSeparateEaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountSeparateEaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountSeparateEaResponse setBody(EnterpriseAccountSeparateEaResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountSeparateEaResponseBody getBody() {
        return this.body;
    }

}
