// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindInstanceDomainsResponseBody body;

    public static UnbindInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsResponse self = new UnbindInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public UnbindInstanceDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindInstanceDomainsResponse setBody(UnbindInstanceDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindInstanceDomainsResponseBody getBody() {
        return this.body;
    }

}
