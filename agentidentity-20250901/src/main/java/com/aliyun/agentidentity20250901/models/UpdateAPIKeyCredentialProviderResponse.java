// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateAPIKeyCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAPIKeyCredentialProviderResponseBody body;

    public static UpdateAPIKeyCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAPIKeyCredentialProviderResponse self = new UpdateAPIKeyCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAPIKeyCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAPIKeyCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAPIKeyCredentialProviderResponse setBody(UpdateAPIKeyCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAPIKeyCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
