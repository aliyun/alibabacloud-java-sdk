// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpcAttributeResponseBody body;

    public static ModifyVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAttributeResponse self = new ModifyVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcAttributeResponse setBody(ModifyVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
