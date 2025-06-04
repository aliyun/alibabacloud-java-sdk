// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAiCallTaskPageResponseBody body;

    public static QueryAiCallTaskPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallTaskPageResponse self = new QueryAiCallTaskPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiCallTaskPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiCallTaskPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiCallTaskPageResponse setBody(QueryAiCallTaskPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiCallTaskPageResponseBody getBody() {
        return this.body;
    }

}
