// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QueryFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFeaturesResponseBody body;

    public static QueryFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFeaturesResponse self = new QueryFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public QueryFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFeaturesResponse setBody(QueryFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFeaturesResponseBody getBody() {
        return this.body;
    }

}
