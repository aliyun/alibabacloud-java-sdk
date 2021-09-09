// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWhiteIpsResponseBody body;

    public static ModifyWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteIpsResponse self = new ModifyWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWhiteIpsResponse setBody(ModifyWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
