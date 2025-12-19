// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class AssumeRoleForWorkloadIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeRoleForWorkloadIdentityResponseBody body;

    public static AssumeRoleForWorkloadIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleForWorkloadIdentityResponse self = new AssumeRoleForWorkloadIdentityResponse();
        return TeaModel.build(map, self);
    }

    public AssumeRoleForWorkloadIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeRoleForWorkloadIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeRoleForWorkloadIdentityResponse setBody(AssumeRoleForWorkloadIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeRoleForWorkloadIdentityResponseBody getBody() {
        return this.body;
    }

}
