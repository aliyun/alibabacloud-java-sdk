// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPageableExpenseRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPageableExpenseRecordsResponseBody body;

    public static QueryPageableExpenseRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPageableExpenseRecordsResponse self = new QueryPageableExpenseRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPageableExpenseRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPageableExpenseRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPageableExpenseRecordsResponse setBody(QueryPageableExpenseRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPageableExpenseRecordsResponseBody getBody() {
        return this.body;
    }

}
