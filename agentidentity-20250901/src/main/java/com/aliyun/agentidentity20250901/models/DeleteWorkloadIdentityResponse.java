// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteWorkloadIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkloadIdentityResponseBody body;

    public static DeleteWorkloadIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkloadIdentityResponse self = new DeleteWorkloadIdentityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkloadIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkloadIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkloadIdentityResponse setBody(DeleteWorkloadIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkloadIdentityResponseBody getBody() {
        return this.body;
    }

}
