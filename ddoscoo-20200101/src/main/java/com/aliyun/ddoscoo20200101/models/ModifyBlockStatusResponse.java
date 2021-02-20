// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlockStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBlockStatusResponseBody body;

    public static ModifyBlockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlockStatusResponse self = new ModifyBlockStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBlockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBlockStatusResponse setBody(ModifyBlockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBlockStatusResponseBody getBody() {
        return this.body;
    }

}
