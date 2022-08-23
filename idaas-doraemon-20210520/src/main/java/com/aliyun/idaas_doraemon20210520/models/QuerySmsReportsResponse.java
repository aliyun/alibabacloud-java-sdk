// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class QuerySmsReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySmsReportsResponseBody body;

    public static QuerySmsReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsReportsResponse self = new QuerySmsReportsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsReportsResponse setBody(QuerySmsReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsReportsResponseBody getBody() {
        return this.body;
    }

}
