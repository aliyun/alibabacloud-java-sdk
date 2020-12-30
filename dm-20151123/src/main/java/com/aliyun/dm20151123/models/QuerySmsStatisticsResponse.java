// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QuerySmsStatisticsResponse setBody(QuerySmsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsStatisticsResponseBody getBody() {
        return this.body;
    }

}
