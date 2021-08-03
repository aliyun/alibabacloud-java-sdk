// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDesktopSpecResponseBody body;

    public static ModifyDesktopSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopSpecResponse self = new ModifyDesktopSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopSpecResponse setBody(ModifyDesktopSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopSpecResponseBody getBody() {
        return this.body;
    }

}
