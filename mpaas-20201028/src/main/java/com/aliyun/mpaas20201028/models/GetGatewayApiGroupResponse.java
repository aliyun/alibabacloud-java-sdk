// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetGatewayApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayApiGroupResponseBody body;

    public static GetGatewayApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayApiGroupResponse self = new GetGatewayApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayApiGroupResponse setBody(GetGatewayApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayApiGroupResponseBody getBody() {
        return this.body;
    }

}
