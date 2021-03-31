// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecurityGroupAttributeResponseBody body;

    public static ModifySecurityGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupAttributeResponse self = new ModifySecurityGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupAttributeResponse setBody(ModifySecurityGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
