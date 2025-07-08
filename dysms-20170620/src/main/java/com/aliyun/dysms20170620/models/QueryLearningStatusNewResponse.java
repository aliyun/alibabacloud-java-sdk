// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryLearningStatusNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLearningStatusNewResponseBody body;

    public static QueryLearningStatusNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLearningStatusNewResponse self = new QueryLearningStatusNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryLearningStatusNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLearningStatusNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLearningStatusNewResponse setBody(QueryLearningStatusNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLearningStatusNewResponseBody getBody() {
        return this.body;
    }

}
