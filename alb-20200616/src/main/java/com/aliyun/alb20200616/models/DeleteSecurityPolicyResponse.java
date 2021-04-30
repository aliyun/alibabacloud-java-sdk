// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteSecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSecurityPolicyResponseBody body;

    public static DeleteSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityPolicyResponse self = new DeleteSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityPolicyResponse setBody(DeleteSecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
