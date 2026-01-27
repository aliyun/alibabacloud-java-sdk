// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoRepairPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoRepairPolicyResponseBody body;

    public static CreateAutoRepairPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoRepairPolicyResponse self = new CreateAutoRepairPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoRepairPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoRepairPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoRepairPolicyResponse setBody(CreateAutoRepairPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoRepairPolicyResponseBody getBody() {
        return this.body;
    }

}
