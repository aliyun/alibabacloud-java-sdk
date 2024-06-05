// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class GetUserGatewayInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserGatewayInstancesResponseBody body;

    public static GetUserGatewayInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserGatewayInstancesResponse self = new GetUserGatewayInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetUserGatewayInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserGatewayInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserGatewayInstancesResponse setBody(GetUserGatewayInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserGatewayInstancesResponseBody getBody() {
        return this.body;
    }

}
