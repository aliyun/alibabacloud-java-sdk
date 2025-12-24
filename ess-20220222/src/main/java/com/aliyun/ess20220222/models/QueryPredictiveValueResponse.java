// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPredictiveValueResponseBody body;

    public static QueryPredictiveValueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveValueResponse self = new QueryPredictiveValueResponse();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPredictiveValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPredictiveValueResponse setBody(QueryPredictiveValueResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPredictiveValueResponseBody getBody() {
        return this.body;
    }

}
