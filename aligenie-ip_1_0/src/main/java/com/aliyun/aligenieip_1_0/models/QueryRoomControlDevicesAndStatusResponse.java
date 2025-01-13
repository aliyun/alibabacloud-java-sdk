// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomControlDevicesAndStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRoomControlDevicesAndStatusResponseBody body;

    public static QueryRoomControlDevicesAndStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomControlDevicesAndStatusResponse self = new QueryRoomControlDevicesAndStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryRoomControlDevicesAndStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRoomControlDevicesAndStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRoomControlDevicesAndStatusResponse setBody(QueryRoomControlDevicesAndStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRoomControlDevicesAndStatusResponseBody getBody() {
        return this.body;
    }

}
