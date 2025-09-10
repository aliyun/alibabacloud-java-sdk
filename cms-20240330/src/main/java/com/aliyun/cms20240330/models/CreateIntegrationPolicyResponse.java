// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateIntegrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntegrationPolicyResponseBody body;

    public static CreateIntegrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationPolicyResponse self = new CreateIntegrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntegrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntegrationPolicyResponse setBody(CreateIntegrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntegrationPolicyResponseBody getBody() {
        return this.body;
    }

}
