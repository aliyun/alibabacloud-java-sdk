// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ChangeDomainOfDnsProductResponse setBody(ChangeDomainOfDnsProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDomainOfDnsProductResponseBody getBody() {
        return this.body;
    }

}
