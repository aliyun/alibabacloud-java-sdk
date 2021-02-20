// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableSceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSceneDefensePolicyResponseBody body;

    public static EnableSceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneDefensePolicyResponse self = new EnableSceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableSceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSceneDefensePolicyResponse setBody(EnableSceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
