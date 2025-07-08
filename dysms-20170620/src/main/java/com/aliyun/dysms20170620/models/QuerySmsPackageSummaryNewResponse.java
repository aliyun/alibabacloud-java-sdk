// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageSummaryNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageSummaryNewResponseBody body;

    public static QuerySmsPackageSummaryNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageSummaryNewResponse self = new QuerySmsPackageSummaryNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageSummaryNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageSummaryNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageSummaryNewResponse setBody(QuerySmsPackageSummaryNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageSummaryNewResponseBody getBody() {
        return this.body;
    }

}
