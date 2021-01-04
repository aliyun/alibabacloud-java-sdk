// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLifecyclePolicyResponseBody body;

    public static CreateLifecyclePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecyclePolicyResponse self = new CreateLifecyclePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateLifecyclePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLifecyclePolicyResponse setBody(CreateLifecyclePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLifecyclePolicyResponseBody getBody() {
        return this.body;
    }

}
