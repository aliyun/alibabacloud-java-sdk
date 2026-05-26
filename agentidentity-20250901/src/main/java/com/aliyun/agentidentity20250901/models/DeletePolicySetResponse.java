// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeletePolicySetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicySetResponseBody body;

    public static DeletePolicySetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicySetResponse self = new DeletePolicySetResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicySetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicySetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicySetResponse setBody(DeletePolicySetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicySetResponseBody getBody() {
        return this.body;
    }

}
