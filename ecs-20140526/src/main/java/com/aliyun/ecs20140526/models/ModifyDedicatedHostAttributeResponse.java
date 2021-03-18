// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDedicatedHostAttributeResponseBody body;

    public static ModifyDedicatedHostAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeResponse self = new ModifyDedicatedHostAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostAttributeResponse setBody(ModifyDedicatedHostAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostAttributeResponseBody getBody() {
        return this.body;
    }

}
