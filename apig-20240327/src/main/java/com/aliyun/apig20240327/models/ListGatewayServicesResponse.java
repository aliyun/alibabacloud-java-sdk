// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayServicesResponseBody body;

    public static ListGatewayServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServicesResponse self = new ListGatewayServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayServicesResponse setBody(ListGatewayServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayServicesResponseBody getBody() {
        return this.body;
    }

}
