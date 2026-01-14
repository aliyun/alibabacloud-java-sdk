// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayAuthResponseBody body;

    public static ListGatewayAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthResponse self = new ListGatewayAuthResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayAuthResponse setBody(ListGatewayAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayAuthResponseBody getBody() {
        return this.body;
    }

}
