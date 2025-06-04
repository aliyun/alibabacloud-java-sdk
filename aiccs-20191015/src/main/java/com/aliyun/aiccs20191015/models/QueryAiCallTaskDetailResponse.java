// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAiCallTaskDetailResponseBody body;

    public static QueryAiCallTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallTaskDetailResponse self = new QueryAiCallTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiCallTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiCallTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiCallTaskDetailResponse setBody(QueryAiCallTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiCallTaskDetailResponseBody getBody() {
        return this.body;
    }

}
