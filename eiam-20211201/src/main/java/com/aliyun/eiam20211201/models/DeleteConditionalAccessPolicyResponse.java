// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteConditionalAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConditionalAccessPolicyResponseBody body;

    public static DeleteConditionalAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConditionalAccessPolicyResponse self = new DeleteConditionalAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConditionalAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConditionalAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConditionalAccessPolicyResponse setBody(DeleteConditionalAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConditionalAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
