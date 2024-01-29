// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsCacheDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDnsCacheDomainResponseBody body;

    public static AddDnsCacheDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsCacheDomainResponse self = new AddDnsCacheDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsCacheDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnsCacheDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDnsCacheDomainResponse setBody(AddDnsCacheDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsCacheDomainResponseBody getBody() {
        return this.body;
    }

}
