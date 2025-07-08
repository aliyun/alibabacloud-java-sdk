// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsPackageSummaryResponseBody body;

    public static QuerySmsPackageSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageSummaryResponse self = new QuerySmsPackageSummaryResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsPackageSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsPackageSummaryResponse setBody(QuerySmsPackageSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsPackageSummaryResponseBody getBody() {
        return this.body;
    }

}
