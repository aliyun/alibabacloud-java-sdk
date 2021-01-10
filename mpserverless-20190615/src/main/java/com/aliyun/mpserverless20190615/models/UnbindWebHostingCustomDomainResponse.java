// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UnbindWebHostingCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UnbindWebHostingCustomDomainResponse setBody(UnbindWebHostingCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindWebHostingCustomDomainResponseBody getBody() {
        return this.body;
    }

}
