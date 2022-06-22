// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackInstanceReportResponseBody body;

    public static QueryAttackInstanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceReportResponse self = new QueryAttackInstanceReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackInstanceReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackInstanceReportResponse setBody(QueryAttackInstanceReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackInstanceReportResponseBody getBody() {
        return this.body;
    }

}
