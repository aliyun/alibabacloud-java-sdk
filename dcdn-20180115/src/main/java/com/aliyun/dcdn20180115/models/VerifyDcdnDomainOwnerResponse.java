// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class VerifyDcdnDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyDcdnDomainOwnerResponseBody body;

    public static VerifyDcdnDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDcdnDomainOwnerResponse self = new VerifyDcdnDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDcdnDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyDcdnDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyDcdnDomainOwnerResponse setBody(VerifyDcdnDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyDcdnDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
