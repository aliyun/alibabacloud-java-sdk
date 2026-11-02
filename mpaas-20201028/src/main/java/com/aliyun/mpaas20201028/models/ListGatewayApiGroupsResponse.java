// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListGatewayApiGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayApiGroupsResponseBody body;

    public static ListGatewayApiGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayApiGroupsResponse self = new ListGatewayApiGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayApiGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayApiGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayApiGroupsResponse setBody(ListGatewayApiGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayApiGroupsResponseBody getBody() {
        return this.body;
    }

}
