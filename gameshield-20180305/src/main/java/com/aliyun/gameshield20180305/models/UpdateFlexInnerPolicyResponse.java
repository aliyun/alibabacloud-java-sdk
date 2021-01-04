// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexInnerPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexInnerPolicyResponseBody body;

    public static UpdateFlexInnerPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexInnerPolicyResponse self = new UpdateFlexInnerPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexInnerPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexInnerPolicyResponse setBody(UpdateFlexInnerPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexInnerPolicyResponseBody getBody() {
        return this.body;
    }

}
