// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLifecyclePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLifecyclePolicyResponseBody body;

    public static ModifyLifecyclePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLifecyclePolicyResponse self = new ModifyLifecyclePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLifecyclePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLifecyclePolicyResponse setBody(ModifyLifecyclePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLifecyclePolicyResponseBody getBody() {
        return this.body;
    }

}
