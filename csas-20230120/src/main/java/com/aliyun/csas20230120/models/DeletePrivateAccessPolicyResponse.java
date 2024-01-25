// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateAccessPolicyResponseBody body;

    public static DeletePrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessPolicyResponse self = new DeletePrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateAccessPolicyResponse setBody(DeletePrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
