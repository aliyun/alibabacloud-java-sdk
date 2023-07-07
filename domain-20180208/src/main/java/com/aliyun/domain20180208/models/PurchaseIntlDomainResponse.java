// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class PurchaseIntlDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PurchaseIntlDomainResponseBody body;

    public static PurchaseIntlDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseIntlDomainResponse self = new PurchaseIntlDomainResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseIntlDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseIntlDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurchaseIntlDomainResponse setBody(PurchaseIntlDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseIntlDomainResponseBody getBody() {
        return this.body;
    }

}
