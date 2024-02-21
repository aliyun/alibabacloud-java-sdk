// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateILMPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateILMPolicyResponseBody body;

    public static CreateILMPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateILMPolicyResponse self = new CreateILMPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateILMPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateILMPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateILMPolicyResponse setBody(CreateILMPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateILMPolicyResponseBody getBody() {
        return this.body;
    }

}
