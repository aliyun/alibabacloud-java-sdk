// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdentityProviderSyncJobResponseBody body;

    public static CreateIdentityProviderSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderSyncJobResponse self = new CreateIdentityProviderSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdentityProviderSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdentityProviderSyncJobResponse setBody(CreateIdentityProviderSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdentityProviderSyncJobResponseBody getBody() {
        return this.body;
    }

}
