// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHttp2EnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHttp2EnableResponseBody body;

    public static ModifyHttp2EnableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHttp2EnableResponse self = new ModifyHttp2EnableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHttp2EnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHttp2EnableResponse setBody(ModifyHttp2EnableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHttp2EnableResponseBody getBody() {
        return this.body;
    }

}
