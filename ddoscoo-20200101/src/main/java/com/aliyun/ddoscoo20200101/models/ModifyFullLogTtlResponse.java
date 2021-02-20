// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyFullLogTtlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyFullLogTtlResponseBody body;

    public static ModifyFullLogTtlResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullLogTtlResponse self = new ModifyFullLogTtlResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFullLogTtlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFullLogTtlResponse setBody(ModifyFullLogTtlResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFullLogTtlResponseBody getBody() {
        return this.body;
    }

}
