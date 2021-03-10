// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLoRaJoinPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryLoRaJoinPermissionsResponse setBody(QueryLoRaJoinPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLoRaJoinPermissionsResponseBody getBody() {
        return this.body;
    }

}
