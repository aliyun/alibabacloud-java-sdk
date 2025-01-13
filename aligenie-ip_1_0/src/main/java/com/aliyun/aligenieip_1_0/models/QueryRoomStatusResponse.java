// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryRoomStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRoomStatusResponseBody body;

    public static QueryRoomStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRoomStatusResponse self = new QueryRoomStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryRoomStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRoomStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRoomStatusResponse setBody(QueryRoomStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRoomStatusResponseBody getBody() {
        return this.body;
    }

}
