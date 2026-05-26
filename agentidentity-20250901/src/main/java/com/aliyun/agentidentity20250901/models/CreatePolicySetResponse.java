// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicySetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolicySetResponseBody body;

    public static CreatePolicySetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicySetResponse self = new CreatePolicySetResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicySetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicySetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolicySetResponse setBody(CreatePolicySetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicySetResponseBody getBody() {
        return this.body;
    }

}
