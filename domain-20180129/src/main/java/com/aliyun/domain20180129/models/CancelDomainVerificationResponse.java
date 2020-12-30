// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelDomainVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelDomainVerificationResponseBody body;

    public static CancelDomainVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDomainVerificationResponse self = new CancelDomainVerificationResponse();
        return TeaModel.build(map, self);
    }

    public CancelDomainVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDomainVerificationResponse setBody(CancelDomainVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDomainVerificationResponseBody getBody() {
        return this.body;
    }

}
