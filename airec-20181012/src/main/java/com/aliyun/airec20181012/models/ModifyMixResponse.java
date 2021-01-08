// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyMixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMixResponseBody body;

    public static ModifyMixResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMixResponse self = new ModifyMixResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMixResponse setBody(ModifyMixResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMixResponseBody getBody() {
        return this.body;
    }

}
