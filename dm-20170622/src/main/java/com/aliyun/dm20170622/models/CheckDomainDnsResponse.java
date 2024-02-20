// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class CheckDomainDnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDomainDnsResponseBody body;

    public static CheckDomainDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainDnsResponse self = new CheckDomainDnsResponse();
        return TeaModel.build(map, self);
    }

    public CheckDomainDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDomainDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDomainDnsResponse setBody(CheckDomainDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDomainDnsResponseBody getBody() {
        return this.body;
    }

}
