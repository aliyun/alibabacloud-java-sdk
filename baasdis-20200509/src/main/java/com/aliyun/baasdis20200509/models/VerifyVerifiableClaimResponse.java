// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class VerifyVerifiableClaimResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyVerifiableClaimResponseBody body;

    public static VerifyVerifiableClaimResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyVerifiableClaimResponse self = new VerifyVerifiableClaimResponse();
        return TeaModel.build(map, self);
    }

    public VerifyVerifiableClaimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyVerifiableClaimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyVerifiableClaimResponse setBody(VerifyVerifiableClaimResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyVerifiableClaimResponseBody getBody() {
        return this.body;
    }

}
