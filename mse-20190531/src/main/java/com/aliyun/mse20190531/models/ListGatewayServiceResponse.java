// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayServiceResponseBody body;

    public static ListGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServiceResponse self = new ListGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayServiceResponse setBody(ListGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
