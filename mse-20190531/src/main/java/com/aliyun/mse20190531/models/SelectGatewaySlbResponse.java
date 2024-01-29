// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class SelectGatewaySlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectGatewaySlbResponseBody body;

    public static SelectGatewaySlbResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectGatewaySlbResponse self = new SelectGatewaySlbResponse();
        return TeaModel.build(map, self);
    }

    public SelectGatewaySlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectGatewaySlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectGatewaySlbResponse setBody(SelectGatewaySlbResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectGatewaySlbResponseBody getBody() {
        return this.body;
    }

}
