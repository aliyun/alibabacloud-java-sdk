// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRegistrationPolicyResponseBody body;

    public static CreateRegistrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistrationPolicyResponse self = new CreateRegistrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateRegistrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRegistrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRegistrationPolicyResponse setBody(CreateRegistrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRegistrationPolicyResponseBody getBody() {
        return this.body;
    }

}
