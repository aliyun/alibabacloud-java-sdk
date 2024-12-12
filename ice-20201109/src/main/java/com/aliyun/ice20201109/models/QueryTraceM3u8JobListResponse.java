// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceM3u8JobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceM3u8JobListResponseBody body;

    public static QueryTraceM3u8JobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceM3u8JobListResponse self = new QueryTraceM3u8JobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceM3u8JobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceM3u8JobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceM3u8JobListResponse setBody(QueryTraceM3u8JobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceM3u8JobListResponseBody getBody() {
        return this.body;
    }

}
