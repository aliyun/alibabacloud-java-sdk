// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyDomainOwnerResponseBody body;

    public static VerifyDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerResponse self = new VerifyDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyDomainOwnerResponse setBody(VerifyDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
