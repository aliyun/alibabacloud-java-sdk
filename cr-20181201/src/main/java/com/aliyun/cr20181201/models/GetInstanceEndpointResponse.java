// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceEndpointResponseBody body;

    public static GetInstanceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceEndpointResponse self = new GetInstanceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceEndpointResponse setBody(GetInstanceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceEndpointResponseBody getBody() {
        return this.body;
    }

}
