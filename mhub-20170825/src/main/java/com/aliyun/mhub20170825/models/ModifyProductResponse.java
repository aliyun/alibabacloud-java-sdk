// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyProductResponseBody body;

    public static ModifyProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProductResponse self = new ModifyProductResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProductResponse setBody(ModifyProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProductResponseBody getBody() {
        return this.body;
    }

}
