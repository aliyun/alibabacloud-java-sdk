// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTraceExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceExtractJobResponseBody body;

    public static QueryTraceExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractJobResponse self = new QueryTraceExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceExtractJobResponse setBody(QueryTraceExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceExtractJobResponseBody getBody() {
        return this.body;
    }

}
