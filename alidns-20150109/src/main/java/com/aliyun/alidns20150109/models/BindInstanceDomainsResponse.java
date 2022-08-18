// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindInstanceDomainsResponseBody body;

    public static BindInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsResponse self = new BindInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public BindInstanceDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindInstanceDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindInstanceDomainsResponse setBody(BindInstanceDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public BindInstanceDomainsResponseBody getBody() {
        return this.body;
    }

}
