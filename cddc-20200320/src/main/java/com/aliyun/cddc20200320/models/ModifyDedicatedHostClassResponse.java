// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostClassResponseBody body;

    public static ModifyDedicatedHostClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClassResponse self = new ModifyDedicatedHostClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostClassResponse setBody(ModifyDedicatedHostClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostClassResponseBody getBody() {
        return this.body;
    }

}
