// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderSyncJobResponseBody body;

    public static GetIdentityProviderSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSyncJobResponse self = new GetIdentityProviderSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderSyncJobResponse setBody(GetIdentityProviderSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderSyncJobResponseBody getBody() {
        return this.body;
    }

}
