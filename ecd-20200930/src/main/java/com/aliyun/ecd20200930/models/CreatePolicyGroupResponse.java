// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePolicyGroupResponseBody body;

    public static CreatePolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupResponse self = new CreatePolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyGroupResponse setBody(CreatePolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyGroupResponseBody getBody() {
        return this.body;
    }

}
