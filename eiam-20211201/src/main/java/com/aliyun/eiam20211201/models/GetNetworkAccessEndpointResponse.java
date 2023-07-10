// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetNetworkAccessEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNetworkAccessEndpointResponseBody body;

    public static GetNetworkAccessEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkAccessEndpointResponse self = new GetNetworkAccessEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkAccessEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkAccessEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkAccessEndpointResponse setBody(GetNetworkAccessEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkAccessEndpointResponseBody getBody() {
        return this.body;
    }

}
