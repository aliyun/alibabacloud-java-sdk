// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyAccessAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccessAttributeResponseBody body;

    public static ModifyAccessAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessAttributeResponse self = new ModifyAccessAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessAttributeResponse setBody(ModifyAccessAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessAttributeResponseBody getBody() {
        return this.body;
    }

}
