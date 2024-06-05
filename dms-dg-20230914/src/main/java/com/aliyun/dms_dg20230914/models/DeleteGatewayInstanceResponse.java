// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class DeleteGatewayInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayInstanceResponseBody body;

    public static DeleteGatewayInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayInstanceResponse self = new DeleteGatewayInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayInstanceResponse setBody(DeleteGatewayInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayInstanceResponseBody getBody() {
        return this.body;
    }

}
