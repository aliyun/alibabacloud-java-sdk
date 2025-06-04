// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAiCallDetailPageResponseBody body;

    public static QueryAiCallDetailPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallDetailPageResponse self = new QueryAiCallDetailPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiCallDetailPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiCallDetailPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiCallDetailPageResponse setBody(QueryAiCallDetailPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiCallDetailPageResponseBody getBody() {
        return this.body;
    }

}
