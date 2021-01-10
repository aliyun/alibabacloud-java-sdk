// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryJobStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryJobStatisticsResponseBody body;

    public static QueryJobStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobStatisticsResponse self = new QueryJobStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobStatisticsResponse setBody(QueryJobStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobStatisticsResponseBody getBody() {
        return this.body;
    }

}
