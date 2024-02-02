// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLoRaJoinPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLoRaJoinPermissionsResponseBody body;

    public static QueryLoRaJoinPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoRaJoinPermissionsResponse self = new QueryLoRaJoinPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoRaJoinPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLoRaJoinPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLoRaJoinPermissionsResponse setBody(QueryLoRaJoinPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLoRaJoinPermissionsResponseBody getBody() {
        return this.body;
    }

}
