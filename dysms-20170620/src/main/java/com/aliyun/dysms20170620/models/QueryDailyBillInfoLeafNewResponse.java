// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDailyBillInfoLeafNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDailyBillInfoLeafNewResponseBody body;

    public static QueryDailyBillInfoLeafNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDailyBillInfoLeafNewResponse self = new QueryDailyBillInfoLeafNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryDailyBillInfoLeafNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDailyBillInfoLeafNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDailyBillInfoLeafNewResponse setBody(QueryDailyBillInfoLeafNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDailyBillInfoLeafNewResponseBody getBody() {
        return this.body;
    }

}
