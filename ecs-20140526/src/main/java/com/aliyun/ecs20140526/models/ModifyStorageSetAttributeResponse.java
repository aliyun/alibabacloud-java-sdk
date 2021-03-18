// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageSetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyStorageSetAttributeResponseBody body;

    public static ModifyStorageSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageSetAttributeResponse self = new ModifyStorageSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageSetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStorageSetAttributeResponse setBody(ModifyStorageSetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStorageSetAttributeResponseBody getBody() {
        return this.body;
    }

}
