// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEvaluateListResponseBody body;

    public static QueryEvaluateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEvaluateListResponse self = new QueryEvaluateListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEvaluateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEvaluateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEvaluateListResponse setBody(QueryEvaluateListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEvaluateListResponseBody getBody() {
        return this.body;
    }

}
