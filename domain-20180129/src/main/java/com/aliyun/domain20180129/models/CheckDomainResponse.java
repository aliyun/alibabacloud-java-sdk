// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDomainResponseBody body;

    public static CheckDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponse self = new CheckDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDomainResponse setBody(CheckDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDomainResponseBody getBody() {
        return this.body;
    }

}
