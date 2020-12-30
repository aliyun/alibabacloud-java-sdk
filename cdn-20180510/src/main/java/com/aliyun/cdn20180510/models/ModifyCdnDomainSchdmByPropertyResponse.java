// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCdnDomainSchdmByPropertyResponseBody body;

    public static ModifyCdnDomainSchdmByPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainSchdmByPropertyResponse self = new ModifyCdnDomainSchdmByPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainSchdmByPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdnDomainSchdmByPropertyResponse setBody(ModifyCdnDomainSchdmByPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdnDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

}
