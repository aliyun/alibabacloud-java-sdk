// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryActiveUserCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHistoryActiveUserCountResponseBody body;

    public static QueryHistoryActiveUserCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryActiveUserCountResponse self = new QueryHistoryActiveUserCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoryActiveUserCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoryActiveUserCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoryActiveUserCountResponse setBody(QueryHistoryActiveUserCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoryActiveUserCountResponseBody getBody() {
        return this.body;
    }

}
