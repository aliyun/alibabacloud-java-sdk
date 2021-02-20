// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebAccessModeResponseBody body;

    public static ModifyWebAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAccessModeResponse self = new ModifyWebAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebAccessModeResponse setBody(ModifyWebAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebAccessModeResponseBody getBody() {
        return this.body;
    }

}
