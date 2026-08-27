// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayErrorAccessLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayErrorAccessLogsResponseBody body;

    public static ListGatewayErrorAccessLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayErrorAccessLogsResponse self = new ListGatewayErrorAccessLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayErrorAccessLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayErrorAccessLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayErrorAccessLogsResponse setBody(ListGatewayErrorAccessLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayErrorAccessLogsResponseBody getBody() {
        return this.body;
    }

}
