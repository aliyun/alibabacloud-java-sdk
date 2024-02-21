// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStopGatewayResponseBody body;

    public static DeleteStopGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStopGatewayResponse self = new DeleteStopGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStopGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStopGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStopGatewayResponse setBody(DeleteStopGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStopGatewayResponseBody getBody() {
        return this.body;
    }

}
