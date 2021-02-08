// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsCacheDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddDnsCacheDomainResponse setBody(AddDnsCacheDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsCacheDomainResponseBody getBody() {
        return this.body;
    }

}
