// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySmsSignResponseBody body;

    public static ModifySmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsSignResponse self = new ModifySmsSignResponse();
        return TeaModel.build(map, self);
    }

    public ModifySmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySmsSignResponse setBody(ModifySmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySmsSignResponseBody getBody() {
        return this.body;
    }

}
