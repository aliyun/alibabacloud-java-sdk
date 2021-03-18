// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHpcClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHpcClusterAttributeResponseBody body;

    public static ModifyHpcClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHpcClusterAttributeResponse self = new ModifyHpcClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHpcClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHpcClusterAttributeResponse setBody(ModifyHpcClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHpcClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
