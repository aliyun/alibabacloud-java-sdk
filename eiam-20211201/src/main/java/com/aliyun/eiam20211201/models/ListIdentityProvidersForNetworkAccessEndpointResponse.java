// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersForNetworkAccessEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdentityProvidersForNetworkAccessEndpointResponseBody body;

    public static ListIdentityProvidersForNetworkAccessEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersForNetworkAccessEndpointResponse self = new ListIdentityProvidersForNetworkAccessEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentityProvidersForNetworkAccessEndpointResponse setBody(ListIdentityProvidersForNetworkAccessEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdentityProvidersForNetworkAccessEndpointResponseBody getBody() {
        return this.body;
    }

}
