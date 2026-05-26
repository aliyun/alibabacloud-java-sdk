// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicySetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicySetResponseBody body;

    public static GetPolicySetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicySetResponse self = new GetPolicySetResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicySetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicySetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicySetResponse setBody(GetPolicySetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicySetResponseBody getBody() {
        return this.body;
    }

}
