// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBillOverviewResponseBody body;

    public static QueryBillOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillOverviewResponse self = new QueryBillOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBillOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBillOverviewResponse setBody(QueryBillOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBillOverviewResponseBody getBody() {
        return this.body;
    }

}
