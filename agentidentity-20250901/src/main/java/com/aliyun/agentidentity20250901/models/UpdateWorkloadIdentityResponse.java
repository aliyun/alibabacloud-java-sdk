// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateWorkloadIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkloadIdentityResponseBody body;

    public static UpdateWorkloadIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkloadIdentityResponse self = new UpdateWorkloadIdentityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkloadIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkloadIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkloadIdentityResponse setBody(UpdateWorkloadIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkloadIdentityResponseBody getBody() {
        return this.body;
    }

}
