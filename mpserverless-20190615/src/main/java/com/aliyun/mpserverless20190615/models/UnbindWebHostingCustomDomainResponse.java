// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UnbindWebHostingCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindWebHostingCustomDomainResponseBody body;

    public static UnbindWebHostingCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindWebHostingCustomDomainResponse self = new UnbindWebHostingCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public UnbindWebHostingCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindWebHostingCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindWebHostingCustomDomainResponse setBody(UnbindWebHostingCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindWebHostingCustomDomainResponseBody getBody() {
        return this.body;
    }

}
