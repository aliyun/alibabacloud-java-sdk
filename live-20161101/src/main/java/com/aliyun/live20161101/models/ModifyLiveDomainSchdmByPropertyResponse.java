// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLiveDomainSchdmByPropertyResponseBody body;

    public static ModifyLiveDomainSchdmByPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveDomainSchdmByPropertyResponse self = new ModifyLiveDomainSchdmByPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveDomainSchdmByPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveDomainSchdmByPropertyResponse setBody(ModifyLiveDomainSchdmByPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

}
