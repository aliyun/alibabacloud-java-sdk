// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicEndpointResponseBody body;

    public static GetBasicEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointResponse self = new GetBasicEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicEndpointResponse setBody(GetBasicEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicEndpointResponseBody getBody() {
        return this.body;
    }

}
