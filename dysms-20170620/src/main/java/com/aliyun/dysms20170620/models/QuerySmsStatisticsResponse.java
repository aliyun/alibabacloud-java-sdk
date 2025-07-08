// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStatisticsResponseBody body;

    public static QuerySmsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsResponse self = new QuerySmsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStatisticsResponse setBody(QuerySmsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsResponseBody getBody() {
        return this.body;
    }

}
