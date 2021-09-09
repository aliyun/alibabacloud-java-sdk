// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteILMPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteILMPolicyResponseBody body;

    public static DeleteILMPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteILMPolicyResponse self = new DeleteILMPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteILMPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteILMPolicyResponse setBody(DeleteILMPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteILMPolicyResponseBody getBody() {
        return this.body;
    }

}
