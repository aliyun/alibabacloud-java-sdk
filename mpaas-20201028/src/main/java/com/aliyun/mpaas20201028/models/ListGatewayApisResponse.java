// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListGatewayApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayApisResponseBody body;

    public static ListGatewayApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayApisResponse self = new ListGatewayApisResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayApisResponse setBody(ListGatewayApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayApisResponseBody getBody() {
        return this.body;
    }

}
