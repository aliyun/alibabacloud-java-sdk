// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBillResponseBody body;

    public static QueryBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillResponse self = new QueryBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBillResponse setBody(QueryBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBillResponseBody getBody() {
        return this.body;
    }

}
