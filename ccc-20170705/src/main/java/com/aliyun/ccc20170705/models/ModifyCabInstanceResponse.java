// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyCabInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCabInstanceResponseBody body;

    public static ModifyCabInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCabInstanceResponse self = new ModifyCabInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCabInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCabInstanceResponse setBody(ModifyCabInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCabInstanceResponseBody getBody() {
        return this.body;
    }

}
