// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateProtectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProtectionPolicyResponseBody body;

    public static CreateProtectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionPolicyResponse self = new CreateProtectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateProtectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProtectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProtectionPolicyResponse setBody(CreateProtectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProtectionPolicyResponseBody getBody() {
        return this.body;
    }

}
