// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateGatewayApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayApiGroupResponseBody body;

    public static UpdateGatewayApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayApiGroupResponse self = new UpdateGatewayApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayApiGroupResponse setBody(UpdateGatewayApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayApiGroupResponseBody getBody() {
        return this.body;
    }

}
