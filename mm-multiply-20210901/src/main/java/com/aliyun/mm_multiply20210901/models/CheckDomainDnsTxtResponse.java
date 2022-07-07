// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckDomainDnsTxtResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDomainDnsTxtResponseBody body;

    public static CheckDomainDnsTxtResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainDnsTxtResponse self = new CheckDomainDnsTxtResponse();
        return TeaModel.build(map, self);
    }

    public CheckDomainDnsTxtResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDomainDnsTxtResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDomainDnsTxtResponse setBody(CheckDomainDnsTxtResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDomainDnsTxtResponseBody getBody() {
        return this.body;
    }

}
