// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeDomainOfDnsProductResponseBody body;

    public static ChangeDomainOfDnsProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductResponse self = new ChangeDomainOfDnsProductResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDomainOfDnsProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDomainOfDnsProductResponse setBody(ChangeDomainOfDnsProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDomainOfDnsProductResponseBody getBody() {
        return this.body;
    }

}
