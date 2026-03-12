// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryBatchTaskDetailListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBatchTaskDetailListResponseBody body;

    public static QueryBatchTaskDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchTaskDetailListResponse self = new QueryBatchTaskDetailListResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchTaskDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBatchTaskDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBatchTaskDetailListResponse setBody(QueryBatchTaskDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBatchTaskDetailListResponseBody getBody() {
        return this.body;
    }

}
