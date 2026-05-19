// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostByCostCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostByCostCenterResponseBody body;

    public static QueryCostByCostCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostByCostCenterResponse self = new QueryCostByCostCenterResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostByCostCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostByCostCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostByCostCenterResponse setBody(QueryCostByCostCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostByCostCenterResponseBody getBody() {
        return this.body;
    }

}
