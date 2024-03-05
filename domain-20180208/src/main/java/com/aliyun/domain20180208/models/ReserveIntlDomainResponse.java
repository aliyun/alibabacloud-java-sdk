// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ReserveIntlDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReserveIntlDomainResponseBody body;

    public static ReserveIntlDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ReserveIntlDomainResponse self = new ReserveIntlDomainResponse();
        return TeaModel.build(map, self);
    }

    public ReserveIntlDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReserveIntlDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReserveIntlDomainResponse setBody(ReserveIntlDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ReserveIntlDomainResponseBody getBody() {
        return this.body;
    }

}
