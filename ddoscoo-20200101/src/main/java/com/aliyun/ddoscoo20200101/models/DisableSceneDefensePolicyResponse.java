// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableSceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSceneDefensePolicyResponseBody body;

    public static DisableSceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneDefensePolicyResponse self = new DisableSceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableSceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSceneDefensePolicyResponse setBody(DisableSceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
