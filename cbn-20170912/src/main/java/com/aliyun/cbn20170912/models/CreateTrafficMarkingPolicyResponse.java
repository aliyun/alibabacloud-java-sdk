// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrafficMarkingPolicyResponseBody body;

    public static CreateTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMarkingPolicyResponse self = new CreateTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrafficMarkingPolicyResponse setBody(CreateTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
