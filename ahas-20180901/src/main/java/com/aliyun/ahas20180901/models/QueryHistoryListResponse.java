// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHistoryListResponseBody body;

    public static QueryHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryListResponse self = new QueryHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoryListResponse setBody(QueryHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoryListResponseBody getBody() {
        return this.body;
    }

}
