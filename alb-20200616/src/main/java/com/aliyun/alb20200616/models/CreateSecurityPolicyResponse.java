// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSecurityPolicyResponseBody body;

    public static CreateSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityPolicyResponse self = new CreateSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityPolicyResponse setBody(CreateSecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
