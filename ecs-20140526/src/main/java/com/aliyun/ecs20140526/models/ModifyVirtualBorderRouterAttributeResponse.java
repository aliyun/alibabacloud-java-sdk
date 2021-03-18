// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVirtualBorderRouterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVirtualBorderRouterAttributeResponseBody body;

    public static ModifyVirtualBorderRouterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBorderRouterAttributeResponse self = new ModifyVirtualBorderRouterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBorderRouterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualBorderRouterAttributeResponse setBody(ModifyVirtualBorderRouterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualBorderRouterAttributeResponseBody getBody() {
        return this.body;
    }

}
