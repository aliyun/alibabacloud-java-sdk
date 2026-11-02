// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteGatewayApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayApiGroupResponseBody body;

    public static DeleteGatewayApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayApiGroupResponse self = new DeleteGatewayApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayApiGroupResponse setBody(DeleteGatewayApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayApiGroupResponseBody getBody() {
        return this.body;
    }

}
