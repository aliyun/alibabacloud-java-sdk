// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayWebsocketEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayWebsocketEventsResponseBody body;

    public static ListGatewayWebsocketEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayWebsocketEventsResponse self = new ListGatewayWebsocketEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayWebsocketEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayWebsocketEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayWebsocketEventsResponse setBody(ListGatewayWebsocketEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayWebsocketEventsResponseBody getBody() {
        return this.body;
    }

}
