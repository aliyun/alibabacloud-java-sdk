// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTaskDetailHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskDetailHistoryResponseBody body;

    public static QueryTaskDetailHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskDetailHistoryResponse self = new QueryTaskDetailHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskDetailHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskDetailHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskDetailHistoryResponse setBody(QueryTaskDetailHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskDetailHistoryResponseBody getBody() {
        return this.body;
    }

}
