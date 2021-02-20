// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebCacheSwitchResponseBody body;

    public static ModifyWebCacheSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheSwitchResponse self = new ModifyWebCacheSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCacheSwitchResponse setBody(ModifyWebCacheSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCacheSwitchResponseBody getBody() {
        return this.body;
    }

}
