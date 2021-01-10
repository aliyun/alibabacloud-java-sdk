// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BindWebHostingCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindWebHostingCustomDomainResponseBody body;

    public static BindWebHostingCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BindWebHostingCustomDomainResponse self = new BindWebHostingCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public BindWebHostingCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindWebHostingCustomDomainResponse setBody(BindWebHostingCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BindWebHostingCustomDomainResponseBody getBody() {
        return this.body;
    }

}
