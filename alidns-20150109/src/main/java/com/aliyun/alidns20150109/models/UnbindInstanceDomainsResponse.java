// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UnbindInstanceDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindInstanceDomainsResponse setBody(UnbindInstanceDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindInstanceDomainsResponseBody getBody() {
        return this.body;
    }

}
