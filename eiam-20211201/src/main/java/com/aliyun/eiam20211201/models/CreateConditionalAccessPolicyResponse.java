// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateConditionalAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConditionalAccessPolicyResponseBody body;

    public static CreateConditionalAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConditionalAccessPolicyResponse self = new CreateConditionalAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateConditionalAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConditionalAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConditionalAccessPolicyResponse setBody(CreateConditionalAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConditionalAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
