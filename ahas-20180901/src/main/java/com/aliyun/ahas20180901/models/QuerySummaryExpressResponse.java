// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySummaryExpressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySummaryExpressResponseBody body;

    public static QuerySummaryExpressResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySummaryExpressResponse self = new QuerySummaryExpressResponse();
        return TeaModel.build(map, self);
    }

    public QuerySummaryExpressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySummaryExpressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySummaryExpressResponse setBody(QuerySummaryExpressResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySummaryExpressResponseBody getBody() {
        return this.body;
    }

}
