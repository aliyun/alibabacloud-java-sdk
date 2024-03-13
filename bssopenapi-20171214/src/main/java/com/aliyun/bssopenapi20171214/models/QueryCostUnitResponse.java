// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostUnitResponseBody body;

    public static QueryCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResponse self = new QueryCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostUnitResponse setBody(QueryCostUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostUnitResponseBody getBody() {
        return this.body;
    }

}
