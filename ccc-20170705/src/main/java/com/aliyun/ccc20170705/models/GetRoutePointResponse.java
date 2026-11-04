// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRoutePointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutePointResponseBody body;

    public static GetRoutePointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutePointResponse self = new GetRoutePointResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutePointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutePointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutePointResponse setBody(GetRoutePointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutePointResponseBody getBody() {
        return this.body;
    }

}
