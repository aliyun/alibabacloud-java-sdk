// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostAutoRenewAttributeResponseBody body;

    public static ModifyDedicatedHostAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoRenewAttributeResponse self = new ModifyDedicatedHostAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse setBody(ModifyDedicatedHostAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
