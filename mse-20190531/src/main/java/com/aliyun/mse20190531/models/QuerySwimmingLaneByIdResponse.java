// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySwimmingLaneByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySwimmingLaneByIdResponseBody body;

    public static QuerySwimmingLaneByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySwimmingLaneByIdResponse self = new QuerySwimmingLaneByIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySwimmingLaneByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySwimmingLaneByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySwimmingLaneByIdResponse setBody(QuerySwimmingLaneByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySwimmingLaneByIdResponseBody getBody() {
        return this.body;
    }

}
