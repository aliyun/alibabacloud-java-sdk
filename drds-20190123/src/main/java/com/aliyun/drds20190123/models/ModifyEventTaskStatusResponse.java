// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyEventTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEventTaskStatusResponseBody body;

    public static ModifyEventTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventTaskStatusResponse self = new ModifyEventTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEventTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEventTaskStatusResponse setBody(ModifyEventTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEventTaskStatusResponseBody getBody() {
        return this.body;
    }

}
