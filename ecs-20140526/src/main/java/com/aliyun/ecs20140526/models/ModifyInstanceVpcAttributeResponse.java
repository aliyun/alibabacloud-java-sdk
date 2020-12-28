// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceVpcAttributeResponseBody body;

    public static ModifyInstanceVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeResponse self = new ModifyInstanceVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVpcAttributeResponse setBody(ModifyInstanceVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
