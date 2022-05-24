// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePolicyInstanceResponseBody body;

    public static DeletePolicyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceResponse self = new DeletePolicyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyInstanceResponse setBody(DeletePolicyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyInstanceResponseBody getBody() {
        return this.body;
    }

}
