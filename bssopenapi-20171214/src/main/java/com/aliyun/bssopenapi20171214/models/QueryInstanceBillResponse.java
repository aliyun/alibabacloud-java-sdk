// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInstanceBillResponseBody body;

    public static QueryInstanceBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceBillResponse self = new QueryInstanceBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceBillResponse setBody(QueryInstanceBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceBillResponseBody getBody() {
        return this.body;
    }

}
