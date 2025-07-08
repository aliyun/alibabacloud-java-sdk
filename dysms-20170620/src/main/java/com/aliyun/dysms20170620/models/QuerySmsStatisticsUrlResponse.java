// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStatisticsUrlResponseBody body;

    public static QuerySmsStatisticsUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsUrlResponse self = new QuerySmsStatisticsUrlResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStatisticsUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStatisticsUrlResponse setBody(QuerySmsStatisticsUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsUrlResponseBody getBody() {
        return this.body;
    }

}
