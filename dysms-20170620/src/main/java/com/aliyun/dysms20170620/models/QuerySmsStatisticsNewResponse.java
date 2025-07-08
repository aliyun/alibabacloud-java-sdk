// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsStatisticsNewResponseBody body;

    public static QuerySmsStatisticsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsNewResponse self = new QuerySmsStatisticsNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsStatisticsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsStatisticsNewResponse setBody(QuerySmsStatisticsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsNewResponseBody getBody() {
        return this.body;
    }

}
