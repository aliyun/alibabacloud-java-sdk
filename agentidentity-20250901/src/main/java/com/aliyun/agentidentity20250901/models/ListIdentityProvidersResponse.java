// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdentityProvidersResponseBody body;

    public static ListIdentityProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersResponse self = new ListIdentityProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentityProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentityProvidersResponse setBody(ListIdentityProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdentityProvidersResponseBody getBody() {
        return this.body;
    }

}
