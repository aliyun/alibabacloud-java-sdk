// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebCacheModeResponseBody body;

    public static ModifyWebCacheModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheModeResponse self = new ModifyWebCacheModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCacheModeResponse setBody(ModifyWebCacheModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCacheModeResponseBody getBody() {
        return this.body;
    }

}
