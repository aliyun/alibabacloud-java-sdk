// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSceneDefensePolicyResponseBody body;

    public static CreateSceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneDefensePolicyResponse self = new CreateSceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneDefensePolicyResponse setBody(CreateSceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
