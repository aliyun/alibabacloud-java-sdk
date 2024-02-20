// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class DescDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescDomainResponseBody body;

    public static DescDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescDomainResponse self = new DescDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescDomainResponse setBody(DescDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescDomainResponseBody getBody() {
        return this.body;
    }

}
