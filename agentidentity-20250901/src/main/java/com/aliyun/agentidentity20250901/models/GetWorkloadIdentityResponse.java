// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetWorkloadIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkloadIdentityResponseBody body;

    public static GetWorkloadIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadIdentityResponse self = new GetWorkloadIdentityResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkloadIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkloadIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkloadIdentityResponse setBody(GetWorkloadIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkloadIdentityResponseBody getBody() {
        return this.body;
    }

}
