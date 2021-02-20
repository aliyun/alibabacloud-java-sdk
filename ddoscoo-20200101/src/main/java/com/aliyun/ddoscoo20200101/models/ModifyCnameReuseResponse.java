// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyCnameReuseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCnameReuseResponseBody body;

    public static ModifyCnameReuseResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCnameReuseResponse self = new ModifyCnameReuseResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCnameReuseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCnameReuseResponse setBody(ModifyCnameReuseResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCnameReuseResponseBody getBody() {
        return this.body;
    }

}
