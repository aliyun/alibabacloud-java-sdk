// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateWorkloadIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkloadIdentityResponseBody body;

    public static CreateWorkloadIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkloadIdentityResponse self = new CreateWorkloadIdentityResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkloadIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkloadIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkloadIdentityResponse setBody(CreateWorkloadIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkloadIdentityResponseBody getBody() {
        return this.body;
    }

}
