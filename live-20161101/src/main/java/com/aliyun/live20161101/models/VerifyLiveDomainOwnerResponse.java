// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class VerifyLiveDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyLiveDomainOwnerResponseBody body;

    public static VerifyLiveDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyLiveDomainOwnerResponse self = new VerifyLiveDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyLiveDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyLiveDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyLiveDomainOwnerResponse setBody(VerifyLiveDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyLiveDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
