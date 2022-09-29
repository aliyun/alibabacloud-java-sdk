// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomControlDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRoomControlDevicesResponseBody body;

    public static QueryRoomControlDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomControlDevicesResponse self = new QueryRoomControlDevicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRoomControlDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRoomControlDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRoomControlDevicesResponse setBody(QueryRoomControlDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRoomControlDevicesResponseBody getBody() {
        return this.body;
    }

}
