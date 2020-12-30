// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCdnDomainResponseBody body;

    public static ModifyCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainResponse self = new ModifyCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdnDomainResponse setBody(ModifyCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdnDomainResponseBody getBody() {
        return this.body;
    }

}
