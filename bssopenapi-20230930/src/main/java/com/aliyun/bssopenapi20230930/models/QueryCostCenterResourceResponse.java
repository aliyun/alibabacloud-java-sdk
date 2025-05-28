// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCostCenterResourceResponseBody body;

    public static QueryCostCenterResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterResourceResponse self = new QueryCostCenterResourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostCenterResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCostCenterResourceResponse setBody(QueryCostCenterResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostCenterResourceResponseBody getBody() {
        return this.body;
    }

}
