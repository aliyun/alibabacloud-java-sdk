// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNetworkInterfaceAttributeResponseBody body;

    public static ModifyNetworkInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkInterfaceAttributeResponse self = new ModifyNetworkInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkInterfaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkInterfaceAttributeResponse setBody(ModifyNetworkInterfaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkInterfaceAttributeResponseBody getBody() {
        return this.body;
    }

}
