// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCasterLayoutResponseBody body;

    public static ModifyCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterLayoutResponse self = new ModifyCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCasterLayoutResponse setBody(ModifyCasterLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterLayoutResponseBody getBody() {
        return this.body;
    }

}
