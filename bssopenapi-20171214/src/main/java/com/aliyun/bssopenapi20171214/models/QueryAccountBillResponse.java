// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccountBillResponseBody body;

    public static QueryAccountBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillResponse self = new QueryAccountBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountBillResponse setBody(QueryAccountBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountBillResponseBody getBody() {
        return this.body;
    }

}
