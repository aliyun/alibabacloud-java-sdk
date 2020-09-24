// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdatePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePolicyResponseBody body;

    public static UpdatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyResponse self = new UpdatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolicyResponse setBody(UpdatePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolicyResponseBody getBody() {
        return this.body;
    }

}
