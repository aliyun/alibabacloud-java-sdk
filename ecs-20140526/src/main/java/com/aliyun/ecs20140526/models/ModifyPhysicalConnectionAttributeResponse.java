// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPhysicalConnectionAttributeResponseBody body;

    public static ModifyPhysicalConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeResponse self = new ModifyPhysicalConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPhysicalConnectionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPhysicalConnectionAttributeResponse setBody(ModifyPhysicalConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPhysicalConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
