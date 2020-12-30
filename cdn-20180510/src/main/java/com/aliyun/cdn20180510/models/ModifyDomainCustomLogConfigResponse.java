// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyDomainCustomLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDomainCustomLogConfigResponseBody body;

    public static ModifyDomainCustomLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainCustomLogConfigResponse self = new ModifyDomainCustomLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainCustomLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainCustomLogConfigResponse setBody(ModifyDomainCustomLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainCustomLogConfigResponseBody getBody() {
        return this.body;
    }

}
