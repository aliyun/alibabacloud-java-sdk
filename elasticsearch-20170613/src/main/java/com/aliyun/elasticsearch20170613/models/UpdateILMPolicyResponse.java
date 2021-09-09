// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateILMPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateILMPolicyResponseBody body;

    public static UpdateILMPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateILMPolicyResponse self = new UpdateILMPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateILMPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateILMPolicyResponse setBody(UpdateILMPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateILMPolicyResponseBody getBody() {
        return this.body;
    }

}
