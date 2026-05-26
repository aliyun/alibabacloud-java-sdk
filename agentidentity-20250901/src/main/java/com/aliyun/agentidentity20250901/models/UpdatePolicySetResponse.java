// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdatePolicySetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolicySetResponseBody body;

    public static UpdatePolicySetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicySetResponse self = new UpdatePolicySetResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolicySetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolicySetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolicySetResponse setBody(UpdatePolicySetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolicySetResponseBody getBody() {
        return this.body;
    }

}
