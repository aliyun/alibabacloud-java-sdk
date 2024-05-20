// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateAdvancedPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdvancedPolicyResponseBody body;

    public static CreateAdvancedPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedPolicyResponse self = new CreateAdvancedPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdvancedPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdvancedPolicyResponse setBody(CreateAdvancedPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdvancedPolicyResponseBody getBody() {
        return this.body;
    }

}
