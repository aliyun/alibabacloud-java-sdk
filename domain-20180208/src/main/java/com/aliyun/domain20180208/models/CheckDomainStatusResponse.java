// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckDomainStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDomainStatusResponseBody body;

    public static CheckDomainStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainStatusResponse self = new CheckDomainStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckDomainStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDomainStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDomainStatusResponse setBody(CheckDomainStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDomainStatusResponseBody getBody() {
        return this.body;
    }

}
