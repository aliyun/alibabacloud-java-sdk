// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPredictiveTaskInfoResponseBody body;

    public static QueryPredictiveTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveTaskInfoResponse self = new QueryPredictiveTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPredictiveTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPredictiveTaskInfoResponse setBody(QueryPredictiveTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPredictiveTaskInfoResponseBody getBody() {
        return this.body;
    }

}
