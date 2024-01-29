// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewaySlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewaySlbResponseBody body;

    public static DeleteGatewaySlbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySlbResponse self = new DeleteGatewaySlbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewaySlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewaySlbResponse setBody(DeleteGatewaySlbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewaySlbResponseBody getBody() {
        return this.body;
    }

}
