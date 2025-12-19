// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetAPIKeyCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAPIKeyCredentialProviderResponseBody body;

    public static GetAPIKeyCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAPIKeyCredentialProviderResponse self = new GetAPIKeyCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetAPIKeyCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAPIKeyCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAPIKeyCredentialProviderResponse setBody(GetAPIKeyCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAPIKeyCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
