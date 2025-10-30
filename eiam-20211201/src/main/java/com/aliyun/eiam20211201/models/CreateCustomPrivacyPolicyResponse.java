// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCustomPrivacyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomPrivacyPolicyResponseBody body;

    public static CreateCustomPrivacyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomPrivacyPolicyResponse self = new CreateCustomPrivacyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomPrivacyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomPrivacyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomPrivacyPolicyResponse setBody(CreateCustomPrivacyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomPrivacyPolicyResponseBody getBody() {
        return this.body;
    }

}
