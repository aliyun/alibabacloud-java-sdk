// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryAnswerSampleByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAnswerSampleByPageResponseBody body;

    public static QueryAnswerSampleByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAnswerSampleByPageResponse self = new QueryAnswerSampleByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryAnswerSampleByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAnswerSampleByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAnswerSampleByPageResponse setBody(QueryAnswerSampleByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAnswerSampleByPageResponseBody getBody() {
        return this.body;
    }

}
