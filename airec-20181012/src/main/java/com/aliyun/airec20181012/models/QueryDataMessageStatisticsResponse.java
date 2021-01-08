// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryDataMessageStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDataMessageStatisticsResponseBody body;

    public static QueryDataMessageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageStatisticsResponse self = new QueryDataMessageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataMessageStatisticsResponse setBody(QueryDataMessageStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataMessageStatisticsResponseBody getBody() {
        return this.body;
    }

}
