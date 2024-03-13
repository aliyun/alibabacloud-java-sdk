// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostUnitResourceResponseBody body;

    public static QueryCostUnitResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResourceResponse self = new QueryCostUnitResourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostUnitResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostUnitResourceResponse setBody(QueryCostUnitResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostUnitResourceResponseBody getBody() {
        return this.body;
    }

}
