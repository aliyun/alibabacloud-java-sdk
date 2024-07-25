// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayRoutesResponseBody body;

    public static ListGatewayRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRoutesResponse self = new ListGatewayRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayRoutesResponse setBody(ListGatewayRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayRoutesResponseBody getBody() {
        return this.body;
    }

}
