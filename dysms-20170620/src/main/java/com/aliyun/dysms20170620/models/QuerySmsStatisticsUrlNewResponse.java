// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsUrlNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStatisticsUrlNewResponseBody body;

    public static QuerySmsStatisticsUrlNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsUrlNewResponse self = new QuerySmsStatisticsUrlNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsUrlNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStatisticsUrlNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStatisticsUrlNewResponse setBody(QuerySmsStatisticsUrlNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsUrlNewResponseBody getBody() {
        return this.body;
    }

}
