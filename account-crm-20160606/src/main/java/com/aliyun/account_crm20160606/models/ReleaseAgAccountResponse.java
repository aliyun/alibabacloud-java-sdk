// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ReleaseAgAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseAgAccountResponseBody body;

    public static ReleaseAgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAgAccountResponse self = new ReleaseAgAccountResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAgAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseAgAccountResponse setBody(ReleaseAgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAgAccountResponseBody getBody() {
        return this.body;
    }

}
