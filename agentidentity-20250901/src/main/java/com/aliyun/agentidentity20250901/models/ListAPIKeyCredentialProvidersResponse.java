// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListAPIKeyCredentialProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAPIKeyCredentialProvidersResponseBody body;

    public static ListAPIKeyCredentialProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAPIKeyCredentialProvidersResponse self = new ListAPIKeyCredentialProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListAPIKeyCredentialProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAPIKeyCredentialProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAPIKeyCredentialProvidersResponse setBody(ListAPIKeyCredentialProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAPIKeyCredentialProvidersResponseBody getBody() {
        return this.body;
    }

}
