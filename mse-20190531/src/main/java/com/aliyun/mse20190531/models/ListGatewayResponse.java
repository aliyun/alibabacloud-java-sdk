// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayResponseBody body;

    public static ListGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponse self = new ListGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayResponse setBody(ListGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayResponseBody getBody() {
        return this.body;
    }

}
