// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetApiEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiEndpointsResponseBody body;

    public static GetApiEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiEndpointsResponse self = new GetApiEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public GetApiEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiEndpointsResponse setBody(GetApiEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiEndpointsResponseBody getBody() {
        return this.body;
    }

}
