// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ReserveDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReserveDomainResponseBody body;

    public static ReserveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ReserveDomainResponse self = new ReserveDomainResponse();
        return TeaModel.build(map, self);
    }

    public ReserveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReserveDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReserveDomainResponse setBody(ReserveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ReserveDomainResponseBody getBody() {
        return this.body;
    }

}
