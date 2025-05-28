// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostCenterResponseBody body;

    public static QueryCostCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterResponse self = new QueryCostCenterResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostCenterResponse setBody(QueryCostCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostCenterResponseBody getBody() {
        return this.body;
    }

}
