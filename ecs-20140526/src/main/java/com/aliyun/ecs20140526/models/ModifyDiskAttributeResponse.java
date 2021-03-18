// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDiskAttributeResponseBody body;

    public static ModifyDiskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskAttributeResponse self = new ModifyDiskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskAttributeResponse setBody(ModifyDiskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskAttributeResponseBody getBody() {
        return this.body;
    }

}
