// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTaskInfoHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTaskInfoHistoryResponseBody body;

    public static QueryTaskInfoHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoHistoryResponse self = new QueryTaskInfoHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskInfoHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskInfoHistoryResponse setBody(QueryTaskInfoHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskInfoHistoryResponseBody getBody() {
        return this.body;
    }

}
