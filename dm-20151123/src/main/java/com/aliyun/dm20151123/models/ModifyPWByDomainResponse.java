// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyPWByDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPWByDomainResponseBody body;

    public static ModifyPWByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPWByDomainResponse self = new ModifyPWByDomainResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPWByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPWByDomainResponse setBody(ModifyPWByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPWByDomainResponseBody getBody() {
        return this.body;
    }

}
