// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreatePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolicyResponseBody body;

    public static CreatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponse self = new CreatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolicyResponse setBody(CreatePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyResponseBody getBody() {
        return this.body;
    }

}
