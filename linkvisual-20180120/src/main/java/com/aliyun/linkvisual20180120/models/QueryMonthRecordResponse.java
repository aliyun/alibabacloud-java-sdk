// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryMonthRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonthRecordResponseBody body;

    public static QueryMonthRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthRecordResponse self = new QueryMonthRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthRecordResponse setBody(QueryMonthRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthRecordResponseBody getBody() {
        return this.body;
    }

}
