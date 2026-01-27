// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAutoRepairPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoRepairPolicyResponseBody body;

    public static DeleteAutoRepairPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoRepairPolicyResponse self = new DeleteAutoRepairPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoRepairPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoRepairPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoRepairPolicyResponse setBody(DeleteAutoRepairPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoRepairPolicyResponseBody getBody() {
        return this.body;
    }

}
