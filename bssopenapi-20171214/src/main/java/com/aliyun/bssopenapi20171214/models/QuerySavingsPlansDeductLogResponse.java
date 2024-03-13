// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySavingsPlansDeductLogResponseBody body;

    public static QuerySavingsPlansDeductLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDeductLogResponse self = new QuerySavingsPlansDeductLogResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDeductLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySavingsPlansDeductLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySavingsPlansDeductLogResponse setBody(QuerySavingsPlansDeductLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySavingsPlansDeductLogResponseBody getBody() {
        return this.body;
    }

}
