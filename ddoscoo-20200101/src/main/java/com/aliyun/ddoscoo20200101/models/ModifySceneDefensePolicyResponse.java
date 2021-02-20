// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySceneDefensePolicyResponseBody body;

    public static ModifySceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneDefensePolicyResponse self = new ModifySceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySceneDefensePolicyResponse setBody(ModifySceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
