// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrivateAccessPolicyResponseBody body;

    public static CreatePrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessPolicyResponse self = new CreatePrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivateAccessPolicyResponse setBody(CreatePrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
